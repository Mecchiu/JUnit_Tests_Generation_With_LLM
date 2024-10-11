package s2e.lab.generators;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.resolution.SymbolResolver;
import com.github.javaparser.resolution.TypeSolver;
import com.github.javaparser.resolution.UnsolvedSymbolException;
import com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.javaparsermodel.declarations.JavaParserMethodDeclaration;
import com.github.javaparser.symbolsolver.javassistmodel.JavassistMethodDeclaration;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import com.github.javaparser.utils.Pair;
import com.ibm.wala.ipa.callgraph.CallGraphBuilderCancelException;
import org.apache.commons.io.FileUtils;
import s2e.lab.PromptUtils;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static s2e.lab.generators.JavaOpenAIPromptGenerator.*;

/**
 * This class is used to create the scenarios (Java files) for SF110 projects for the RQ2.
 */
public class SF110ScenarioGenerator {

    public static int NUMBER_OF_SCENARIOS = 5;

    /**
     * Clone a compilation unit.
     *
     * @param cu compilation unit to be copied (a new reference is created)
     * @return a new compilation unit
     */
    public static CompilationUnit clone(CompilationUnit cu) {
        return new CompilationUnit(
                cu.getPackageDeclaration().orElse(null),
                cu.getImports(),
                new NodeList<>(), // no types in it
                cu.getModule().orElse(null)
        );
    }

    /**
     * Clone a class or interface declaration.
     *
     * @param c              class or interface declaration to be copied (a new reference is created)
     * @param includeMembers if true, the members of the class/interface are copied as well
     * @return a new class or interface declaration
     */
    public static ClassOrInterfaceDeclaration clone(ClassOrInterfaceDeclaration c, boolean includeMembers) {
        // copy the class modifiers, annotations, name, type parameters, extended types, implemented types
        // copy members of the class if includeMembers is true
        NodeList<BodyDeclaration<?>> members = new NodeList<>();
        if (includeMembers) {
            c.getMembers().forEach(member -> members.add(member.clone()));
        }
        ClassOrInterfaceDeclaration copy = new ClassOrInterfaceDeclaration(
                c.getModifiers(),
                c.getAnnotations(),
                c.isInterface(),
                c.getName(),
                c.getTypeParameters(),
                c.getExtendedTypes(),
                c.getImplementedTypes(),
                members
        );
        // include any javadoc the class previously had
        if (c.getJavadoc().isPresent())
            copy.setJavadocComment(c.getJavadoc().get());

        return copy;
    }

    /**
     * Generates the scenario 1:
     * - package declaration
     * - import statements
     * - method signature + implementation (no JavaDoc) + surrounding class
     *
     * @param c
     * @param m method under test
     * @return a class with the scenario implementation
     */
    public static Pair<CompilationUnit, ClassOrInterfaceDeclaration> generateScenario1(ClassOrInterfaceDeclaration c, MethodDeclaration m) {
        // create a (soft) copy
        CompilationUnit scenarioCu = clone(c.findCompilationUnit().get());
        ClassOrInterfaceDeclaration scenarioClass = clone(c, false);
        scenarioCu.addType(scenarioClass);

        // add the method's implementation (including signature)
        scenarioClass.addMember(m.clone());

        // remove Javadoc from the method
        scenarioClass.getMethods().get(0).removeJavaDocComment();

        // assert only one method there! otherwise, we have a bug :(
        assert scenarioClass.getMembers().size() == 1;
        return new Pair<>(scenarioCu, scenarioClass);
    }

    /**
     * Generates the scenario 2: just like scenario 1, but keep the JavaDoc
     *
     * @param c
     * @param m method under test
     * @return a class with the scenario implementation
     */
    public static Pair<CompilationUnit, ClassOrInterfaceDeclaration> generateScenario2(ClassOrInterfaceDeclaration c, MethodDeclaration m) {
        // just like scenario 1, but add a javadoc
        Pair<CompilationUnit, ClassOrInterfaceDeclaration> scenario1 = generateScenario1(c, m);
        ClassOrInterfaceDeclaration scenarioClass = scenario1.b;
        if (m.getJavadoc().isPresent())
            scenarioClass.getMethods().get(0).setJavadocComment(m.getJavadoc().get());
        return new Pair<>(scenario1.a, scenarioClass);
    }

    /**
     * Just like scenario 2, but remove method's implementation
     *
     * @param c class under test
     * @param m method under test
     * @return a class with the scenario implementation
     */
    public static Pair<CompilationUnit, ClassOrInterfaceDeclaration> generateScenario3(ClassOrInterfaceDeclaration c, MethodDeclaration m) {

        // just like scenario 1, but remove method's implementation
        Pair<CompilationUnit, ClassOrInterfaceDeclaration> scenario2 = generateScenario2(c, m);
        ClassOrInterfaceDeclaration scenarioClass = scenario2.b;
        scenarioClass.getMethods().get(0).setBody(null);

        return new Pair<>(scenario2.a, scenarioClass);
    }


    /**
     * Just like scenario 3, but add the signatures for all the other methods in the class as well fields.
     *
     * @param c class under test
     * @param m method under test
     * @return a class with the scenario implementation
     */
    public static Pair<CompilationUnit, ClassOrInterfaceDeclaration> generateScenario4(ClassOrInterfaceDeclaration c, MethodDeclaration m) {
        // create a soft copy, and this time include all members of the class
        CompilationUnit scenarioCu = clone(c.findCompilationUnit().get());
        ClassOrInterfaceDeclaration scenarioClass = clone(c, true);
        scenarioCu.addType(scenarioClass);

        // remove all the  implementations from the members (methods, constructors, static blocks, etc)
        for (BodyDeclaration<?> member : scenarioClass.getMembers()) {
            if (member instanceof MethodDeclaration) {
                ((MethodDeclaration) member).setBody(null);
            } else if (member instanceof NodeWithBlockStmt) {
                // remove any implementation from a static block, a constructor, etc
                // ie, leave it like "{}". Notice we cannot make these nodes with a null body (it throws an exception)
                ((NodeWithBlockStmt) member).setBody(new BlockStmt());
            }
        }
        // check that we have the same number of members (otherwise, we have a bug)x
        assert scenarioClass.getMembers().size() == c.getMembers().size();
        return new Pair<>(scenarioCu, scenarioClass);
    }

    /**
     * Get the fully qualified name of a method (including the class name)
     *
     * @param m the method declaration
     * @return the method's fully qualified name (ex: java.lang.String.length())
     * The parameters are not fully qualified (ex: java.lang.String.length(Integer), instead of java.lang.String.length(java.lang.Integer)
     */
    private static String getFullyQualifiedMethodName(ClassOrInterfaceDeclaration c, MethodDeclaration m) {
        String methodClassname = c.resolve().getQualifiedName();
        return methodClassname + "." + m.getSignature().asString();
    }


//    public static CallableDeclaration.Signature getSignature(ResolvedMethodDeclaration rm) {
//        rm.getTypeParameters().stream().map(t->t.getName()).collect(toList());
//        return new CallableDeclaration.Signature(rm.getName(), getParameters().stream().map(this::getTypeWithVarargsAsArray).map(this::stripGenerics).map(this::stripAnnotations).collect(toList()));
//    }

    public static String getSimpleSignature(MethodDeclaration method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        sb.append("(");
        for (int i = 0; i < method.getParameters().size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(method.getParameters().get(i).getName());
        }
        sb.append(")");
        return sb.toString();
    }
    public static String getSimpleSignature(ResolvedMethodDeclaration method) {
        if(method instanceof JavaParserMethodDeclaration)
            return ((JavaParserMethodDeclaration) method).getWrappedNode().getSignature().asString();
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        sb.append("(");
        for (int i = 0; i < method.getNumberOfParams(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(method.getParam(i).getName());
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * Just like scenario 3, but add the signatures and documentation of the invoked methods (1-level deep)
     *
     * @param c class under test
     * @param m method under test
     * @return a class with the scenario implementation
     */
    public static Pair<CompilationUnit, ClassOrInterfaceDeclaration> generateScenario5(ClassOrInterfaceDeclaration c, MethodDeclaration m, Map<String, MethodDeclaration> allProjectMethods) {
        // just like scenario 2 (method's signature + implementation + Javadoc)
        Pair<CompilationUnit, ClassOrInterfaceDeclaration> scenario2 = generateScenario2(c, m);
        CompilationUnit scenarioCu = scenario2.a;
        ClassOrInterfaceDeclaration scenarioClass = scenario2.b;
        scenarioCu.remove(scenarioClass);
        // all the invoked methods' signatures that were found (and its documentation)
        // key = class' fully qualified name / value = ClassOrInterfaceDeclaration
        Map<String, ClassOrInterfaceDeclaration> invokedTypes = new HashMap<>();
        Set<String> invokedMethods = new HashSet<>();
        String mutQualifiedName = getFullyQualifiedMethodName(c, m);
        invokedMethods.add(mutQualifiedName);// flag the method under analysis as visited
        invokedTypes.put(c.resolve().getQualifiedName(), scenarioClass); // add the current compilation class declaration to the cache


        // finds all the method calls on the method under test
        m.findAll(MethodCallExpr.class).forEach(call -> {
            // finds the invoked method
            try {
                ResolvedMethodDeclaration invokedMethod = call.resolve();
                String invokedClassName = invokedMethod.declaringType().getQualifiedName();
                String invokedFullMethodName = invokedClassName + "." + getSimpleSignature(invokedMethod);//invokedMethod.getSignature();
                MethodDeclaration newMethod = allProjectMethods.get(invokedFullMethodName);

                // if the method was found, and it was not already added, add it and analyze
                if (newMethod != null && !invokedMethods.contains(invokedFullMethodName)) {
                    invokedMethods.add(invokedFullMethodName);
                    // add to the existing class, or create a new one
                    if (invokedTypes.containsKey(invokedClassName)) {
                        // clone, and remove the implementation
                        MethodDeclaration clonedMethod = newMethod.clone();
                        clonedMethod.setBody(null);
                        invokedTypes.get(invokedClassName).addMember(clonedMethod);
                    } else {
                        // get the method's signature+javadoc with its surrounding class
                        ClassOrInterfaceDeclaration newClass = newMethod.findAncestor(ClassOrInterfaceDeclaration.class).get();
                        Pair<CompilationUnit, ClassOrInterfaceDeclaration> newMethodScenario = generateScenario3(newClass, newMethod);
                        invokedTypes.put(invokedClassName, newMethodScenario.b);
                    }
                }
            } catch (UnsolvedSymbolException | UnsupportedOperationException e) {
                // ignore
            }
        });

        // adds the method under test (but ignore any recursive calls)
        invokedTypes.values().stream()
                .forEach(scenarioCu::addType);


        return new Pair<CompilationUnit, ClassOrInterfaceDeclaration>(scenarioCu, scenarioClass);
    }


    public static void saveScenario(CompilationUnit scenarioCu, File project, File javaFile, String suffix, int scenarioNo) throws IOException {
        // path to the scenario folder
        String scenarioFolderPath = String.format(SF100_EVOSUITE_SCENARIO, "scenario" + scenarioNo) + project.getName();
        // the line below keeps the original folder structure to take into account the package location
        String sourceFileLocation = javaFile.getAbsolutePath().replace(project.getAbsolutePath(), "");
        // add a suffix, if a class has multiple methods to test, the last one will overwrite the previous ones
        sourceFileLocation = sourceFileLocation.replace(".java", suffix + ".java");
        // the Java file generated
        File scenarioFile = new File(scenarioFolderPath + sourceFileLocation);
        // creates parent(s) directory if needed
        scenarioFile.getParentFile().mkdirs();

        // saves to the Java file
        try (FileWriter fileWriter = new FileWriter(scenarioFile)) {
            fileWriter.write(scenarioCu.toString());
        }

        System.out.println("Saved at " + scenarioFile);
    }

    public static void cleanPriorScenarios() throws IOException {
        // cleans up prior generated scenarios
        for (int i = 1; i <= NUMBER_OF_SCENARIOS; i++) {
            File scenarioFolder = new File(String.format(SF100_EVOSUITE_SCENARIO, "scenario" + i, ""));
            FileUtils.cleanDirectory(scenarioFolder);
            System.out.println("Cleaned up " + scenarioFolder.getCanonicalPath());
        }
    }

    /**
     * Returns a compilation unit for the given Java file (or null in case of a ParseProblemException)
     *
     * @param project  the project root directory (it assumes all code is placed in a src/main/java folder)
     * @param javaFile file to parse
     * @return a compilation unit
     * @throws FileNotFoundException in case the file does not exist
     */
    public static CompilationUnit getCompilationUnit(File project, File javaFile) throws FileNotFoundException {
        File rootDir = new File(project.getAbsolutePath() + "/src/main/java");
        TypeSolver typeSolver = new CombinedTypeSolver(new ReflectionTypeSolver(), new JavaParserTypeSolver(rootDir));
        JavaSymbolSolver symbolSolver = new JavaSymbolSolver(typeSolver);
        ParserConfiguration parserConfiguration = new ParserConfiguration();
//        SymbolResolver symbolSolver = new JavaSymbolSolver(new JavaParserTypeSolver(rootDir));
        parserConfiguration.setSymbolResolver(symbolSolver);
        StaticJavaParser.setConfiguration(parserConfiguration);

        try {
            CompilationUnit compilationUnit = StaticJavaParser.parse(javaFile);
            return compilationUnit;
        } catch (ParseProblemException ex) {
            System.err.println("Error parsing file: " + javaFile.getAbsolutePath());
            return null;
        }
    }

    public static Pair<Map<String, MethodDeclaration>, Map<String, CompilationUnit>> getAllProjectMethods(File project) throws IOException {
        Map<String, MethodDeclaration> allMethods = new HashMap<>();
        Map<String, CompilationUnit> allCompUnits = new HashMap<>();
        List<File> javaFiles = JavaSearcher.findNonTestJavaFiles(project);
        for (File javaFile : javaFiles) {
            CompilationUnit cu = getCompilationUnit(project, javaFile);
            if (cu == null) continue;
            allCompUnits.put(javaFile.getAbsolutePath(), cu);
            for (TypeDeclaration<?> type : cu.getTypes()) {
                if (type.isClassOrInterfaceDeclaration()) {
                    for (MethodDeclaration m : type.getMethods()) {
                        String methodQualifiedName = getFullyQualifiedMethodName(type.asClassOrInterfaceDeclaration(), m);
                        allMethods.put(methodQualifiedName, m);
                        allMethods.put(getSimpleSignature(m), m);
//                        try {
//                            allMethods.put(m.resolve().getQualifiedSignature(), m);
//                        } catch (Exception e) { /* ignore */ }
                    }
                }
            }

            /*cu.findAll(MethodDeclaration.class).forEach(m -> {
                try {
                    String qualifiedSignature = m.resolve().getQualifiedSignature();
                    allMethods.put(qualifiedSignature, m);
                } catch (UnsolvedSymbolException e) {
                    // System.err.println("UnresolvedSymbolException for " + m);
                }
            });*/
        }
        return new Pair<>(allMethods, allCompUnits);
    }


    public static void main(String[] args) throws IOException, CallGraphBuilderCancelException {
        // cleans up prior results
//        cleanPriorScenarios();

        // get the list of projects
        File originalDir = new File(format(SF100_EVOSUITE_SCENARIO, "original"));
        assert originalDir.exists();
        List<File> projectList = JavaSearcher.getFilteredProjects(originalDir.getAbsolutePath());//FIXME: replace the hack by this! getProjectList(originalDir.getAbsolutePath());
        assert projectList.size() == 53;//FIXME 111; // we have 111 projects in SF110 (two projects with ID = 82)
        int totalProjects = 0, totalMethodsUnderTest = 0;

        for (File project : projectList) {
//            if (!project.getName().startsWith("19")) continue;
            System.out.println(project);
            // CallGraph callGraph = CallGraphGenerator.computeCallGraph(project);
            Pair<Map<String, MethodDeclaration>, Map<String, CompilationUnit>> projMaps = getAllProjectMethods(project);
            List<File> javaFiles = JavaSearcher.findNonTestJavaFiles(project);
            int projectMethodCount = 0;
            for (File javaFile : javaFiles) {
                // parse the file and get the primary class declaration
                CompilationUnit cu = projMaps.b.get(javaFile.getAbsolutePath());
                if (cu == null) continue;
                ClassOrInterfaceDeclaration classDecl = PromptUtils.getPrimaryClass(cu);
                if (classDecl == null) continue;

                // collect the testable method's names (only if the class is also testable, AND the method has a "good" JavaDoc)
                List<MethodDeclaration> testableMethods = PromptUtils.getTestableMethods(classDecl, true)
                        .stream()
                        .filter(METHOD_INCLUSION_CRITERIA).collect(Collectors.toList());
                projectMethodCount += testableMethods.size();
//                System.out.println(project);
                for (int i = 0; i < testableMethods.size(); i++) {
                    MethodDeclaration m = testableMethods.get(i);
                    // if only one, don't bother with the test name suffix
                    String suffix = testableMethods.size() == 1 ? "" : String.valueOf(i);
                    // generates the scenarios and save
//                    saveScenario(generateScenario1(classDecl, m).a, project, javaFile, suffix, 1);
//                    saveScenario(generateScenario2(classDecl, m).a, project, javaFile, suffix, 2);
//                    saveScenario(generateScenario3(classDecl, m).a, project, javaFile, suffix, 3);
//                    saveScenario(generateScenario4(classDecl, m).a, project, javaFile, suffix, 4);
                    saveScenario(generateScenario5(classDecl, m, projMaps.a).a, project, javaFile, suffix, 5);
                }
            }

            // only includes projects that at least 1 method to test, but also between MIN and MAX (inclusive)
            if (PROJECT_INCLUSION_CRITERIA.test(projectMethodCount)) {
                System.out.println("Analyzed project " + project.getAbsolutePath());
                totalProjects++;
                totalMethodsUnderTest += projectMethodCount;
            } else {
                // deleted the scenarios generated, as the project failed the inclusion criteria
                // cleans up prior generated scenarios
                for (int i = 1; i <= NUMBER_OF_SCENARIOS; i++) {
                    File projectScenarioFolder = new File(String.format(SF100_EVOSUITE_SCENARIO, "scenario" + i) + project.getName());
                    FileUtils.deleteDirectory(projectScenarioFolder);
                }
                System.out.println("Skipped project " + project.getName());
            }


        }

        // these assertions are to ensure that the number of projects & methods is correct,
        // otherwise, our filtering is discrepant from JavaOpenAIPromptGenerator.java
        assert totalProjects == 53;
        assert totalMethodsUnderTest == 504;
    }
}

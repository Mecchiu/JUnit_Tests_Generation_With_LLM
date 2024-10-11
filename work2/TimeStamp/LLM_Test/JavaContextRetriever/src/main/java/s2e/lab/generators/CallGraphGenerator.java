package s2e.lab.generators;

import com.ibm.wala.cast.ir.ssa.AstIRFactory;
import com.ibm.wala.cast.java.client.impl.ZeroCFABuilderFactory;
import com.ibm.wala.cast.java.ipa.callgraph.JavaSourceAnalysisScope;
import com.ibm.wala.cast.java.translator.jdt.ecj.ECJClassLoaderFactory;
import com.ibm.wala.classLoader.*;
import com.ibm.wala.ipa.callgraph.*;
import com.ibm.wala.ipa.callgraph.impl.AllApplicationEntrypoints;
import com.ibm.wala.ipa.callgraph.propagation.InstanceKey;
import com.ibm.wala.ipa.cha.ClassHierarchyException;
import com.ibm.wala.ipa.cha.ClassHierarchyFactory;
import com.ibm.wala.ipa.cha.IClassHierarchy;
import com.ibm.wala.ssa.DefaultIRFactory;
import com.ibm.wala.types.ClassLoaderReference;
import com.ibm.wala.util.config.FileOfClasses;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Function;
import java.util.jar.JarFile;

public class CallGraphGenerator {
//    public static String EXCLUSION_FILE = "./src/main/resources/ui-exclusions.txt";//Java60RegressionExclusions.txt";
    public static String EXCLUSION_FILE = "./src/main/resources/Java60RegressionExclusions.txt";
    public static String JAVA_RUNTIME_17 = "./src/main/resources/jdk-17.0.1/rt.jar";
    public static String JAVA_RUNTIME_8 = "./src/main/resources/jre1.8.0_121_debug/lib/rt.jar";


    public static JavaSourceAnalysisScope createScope(File artifact) throws IOException {
        JavaSourceAnalysisScope scope = new JavaSourceAnalysisScope();
        // adds primordial (built-in) classes
        scope.addToScope(scope.getPrimordialLoader(), new JarFileModule(new JarFile(JAVA_RUNTIME_8, false)));
        // adds application classes (source code)
        if (artifact.isDirectory()) {
            File srcFolder = new File(artifact, "src/main/java");
            scope.addToScope(JavaSourceAnalysisScope.SOURCE, new SourceDirectoryTreeModule(srcFolder));
        }else
            scope.addToScope(JavaSourceAnalysisScope.SOURCE, new SourceFileModule(artifact, artifact.getName(), null));
        // sets exclusion file
        scope.setExclusions(new FileOfClasses(new FileInputStream(EXCLUSION_FILE)));


        File libFolder = new File(artifact, "lib");
        if (libFolder.exists()) {
            for (File lib : libFolder.listFiles()) {
                System.out.println(lib.getName());
                if (lib.getName().endsWith(".jar")) {
                    scope.addToScope(ClassLoaderReference.Extension, new JarFileModule(new JarFile(lib, false)));
                }
            }
        }

        return scope;
    }


    public static CallGraph computeCallGraph(File project) throws IOException, CallGraphBuilderCancelException, ClassHierarchyException {
        JavaSourceAnalysisScope scope = createScope(project);
        ClassLoaderFactory factory = new ECJClassLoaderFactory(scope.getExclusions());
        IClassHierarchy cha = ClassHierarchyFactory.make(scope, factory);


        Function<IClass, Boolean> isApplicationClass = c -> (!c.isInterface() && !c.isAbstract()) &&
                (c.getClassLoader().getReference().equals(ClassLoaderReference.Application) || c.getClassLoader().getReference().equals(JavaSourceAnalysisScope.SOURCE));
        AllApplicationEntrypoints entrypoints = new AllApplicationEntrypoints(cha.getScope(), cha, isApplicationClass);
        AnalysisOptions options = new AnalysisOptions(scope, entrypoints);
        AnalysisCache cache = new AnalysisCacheImpl(AstIRFactory.makeDefaultFactory(), options.getSSAOptions());
        CallGraphBuilder<InstanceKey> builder = new ZeroCFABuilderFactory().make(options, cache, cha, scope);

        return builder.makeCallGraph(options, null);
    }


//    public static CallGraph computeCallGraph(File project) throws IOException, CallGraphBuilderCancelException {
//        ECJJavaSourceAnalysisEngine engine = new ECJJavaSourceAnalysisEngine();
//        engine.addSystemModule(new JarFileModule(new JarFile(JAVA_RUNTIME_8, false)));
//        engine.setExclusionsFile(EXCLUSION_FILE);
//
//        engine.addSourceModule(new SourceDirectoryTreeModule(project));
//
//
//        engine.buildAnalysisScope();
//
//        AnalysisScope analysisScope = engine.getOptions().getAnalysisScope();
//
//
//
//        IClassHierarchy cha = engine.buildClassHierarchy();
//
//
//        Function<IClass, Boolean> isApplicationClass = c ->
//                c.getClassLoader().getReference().equals(ClassLoaderReference.Application) || c.getClassLoader().getReference().equals(JavaSourceAnalysisScope.SOURCE);
//        AllApplicationEntrypoints entrypoints = new AllApplicationEntrypoints(cha.getScope(), cha, isApplicationClass);
//
//
//        CallGraphBuilder<InstanceKey> builder = engine.defaultCallGraphBuilder();
//        AnalysisOptions options = engine.getOptions();
//        options.setEntrypoints(entrypoints);
//
//        return builder.makeCallGraph(engine.getOptions(), null);
//    }


    public static void main(String[] args) throws Exception {
//        System.setErr(new PrintStream("err.txt"));
        List<File> filteredProjects = JavaSearcher.getFilteredProjects("/Users/Documents/Portfolio/GitHub/LLM-Based-Test-Generation-Study/EvoSuiteBenchmark/original/");
        for (File project : filteredProjects) {

            System.out.println(project.getName());
            try {
                CallGraph callGraph = computeCallGraph(project);
                System.out.println("\t" + callGraph.getNumberOfNodes());
            } catch (Exception e) {
                System.out.println("\t Could not compute CG: " + project.getName() + "\n" + e.getMessage());

            }

        }

    }

}

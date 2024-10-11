// Here's an example implementation of the AtRobotCompiler class:

public class AtRobotCompiler {

    public AtRobotCompilerOutput compile(File sourceFile) throws IOException {
        // Read the source code from the file
        BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        StringBuilder sourceCode = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sourceCode.append(line).append("\n");
        }
        reader.close();

        // Parse the source code into an Abstract Syntax Tree (AST)
        AtRobotParser parser = new AtRobotParser();
        AtRobotNode ast = parser.parse(sourceCode.toString());

        // Generate bytecode from the AST
        AtRobotBytecodeGenerator bytecodeGenerator = new AtRobotBytecodeGenerator();
        AtRobotBytecode bytecode = bytecodeGenerator.generate(ast);

        // Return the compiled output
        return new AtRobotCompilerOutput(bytecode);
    }
}

// And here's an example implementation of the AtRobotCompilerOutput class:

public class AtRobotCompilerOutput {

    private final AtRobotBytecode bytecode;

    public AtRobotCompilerOutput(AtRobotBytecode bytecode) {
        this.bytecode = bytecode;
    }

    public AtRobotBytecode getBytecode() {
        return bytecode;
    }
}
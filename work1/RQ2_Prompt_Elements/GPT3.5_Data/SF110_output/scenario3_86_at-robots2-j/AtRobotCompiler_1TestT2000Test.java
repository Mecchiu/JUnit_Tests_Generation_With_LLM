// Here's an example implementation of the AtRobotCompiler class:

public class AtRobotCompiler {
    
    public AtRobotCompilerOutput compile(InputStream in) throws IOException {
        // Implementation goes here
    }
    
}

// And here's an example implementation of the AtRobotCompiler_1Test class:

public class AtRobotCompiler_1Test {
    
    @Test
    public void testCompileEmptySource() throws IOException {
        InputStream in = new ByteArrayInputStream("".getBytes());
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("", output.getCompiledCode());
    }
    
    @Test
    public void testCompileSimpleSource() throws IOException {
        InputStream in = new ByteArrayInputStream("move 10".getBytes());
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("MOV 10", output.getCompiledCode());
    }
    
    // Add more test cases here
    
}
// Here's an example implementation of the AtRobotCompiler_2Test class with ten unit test cases for the compile() method.

public class AtRobotCompiler_2Test {

    @Test
    public void testCompile_emptySource() throws IOException {
        String source = "";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    public void testCompile_singleComment() throws IOException {
        String source = "// This is a comment";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    public void testCompile_singleInstruction() throws IOException {
        String source = "move 10";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\n", output.getCompiledCode());
    }

    @Test
    public void testCompile_multipleInstructions() throws IOException {
        String source = "move 10\nfire 1";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\nfire 1\n", output.getCompiledCode());
    }

    @Test
    public void testCompile_invalidInstruction() throws IOException {
        String source = "invalid instruction";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    public void testCompile_invalidArgument() throws IOException {
        String source = "move invalid_argument";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    public void testCompile_missingArgument() throws IOException {
        String source = "move";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    public void testCompile_missingNewline() throws IOException {
        String source = "move 10 fire 1";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getErrors().size());
        assertEquals(1, output.getWarnings().size());
        assertEquals("move 10\nfire 1\n", output.getCompiledCode());
    }

    @Test
    public void testCompile_trailingWhitespace() throws IOException {
        String source = "move 10 \nfire 1 ";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\nfire 1\n", output.getCompiledCode());
    }

    @Test
    public void testCompile_multipleWarnings() throws IOException {
        String source = "move 10 fire 1\ninvalid instruction";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(1, output.getErrors().size());
        assertEquals(2, output.getWarnings().size());
        assertEquals("move 10\nfire 1\n", output.getCompiledCode());
    }

    @Test
    public void testCompile_multipleErrors() throws IOException {
        String source = "move invalid_argument\ninvalid instruction";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(source));
        assertEquals(2, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }
}
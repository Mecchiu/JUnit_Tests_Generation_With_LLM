// Here's an example of a unit test case for the AtRobotCompiler class

@Test
void testCompile() throws IOException {
    // Create a sample input stream with some source code
    String sourceCode = "start:\n" +
                        "move 10\n" +
                        "turn left\n" +
                        "shoot\n" +
                        "goto start\n";
    InputStream inputStream = new ByteArrayInputStream(sourceCode.getBytes());

    // Compile the source code
    AtRobotCompiler compiler = new AtRobotCompiler();
    AtRobotCompilerOutput output = compiler.compile(inputStream);

    // Verify that the compiled output is correct
    assertEquals(5, output.getInstructions().size());
    assertEquals("START", output.getInstructions().get(0).getLabel());
    assertEquals("MOVE", output.getInstructions().get(1).getOpcode());
    assertEquals(10, output.getInstructions().get(1).getArgument());
    assertEquals("TURN", output.getInstructions().get(2).getOpcode());
    assertEquals("LEFT", output.getInstructions().get(2).getArgument());
    assertEquals("SHOOT", output.getInstructions().get(3).getOpcode());
    assertEquals("GOTO", output.getInstructions().get(4).getOpcode());
    assertEquals("START", output.getInstructions().get(4).getArgument());
}
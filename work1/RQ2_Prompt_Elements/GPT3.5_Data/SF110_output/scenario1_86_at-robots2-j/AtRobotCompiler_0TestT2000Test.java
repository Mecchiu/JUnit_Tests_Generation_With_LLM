// Here's an example of how you could write a test case for the AtRobotCompiler class:

@Test
void testCompile() throws IOException {
    // Create a temporary file with some source code
    File tempFile = File.createTempFile("test", ".robot");
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
    writer.write("start:\n");
    writer.write("move 10\n");
    writer.write("turn left\n");
    writer.write("move 20\n");
    writer.write("turn right\n");
    writer.write("goto start\n");
    writer.close();

    // Compile the source code
    AtRobotCompiler compiler = new AtRobotCompiler();
    AtRobotCompilerOutput output = compiler.compile(tempFile);

    // Check that the output is correct
    assertEquals(6, output.getInstructions().size());
    assertEquals("START", output.getInstructions().get(0).getLabel());
    assertEquals("MOVE", output.getInstructions().get(1).getOpcode());
    assertEquals(10, output.getInstructions().get(1).getArgument());
    assertEquals("TURN", output.getInstructions().get(2).getOpcode());
    assertEquals("LEFT", output.getInstructions().get(2).getArgument());
    assertEquals("MOVE", output.getInstructions().get(3).getOpcode());
    assertEquals(20, output.getInstructions().get(3).getArgument());
    assertEquals("TURN", output.getInstructions().get(4).getOpcode());
    assertEquals("RIGHT", output.getInstructions().get(4).getArgument());
    assertEquals("GOTO", output.getInstructions().get(5).getOpcode());
    assertEquals("START", output.getInstructions().get(5).getArgument());

    // Clean up the temporary file
    tempFile.delete();
}
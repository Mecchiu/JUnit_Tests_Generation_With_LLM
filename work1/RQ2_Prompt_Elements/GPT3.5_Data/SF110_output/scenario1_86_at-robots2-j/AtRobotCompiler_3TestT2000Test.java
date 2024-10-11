// Here's an example of how you could write a test case for the AtRobotCompiler class:

@Test
void testCompile() throws IOException {
    // Create a StringReader with some sample source code
    String sourceCode = "start:\n" +
                        "move 10\n" +
                        "turn left\n" +
                        "shoot\n" +
                        "goto start\n";
    StringReader stringReader = new StringReader(sourceCode);
    LineNumberReader reader = new LineNumberReader(stringReader);

    // Compile the source code
    AtRobotCompiler compiler = new AtRobotCompiler();
    AtRobotCompilerOutput output = compiler.compile(reader);

    // Verify that the compiled output is correct
    assertEquals(5, output.getInstructions().size());
    assertEquals("start", output.getInstructions().get(0).getLabel());
    assertEquals("move", output.getInstructions().get(1).getOpcode());
    assertEquals(10, output.getInstructions().get(1).getOperand());
    assertEquals("turn", output.getInstructions().get(2).getOpcode());
    assertEquals("left", output.getInstructions().get(2).getModifier());
    assertEquals("shoot", output.getInstructions().get(3).getOpcode());
    assertEquals("start", output.getInstructions().get(4).getOperand());
}

package net.virtualinfinity.atrobots.compiler;
public static final String atRobot_5 = "atRobot\n"
			+ "/*\nte R.R\n"
			+ "\ntwierd\n"
			+ "\ntext\ntext\n"
			+ "\n*/;\n";

		public static final String atRobot_6 = "atRobot\n"
			+ "/*\ntwierd\n"
			+ "\ntext\ntext\ntext\n"
			+ "\n*/\n;\n";
}

/**
 * Main method to execute the test class. 
 */
public final class AtRobotCompiler_2Test_Main {

    @Test
    public void test() throws IOException, InstantiationException, IllegalAccessException {
		// Create CompilerOutput object
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();

		// Execute main method
        AtRobotCompiler.compile("atRobotCompiler_5.java")
           .compileTo(output.stdout);
    }
}

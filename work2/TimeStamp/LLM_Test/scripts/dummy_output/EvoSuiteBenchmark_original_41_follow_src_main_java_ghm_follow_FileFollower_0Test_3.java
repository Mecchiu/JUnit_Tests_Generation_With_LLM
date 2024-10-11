// FileFollower_0Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {
		
	/**
	 * Runs the program using the 'follow' command line argument.
	 */
	@Test
	void defaultTest() {

		final String[] testArguments = { "--file", "../data", "-f", "foobar", FOOBAR2_EXECUTER };

		// Run the program.
		Process outputProcess = new Process();
		List<String> command = new ArrayList<>();
		command.add("follow");
		command.addAll(testArguments);
		outputProcess.setCommand(command);
		assertTrue(outputProcess.execute().waitFor(0, 60000));
	}
	
	/**
	 * Sets up a new OutputDestination to which text is written, the
	 * new Destination will be added to the file set in {@link #DEFAULT_OUTPUTS}.
	 * @return whether the new OutputDestination was added to the
	 *         {@link #DEFAULT_OUTPUTS} or not
	 */
	boolean setupOutputDestination() {

		final OutputDestination defaultOutputs = new FileOutputDestination();

		// Attach the new OutputDestination.
		List<OutputDestination> outputDestinations = new ArrayList<>();
		outputDestinations.add(defaultOutputs);
		final String defaultOutputFile = "/output.txt";
		final String[] outputArguments = { "-f", defaultOutputFile};
		final long expectedExecutedTime = 0;
		outputProcess = new Process();

		// Run the program.
		Process outputProcess;
		try {
			outputProcess = new Process();
			outputProcess.setCommand(outputArguments);
			assertTrue(outputProcess.start().waitFor(expectedExecutedTime));
		} catch (IOException ex) {
			return false; // If no output destination is set, this test fails
		} catch (InterruptedException ex) {
			return false; // If no output destination is set, this test fails
		}
		outputProcess.setOutputDestination(outputDestinations.get(0));
		return true;
	}

	/**
	 * Runs the program using the 'FOOBAR' argument.
	 */
	@Test
	void FOOBAR2_Test() {

		// Set up the test.
		setupOutputDestination();
		List<String> testArgs = new ArrayList<>(5);
		testArgs.add("--file");
		testArgs.add("../data");
		testArgs.add("-f");
		testArgs.add("foobar");

		// Run the program as the UNIX command.
		Process testProcess = new Process();
		testProcess.setCommand(testArgs);
		testProcess.start();
		assertTrue(testProcess.waitFor());
	}
	
	// FOOBAR_EXECUTER_TEST.java
	private static void FOOBAR2_Executest() {
		final String[] testArguments = { "--file", "../data", "-f", "foobar", FOOBAR2_EXECUTER };

		// Run the program.
		Process testProcess = new Process();
		List<String> command = new ArrayList<>();
		command.add("FOOBAR");
		command.addAll(testArguments);
		testProcess.setCommand(command);
		assertTrue(testProcess.execute().waitFor(0, 60000));
	}
	
	@Test
	void setupOutputDestination_default(){

		assertTrue(setupOutputDestination());
	}
	
	@Test
	void setupOutputDestination_FOOBAR_Executor(){

		// Run the UNIX shell command 'FOOBAR' without arguments.
		FOOBAR2_Test();

		// Set-up a different instance of the OutputDestination, this is fine.
		final OutputDestination defaultOutputDestination = new FileOutputDestination();

		// Run the UNIX command 'FOOBAR' which will attach an empty list
		// of outputs.
		List<OutputDestination> outputDestinations = new ArrayList<>();
		outputDestinations = new ArrayList<>();
		List<String> testArguments = new ArrayList<>();
		testArguments.add("--file");
		testArguments.add("../data");
		testArguments.add("-f");
		testArguments.add("foobar");
		FOOBAR2_Executest();

		assertTrue(outputDestination.getOutput().isEmpty());
		assertTrue(defaultOutputDestination.getOutput().isEmpty());

		// Set-up the output destination to the following instance.
		outputDestinations.add(defaultOutputDestination);

		// Run the program
		outputProcess = new Process();
		outputProcess.setCommand(testArguments);
		assertTrue(outputProcess.start().waitFor(0, 60000));
		assertTrue(outputProcess.getOutput().isEmpty());
	}
	
	@Test
	/* @Test
	    @Ignore
	    public void 
	    testFileFollowing(Assumptions assu){@link OutputDestination}
	*/ 
	void testFileFollowing_output() {
		
		final String[] expectedOutputDestinations = { "FOOBAR2_FOOBAR.html",
		                                              DEFAULT_OUTPUTS["FOOBAR2.html"], DEFAULT_OUTPUTS["FOOBAR.html"], };

		// Run the program.
		boolean b = setupOutputDestination();
		assertTrue(b);
		b = FileFollower.addOutputDestination(outputProcess);
		assertTrue(!b);

		List<String> testArguments;

}
}
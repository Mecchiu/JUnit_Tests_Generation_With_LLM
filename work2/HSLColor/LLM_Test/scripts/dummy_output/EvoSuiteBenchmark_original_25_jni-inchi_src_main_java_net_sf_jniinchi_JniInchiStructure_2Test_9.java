// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
		
	/**
	 * Create unit test instance.
	 */
	public JniInchiStructure_2Test() { 
		
		System.out.println("========== Test Class ============");

		List<String[]> inputs = getInput();

		for (String[] input: inputs) {
				getOutput(input);
		}	
	}
	
	/**
	 * Tests that when stereo mode is set to "R" we do not get the stereo parity
	 * in case there isn't any stereo data in the input
	 */
	@Test
	void testInputsWhenNoStereoData() {

		List<String[]> inputs = getInput();

		for (String[] input: inputs) {
			if (input[1].equals("R")) {
				fail("The stereo data is not present: " + input[0]);
			}
		}
	}

	/**
	 * Tests stereo parity of all members of {@link List<String[]>}.
	 */
	@Test
	void testStereobits() {

		List<String[]> inputs = new ArrayList<>();
		List<String[]> outputs = new ArrayList<>();
		List<List<String>> outputsListInputs = new ArrayList<>();
				
		getOutput(outputs, "R");
		getInput(inputs, "R");
		getOutput(outputsListInputs, "R");
		
		inputs.stream().forEach((String[] input) -> {
			outputsListInputs.add(Arrays.asList(input));
		});
		
		assertFalse("We don't care what the stereo parity is: " + outputs, outputs.isEmpty());
		
		List<JniInchiStereoMode> output = JniInchiStructure.addStereo0D((JniInchiStereo0D) outputs.stream().collect(() -> new JniInchiStereoMode("R")));
		assertFalse("Shouldn't have a stereo parity : " + output.stream().collect(() -> new JniInchiStereoMode("R")), output.stream().filter((JniInchiStereoMode s) -> s.equals(JniInchiStereo0D.STEREO_BOTH) ).collect(() -> true).get());
		
		for (String[] input: inputs) {
			List<JniInchiStereoMode> output2 = JniInchiStructure.addStereo0D(JniInchiStereo0D.STEREO_BOTH);
			outputsListInputs.add(output2);
		}
				// outputs are still the same as we have previously output
		// no need to iterate again and have to reset outputs
		assertEquals("We don't care what the stereo parity is: " + outputs, outputs, output);
	}
	
	/**
	 * Tests if the stereo parity for all members of {@link List<String[]>} is added correctly
	 */
	@Test
	void testStereobitsMultipleTime() {

		List<String[]> inputs = new ArrayList<>();
		List<String[]> outputs = new ArrayList<>();
		List<List<String>> outputsListInputs = new ArrayList<>();
		
		getOutput(outputs, "R");
		getInput(inputs, "R");
		getOutput(outputsListInputs, "R");
			
		inputs.stream().forEach((String[] input) -> {
			outputsListInputs.add(Arrays.asList(input));
		});
			
		List<JniInchiStereoMode> output = JniInchiStructure.addStereo0D((JniInchiStereo0D) outputs.stream().collect(() -> new JniInchiStereoMode("R")));
		
		inputs.stream().forEach((String[] input) -> {
			outputsListInputs.add(Arrays.asList(input));
		});
		
		List<JniInchiStereoMode> expected1 = Arrays.asList(new JniInchiStereoMode("R"), new JniInchiStereoMode("S0"));
		List<JniInchiStereoMode> expected2 = Arrays.asList(new JniInchiStereoMode("R"), new JniInchiStereoMode("S0", "S1"));
		assertEquals("We don't care what the stereo parity is: " + outputs, 2, outputs.size());
		
		assertTrue("The stereo parity of all members of " + outputsListInputs + " should be " + expected1.stream().collect(() -> new JniInchiStereoMode("R")) + " when we add the second stereo data", expected1.stream().filter((JniInchiStereoMode s) -> s.equals(expected2)).collect(() -> true).get().equals(expected1));
		
		List<JniInchiStereoMode> output2 = JniInchiStructure.addStereo0D(output);
		assertTrue("Shouldn't have a stereo parity : " + output2,!output2.stream().filter((JniInchiStereoMode s) -> s.equals(JniInchiStereo0D.STEREO_BOTH)).collect(() -> true).get());
		assertTrue("We shouldn't have a stereo parity for the first stereo data when we add the second stereo data", outputs.stream().filter((JniInchiStereoMode s) -> s.equals(JniInchiStereo0D.STEREO_BOTH)).collect(() -> true).get().equals(output2));
	}

}
// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#size()} method.
*/
class Memory_0Test {
		
	@Test
	void testSize() throws InterruptedException {
		
		System.out.println("Memory_0Test.testSize");
		
		List<Double> expected = new ArrayList<Double>();
		
		expected.add(0.01);
		expected.add(0.02);
		expected.add(0.05);
		expected.add(0.1);
		expected.add(0.5);
		expected.add(0.5);
		expected.add(0.5);
		expected.add(0.50);
		expected.add(0.8);
		expected.add(1.0);
		expected.add(3.6);
		expected.add(7.6);
		expected.add(8.3);
		expected.add(11.4);
		expected.add(12.9);
		expected.add(17.2);
		expected.add(21.64);
		expected.add(23.89);
		expected.add(24.77);
		expected.add(27.9);
		expected.add(29.2);
		expected.add(33.9);
		expected.add(32.7);
		expected.add(38.5);

		expected.stream().forEach(expectedD -> {
			final double expectedS = expectedD;
	    	  List<Double> expectedD0 = expectedS;
	    	  expectedD0.add(-expectedS);
	   		expectedD0.add(expectedS);
	   		expectedD0.add(expectedS);
	   		expectedD0.add(expectedS);
			expectedD0.add(expectedS);
		});
		
		final List<Double> actual = new ArrayList<Double>();
	    Memory.size().forEach(action -> actual.add(action));
		assertEquals(expected, actual);
	}
	
}
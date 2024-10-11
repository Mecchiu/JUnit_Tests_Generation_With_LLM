// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains one unit test case for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

	/**
	* Test constructor of {@link FilterIntegers} class, and its {@link FilterIntegERS#filterIntegers(List)} method.
	*/
	@Test
	void testConstructor() {
		List<String> values = new ArrayList<>();
		values.add("1");
		values.add("2");
		values.add("3");
		
		List<String> result = new ArrayList<>();
			
		List<String> result2 = new ArrayList<>();
		result2.add("100");
		result2.add("200");
			
		for (String s: values) {
	        assertFalse(!filterIntegers(values).contains(s));
		}
		
		// Check if FilterIntegERS.filterIntegers(values) return a new list, which contains those values
	    assertEquals(filterIntegers(values), filterIntegers(values2));
		
	    // check FilterIntegERS.filterIntegERS(values2) returns a list containing those values
		// both values and values2 are filtered
	    assertNotNull(filterIntegers(values).filterIntegers(values2));
		
	}
		
}
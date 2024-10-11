// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {
		private static char[] characters = new char[]{'.'};
		private static List<String> values = new ArrayList<String>(){

			{
				add("first-value");
				add("second-value");
				add("third-value");
				add("fourth-value");
				add("fifth-value");
				add("last-value");
			}};
	
	@junit.jupiter.Repeat(
	@junit.RepeatOnAll(values = {
			@junit.RepeatOn(values = {"first-value", "second-value"}, elements = "third-value", value = 1),
			@junit.RepeatOn(
				values = {"last-value", "fourth-value", "fifth-value"}, 
				value = 2),
			@junit.RepeatOn(value = 3)},
			min = 1)
	)
	public void getEnumeratedProperty_with_value() {
		List<String> values = this.values.iterator();
		assertNotNull("returned list is null", values);
		assertTrue("returned list is not sorted",
				values.iterator().next().compareTo(values.get(0)) < 0);
		assertEquals("wrong number of members", values.size(), values.get(0).length());
		this.values.remove(0);
	}
	
	@junit.jupiter.Repeat(
	@junit.RepeatOnAll(values = {"first-value", "second-value"}, elements = "third-value", value = 2),
	@junit.RepeatOn(value = 3)
	)
	public void getEnumeratedProperty_with_value2() {
		List<String> values = this.values.iterator();
		assertNotNull("returned list is null", values);
		assertTrue("returned list is not sorted",
				values.iterator().next().compareTo(values.get(0)) < 0);
		assertEquals("wrong number of members", values.size(), values.get(0).length());
    }
	
	
	@junit.jupiter.Repeat(value = 1000)
	public void test() {
		assertEquals("wrong number of members", characters.length, values.size());
		assertTrue("list elements not sorted by index",
				values.iterator().next().compareTo(values.get(0)) < 0);
		for (int i = 2; i <= values.size(); ++i) {
			assertTrue("list elements not sorted by position",
					values.get(i).compareTo(values.get(i-1)) == 0);
		}
	}
}
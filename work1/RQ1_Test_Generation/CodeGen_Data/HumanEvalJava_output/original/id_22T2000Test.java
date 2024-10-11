// FilterIntegersTest.java
package original;

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
		 * filterIntegers(value)
		 * Test method for {@link FilterIntegers#filterIntegers(List)}.
		 */
	@Test
	public void testFilterIntegers() {
		
		List<Object> values = new ArrayList<Object>();
		values.add(null);
		values.add(5);
		values.add("abc");
		values.add({});
		values.add({ null : 5 });
		values.add(5, "abc");
		values.add("ab", value -> value.toString().length() <= 100);
		values.add("ab", 3);
		values.add("ab", value);
		values.add("abc", value);
		values.add("a", 10);
		values.add("a", { value : 1 });
		values.add("a", value);
		values.add("abc", value);
		values.add("a", value);
		values.add("ab", value);
		values.add("b", value);
		values.add("b", value);
		values.add(new Integer(0));
		values.add(new Integer(5));
		values.add("abcd", value -> value.toString().length() <= 100);
		values.add("c", new Number(0));
		values.add("c", value);
		values.add("c", value);
		values.add("abc", value);
		values.add("c", value);
		values.add("d", value);
		values.add("d", value);
		values.add(new Number(0));
		values.add("abc", new Number(0));
		values.add("abcd", new Number(0));
		values.add(value -> value.toString().length() <= 100);
		// Test with filter
		List<Object> result = FilterIntegers.filterIntegers(values);
		assertTrue(result.toString().length() > 100);
		String output = result.toString();
		assertCount(values, output.length(), 100);
		assertCount(values, output.length(), 100);
		assertCount(values, output.length(), 100);
		assertCount(values, output.length(), 100);
		
		// Test with filter list
		List<Object> result1 = new ArrayList<Object>();
		result1.add(new Integer(100));
		List<Object> result2 = new ArrayList<Object>();
		result2.add(new Integer(100));
		result2.add(value -> { throw new ReferenceError(); value.toString().length() <= 100; });
		List<Object> result = FilterIntegers.filterIntegers(values);
		assertTrue(result.toString().length() > 100);
		assertTrue(result.toString().length() > 100);
		// assertTrue(new String(result.toString()).length() > 100);
		String output1 = result.toString();
		String output2 = result2.toString();
		if (output1.length() == 0) { assertTrue(output1.equals("")); }
		if (result2.toString().length() == 0) { assertTrue(output2.equals("")); }
		assertTrue(output1.length() > 0 && output2.length() > 0);
		output1 = new String(output1); output2 = new String(output2);
		assertTrue(output1.toString().indexOf("100") > 0);
		assertTrue(output2.toString().indexOf("100") > 0);
		output1 = result.toString();
		output2 = result2.toString();
		output1 = output1.replace("[100", "");
		output2 = output2.replace("[100", "");
		assertTrue(output1.indexOf(output2) > 0);
		
		// Test with filter
		// TODO: Implement test case for other filters.
	}
	
	public static void assertCount(List<Object> values, Long count, Long limit) {
		long expectedLength = count.longValue();
		long expectedLength2 = (count - limit) * count.longValue();
		// TODO: Implement test case for other filters.
	}

		@Test
		public void testSerializable() throws Exception {
				fail("Not yet implemented");
		}

}

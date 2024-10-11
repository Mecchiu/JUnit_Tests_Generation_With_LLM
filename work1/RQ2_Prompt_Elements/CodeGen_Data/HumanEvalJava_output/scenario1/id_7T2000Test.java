// FilterBySubstringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains one unit test case for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {
@Test
		void test() {
			List<Object> strings = new ArrayList<Object>();
			strings.add("a");
			strings.add("b");
			strings.add("c");
			strings.add("d");
			System.out.println(strings);
			
			assertEquals(2, filterBySubstring(strings, "a").size());
			assertEquals(2, filterBySubstring(strings, "b").size());
			assertEquals(1, filterBySubstring(strings, "c").size());
			assertEquals(1, filterBySubstring(strings, "d").size());
		}
}
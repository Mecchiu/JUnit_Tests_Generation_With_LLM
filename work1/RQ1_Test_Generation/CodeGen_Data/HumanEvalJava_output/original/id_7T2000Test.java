// FilterBySubstringTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains one unit test case for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

	/**
	 * Test for empty lists.
	 * A class of test case for {@link FilterBySubstring#filterBySubstring(List, String)}.
	 */
	@Test
    public void testFilterBySubstringEmpty_1C() {
		//GIVEN
		@SuppressWarnings("unused")
		List<Object> strings = new ArrayList<Object>();
		FilterBySubstring c = new FilterBySubstring();

		//WHEN
		@SuppressWarnings("unused")
		List<Object> result = c.filterBySubstring(strings, "array");
		
        //THEN - array of empty lists
    }
    
	/**
	 * Test for empty lists.
	 * A class of test case for {@link FilterBySubstring#filterBySubstring(List, String)}.
	 */
	@Test
    public void testFilterBySubstringEmpty_2C() {
		//GIVEN
		@SuppressWarnings("unused")
		List<Object> strings = new ArrayList<Object>();
		FilterBySubstring c = new FilterBySubstring();

		//WHEN
		@SuppressWarnings("unused")
		List<Object> result = c.filterBySubstring(strings, "");
		
        //THEN - array of empty lists
    }
}

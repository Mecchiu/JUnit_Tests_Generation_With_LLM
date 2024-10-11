// FilterByPrefixTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains one unit test case for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {
private int intValue, strValue, arrValue;
		private static int value = 0;

    /**
     * Construct instance of this class.
     */
    public FilterByPrefixTest() {
    }

    @Test
    void testFunc() {
    	assertEquals(0, filterByPrefix(emptyList(), "a"));
    	assertEquals(1, filterByPrefix(singletonList("a"), "a"));
    	assertEquals(2, filterByPrefix(list(singleCharArray("a"), list(singleCharArray("b"))), "a"));
    	assertEquals(3, filterByPrefix(list(singleCharArray("b"), singleCharArray("c"))), "b");

    	assertThrowOnInvalidArray(() -> countOccurrences(emptyList(), "a"));
    	assertThrowOnInvalidArray(() -> countOccurrences(singletonList("a"), "a"));
    	assertThrowOnInvalidArray(() -> filterByPrefix(singletonList("a"), list(singleCharArray("b"))));
    	assertThrowOnInvalidArray(() -> filterByPrefix(list(singleCharArray("b"), singleCharArray("c")), singleCharArray("a")));

    	assertThrowOnMixedArguments(() -> countOccurrences(emptyList(), singleCharArray("b")));
    	assertThrowOnMixedArguments(() -> countOccurrences(list(singleCharArray("b"))), singleCharArray("b"));
    	assertThrowOnMixedArguments(new FilterByPrefix::countOccurrences, singleCharArray("b"), list(singleCharArray("a")));

    	assertThrowOnMixedArguments(() -> filterByPrefix(list(singleCharArray("b"))), singleCharArray("a"));
    	assertThrowOnMixedArguments(() -> filterByPrefix(list(singleCharArray("b"), singleCharArray("a"))), list(singleCharArray("b")));
    	assertThrowOnMixedArguments(() -> filterByPrefix(list(singleCharArray("b")), list(singleCharArray("a"))), list(singleCharArray("b")));

    	assertThrowOnMixedArguments(() -> filterByPrefix(singleCharArray("b")), list(singleCharArray("a")));
    	assertThrowOnMixedArguments(new FilterByPrefix::filterByPrefix, list(singleCharArray("b")), list(singleCharArray("a")));
		}

	@Test
	void test() {
		filterByPrefix(emptyList(), "");
		filterByPrefix(newArrayList(array()), "");
		filterByPrefix(singletonList(array()), "");
		filterByPrefix(list(array()), "");
		filterByPrefix(ofList(array()), "");
		filterByPrefix(ofList(array()), list(array()));
		filterByPrefix(ofList(array()), list(array()));

		assertEquals(1, countOccurrences(emptyList(), ""));
		assertEquals(0, countOccurrences(singletonList(""), ""));

		assertThrowOnInvalidArgument(() -> filterByPrefix(list(array()), array()));
		assertThrowOnInvalidArgument(() -> filterByPrefix(list(array()), listOfCharArray(array())));
		assertThrowOnInvalidArgument(() -> filterByPrefix(singletonList(array()), listOfCharArray(array())));

		assertThrowOnMixedArgument(() -> filterByPrefix(singletonList(array()), emptyList()));
		assertThrowOnMixedArgument(() -> filterByPrefix(newArrayList(array()), emptyList()));
		assertThrowOnMixedArgument(() -> filterByPrefix(ofList(array()), emptyList()));
		assertThrowOnMixedArgument(() -> filterByPrefix(list(array()), emptyList()));
		assertThrowOnMixedArgument(() -> filterByPrefix(ofList(array()), emptyList()));

		assertThrowOnMixedArgument(() -> filterByPrefix(ofList(array()), emptyList()));
		assertThrowOnMixedArgument(() -> filterByPrefix(ofList(array()), listOfCharArray(emptyList())));
		assertThrowOnMixedArgument(() -> filterByPrefix(list(array()), emptyList()));
	}
}

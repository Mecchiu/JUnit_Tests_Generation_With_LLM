// FilterByPrefixTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains one unit test case for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

	@Test
	public void testFilterByPrefix() {

        Object s = new Object();
        s = null;
        
        assertFalse("testFilterByPrefix() should return an empty list as no strings were filtered.",
                FilterByPrefix.filterByPrefix(new ArrayList<>(), "")  
                       .size() == 0);
        assertFalse("testFilterByPrefix() should return an empty list as no strings were filtered.",
                FilterByPrefix.filterByPrefix(new ArrayList<>(), "abc")  
                       .size() == 0);
        assertEquals("testFilterByPrefix() should return an empty list as no strings were filtered.",
                new ArrayList<>(0), FilterByPrefix.filterByPrefix(new ArrayList<>(), null));
        assertEquals("testFilterByPrefix() should return a valid list as it accepts strings only.",
                new ArrayList<>(0, "abc", s),
                FilterByPrefix.filterByPrefix(new ArrayList<>(0, "def", s, s, s),
                        " abc"));
	}
	
}
// FilterByPrefixTest.java
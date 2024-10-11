// FilterByPrefixTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains one unit test case for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

	List<String> inputList = new ArrayList<String>();
	{
	inputList.add("abc");
	inputList.add("array");
	inputList.add("doE");
	inputList.add("doe");
	inputList.add("doe"); 
	inputList.add("array"); 
	inputList.add("xxx");
	inputList.add("xxx"); 
	}

	List<Object> resultList = new ArrayList<Object>();

    @Test
    public void testFilterByPrefix(){
        final String prefix = "abcd";
        final FilterByPrefix f = new FilterByPrefix();
        List<Object> matchList = f.filterByPrefix(inputList, prefix);
        assertEquals(6, matchList.size());
        assertTrue(matchList.toString().startsWith(prefix));
        assertEquals( "abc", matchList.get(0));
        assertEquals( "array", matchList.get(1));
        assertEquals( "doE", matchList.get(2));
        assertEquals("doe", matchList.get(3));
        assertEquals("array", matchList.get(4));
        assertEquals( "xxx", matchList.get(5));
    };
}
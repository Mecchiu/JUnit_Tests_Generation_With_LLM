// FilterBySubstringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains one unit test case for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

	@Test
    public void filterBySubstringListNull(){
			
		List<Object> strings = null;
		List<Object> result = new FilterBySubstring().filterBySubstring(strings, "'asd");
		
		assertNull("get strings", strings);
		assertNull("get result", result);
		
	}
	
	@Test
    public void filterBySubstringArrayNull(){
			
		int[] strings = null;
		List<Object> result = new FilterBySubstring().filterBySubstring(strings, "'array");
		
		assertNull("get result", result);
		
	}
	
	@Test
    public void filterBySubstringArrayNullAndTrueFalse(){
			
		List<Object> strings = new FilterBySubstring().filterBySubstring(new int[]{1,3}, "'array");
		
		assertNull("get result", strings);
		
	}
	
}

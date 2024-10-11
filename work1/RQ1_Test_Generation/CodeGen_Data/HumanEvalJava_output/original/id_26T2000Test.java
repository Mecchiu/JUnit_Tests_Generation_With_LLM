// RemoveDuplicatesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains one unit test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

	@Test
	public void test() {
		List<String> array = new ArrayList<String>();
		array.add("A", "A");
		array.add("B", "A");
		array.add("C", "B");
		array.add("E", "C");
		array.add("F", "E");
		removeDuplicates(array);
		assertTrue(array.size() > 4);
	}
	
}
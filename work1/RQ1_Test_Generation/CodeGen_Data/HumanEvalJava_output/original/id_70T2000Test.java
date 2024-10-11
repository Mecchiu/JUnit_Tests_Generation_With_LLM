// StrangeSortListTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
/**
		* Unit test method testStrangeSortList.
		* This unit test method tests the {@link StrangeSortList#strangeSortList(List)} method.
		*/
		@Test
		public void testEqual() {
				List<Object> list = new ArrayList<Object>(){
							@Override
							public Object get(int index) {
									return list.get(index);
							}
						};
				assertNotNull(strangeSortList(list).get(0));
				assertNull(strangeSortList(list).get(list.size() - 1));
		}
}

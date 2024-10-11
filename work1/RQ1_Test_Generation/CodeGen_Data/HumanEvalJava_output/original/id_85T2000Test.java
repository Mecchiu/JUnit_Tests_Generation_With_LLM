// Add1Test.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains one unit test case for the {@link Add1#add(List)} method.
*/
class Add1Test {
/**
		 * Test case for {@link Add1#add(List)}.
		 */
		List<Integer> list = getList();
		
		@Test
		public void addOneList(){
			assertNotEquals(0, list.size());
			assertNotEquals(0, (list.get(0) + Integer.MAX_VALUE));
			
		}
		
		@Test
		public void addNegativeOne(){
			List<Integer> newList = list.subList(0, 1);
			
			assertNotEquals(0,
					(newList.get(0).clone().longValue() + Integer.MAX_VALUE));
			assertNotEquals(newList.get(0).getClass().getSimpleName(),
					Integer.class.getSimpleName());
			assertEquals(newList.get(1).getClass().getSimpleName(), Integer.class
//						.getSimpleName());
		}
		
		@Test
		public void addWithZero(){
			List<Integer> newList = list.subList(0,0);
			
			assertEquals(Integer.MAX_VALUE, 
					newList.get(0).clone().longValue());
			assertEquals(Integer.MAX_VALUE, newList.get(1)
//					.clone().longValue());
			
				
		}
 
		List<Integer> getList(){
			List<Integer> newList = new Add1().list;
			return newList;
		}
}

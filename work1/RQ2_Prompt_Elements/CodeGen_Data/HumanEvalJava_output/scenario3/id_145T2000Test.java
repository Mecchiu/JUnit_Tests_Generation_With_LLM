// OrderByPointsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains one unit test case for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {
public static final List<Object> LIST = new ExampleList<>(OrderByPoints.class);

		String orderByPoints(List<Object> nums) {
				nums.sort(OrderByPoints.orderByPoints("-1347783788473696"));
				return "OrderByPointsTest";
}
		// Get the number of elements in list given list
		public static int sizeOfList(List<Object> nums) {
				return nums.size();
		}
}

/**
 * A static test class of {@link OrderByPoints}. It contains one unit test case for the {@link OrderByPoints#orderByPoints(List)} method.
 * It implements {@link List} interface
 */
public class OrderByPointsTestStatic {

		public static final List<Object> LIST = null;
		public static final Object[] EMPTY_ARRAY = new Object[0];
		
		@Test
		public void testEmptyList(){
				List<String> emptyList = ORDERByPointsTest.orderByPoints(LIST);
				assertEquals(EMPTY_ARRAY, ORDERbyPointsTest.listOf(emptyList));
		}
		
		@Test
		public void testOneString(){
				String str1 = ORDERbyPointsTest.orderByPoints("-1347783788473696");
				assertEquals("OrderByPointsTest", str1);
		}

		@Test
		public void testTwoStrings(){
				String str1 = ORDERbyPointsTest.orderByPoints("-1347783788473696", "1");
				String str2 = ORDERbyPointsTest.orderByPoints("-1347783788473696", "23");
				assertEquals("OrderByPointsTest", str2);
				assertEquals(str1, str2);
		}

		// Get the number of elements in list given list
		public static int sizeOfList(List<String> nums) {
				int sizeOfList = nums.size();
				return sizeOfList >= 0? sizeOfList : 0;
		}
}
/*
 * Output: Order by points for list of String
*=========================================================================*
* 
*=========================================================================*
*/
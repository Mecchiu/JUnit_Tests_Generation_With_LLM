// Maximum1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains one unit test case for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	private static final int MAX = 1000000;
	
	@Test
    void test1() {
		
		List<Integer> arr = new ArrayList<>();
		int max = 0;
		listToArray(0, 10000, MAX, -1000, -1, 0, 0, -2, MAX)::iterator.addAll(listIterator(arr));
		for (int i = arr.size(); i > -1; i--) {
			assertEquals(1, new Integer(i).intValue());
            //noinspection NestedAsserts
			assertEquals(Arrays.binarySearch(max, i), -1 * max++);
		}
    }
	
	@Test
		public void test2() {
			
			// given
			int[] list = new int[2];
			System.out.println("list.length = " + list.length);
			list[0] = 200;
			list[1] = 100;
			
			// given with empty list
			Integer[] intList = new Integer[0];		
			List<Integer> listToArray = new ArrayList<Integer>();					
			new Maximum1(intList).maximum(listToArray);		
			System.out.println(new ArrayList<Integer>(listToArray));
			assertArrayEquals(intList, listToArray.toArray());
			
			// given with list
			listToArray = new ArrayList<Integer>();
			listToArray.add(100);
			listToArray.add(200);
			listToArray.add(-100);
			listToArray.add(200);
			listToArray.add(200);
			
			// given with list of elements
			int[][] toArray = new int[][] { new int[] { 0, 200, 0 }, new int[] { 100, 200, 0 }, new int[] { 200, 0, 100 } };
			new Maximum1(toArray).maximum(listToArray);			
			System.out.println(listToArray);
			assertArrayEquals(toArray, listToArray.toArray());			
	}
}

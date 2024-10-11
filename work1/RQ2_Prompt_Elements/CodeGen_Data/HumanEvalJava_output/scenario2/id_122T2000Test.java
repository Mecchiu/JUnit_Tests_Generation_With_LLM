// AddElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains one unit test case for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

	private long numArrayToTest; // number of array to test
	
	/**
	 * Constructor of {@link AddElementsTest}.
	 */
	public AddElementsTest(){
		numArrayToTest = 10;
	}

	/**
	 * Test {@link AddElements#addElements(List, int)} when element 1 is 100 and element 2 is 9.
	 */
	@Test
	void testAddElements1(){
		int expectedRes = 900;
		assertEquals(expectedRes, addElements(new List<>(),1));
	}
	
	/**
	 * Test {@link AddElements#addElements(List, int)} when the elements
	 * are from the array of integers from step 1 to step 10.
	 */
	@Test
	void testAddElements2(){
		List<Integer> numbers = new ArrayList(10);
		int expectedRes = 10;
		assertEquals(expectedRes, addElements(numbers, 2));
	}
	
	/**
	 * Test {@link AddElements#addElements(List, int)} when the number
	 * of elements is from the array of integers from step 1 to step 2.
	 */
	@Test
	void testAddElements3(){
		List<Integer> numbers = new ArrayList(2);
		int expectedRes = 1;
		assertEquals(expectedRes, addElements(numbers, 2));
	}

/**
 * Test {@link AddElements#addElements(List, int)} when element 2 does not exist.
 * @throws Exception
 */
	@Test
	void addElements_NotExisting(){
		int expectedRes = 10;
		List<List<Integer>> numbers = new ArrayList(5);
		List<Integer> n1 = new ArrayList(); // null is returned instead if the number element doesnt exists
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(10));
		numbers.add(n1);
		List<Integer> n2 = new ArrayList(1);
		n2.add(Integer.valueOf(10));
		n2.add(Integer.valueOf(10));
		n2.add(Integer.valueOf(100));
		numbers.add(n2);
		addElements(numbers,2); // it should not throw an exception if element 2 exists.
		int sumRes = addElements(numbers, 2);
		assertEquals(sumRes, expectedRes);
	}

/**
 * Test the {@link AddElements#addElements(List, int)} method if the first
 * elements are from step 1 to step 10 but the last elements are from step 20
 * to step 100.
 */
	@Test
	void testAddElements4(){
		int expectedRes = 300;
		List<List<Integer>> numbers = new ArrayList(5);
		List<Integer> n1 = new ArrayList(); // null is returned instead if the number element doesnt exist
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(20));
		List<Integer> n2 = new ArrayList(1);
		n2.add(Integer.valueOf(10));
		n2.add(Integer.valueOf(10));
		n2.add(Integer.valueOf(20));
		n1.add(Integer.valueOf(105));
		n2.add(Integer.valueOf(200));
		numbers.add(n1);
		numbers.add(n2);
		addElements(numbers,1);
		int sumRes = addElements(numbers, 1);
		assertEquals(sumRes, expectedRes);
	}

/**
 * Test the {@link AddElements#addElements(List, int)} method if the last
 * elements are from step 1 to step 10 but the first elements are from step 20
 * to step 100.
 */
	@Test
	void testAddElements5(){
		int expectedRes = 500;
		List<List<Integer>> numbers = new ArrayList(5);
		List<Integer> n1 = new ArrayList(); // null is returned instead if the number element doesnt exist
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(100));
		List<Integer> n2 = new ArrayList(1);
		n2.add(Integer.valueOf(10));
		n2.add(Integer.valueOf(10));
		n2.add(Integer.valueOf(1000));
		List<Integer> n3 = new ArrayList(2);
		n3.add(Integer.valueOf(10));
		n3.add(Integer.valueOf(10));
		n3.add(Integer.valueOf(500));
		n2.add(Integer.valueOf(1000));
		n1.add(Integer.valueOf(400));
		n2.add(Integer.valueOf(10));
		List<Integer> n4 = new ArrayList(2);
		n4.add(Integer.valueOf(1));
		n4.add(Integer.valueOf(100));
		n1.add(Integer.valueOf(200));
		n4.add(Integer.valueOf(100));
		n4.add(Integer.valueOf(400));
		n1.add(Integer.valueOf(100));
		n1.add(Integer.valueOf(400));
		List<Integer> n5 = new ArrayList(1);
		n5.add(Integer.valueOf(10));
		n5.add(Integer.valueOf(150));
		n6 = new ArrayList(2);
		n6.add(Integer.valueOf(10));
		n6.add(Integer.valueOf(100));
		n6.add(Integer.valueOf(150));
		List<Integer> n6b = new ArrayList(1);
		n6b.add(Integer.valueOf(10));
		n6b.add(Integer.valueOf(150));
		n6b.add(Integer.valueOf(200));
		List<Integer> n6c = new ArrayList(2);
		n6c.add(Integer.valueOf(10));
		n6c.add(Integer.valueOf(100));
		n6c.add(Integer.valueOf(150));
		n6c.add(Integer.valueOf(200));
		n4.add(Integer.valueOf(100));
		n4.add(Integer.valueOf(150));
		n3.add(Integer.valueOf(1000));
		n2.add(Integer.valueOf(400));
		n1.add(Integer.valueOf(10));
		n1.add(Integer.valueOf(150));
		n2.add(Integer.valueOf(400));
		n1.add(Integer.valueOf(100));
		n1.add(Integer.valueOf(150));
		n1.add(Integer.valueOf(400));
		List<Integer> n6F = new ArrayList(1);
		n6F.add(Integer.valueOf(10));
		n6F.add(Integer.valueOf(100
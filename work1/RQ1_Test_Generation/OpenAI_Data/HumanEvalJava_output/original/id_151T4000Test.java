// DoubleTheDifferenceTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {

	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with an empty list.
	*/
	@Test
	void testDoubleTheDifference_EmptyList() {
		List<Object> lst = List.of();
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement() {
		List<Object> lst = List.of(5);
		assertEquals(25, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_2() {
		List<Object> lst = List.of(4);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_3() {
		List<Object> lst = List.of(0);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_4() {
		List<Object> lst = List.of(-1);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_5() {
		List<Object> lst = List.of(0.1);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_6() {
		List<Object> lst = List.of(-10);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_7() {
		List<Object> lst = List.of(-1);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_8() {
		List<Object> lst = List.of(0.2);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_9() {
		List<Object> lst = List.of(-99);
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement_10() {
		List<Object> lst = List.of(99);
		assertEquals(9801, DoubleTheDifference.doubleTheDifference(lst));
	}
}
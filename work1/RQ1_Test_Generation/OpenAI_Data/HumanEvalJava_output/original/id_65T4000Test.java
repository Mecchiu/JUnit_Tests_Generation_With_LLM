// CircularShiftTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is greater than the number of digits.
	*/
	@Test
	void testCircularShift_1() {
		assertEquals("001", CircularShift.circularShift(100, 2));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is less than the number of digits.
	*/
	@Test
	void testCircularShift_2() {
		assertEquals("12", CircularShift.circularShift(12, 2));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is greater than the number of digits.
	*/
	@Test
	void testCircularShift_3() {
		assertEquals("79", CircularShift.circularShift(97, 8));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is less than the number of digits.
	*/
	@Test
	void testCircularShift_4() {
		assertEquals("21", CircularShift.circularShift(12, 1));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is greater than the number of digits.
	*/
	@Test
	void testCircularShift_5() {
		assertEquals("11", CircularShift.circularShift(11, 101));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is less than the number of digits.
	*/
	@Test
	void testCircularShift_6() {
		assertEquals("123", CircularShift.circularShift(123, 2));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is greater than the number of digits.
	*/
	@Test
	void testCircularShift_7() {
		assertEquals("987", CircularShift.circularShift(789, 8));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is less than the number of digits.
	*/
	@Test
	void testCircularShift_8() {
		assertEquals("321", CircularShift.circularShift(123, 1));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is greater than the number of digits.
	*/
	@Test
	void testCircularShift_9() {
		assertEquals("111", CircularShift.circularShift(111, 101));
	}
	
	/**
	* Test case for {@link CircularShift#circularShift(int, int)} method.
	* It tests the case when the shift is less than the number of digits.
	*/
	@Test
	void testCircularShift_10() {
		assertEquals("123", CircularShift.circularShift(123, 0));
	}
}
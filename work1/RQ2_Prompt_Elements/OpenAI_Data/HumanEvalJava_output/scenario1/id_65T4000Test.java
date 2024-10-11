// CircularShiftTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

	/**
	* Test case 1.
	* The input is:
	* x = 12345
	* shift = 1
	* The expected output is:
	* 52341
	*/
	@Test
	void test1() {
		int x = 12345;
		int shift = 1;
		String expected = "52341";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input is:
	* x = 12345
	* shift = 2
	* The expected output is:
	* 34512
	*/
	@Test
	void test2() {
		int x = 12345;
		int shift = 2;
		String expected = "34512";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input is:
	* x = 12345
	* shift = 3
	* The expected output is:
	* 45123
	*/
	@Test
	void test3() {
		int x = 12345;
		int shift = 3;
		String expected = "45123";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input is:
	* x = 12345
	* shift = 4
	* The expected output is:
	* 51234
	*/
	@Test
	void test4() {
		int x = 12345;
		int shift = 4;
		String expected = "51234";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input is:
	* x = 12345
	* shift = 5
	* The expected output is:
	* 12345
	*/
	@Test
	void test5() {
		int x = 12345;
		int shift = 5;
		String expected = "12345";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input is:
	* x = 12345
	* shift = 6
	* The expected output is:
	* 52341
	*/
	@Test
	void test6() {
		int x = 12345;
		int shift = 6;
		String expected = "52341";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input is:
	* x = 12345
	* shift = 7
	* The expected output is:
	* 34512
	*/
	@Test
	void test7() {
		int x = 12345;
		int shift = 7;
		String expected = "34512";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input is:
	* x = 12345
	* shift = 8
	* The expected output is:
	* 45123
	*/
	@Test
	void test8() {
		int x = 12345;
		int shift = 8;
		String expected = "45123";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input is:
	* x = 12345
	* shift = 9
	* The expected output is:
	* 51234
	*/
	@Test
	void test9() {
		int x = 12345;
		int shift = 9;
		String expected = "51234";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input is:
	* x = 12345
	* shift = 10
	* The expected output is:
	* 12345
	*/
	@Test
	void test10() {
		int x = 12345;
		int shift = 10;
		String expected = "12345";
		String actual = CircularShift.circularShift(x, shift);
		assertEquals(expected, actual);
	}
}
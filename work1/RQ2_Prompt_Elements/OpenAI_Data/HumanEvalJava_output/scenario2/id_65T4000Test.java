// CircularShiftTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

	/**
	* Test case 1.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 1
	* Expected result: "23451"
	*/
	@Test
	void testCase1() {
		assertEquals("23451", CircularShift.circularShift(12345, 1));
	}
	
	/**
	* Test case 2.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 2
	* Expected result: "34512"
	*/
	@Test
	void testCase2() {
		assertEquals("34512", CircularShift.circularShift(12345, 2));
	}
	
	/**
	* Test case 3.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 3
	* Expected result: "45123"
	*/
	@Test
	void testCase3() {
		assertEquals("45123", CircularShift.circularShift(12345, 3));
	}
	
	/**
	* Test case 4.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 4
	* Expected result: "51234"
	*/
	@Test
	void testCase4() {
		assertEquals("51234", CircularShift.circularShift(12345, 4));
	}
	
	/**
	* Test case 5.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 5
	* Expected result: "12345"
	*/
	@Test
	void testCase5() {
		assertEquals("12345", CircularShift.circularShift(12345, 5));
	}
	
	/**
	* Test case 6.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 6
	* Expected result: "54321"
	*/
	@Test
	void testCase6() {
		assertEquals("54321", CircularShift.circularShift(12345, 6));
	}
	
	/**
	* Test case 7.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 7
	* Expected result: "43215"
	*/
	@Test
	void testCase7() {
		assertEquals("43215", CircularShift.circularShift(12345, 7));
	}
	
	/**
	* Test case 8.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 8
	* Expected result: "32154"
	*/
	@Test
	void testCase8() {
		assertEquals("32154", CircularShift.circularShift(12345, 8));
	}
	
	/**
	* Test case 9.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 9
	* Expected result: "21543"
	*/
	@Test
	void testCase9() {
		assertEquals("21543", CircularShift.circularShift(12345, 9));
	}
	
	/**
	* Test case 10.
	* Test method with following params:
	*				- x = 12345
	*				- shift = 10
	* Expected result: "15432"
	*/
	@Test
	void testCase10() {
		assertEquals("15432", CircularShift.circularShift(12345, 10));
	}
}
// StartsOneEndsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive() {
		assertEquals(20, StartsOneEnds.startsOneEnds(1));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-1));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive2() {
		assertEquals(200, StartsOneEnds.startsOneEnds(2));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative2() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-2));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero2() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive3() {
		assertEquals(2000, StartsOneEnds.startsOneEnds(3));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative3() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-3));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero3() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive4() {
		assertEquals(20000, StartsOneEnds.startsOneEnds(4));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative4() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-4));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero4() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive5() {
		assertEquals(200000, StartsOneEnds.startsOneEnds(5));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative5() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-5));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero5() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive6() {
		assertEquals(2000000, StartsOneEnds.startsOneEnds(6));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative6() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-6));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero6() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive7() {
		assertEquals(20000000, StartsOneEnds.startsOneEnds(7));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative7() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-7));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero7() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive8() {
		assertEquals(200000000, StartsOneEnds.startsOneEnds(8));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative8() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-8));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero8() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive9() {
		assertEquals(2000000000, StartsOneEnds.startsOneEnds(9));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative9() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-9));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero9() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a positive integer.
	*/
	@Test
	void testStartsOneEndsPositive10() {
		assertEquals(20000000000L, StartsOneEnds.startsOneEnds(10));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a negative integer.
	*/
	@Test
	void testStartsOneEndsNegative10() {
		assertEquals(0, StartsOneEnds.startsOneEnds(-10));
	}
	
	/**
	* Test case for {@link StartsOneEnds#startsOneEnds(int)} method.
	* It tests the method with a zero.
	*/
	@Test
	void testStartsOneEndsZero10() {
		assertEquals(0, StartsOneEnds.startsOneEnds(0));
	}
}
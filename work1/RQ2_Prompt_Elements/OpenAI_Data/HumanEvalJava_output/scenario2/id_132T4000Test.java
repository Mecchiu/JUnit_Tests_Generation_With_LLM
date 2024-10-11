// IsNestedTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

	/**
	* Test case 1.
	* The input string is empty.
	* The expected result is false.
	*/
	@Test
	void test1() {
		String string = "";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 2.
	* The input string contains only one opening bracket.
	* The expected result is false.
	*/
	@Test
	void test2() {
		String string = "[";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 3.
	* The input string contains only one closing bracket.
	* The expected result is false.
	*/
	@Test
	void test3() {
		String string = "]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 4.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test4() {
		String string = "[]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 5.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test5() {
		String string = "[[]]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 6.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test6() {
		String string = "[[][]]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 7.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test7() {
		String string = "[[[]]]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 8.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test8() {
		String string = "[[[][]]]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 9.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test9() {
		String string = "[[[][]][]]";
		assertFalse(IsNested.isNested(string));
	}
	
	/**
	* Test case 10.
	* The input string contains only one pair of brackets.
	* The expected result is false.
	*/
	@Test
	void test10() {
		String string = "[[[][]][[]]]";
		assertTrue(IsNested.isNested(string));
	}
}
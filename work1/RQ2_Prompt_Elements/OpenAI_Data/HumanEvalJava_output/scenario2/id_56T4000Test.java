// CorrectBracketingTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

	/**
	* Test case 1 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is correct.
	*/
	@Test
	void testCorrectBracketing1() {
		assertTrue(CorrectBracketing.correctBracketing("<<>>"));
	}
	
	/**
	* Test case 2 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing2() {
		assertFalse(CorrectBracketing.correctBracketing("<<<>>"));
	}
	
	/**
	* Test case 3 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing3() {
		assertFalse(CorrectBracketing.correctBracketing("<<>><"));
	}
	
	/**
	* Test case 4 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing4() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>>"));
	}
	
	/**
	* Test case 5 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing5() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><"));
	}
	
	/**
	* Test case 6 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing6() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><>"));
	}
	
	/**
	* Test case 7 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing7() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><><"));
	}
	
	/**
	* Test case 8 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing8() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><><>"));
	}
	
	/**
	* Test case 9 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing9() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><><><"));
	}
	
	/**
	* Test case 10 for {@link CorrectBracketing#correctBracketing(String)}.
	* It tests the method with a string of brackets that is not correct.
	*/
	@Test
	void testCorrectBracketing10() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><><><>"));
	}
}
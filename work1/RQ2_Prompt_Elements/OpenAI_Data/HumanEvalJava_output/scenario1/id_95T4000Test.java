// CheckDictCaseTest.java
package scenario1;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

	/**
	* Test case 1.
	* The input is a dictionary with all lowercase keys.
	* The expected result is true.
	*/
	@Test
	void testCase1() {
		Map<String, String> dict = Map.of("a", "1", "b", "2", "c", "3");
		assertTrue(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 2.
	* The input is a dictionary with all uppercase keys.
	* The expected result is true.
	*/
	@Test
	void testCase2() {
		Map<String, String> dict = Map.of("A", "1", "B", "2", "C", "3");
		assertTrue(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 3.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase3() {
		Map<String, String> dict = Map.of("a", "1", "B", "2", "c", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 4.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase4() {
		Map<String, String> dict = Map.of("A", "1", "b", "2", "C", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 5.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase5() {
		Map<String, String> dict = Map.of("A", "1", "B", "2", "c", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 6.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase6() {
		Map<String, String> dict = Map.of("a", "1", "B", "2", "C", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 7.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase7() {
		Map<String, String> dict = Map.of("A", "1", "b", "2", "C", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 8.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase8() {
		Map<String, String> dict = Map.of("a", "1", "B", "2", "C", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 9.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase9() {
		Map<String, String> dict = Map.of("A", "1", "b", "2", "c", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case 10.
	* The input is a dictionary with mixed case keys.
	* The expected result is false.
	*/
	@Test
	void testCase10() {
		Map<String, String> dict = Map.of("a", "1", "B", "2", "C", "3");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
}
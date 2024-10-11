// CheckDictCaseTest.java
package original;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns true when all keys are strings in lower case.
	*/
	@Test
	void testCheckDictCase_AllLowerCase() {
		Map<String, String> dict = Map.of("p", "pineapple", "b", "banana");
		assertTrue(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when all keys are not strings in lower case.
	*/
	@Test
	void testCheckDictCase_NotAllLowerCase() {
		Map<String, String> dict = Map.of("p", "pineapple", "A", "banana", "B", "banana");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when all keys are not strings.
	*/
	@Test
	void testCheckDictCase_NotAllString() {
		Map<String, String> dict = Map.of("p", "pineapple", "5", "banana", "a", "apple");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when all keys are not strings in upper case.
	*/
	@Test
	void testCheckDictCase_NotAllUpperCase() {
		Map<String, String> dict = Map.of("Name", "John", "Age", "36", "City", "Houston");
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns true when all keys are strings in upper case.
	*/
	@Test
	void testCheckDictCase_AllUpperCase() {
		Map<String, String> dict = Map.of("STATE", "NC", "ZIP", "12345");
		assertTrue(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns true when all keys are strings in lower case.
	*/
	@Test
	void testCheckDictCase_AllLowerCase2() {
		Map<String, String> dict = Map.of("fruit", "Orange", "taste", "Sweet");
		assertTrue(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when the given dictionary is empty.
	*/
	@Test
	void testCheckDictCase_EmptyDict() {
		Map<String, String> dict = Map.of();
		assertFalse(CheckDictCase.checkDictCase(dict));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when the given object is not a dictionary.
	*/
	@Test
	void testCheckDictCase_NotDict() {
		String str = "Hello World!";
		assertFalse(CheckDictCase.checkDictCase(str));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when the given object is null.
	*/
	@Test
	void testCheckDictCase_Null() {
		assertFalse(CheckDictCase.checkDictCase(null));
	}
	
	/**
	* Test case for {@link CheckDictCase#checkDictCase(Object)} method.
	* It checks if the method returns false when the given object is an empty array.
	*/
	@Test
	void testCheckDictCase_EmptyArray() {
		String[] arr = new String[0];
		assertFalse(CheckDictCase.checkDictCase(arr));
	}
}
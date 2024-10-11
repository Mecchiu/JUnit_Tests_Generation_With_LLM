// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_Test() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertTrue(stringMatchesGuardCondition.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "Test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_TestUpperCase() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("Test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Test1() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "1test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_1Test() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("1test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "1test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_1Test1() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("1test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Test1Test() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("test1test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "testtest".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_TestTest() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("testtest"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "testtesttest".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_TestTestTest() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("testtesttest"));
	}
	
}

// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_Test() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertTrue(stringMatchesGuardCondition.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "Test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_TestUpperCase() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("Test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Test1() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "1test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_1Test() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("1test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "1test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_1Test1() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		assertFalse(stringMatchesGuardCondition.evaluate("1test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1test".
	* Expected result: false.
	*/
	@Test
	void testEval
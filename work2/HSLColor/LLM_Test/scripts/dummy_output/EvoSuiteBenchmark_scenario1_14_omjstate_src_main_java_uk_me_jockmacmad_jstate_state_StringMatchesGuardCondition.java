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
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_1() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test");
		boolean result = fixture.evaluate(o);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_2() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test2");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_3() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_4() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test ");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_5() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event(" test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_6() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_7() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_8() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_9() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_10() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
}
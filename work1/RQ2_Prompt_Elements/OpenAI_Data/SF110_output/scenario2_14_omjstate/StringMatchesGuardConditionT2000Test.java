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
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test");
		assertTrue(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_2() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_3() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_4() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_5() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		event.addParameter("test4");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_6() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		event.addParameter("test4");
		event.addParameter("test5");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_7() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		event.addParameter("test4");
		event.addParameter("test5");
		event.addParameter("test6");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_8() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		event.addParameter("test4");
		event.addParameter("test5");
		event.addParameter("test6");
		event.addParameter("test7");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_9() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		event.addParameter("test4");
		event.addParameter("test5");
		event.addParameter("test6");
		event.addParameter("test7");
		event.addParameter("test8");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_10() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition();
		stringMatchesGuardCondition.Value = "test";
		Event event = new Event();
		event.addParameter("test1");
		event.addParameter("test2");
		event.addParameter("test3");
		event.addParameter("test4");
		event.addParameter("test5");
		event.addParameter("test6");
		event.addParameter("test7");
		event.addParameter("test8");
		event.addParameter("test9");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
}
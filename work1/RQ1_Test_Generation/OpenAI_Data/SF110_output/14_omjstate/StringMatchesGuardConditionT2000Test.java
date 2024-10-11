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
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test");
		assertTrue(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate2() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test2");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate3() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test3");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate4() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test4");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate5() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test5");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate6() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test6");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate7() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test7");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate8() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test8");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate9() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test9");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}.
	* Test method for {@link StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	void testEvaluate10() {
		StringMatchesGuardCondition stringMatchesGuardCondition = new StringMatchesGuardCondition("test");
		Event event = new Event("test10");
		assertFalse(stringMatchesGuardCondition.evaluate(event));
	}
	
}
// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		
	/**
	* Test method for {@link uk.me.jockmacmad.jstate.state.StringMatchesGuardCondition#evaluate(Object)}.
	*/
	@Test
	public void testEvaluate() {
		EvaluationState<String, Object> s = new StringEvaluationState<>("123");
		EvaluationState<String, Object> e = new StringEvaluationState<>("456");
		check(true, e);
		assertEquals(false, s.evaluate(e));
		assertEquals(false, s.evaluate(e));
	}

}
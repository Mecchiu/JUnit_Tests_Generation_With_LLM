// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

	// private StringMatchesGuardConditionTest()
	// {
	// }

		@Test
    public void testEvaluate() {
				
		String str = "TEST";
		
		StringMatchesGuardCondition cond = new StringMatchesGuardCondition();
		int result = cond.evaluate(new uk.me.jockmacmad.jstate.state.Event(str));
		assertEquals(1, result);
    }
}
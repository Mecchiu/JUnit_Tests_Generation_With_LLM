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
	public void testevaluate() {
		System.out.println("StringMatchesGuardConditionTest.testevaluate");
		
		StringMatchesGuardCondition value = new StringMatchesGuardCondition("Test");
		System.out.println("result of testcase: " + "value = " + value.evaluate(null));

	}
	
	/**
	 * A unit test for {@link StringMatchesGuardCondition#evaluate(Object)}.
	 */
	@Test
	public void testEvaluate() {
	
		System.out.println("StringMatchesGuardConditionTest.a unit test for evaluate");
		
		StringMatchesGuardCondition value = new StringMatchesGuardCondition("Test");
		System.out.println("result of testcase: " + "value = " + value.evaluate(new Object()));
	}

}
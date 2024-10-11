// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		
	@Test
	public void test() {
		// instance should not be null
		StringMatchesGuardCondition stringMatchesGuardConditionInstance = new StringMatchesGuardCondition(null);
		assertNotNull(stringMatchesGuardConditionInstance);
		
		// instance should not be equal to null
		StringMatchesGuardCondition stringMatchesGuardConditionInstance2 = new StringMatchesGuardCondition("");
		assertNotNull(stringMatchesGuardConditionInstance2);
		assertEquals(stringMatchesGuardConditionInstance.getClass().getName(), stringMatchesGuardConditionInstance2.getClass().getName());
		assertEquals(stringMatchesGuardConditionInstance.getClass(), stringMatchesGuardConditionInstance2.getClass());
		
		// instance should be of same type
		StringMatchesGuardCondition stringMatchesGuardConditionInstance3 = new StringMatchesGuardCondition("");
		assertEquals(stringMatchesGuardConditionInstance.getClass(), stringMatchesGuardConditionInstance3.getClass());
		
		// instance should not be any string
		StringMatchesGuardCondition stringMatchesGuardConditionInstance4 = new StringMatchesGuardCondition("Any");
		assertNotNull(stringMatchesGuardConditionInstance4);
		assertFalse(stringMatchesGuardConditionInstance == stringMatchesGuardConditionInstance4);
		
		// instance should not be an empty string
		StringMatchesGuardCondition stringMatchesGuardConditionInstance5 = new StringMatchesGuardCondition("  ");
		assertNotNull(stringMatchesGuardConditionInstance5);
		assertFalse(stringMatchesGuardConditionInstance == stringMatchesGuardConditionInstance5);
		
		// instance should be a valid string
		StringMatchesGuardCondition stringMatchesGuardConditionInstance6 = new StringMatchesGuardCondition("The");
		assertTrue(stringMatchesGuardConditionInstance!= stringMatchesGuardConditionInstance6);
		
		/*********************************************************************************/
		// method not tested
	}
}
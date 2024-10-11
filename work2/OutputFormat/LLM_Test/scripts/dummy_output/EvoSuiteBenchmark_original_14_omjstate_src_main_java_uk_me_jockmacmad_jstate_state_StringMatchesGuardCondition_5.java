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
	 * Test method.
	 */
	@Test
	public void testInto() {
		StringMatchesGuardCondition instance = new StringMatchesGuardCondition("The value of this object is "
				+ "an invalid String");
		boolean retValue = instance.evaluate(new Integer(22));
		assertTrue(retValue);
		retValue = StringMatchesGuardCondition.evaluate(instance);
		assertFalse(retValue);
		
		String newValue = "This value is 12";
		StringMatchesGuardCondition testObject = new StringMatchesGuardCondition(newValue);
		retValue = testObject.evaluate(new Integer(22));
		assertTrue(retValue);
		retValue = testObject.evaluate(new Integer(42));
		assertFalse(retValue);
	}
}
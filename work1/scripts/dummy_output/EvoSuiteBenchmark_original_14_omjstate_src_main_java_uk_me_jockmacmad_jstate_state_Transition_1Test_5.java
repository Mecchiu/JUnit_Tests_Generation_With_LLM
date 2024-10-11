// Transition_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#willTrigger(IState, Event)} method.
*/
class Transition_1Test {
		
	/**
	 * Test of willTrigger method, of class Transition.
	 * @throws java.lang.Exception if any.
	 */
	@Test
	public void testWillTrigger() throws Exception {
		System.out.println("willTrigger");
		Object trigger = myTriggeredConditions.get(0);
		// the "trigger" can now be set to null
		// so we can assert if a state is null.
		
		// if there are two, then if one of them (2 or 3) evaluates to false, no valid state was detected.
		assertFalse(check());
		
		assertEquals(myTriggeredConditions.get(1).evaluate(myState1), myState2.get());
	
		assertEquals(myTriggeredConditions.get(2).evaluate(myState1), myState3.get());
		
	}
	
    /**
    * Test of willTrigger method, of class Transition.
    * Creation date: (2/15/01 2:57:49 PM)
    * @since 0.1
    * @throws java.lang.Exception if any.
    */
    @Test
    public void testNoTrigger() throws Exception {
    	// a state being defined here will be asserted in the method
    	// but in the tests is that you can check the event that is set.
    	System.out.println("state not defined");
    	Object trigger = null, shouldBe = null, shouldNotBe;
    	String name = "trigger";
    	String message = null;
}
}
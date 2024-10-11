// Transition_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#trigger(IState, Event)} method.
*/
class Transition_0Test {
		
	/**
	 * Test method for {@link Transition#getTriggerEvent()}.
	 *
	 * @since 0.1
	 */
	@Test
	public void testGetTriggerEvent() {
		
		// Invalid State
		assertNull(Transition.getTriggerEvent());
		
		// Valid State
		IState myCurrentState = new IState();
		assertNotNull(Transition.getTriggerEvent(myCurrentState));
		
		// Valid Event
		Event triggerEvent = new Event("name");
		IState myNextState = new IState();
		assertNotNull(myNextState.getTriggerEvent(triggerEvent, myCurrentState));
		
	}
	
	/**
	 * Test method for {@link Transition#equals(Object)}.
	 */
	@Test
	public void testEqualsObject() {
		
		// Invalid Object
		assertFalse(Transition.equals(null));
		
		// Other Equivalence Types
		EqualsBuilder typeB1 = new EqualsBuilder();
		Transition transition1 = new Transition();
		typeB1.append(transition1, "trigger_event", trigger(newState("trigger"), Event.TRIGGER_RISK_EVENT));
		assertTrue(typeB1.isEquals());
		
		// Invalid State and Event
		assertFalse(typeB1.isEquals(new Transition()));
		assertFalse(typeB1.isEquals(new State()));
		assertFalse(typeB1.isEquals(new IState()));
		
	}
	
	/**
	 * Test method for {@link Transition#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		
		// Invalid State
		Transition transition1 = new Transition();
		assertFalse(transition1.hashCode() == 0);
		
		Transition transition2 = new Transition();
}
}
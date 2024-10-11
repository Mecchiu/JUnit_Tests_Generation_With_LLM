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
		
	@SuppressWarnings("unused")
	private final static String name = "name";
	
	/**
	  * Unit test for {@link Transition#willTrigger(IState, Event)}.
	  */
	@Test
	public void testTriggerIStateEvent1() {
			
		StateManager sm = StateManager.getInstance();
		IState initialState = sm.currentState();
		
		StateManager.setStateManager(new StateManager_1());		
		
		// Set up the event
		Event triggerEventIEvent = new Event("test.event1", 1234, new Date(1333));
		
		// Set up the event triggering
		IState outcomeStateE = sm.createState("outcomeStateE", new IInitialStateFactory("outcome"));
		sm.join(triggerEventIEvent, outcomeStateE);
		
		IState currentStateI = sm.currentState();
		
		// State Machine transition
		sm.setState(initialState);
		IState currentState = sm.currentState();
		
		sm.setState(initialState);
		IState triggerState = sm.createState("triggerState", new IInitialStateFactory("trigger"));

		sm.setState(currentState);
		IState currentStateI_1 = sm.currentState();
		
		sm.setState(currentState);
		IState resultStateI = sm.createState("resultStateI", new IInitialStateFactory("result"));
		
		sm.setState(currentState);
		IState triggerState_1 = sm.createState("triggerState_1", new IInitialStateFactory("trigger"));
		
		// Now test for willTrigger
		boolean shouldTrigger = false;
		
		shouldTrigger = sm.willTrigger(initiate(triggerState), triggerEvent);
		
}
}
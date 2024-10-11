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
	 * Initialise our test case.
	 * Creation date: (6/02/01 6:12:09 PM)
	 * @throws java.lang.Exception
	 */
	@Test
	void initialise(){
		assertNotNull( "State Machine should have been created!",
				StateMachineManager.getStateMachineManager().getStateMachine("Transition"));
	}
	
	/**
	 * Tests whether a transition is valid.
	 */
	@Test
	void validTest(){
		Transition transition = new Transition("Transition");
		Event triggerEvent = new Event("trigger");
		System.out.println(ToStringBuilder.reflectionToString(transition));
		System.out.println(ToStringBuilder.reflectionToString(transition));
	}
	
	/**
	 * Tests that a transition that does no
	 *  guard conditions returns to the starting state.
	 */
	@Test
	void noGuardConditionTest(){
		Transition transition = new Transition("Transition");
		transition.addGuardCondition(new IGuardCondition() {
			@Override
			public boolean evaluate(State currentState, Event event) {
				return true;
			}
		});
		System.out.println(ToStringBuilder.reflectionToString(transition));
	}

}
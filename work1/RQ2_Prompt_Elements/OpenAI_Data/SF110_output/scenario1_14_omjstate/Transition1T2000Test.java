// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#willTrigger(IState, Event)} method.
*/
class TransitionTest {

	@Test
	void testWillTrigger_1() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("currentState");
		Event event = new Event("event");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_2() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("event");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_3() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_4() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition = new GuardCondition(true);
		transition.addGuardCondition(guardCondition);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_5() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition = new GuardCondition(false);
		transition.addGuardCondition(guardCondition);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_6() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition1 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition1);
		IGuardCondition guardCondition2 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition2);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_7() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition1 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition1);
		IGuardCondition guardCondition2 = new GuardCondition(false);
		transition.addGuardCondition(guardCondition2);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_8() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition1 = new GuardCondition(false);
		transition.addGuardCondition(guardCondition1);
		IGuardCondition guardCondition2 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition2);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_9() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition1 = new GuardCondition(false);
		transition.addGuardCondition(guardCondition1);
		IGuardCondition guardCondition2 = new GuardCondition(false);
		transition.addGuardCondition(guardCondition2);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_10() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		IGuardCondition guardCondition1 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition1);
		IGuardCondition guardCondition2 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition2);
		IGuardCondition guardCondition3 = new GuardCondition(true);
		transition.addGuardCondition(guardCondition3);
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
}

// GuardCondition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A guard condition that is evaluated upon receiving an event.
 * <p>
 *   Given an event the guard condition
 *     evaluates if it applies by checking
 *     the event matches its own.
 *     Once it ascertains it is for the event
 *     it evaluates the condition and returns
 *     the result.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class GuardCondition {

    public final boolean evaluate(final Event pEvent) {
        boolean retVal = false;
        if (event.equals(pEvent)) {
            retVal = condition;
        }
        return retVal;
    }
}

// GuardConditionTest.java
package uk.me.jockmacmad.jstate.state
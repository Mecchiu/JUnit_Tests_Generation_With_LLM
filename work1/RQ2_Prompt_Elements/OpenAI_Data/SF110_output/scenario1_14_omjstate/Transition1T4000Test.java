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
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_6() {
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
	void testWillTrigger_7() {
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
	void testWillTrigger_8() {
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
	void testWillTrigger_9() {
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
	void testWillTrigger_10() {
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
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    public final boolean willTrigger(final IState pCurrentState, final Event pEvent) {
        boolean retVal = false;
        boolean passesGuards = false;
        if ((initialState.equals(pCurrentState)) && (triggerEvent.equals(pEvent))) {
            for (IGuardCondition ig : guardConditions) {
                passesGuards = ig.evaluate(pEvent);
            }
            if (passesGuards) {
                retVal = true;
            }
        }
        return retVal;
    }
}

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
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_6() {
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
	void testWillTrigger_7() {
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
	void testWillTrigger_8() {
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
	void testWillTrigger_9() {
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
	void testWillTrigger_10() {
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
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    public final boolean willTrigger(final IState pCurrentState, final Event pEvent) {
        boolean retVal = false;
        boolean passesGuards = false;
        if ((initialState.equals(pCurrentState)) && (triggerEvent.equals(pEvent))) {
            for (IGuardCondition ig : guardConditions) {
                passesGuards = ig.evaluate(pEvent);
            }
            if (passesGuards) {
                retVal = true;
            }
        }
        return retVal;
    }
}

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
		
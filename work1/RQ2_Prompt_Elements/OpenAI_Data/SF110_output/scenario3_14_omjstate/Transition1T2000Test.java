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
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_2() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_3() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_4() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_5() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_6() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_7() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_8() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_9() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_10() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
}

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A state machine that can be in one of a number of states.
 * <p>
 *   The state machine is in one state at any given time.
 *     When an event is received, the state machine
 *     evaluates all the transitions it has associated
 *     with the current state. If any of the transitions
 *     evaluate to true, then the state machine executes
 *     the transition and changes to the new state.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class StateMachine {

    /**
     * The current state of the state machine.
     */
    private IState currentState;

    /**
     * The transitions that the state machine can take.
     */
    private List transitions;

    /**
     * Constructor for the StateMachine object
     * Creation date: (14/02/01 6:15:12 PM)
     */
    public StateMachine() {
        transitions = new ArrayList();
    }

    /**
     * Add a transition to the state machine.
     * Creation date: (14/02/01 6:15:12 PM)
     *
     * @param pTransition the transition to add
     */
    public final void addTransition(final Transition pTransition) {
        transitions.add(pTransition);
    }

    /**
     * Get the current state of the state machine.
     * Creation date: (14/02/01 6:15:12 PM)
     *
     * @return the current state of the state machine
     */
    public final IState getCurrentState() {
        return currentState;
    }

    /**
     * Set the current state of the state machine.
     * Creation date: (14/02/01 6:15:12 PM)
     *
     * @param pCurrentState the current state of the state machine
     */
    public final void setCurrentState(final IState pCurrentState) {
        currentState = pCurrentState;
    }

    /**
     * Get the transitions that the state machine can take.
     * Creation date: (14/02/01 6:15:12 PM)
     *
     * @return the transitions that the state machine can take
     */
    public final List getTransitions() {
        return transitions;
    }

    /**
     * Set the transitions that the state machine can take.
     * Creation date: (14/02/01 6:15:12 PM)
     *
     * @param pTransitions the transitions that the state machine can take
     */
    public final void setTransitions(final List pTransitions) {
        transitions = pTransitions;
    }

    /**
     * Receive an event and evaluate all the transitions
     * associated with the current state. If any of the
     * transitions evaluate to true, then execute the
     * transition and change to the new state.
     * Creation date: (14/02/01 6:15:12 PM)
     *
     * @param pEvent the event to receive
     */
    public final void receiveEvent(final Event pEvent) {
        for (Iterator i = transitions.iterator(); i.hasNext();) {
            Transition transition = (Transition) i.next();
            if (transition.willTrigger(currentState, pEvent)) {
                currentState = transition.execute();
                break;
            }
        }
    }
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#receiveEvent(Event)} method.
*/
class StateMachineTest {
	
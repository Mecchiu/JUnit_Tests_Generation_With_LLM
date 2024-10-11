// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {

	@Test
	void testTrigger_1() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	@Test
	void testTrigger_2() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_3() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), triggerEvent);
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_4() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_5() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	@Test
	void testTrigger_6() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_7() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), triggerEvent);
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_8() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_9() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	@Test
	void testTrigger_10() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A state that can be transitioned to.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class State implements IState {

    private final String name;

    public State(final String pName) {
        name = pName;
    }

    public final String getName() {
        return name;
    }

    @Override
    public final boolean equals(final Object pOther) {
        if (pOther == null) {
            return false;
        }
        if (pOther == this) {
            return true;
        }
        if (pOther.getClass() != getClass()) {
            return false;
        }
        State rhs = (State) pOther;
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    @Override
    public final String toString() {
        return new ToStringBuilder(this).append("name", name).toString();
    }
}

// Event.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * An event that can be triggered.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Event implements IEvent {

    private final String name;

    public Event(final String pName) {
        name = pName;
    }

    public final String getName() {
        return name;
    }

    @Override
    public final boolean equals(final Object pOther) {
        if (pOther == null) {
            return false;
        }
        if (pOther == this) {
            return true;
        }
        if (pOther.getClass() != getClass()) {
            return false;
        }
        Event rhs = (Event) pOther;
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    @Override
    public final String toString() {
        return new ToStringBuilder(this).append("name", name).toString();
    }
}

// IState.java
package uk.me.jockmacmad.jstate.state;

/**
 * A state that can be transitioned to.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public interface IState {

    /**
     * Get the name of the state.
     *
     * @return the name of the state.
     */
    String getName();
}

// IEvent.java
package uk.me.jockmacmad.jstate.state;

/**
 * An event that can be triggered.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public interface IEvent {

    /**
     * Get the name of the event.
     *
     * @return the name of the event.
     */
    String getName();
}

// IGuardCondition.java
package uk.me.jockmacmad.jstate.state;

/**
 * A guard condition that can be evaluated.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public interface IGuardCondition {

    /**
     * Evaluate the guard condition.
     *
     * @param pEvent the event that triggered the transition.
     * @return true if the guard condition evaluates to true, false otherwise.
     */
    boolean evaluate(IEvent pEvent);
}

// ITransition.java
package uk.me.jockmacmad.jstate.state;

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
public interface ITransition {

    /**
     * Trigger the transition.
     *
     * @param pCurrentState the current state of the state machine.
     * @param pEvent        the event that triggered the transition.
     * @return the new state that the state machine is in.
     */
    IState trigger(IState pCurrentState, IEvent pEvent);
}

// IStateMachine.java
package uk.me.jockmacmad.jstate.state;

/**
 * A state machine that can be triggered.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public interface IStateMachine {

    /**
     * Trigger the state machine.
     *
     * @param pEvent the event that triggered the state machine.
     */
    void trigger(IEvent pEvent);

    /**
     * Get the current state of the state machine.
     *
     * @return the current state of the state machine.
     */
    IState getCurrentState();
}

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * A state machine that can be triggered.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class StateMachine implements IStateMachine {

    private IState currentState;
    private final List<ITransition> transitions = new ArrayList<ITransition>();

    public StateMachine(final IState pInitialState) {
        currentState = pInitialState;
    }

    public final void addTransition(final ITransition pTransition) {
        transitions.add(pTransition);
    }

    public final void trigger(final IEvent pEvent) {
        for (ITransition it : transitions) {
            IState newState = it.trigger(currentState, pEvent);
            if (!currentState.equals(newState)) {
                currentState = newState;
                break;
            }
        }
    }

    public final IState getCurrentState() {
        return currentState;
    }

    @Override
    public final boolean equals(final Object pOther) {
        if (pOther == null) {
            return false;
        }
        if (pOther == this) {
            return true;
        }
        if (pOther.getClass() != getClass()) {
            return false;
        }
        StateMachine rhs = (StateMachine) pOther;
        return new EqualsBuilder().append(currentState, rhs.currentState).append(transitions, rhs.transitions).isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37).append(currentState).append(transitions).toHashCode();
    }

    @Override
    public final String toString() {
        return new ToStringBuilder(this).append("currentState", currentState).append("transitions", transitions).toString();
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
* It contains ten unit test cases for the {@link StateMachine#trigger(IEvent)} method.
*/
class StateMachineTest {
		
	@Test
	void testTrigger_1() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		StateMachine stateMachine = new StateMachine(initialState);
		stateMachine.addTransition(transition);
		
		// When
		stateMachine.trigger(triggerEvent);
		
		// Then
		assertEquals(outcomeState, stateMachine.getCurrentState());
	}
	
	@Test
	void testTrigger_2() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		StateMachine stateMachine = new StateMachine(initialState);
		stateMachine.addTransition(transition);
		
		// When
		stateMachine.trigger(new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, stateMachine.getCurrentState());
	}
	
	@Test
	void testTrigger_3() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		StateMachine stateMachine = new StateMachine(initialState);
		stateMachine.addTransition(transition);
		
		// When
		stateMachine.trigger(triggerEvent);
		
		// Then
		assertEquals(outcomeState, stateMachine.getCurrentState());
	}
	
	@Test
	void testTrigger_4() {
		// Given
		IState initial
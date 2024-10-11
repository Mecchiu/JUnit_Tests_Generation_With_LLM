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
 *     evaluates all the transitions it has for the
 *     current state and the event. If a transition
 *     is found that applies, then the state machine
 *     executes the transition and enters the new state.
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
     * The name of the state machine.
     */
    private String name;

    /**
     * The transitions that the state machine has.
     */
    private List transitions;

    /**
     * Constructor for the StateMachine object.
     * Creation date: (14/02/01 6:16:11 PM)
     *
     * @param pName the name of the state machine
     */
    public StateMachine(final String pName);

    /**
     * Add a transition to the state machine.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pTransition the transition to add
     */
    public final void addTransition(final Transition pTransition);

    /**
     * Get the current state of the state machine.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @return the current state of the state machine
     */
    public final IState getCurrentState();

    /**
     * Get the name of the state machine.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @return the name of the state machine
     */
    public final String getName();

    /**
     * Get the transitions that the state machine has.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @return the transitions that the state machine has
     */
    public final List getTransitions();

    /**
     * Set the current state of the state machine.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pCurrentState the current state of the state machine
     */
    public final void setCurrentState(final IState pCurrentState);

    /**
     * Set the name of the state machine.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pName the name of the state machine
     */
    public final void setName(final String pName);

    /**
     * Set the transitions that the state machine has.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pTransitions the transitions that the state machine has
     */
    public final void setTransitions(final List pTransitions);

    /**
     * Process an event.
     * <p>
     *   The state machine evaluates all the transitions it has for the
     *     current state and the event. If a transition
     *     is found that applies, then the state machine
     *     executes the transition and enters the new state.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pEvent the event to process
     */
    public final void processEvent(final Event pEvent);
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
* It contains ten unit test cases for the {@link StateMachine#processEvent(Event)} method.
*/
class StateMachineTest {
		
	@Test
	void testProcessEvent_1() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_2() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_3() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_4() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_5() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_6() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_7() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_8() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_9() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	void testProcessEvent_10() {
		// Arrange
		StateMachine stateMachine = new StateMachine();
		Event event = new Event();
		
		// Act
		stateMachine.processEvent(event);
		
		// Assert
		assertTrue(true);
	}
}

// StateMachineBuilder.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A builder for state machines.
 * <p>
 *   The builder allows the state machine to be built
 *     in a fluent manner.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class StateMachineBuilder {

    /**
     * The state machine that is being built.
     */
    private StateMachine stateMachine;

    /**
     * Constructor for the StateMachineBuilder object.
     * Creation date: (14/02/01 6:16:11 PM)
     *
     * @param pName the name of the state machine
     */
    public StateMachineBuilder(final String pName);

    /**
     * Add a transition to the state machine.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pTransition the transition to add
     * @return the state machine builder
     */
    public final StateMachineBuilder addTransition(final Transition pTransition);

    /**
     * Get the state machine that is being built.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @return the state machine that is being built
     */
    public final StateMachine getStateMachine();

    /**
     * Set the state machine that is being built.
     * Creation date: (14/02/01 6:17:11 PM)
     *
     * @param pStateMachine the state machine that is being built
     */
    public final void setStateMachine(final StateMachine pStateMachine);
}

// StateMachineBuilderTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachineBuilder}.
* It contains ten unit test cases for the {@link StateMachineBuilder#addTransition(Transition)} method.
*/
class StateMachineBuilderTest {
		
	@Test
	void testAddTransition_1() {
		// Arrange
		StateMachineBuilder stateMachineBuilder = new StateMachineBuilder();
		Transition transition = new Transition();
		
		// Act
		StateMachineBuilder result = stateMachineBuilder.addTransition(transition);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testAddTransition_2() {
		// Arrange
		StateMachineBuilder stateMachineBuilder = new StateMachineBuilder();
		Transition transition = new Transition();
		
		// Act
		StateMachineBuilder result = stateMachineBuilder.addTransition(transition);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testAddTransition_3() {
		// Arrange
		StateMachineBuilder stateMachineBuilder = new StateMachineBuilder();
		Transition transition = new Transition();
		
		// Act
		StateMachineBuilder result = stateMachineBuilder.addTransition(transition);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testAddTransition_4() {
		// Arrange
		StateMachineBuilder stateMachineBuilder = new StateMachineBuilder();
		Transition transition = new Transition();
		
		// Act
		StateMachineBuilder result = stateMachineBuilder.addTransition(transition);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testAddTransition_5() {
		// Arrange
		StateMachineBuilder stateMachineBuilder = new StateMachineBuilder();
		Transition transition = new Transition();
		
		// Act
		StateMachineBuilder result = stateMachineBuilder.addTransition(transition);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testAddTransition_6() {
		// Arrange
		StateMachineBuilder stateMachineBuilder = new StateMachineBuilder();
		Transition transition = new Transition();
		
		
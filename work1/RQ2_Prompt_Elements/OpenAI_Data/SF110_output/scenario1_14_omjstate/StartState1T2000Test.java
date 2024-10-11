// StartStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toObject()} method.
*/
class StartStateTest {

	/**
	* Test case for {@link StartState#toObject()}.
	*/
	@Test
	void testToObject() {
		StartState startState = new StartState();
		assertEquals(startState, startState.toObject());
	}
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state in a state machine.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype state
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class State implements IState {

    private String name;

    /**
     * Constructor for the State object
     *
     * @param name The name of the state
     */
    public State(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the state
     *
     * @return The name of the state
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the name of the state
     *
     * @return The name of the state
     */
    public String toString() {
        return name;
    }

    /**
     * Returns the name of the state
     *
     * @return The name of the state
     */
    public java.lang.Object toObject() {
        return name;
    }

    /**
     * Returns the hash code of the state
     *
     * @return The hash code of the state
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    /**
     * Returns true if the state is equal to the given object
     *
     * @param obj The object to compare the state to
     * @return True if the state is equal to the given object
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        State rhs = (State) obj;
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }
}

// StateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link State}.
* It contains ten unit test cases for the {@link State#toObject()} method.
*/
class StateTest {
		
	/**
	* Test case for {@link State#toObject()}.
	*/
	@Test
	void testToObject() {
		State state = new State("test");
		assertEquals("test", state.toObject());
	}
}

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machine.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype state machine
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class StateMachine {

    private IState currentState;

    /**
     * Constructor for the StateMachine object
     *
     * @param startState The starting state of the state machine
     */
    public StateMachine(IState startState) {
        currentState = startState;
    }

    /**
     * Returns the current state of the state machine
     *
     * @return The current state of the state machine
     */
    public IState getCurrentState() {
        return currentState;
    }

    /**
     * Sets the current state of the state machine
     *
     * @param state The new current state of the state machine
     */
    public void setCurrentState(IState state) {
        currentState = state;
    }
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#getCurrentState()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#getCurrentState()}.
	*/
	@Test
	void testGetCurrentState() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals(new StartState(), stateMachine.getCurrentState());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#setCurrentState(IState)} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#setCurrentState(IState)}.
	*/
	@Test
	void testSetCurrentState() {
		StateMachine stateMachine = new StateMachine(new StartState());
		stateMachine.setCurrentState(new State("test"));
		assertEquals(new State("test"), stateMachine.getCurrentState());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#StateMachine(IState)} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*/
	@Test
	void testStateMachine() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals(new StartState(), stateMachine.getCurrentState());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#StateMachine(IState)} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*/
	@Test
	void testStateMachine() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals(new StartState(), stateMachine.getCurrentState());
	}
}

// StateMachineTest.java
package uk
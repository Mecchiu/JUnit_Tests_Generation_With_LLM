// StartStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartStateTest {

	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton2() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton3() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton4() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton5() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton6() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton7() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton8() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton9() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton10() {
		StartState result = StartState.getSingleton();
		assertNotNull(result);
	}
	
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class State implements IState {

    /**
     * The name of the state.
     */
    private String name;

    /**
     * Constructor for the State object
     *
     * @param name The name of the state.
     */
    public State(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the state.
     *
     * @return The name of the state.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the state.
     *
     * @return A string representation of the state.
     */
    public String toString() {
        return name;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj The reference object with which to compare.
     * @return True if this object is the same as the obj argument; false otherwise.
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
* It contains ten unit test cases for the {@link State#State(String)} method.
*/
class StateTest {
		
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState2() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState3() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState4() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState5() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState6() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState7() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState8() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState9() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State(String)}.
	*
	* @since 0.1
	*/
	@Test
	void testState10() {
		String name = "";
		State result = new State(name);
		assertNotNull(result);
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
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class StateMachine {

    /**
     * The current state of the state machine.
     */
    private IState currentState;

    /**
     * The start state of the state machine.
     */
    private IState startState;

    /**
     * Constructor for the StateMachine object
     *
     * @param startState The start state of the state machine.
     */
    public StateMachine(IState startState) {
        this.startState = startState;
        currentState = startState;
    }

    /**
     * Returns the current state of the state machine.
     *
     * @return The current state of the state machine.
     */
    public IState getCurrentState() {
        return currentState;
    }

    /**
     * Returns the start state of the state machine.
     *
     * @return The start state of the state machine.
     */
    public IState getStartState() {
        return startState;
    }

    /**
     * Sets the current state of the state machine.
     *
     * @param state The new current state of the state machine.
     */
    public void setCurrentState(IState state) {
        currentState = state;
    }

    /**
     * Returns a string representation of the state machine.
     *
     * @return A string representation of the state machine.
     */
    public String toString() {
        return "StateMachine: " + currentState;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currentState).append(startState).toHashCode();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj The reference object with which to compare.
     * @return True if this object is the same as the obj argument; false otherwise.
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
        StateMachine rhs = (StateMachine) obj;
        return new EqualsBuilder().append(currentState, rhs.currentState).append(startState, rhs.startState).isEquals();
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
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine2() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine3() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine4() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine5() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine6() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine7() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine8() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine9() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link StateMachine#StateMachine(IState)}.
	*
	* @since 0.1
	*/
	@Test
	void testStateMachine10() {
		IState startState = null;
		StateMachine result = new StateMachine(startState);
		assertNotNull(result);
	}
	
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machines transition.
 * Creation date: (19/02/01 4:22:22 PM)
 *
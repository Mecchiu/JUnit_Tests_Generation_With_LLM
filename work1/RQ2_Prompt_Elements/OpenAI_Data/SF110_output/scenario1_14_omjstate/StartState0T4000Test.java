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
     * Constructor for the State object
     *
     * @param name The name of the state
     */
    public State(String name) {
        this.name = name;
    }

    /**
     * The name of the state
     */
    private String name;

    /**
     * Gets the name attribute of the State object
     *
     * @return The name value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name attribute of the State object
     *
     * @param name The new name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the Method
     *
     * @param obj Description of Parameter
     * @return Description of the Returned Value
     */
    public boolean equals(Object obj) {
        if (obj instanceof State) {
            State rhs = (State) obj;
            return new EqualsBuilder().append(name, rhs.name).isEquals();
        }
        return false;
    }

    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     */
    public String toString() {
        return name;
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
     * The current state of the state machine
     */
    private IState currentState;

    /**
     * The start state of the state machine
     */
    private IState startState;

    /**
     * Constructor for the StateMachine object
     *
     * @param startState The start state of the state machine
     */
    public StateMachine(IState startState) {
        this.startState = startState;
        currentState = startState;
    }

    /**
     * Gets the currentState attribute of the StateMachine object
     *
     * @return The currentState value
     */
    public IState getCurrentState() {
        return currentState;
    }

    /**
     * Sets the currentState attribute of the StateMachine object
     *
     * @param currentState The new currentState value
     */
    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    /**
     * Gets the startState attribute of the StateMachine object
     *
     * @return The startState value
     */
    public IState getStartState() {
        return startState;
    }

    /**
     * Sets the startState attribute of the StateMachine object
     *
     * @param startState The new startState value
     */
    public void setStartState(IState startState) {
        this.startState = startState;
    }

    /**
     * Description of the Method
     *
     * @param obj Description of Parameter
     * @return Description of the Returned Value
     */
    public boolean equals(Object obj) {
        if (obj instanceof StateMachine) {
            StateMachine rhs = (StateMachine) obj;
            return new EqualsBuilder().append(currentState, rhs.currentState).append(startState, rhs.startState).isEquals();
        }
        return false;
    }

    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currentState).append(startState).toHashCode();
    }

    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     */
    public String toString() {
        return "StateMachine: currentState=" + currentState + " startState=" + startState;
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
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class Transition {

    /**
     * The
// EndStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#toObject()} method.
*/
class EndStateTest {

	/**
	* Test case for {@link EndState#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// IState.java
package uk.me.jockmacmad.jstate.state;

/**
 * Interface for all state classes.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public interface IState {

    /**
     * Returns this state object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state in a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class State implements IState {

    /**
     * The name of this state.
     */
    private String name;

    /**
     * Constructor for the State object
     *
     * @param name The name of this state.
     */
    public State(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The name value
     */
    public String getName() {
        return name;
    }

    /**
     * Returns this state object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject() {
        return (java.lang.Object) this;
    }

    /**
     * Returns a string representation of the state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The string representation of this state.
     */
    public String toString() {
        return name;
    }

    /**
     * Returns a hash code for this state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The hash code for this state.
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    /**
     * Returns true if the given object is equal to this state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param obj The object to compare to this state.
     * @return True if the given object is equal to this state.
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
		// TODO: implement test
	}
}

// Transition.java
package uk.me.jockmacmad.jstate.transition;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a transition in a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class Transition {

    /**
     * The name of this transition.
     */
    private String name;

    /**
     * Constructor for the Transition object
     *
     * @param name The name of this transition.
     */
    public Transition(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this transition.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The name value
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the transition.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The string representation of this transition.
     */
    public String toString() {
        return name;
    }

    /**
     * Returns a hash code for this transition.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The hash code for this transition.
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    /**
     * Returns true if the given object is equal to this transition.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param obj The object to compare to this transition.
     * @return True if the given object is equal to this transition.
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
        Transition rhs = (Transition) obj;
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.transition;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
*/
class TransitionTest {
		
	/**
	* Test case for {@link Transition#Transition(String)}.
	*/
	@Test
	void testTransition() {
		// TODO: implement test
	}
}

// TransitionTable.java
package uk.me.jockmacmad.jstate.transition;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import uk.me.jockmacmad.jstate.state.EndState;
import uk.me.jockmacmad.jstate.state.IState;
import uk.me.jockmacmad.jstate.state.State;

/**
 * Class representing a transition table for a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class TransitionTable {

    /**
     * The transition table.
     */
    private Map<IState, Map<Transition, IState>> table;

    /**
     * Constructor for the TransitionTable object
     */
    public TransitionTable() {
        table = new HashMap<IState, Map<Transition, IState>>();
    }

    /**
     * Adds a transition to the transition table.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param fromState The state to transition from.
     * @param transition The transition to make.
     * @param toState The state to transition to.
     */
    public void addTransition(IState fromState, Transition transition, IState toState) {
        Map<Transition, IState> transitions = table.get(fromState);
        if (transitions == null) {
            transitions = new HashMap<Transition, IState>();
            table.put(fromState, transitions);
        }
        transitions.put(transition, toState);
    }

    /**
     * Returns the state to transition to given the current state and transition.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param fromState The state to transition from.
     * @param transition The transition to make.
     * @return The state to transition to.
     */
    public IState getTransition(IState fromState, Transition transition) {
        Map<Transition, IState> transitions = table.get(fromState);
        if (transitions == null) {
            return new EndState();
        }
        IState toState = transitions.get(transition);
        if (toState == null) {
            return new EndState();
        }
        return toState;
    }

    /**
     * Returns a string representation of the transition table.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The string representation of this transition table.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (IState fromState : table.keySet()) {
            Map<Transition, IState> transitions = table.get(fromState);
            for (Transition transition : transitions.keySet()) {
                IState toState = transitions.get(transition);
                sb.append(fromState.toString()).append(" -> ").append(transition.toString()).append(" -> ").append(toState.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Returns a hash code for this transition table.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The hash code for this transition table.
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(table).toHashCode();
    }

    /**
     * Returns true if the given object is equal to this transition table.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param obj The object to compare to this transition table.
     * @return True if the given object is equal to this transition table.
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
        TransitionTable rhs = (TransitionTable) obj;
        return new EqualsBuilder().append(table, rhs.table).isEquals();
    }
}

// TransitionTableTest.java
package uk.me.jockmacmad.jstate.transition;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionTable}.
*/
class TransitionTableTest {
		
	/**
	* Test case for {@link TransitionTable#TransitionTable()}.
	*/
	@Test
	void testTransitionTable() {
		// TODO: implement test
	}
}

// StateMachine.java
package uk.me.jockmacmad.jstate.machine;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import uk.me.jockmacmad.jstate.state.EndState;
import uk.me.jockmacmad.jstate.state.IState;
import uk.me.jockmacmad.jstate.state.State;
import uk.me.jockmacmad.jstate.transition.Transition;
import uk.me.jockmacmad.jstate.transition.TransitionTable;

/**
 * Class representing a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class StateMachine {

    /**
     * The transition table for this state machine.
     */
    private TransitionTable transitionTable;

    /**
     * The current state of this state machine.
     */
    private IState currentState;

    /**
     * The map of state methods.
     */
    private Map<IState, Map<String, Method>> stateMethods;

    /**
     * Constructor for the StateMachine object
     *
     * @param transitionTable The transition table for this state machine.
     */
    public StateMachine(TransitionTable transitionTable) {
        this.transitionTable = transitionTable;
        currentState = new EndState();
        stateMethods = new HashMap<IState, Map<String, Method>>();
    }

    /**
     * Returns the current state of this state machine.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The current state of this state machine.
     */
    public IState getCurrentState() {
        return currentState;
    }

    /**
     * Sets the current state of this state machine.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param currentState The new current state of this state machine.
     */
    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    /**
     * Returns the transition table for this state machine.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The transition table for this state machine.
     */
    public TransitionTable getTransitionTable() {
        return transitionTable;
    }

    /**
     * Sets the transition table for this state machine.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param transitionTable The new transition table for this state machine.
     */
    public void setTransitionTable(TransitionTable transitionTable) {
        this.transitionTable = transitionTable;
    }

    /**
     * Returns the map of state methods.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return The map of state methods.
     */
    public Map<IState, Map<String, Method>> getStateMethods() {
        return stateMethods;
    }

    /**
     * Sets the map of state methods.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param stateMethods The new map of state methods.
     */
    public void setStateMethods(Map<IState, Map<String, Method>> stateMethods) {
        this.stateMethods = stateMethods;
    }

    /**
     * Adds a state method to the map of state methods.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @
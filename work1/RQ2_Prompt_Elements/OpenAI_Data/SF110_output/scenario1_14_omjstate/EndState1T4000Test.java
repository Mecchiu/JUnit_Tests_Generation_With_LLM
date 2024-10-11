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
		EndState endState = new EndState();
		assertEquals(endState, endState.toObject());
	}
}

// IState.java
package uk.me.jockmacmad.jstate.state;

/**
 * Interface representing a state in a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public interface IState {

    /**
     * Returns the state as an object.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// ISingleton.java
package uk.me.jockmacmad.jstate.patterns;

/**
 * Interface representing a singleton.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public interface ISingleton {

    /**
     * Returns the singleton as an object.
     * Creation date: (2/19/01 4:22:51 PM)
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
     * The state name.
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
     * Returns the state as an object.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject() {
        return (java.lang.Object) this;
    }

    /**
     * Returns the name of the state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return java.lang.String
     */
    public String toString() {
        return name;
    }

    /**
     * Returns a hash code for the state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return int
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    /**
     * Returns true if the state is equal to the given object.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param obj The object to compare to.
     * @return boolean
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
		assertEquals(state, state.toObject());
	}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a transition between two states.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class Transition {

    /**
     * The source state.
     */
    private IState source;

    /**
     * The destination state.
     */
    private IState destination;

    /**
     * Constructor for the Transition object
     *
     * @param source      The source state.
     * @param destination The destination state.
     */
    public Transition(IState source, IState destination) {
        this.source = source;
        this.destination = destination;
    }

    /**
     * Returns the source state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return IState
     */
    public IState getSource() {
        return source;
    }

    /**
     * Returns the destination state.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return IState
     */
    public IState getDestination() {
        return destination;
    }

    /**
     * Returns a hash code for the transition.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @return int
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(source).append(destination).toHashCode();
    }

    /**
     * Returns true if the transition is equal to the given object.
     * Creation date: (2/19/01 4:22:51 PM)
     *
     * @param obj The object to compare to.
     * @return boolean
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
        return new EqualsBuilder().append(source, rhs.source).append(destination, rhs.destination).isEquals();
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#getSource()} method.
*/
class TransitionTest {
		
	/**
	* Test case for {@link Transition#getSource()}.
	*/
	@Test
	void testGetSource() {
		Transition transition = new Transition(new State("test"), new State("test"));
		assertEquals(new State("test"), transition.getSource());
	}
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#getDestination()} method.
*/
class TransitionTest {
		
	/**
	* Test case for {@link Transition#getDestination()}.
	*/
	@Test
	void testGetDestination() {
		Transition transition = new Transition(new State("test"), new State("test"));
		assertEquals(new State("test"), transition.getDestination());
	}
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#equals(Object)} method.
*/
class TransitionTest {
		
	/**
	* Test case for {@link Transition#equals(Object)}.
	*/
	@Test
	void testEquals() {
		Transition transition = new Transition(new State("test"), new State("test"));
		assertEquals(new Transition(new State("test"), new State("test")), transition);
	}
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#hashCode()} method.
*/
class TransitionTest {
		
	/**
	* Test case for {@link Transition#hashCode()}.
	*/
	@Test
	void testHashCode() {
		Transition transition = new Transition(new State("test"), new State("test"));
		assertEquals(new HashCodeBuilder(17, 37).append(new State("test")).append(new State("test")).toHashCode(), transition.hashCode());
	}
}
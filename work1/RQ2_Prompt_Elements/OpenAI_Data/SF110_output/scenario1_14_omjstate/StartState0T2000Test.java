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
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     */
    public String toString() {
        return name;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare.
     * @return <code>true</code> if this object is the same as the obj
     *         argument; <code>false</code> otherwise.
     */
    public boolean equals(Object obj) {
        if (obj instanceof State) {
            State rhs = (State) obj;
            return new EqualsBuilder().append(name, rhs.name).isEquals();
        }
        return false;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
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
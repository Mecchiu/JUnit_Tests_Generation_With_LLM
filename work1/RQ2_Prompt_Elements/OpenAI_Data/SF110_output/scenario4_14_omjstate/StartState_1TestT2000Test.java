// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toObject()} method.
*/
class StartState_1Test {

	/**
	* Test case for {@link StartState#toObject()}.
	*/
	@Test
	void testToObject() {
		StartState startState = StartState.getSingleton();
		Object object = startState.toObject();
		assertEquals(startState, object);
	}
}

// StartState_2Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getName()} method.
*/
class StartState_2Test {
		
	/**
	* Test case for {@link StartState#getName()}.
	*/
	@Test
	void testGetName() {
		StartState startState = StartState.getSingleton();
		String name = startState.getName();
		assertEquals("uk.me.jockmacmad.jstate.state.StartState", name);
	}
}

// StartState_3Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#equals(Object)} method.
*/
class StartState_3Test {
		
	/**
	* Test case for {@link StartState#equals(Object)}.
	*/
	@Test
	void testEquals() {
		StartState startState = StartState.getSingleton();
		Object object = startState.toObject();
		boolean equals = startState.equals(object);
		assertTrue(equals);
	}
}

// StartState_4Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#hashCode()} method.
*/
class StartState_4Test {
		
	/**
	* Test case for {@link StartState#hashCode()}.
	*/
	@Test
	void testHashCode() {
		StartState startState = StartState.getSingleton();
		int hashCode = startState.hashCode();
		assertEquals(new HashCodeBuilder(17, 37).append(startState).toHashCode(), hashCode);
	}
}

// StartState_5Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartState_5Test {
		
	/**
	* Test case for {@link StartState#getSingleton()}.
	*/
	@Test
	void testGetSingleton() {
		StartState startState = StartState.getSingleton();
		assertNotNull(startState);
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
 * @stereotype abstract
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public abstract class State extends java.lang.Object implements IState {

    /**
     * Field storing a stringified version of the classname.
     * Creation date: (2/20/01 10:55:55 AM)
     * @since 0.1
     */
    private java.lang.String name;

    /**
     * Constructor for the State object
     * Creation date: (2/20/01 10:56:22 AM)
     * @since 0.1
     */
    public State();

    /**
     *  Method to compare two IState objects.
     * <p>
     *  Returns true if both IState objects are instances of
     *  <code>State</code>, otherwise returns false.
     *  <p>
     *  Uses the Apache Commons Lang
     *   <code>EqualsBuilder.reflectionEquals(this, pIState);</code> function.
     *  @since 0.1
     *  @return boolean
     *  @param pIState the State to compare against
     *  the State to compare against
     */
    @Override
    public boolean equals(final Object pIState);

    /**
     *  Builds the <code>hashCode</code> of this <code>Object</code>
     *  using the Apache Commons Lang
     *  <code>HashCodeBuilder.reflectionHashCode(this);</code> function.
     * @return int the HashCode of this <code>Object</code>
     */
    @Override
    public int hashCode();

    /**
     * Field storing a stringified version of the classname.
     * Creation date: (2/20/01 10:55:55 AM)
     * @return java.lang.String
     */
    @Override
    public java.lang.String getName();

    /**
     * Returns this State object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// State_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link State}.
* It contains ten unit test cases for the {@link State#toObject()} method.
*/
class State_1Test {
		
	/**
	* Test case for {@link State#toObject()}.
	*/
	@Test
	void testToObject() {
		State state = new State() {
		};
		Object object = state.toObject();
		assertEquals(state, object);
	}
}

// State_2Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link State}.
* It contains ten unit test cases for the {@link State#getName()} method.
*/
class State_2Test {
		
	/**
	* Test case for {@link State#getName()}.
	*/
	@Test
	void testGetName() {
		
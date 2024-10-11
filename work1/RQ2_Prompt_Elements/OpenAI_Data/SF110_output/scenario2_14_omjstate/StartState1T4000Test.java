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
 * Class representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public final class State extends java.lang.Object implements IState {

    /**
     * Returns this State object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject() {
        return (java.lang.Object) this;
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
		State state = new State();
		assertEquals(state, state.toObject());
	}
}

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public final class StateMachine extends java.lang.Object implements IState {

    /**
     * Returns this StateMachine object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject() {
        return (java.lang.Object) this;
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
* It contains ten unit test cases for the {@link StateMachine#toObject()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toObject()}.
	*/
	@Test
	void testToObject() {
		StateMachine stateMachine = new StateMachine();
		assertEquals(stateMachine, stateMachine.toObject());
	}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public final class Transition extends java.lang.Object implements IState {

    /**
     * Returns this Transition object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject() {
        return (java.lang.Object) this;
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
* It contains ten unit test cases for the {@link Transition#toObject()} method.
*/
class TransitionTest {
		
	/**
	* Test case for {@link Transition#toObject()}.
	*/
	@Test
	void testToObject() {
		Transition transition = new Transition();
		assertEquals(transition, transition.toObject());
	}
}

// IState.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public interface IState {

    /**
     * Returns this IState object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// IStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IState}.
* It contains ten unit test cases for the {@link IState#toObject()} method.
*/
class IStateTest {
		
	/**
	* Test case for {@link IState#toObject()}.
	*/
	@Test
	void testToObject() {
		IState iState = new IState() {
			@Override
			public Object toObject() {
				return null;
			}
		};
		assertEquals(iState, iState.toObject());
	}
}

// IStateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public interface IStateMachine {

    /**
     * Returns this IStateMachine object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// IStateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IStateMachine}.
* It contains ten unit test cases for the {@link IStateMachine#toObject()} method.
*/
class IStateMachineTest {
		
	/**
	* Test case for {@link IStateMachine#toObject()}.
	*/
	@Test
	void testToObject() {
		IStateMachine iStateMachine = new IStateMachine() {
			@Override
			public Object toObject() {
				return null;
			}
		};
		assertEquals(iStateMachine, iStateMachine.toObject());
	}
}

// ITransition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public interface ITransition {

    /**
     * Returns this ITransition object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// ITransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ITransition}.
* It contains ten unit test cases for the {@link ITransition#toObject()} method.
*/
class ITransitionTest {
		
	/**
	* Test case for {@link ITransition#toObject()}.
	*/
	@Test
	void testToObject() {
		ITransition iTransition = new ITransition() {
			@Override
			public Object toObject() {
				return null;
			}
		};
		assertEquals(iTransition, iTransition.toObject());
	}
}

// IStateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public interface IStateMachine {

    /**
     * Returns this IStateMachine object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// IStateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IStateMachine}.
* It contains ten unit test cases for the {@link IStateMachine#toObject()} method.
*/
class IStateMachineTest {
		
	/**
	* Test case for {@link IStateMachine#toObject()}.
	*/
	@Test
	void testToObject() {
		IStateMachine iStateMachine = new IStateMachine() {
			@Override
			public Object toObject() {
				return null;
			}
		};
		assertEquals(iStateMachine, iStateMachine.toObject());
	}
}

// ITransition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public interface ITransition {

    /**
     * Returns this ITransition object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// ITransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ITransition}.
* It contains ten unit test cases for the {@link ITransition#toObject()} method.
*/
class ITransitionTest {
		
	/**
	* Test case for {@link ITransition#toObject()}.
	*/
	@Test
	void testToObject() {
		ITransition iTransition = new ITransition() {
			@Override
			public Object toObject() {
				return null;
			}
		};
		assertEquals(iTransition, iTransition.toObject());
	}
}

// IState.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @stereotype singleton
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public interface IState {

    /**
     * Returns this IState object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// IStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IState}.
* It contains ten unit test cases for the {@link IState#toObject()} method.
*/
class IStateTest {
		
	/**
	* Test case for {@link IState#toObject()}.
	*/
	@Test
	void testToObject() {
		IState iState = new IState() {
			@
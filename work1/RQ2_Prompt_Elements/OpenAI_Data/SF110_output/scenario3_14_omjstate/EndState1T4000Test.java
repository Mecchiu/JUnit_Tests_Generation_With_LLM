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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface for all state objects.
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
		// TODO: implement test
	}
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
     * Returns this State object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
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

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

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
     * Returns this StateMachine object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
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
		// TODO: implement test
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
     * Returns this Transition object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
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
		// TODO: implement test
	}
}

// TransitionException.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Exception thrown when a transition is attempted that is not allowed.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class TransitionException extends java.lang.Exception {

    /**
     * Returns this TransitionException object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// TransitionExceptionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionException}.
* It contains ten unit test cases for the {@link TransitionException#toObject()} method.
*/
class TransitionExceptionTest {
		
	/**
	* Test case for {@link TransitionException#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// TransitionListener.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface for objects that wish to be notified of state transitions.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public interface TransitionListener {

    /**
     * Returns this TransitionListener object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// TransitionListenerTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionListener}.
* It contains ten unit test cases for the {@link TransitionListener#toObject()} method.
*/
class TransitionListenerTest {
		
	/**
	* Test case for {@link TransitionListener#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// TransitionListenerAdapter.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Adapter class for the TransitionListener interface.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class TransitionListenerAdapter implements TransitionListener {

    /**
     * Returns this TransitionListenerAdapter object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// TransitionListenerAdapterTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionListenerAdapter}.
* It contains ten unit test cases for the {@link TransitionListenerAdapter#toObject()} method.
*/
class TransitionListenerAdapterTest {
		
	/**
	* Test case for {@link TransitionListenerAdapter#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// TransitionListenerException.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Exception thrown when a transition listener throws an exception.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class TransitionListenerException extends java.lang.Exception {

    /**
     * Returns this TransitionListenerException object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// TransitionListenerExceptionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionListenerException}.
* It contains ten unit test cases for the {@link TransitionListenerException#toObject()} method.
*/
class TransitionListenerExceptionTest {
		
	/**
	* Test case for {@link TransitionListenerException#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// TransitionListenerManager.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class that manages the transition listeners for a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class TransitionListenerManager {

    /**
     * Returns this TransitionListenerManager object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// TransitionListenerManagerTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionListenerManager}.
* It contains ten unit test cases for the {@link TransitionListenerManager#toObject()} method.
*/
class TransitionListenerManagerTest {
		
	/**
	* Test case for {@link TransitionListenerManager#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// TransitionManager.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class that manages the transitions for a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class TransitionManager {

    /**
     * Returns this TransitionManager object as a java.lang.Object.
     * Used during reflection.
     * Creation date: (2/26/01 10:49:49 AM)
     *
     * @return java.lang.Object
     */
    public java.lang.Object toObject();
}

// TransitionManagerTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransitionManager}.
* It contains ten unit test cases for the {@link TransitionManager#toObject()} method.
*/
class TransitionManagerTest {
		
	/**
	* Test case for {@link TransitionManager#toObject()}.
	*/
	@Test
	void testToObject() {
		// TODO: implement test
	}
}

// TransitionNotFoundException.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Exception thrown when a transition is attempted that does not exist.
 * Creation date: (2/19/01 4:22:51 PM
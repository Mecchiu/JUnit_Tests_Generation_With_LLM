// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {

	/**
	* Test case for the {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case is used to test the {@link Transition#trigger(IState, Event)} method.
	* It checks that the method returns the correct state.
	*/
	@Test
	void testTrigger() {
		// TODO: implement this test case
		// Please write your test code below this comment.
	}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        if (pCurrentState.equals(mStartState) && pEvent.equals(mEvent)) {
            if (mGuard == null || mGuard.evaluate()) {
                mAction.execute();
                return mEndState;
            }
        }
        return pCurrentState;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {
		
	/**
	* Test case for the {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case is used to test the {@link Transition#trigger(IState, Event)} method.
	* It checks that the method returns the correct state.
	*/
	@Test
	void testTrigger() {
		// TODO: implement this test case
		// Please write your test code below this comment.
	}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        if (pCurrentState.equals(mStartState) && pEvent.equals(mEvent)) {
            if (mGuard == null || mGuard.evaluate()) {
                mAction.execute();
                return mEndState;
            }
        }
        return pCurrentState;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest {
		
	/**
	* Test case for the {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case is used to test the {@link Transition#trigger(IState, Event)} method.
	* It checks that the method returns the correct state.
	*/
	@Test
	void testTrigger() {
		// TODO: implement this test case
		// Please write your test code below this comment.
	}
}

// Transition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A transition that is evaluated upon receiving an event.
 * <p>
 *   Given a start state and an event the transition
 *     firstly evaluates if it applies by checking
 *     the start state and and event match its own.
 *     Once it ascertains it is for the start state/event
 *     combination, then the transition evaluates any
 *     guard conditions it has associated to it.
 *     If all the guard conditions evaluate to true,
 *     then the transition executes and returns the
 *     new state that the state machine is in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Transition {

    /**
     * Causes this Transition to fire.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     * @param pCurrentState the current State
     * @param pEvent the Event to trigger
     * @return com.objectmentors.state.State
     */
    public final IState trigger(final IState pCurrentState, final Event pEvent) {
        if (pCurrentState.equals(mStartState) && pEvent.equals(mEvent)) {
            if (mGuard == null || mGuard.evaluate()) {
                mAction.execute();
                return mEndState;
            }
        }
        return pCurrentState;
    }
}

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**

// TransitionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#willTrigger(IState, Event)} method.
*/
class TransitionTest {

		@Test
		void testWillTrigger_1() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_2() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_3() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.triggerEvent = event;
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_4() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_5() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				transition.guardConditions.add(new GuardCondition());
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_6() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_7() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_8() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_9() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
		
		@Test
		void testWillTrigger_10() {
				Transition transition = new Transition();
				IState currentState = new State();
				Event event = new Event();
				transition.initialState = currentState;
				transition.triggerEvent = event;
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				transition.guardConditions.add(new GuardCondition());
				boolean result = transition.willTrigger(currentState, event);
				assertFalse(result);
		}
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A state that the state machine can be in.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class State implements IState {

    /**
     * Check to evaluate if this State is the same as the supplied State.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @param pState the supplied State
     * @return com.objectmentors.state.State
     */
    public final boolean equals(final IState pState) {
        return false;
    }
}

// StateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link State}.
* It contains one unit test case for the {@link State#equals(IState)} method.
*/
class StateTest {
		
		@Test
		void testEquals_1() {
				State state = new State();
				IState otherState = new State();
				boolean result = state.equals(otherState);
				assertFalse(result);
		}
}

// Event.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * An event that is sent to the state machine.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class Event implements IEvent {

    /**
     * Check to evaluate if this Event is the same as the supplied Event.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @param pEvent the supplied Event
     * @return com.objectmentors.state.State
     */
    public final boolean equals(final IEvent pEvent) {
        return false;
    }
}

// EventTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Event}.
* It contains one unit test case for the {@link Event#equals(IEvent)} method.
*/
class EventTest {
		
		@Test
		void testEquals_1() {
				Event event = new Event();
				IEvent otherEvent = new Event();
				boolean result = event.equals(otherEvent);
				assertFalse(result);
		}
}

// GuardCondition.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A guard condition that is evaluated when a transition is triggered.
 * Creation date: (14/02/01 6:14:35 PM)
 *
 * @author:
 */
public class GuardCondition implements IGuardCondition {

    /**
     * Check to evaluate if this GuardCondition will trigger
     * given the supplied Event.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @param pEvent the supplied Event
     * @return com.objectmentors.state.State
     */
    public final boolean evaluate(final Event pEvent) {
        return false;
    }
}

// GuardConditionTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GuardCondition}.
* It contains one unit test case for the {@link GuardCondition#evaluate(Event)} method.
*/
class GuardConditionTest {
		
		@Test
		void testEvaluate_1() {
				GuardCondition guardCondition = new GuardCondition();
				Event event = new Event();
				boolean result = guardCondition.evaluate(event);
				assertFalse(result);
		}
}
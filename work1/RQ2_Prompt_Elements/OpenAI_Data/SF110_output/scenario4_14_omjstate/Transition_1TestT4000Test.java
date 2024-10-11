// Transition_1Test.java
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
class Transition_1Test {

	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns true when the current state and the event are the same as the initial state and the event of the transition.
	*/
	@Test
	void testWillTrigger_1() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, event);
		
		// Then
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state is the same as the initial state of the transition but the event is different.
	*/
	@Test
	void testWillTrigger_2() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, new Event("otherEvent"));
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state is different from the initial state of the transition but the event is the same.
	*/
	@Test
	void testWillTrigger_3() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(new State("otherState"), event);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state and the event are different from the initial state and the event of the transition.
	*/
	@Test
	void testWillTrigger_4() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state is null.
	*/
	@Test
	void testWillTrigger_5() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, event);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the event is null.
	*/
	@Test
	void testWillTrigger_6() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, null);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state and the event are null.
	*/
	@Test
	void testWillTrigger_7() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, null);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state is null and the event is the same as the event of the transition.
	*/
	@Test
	void testWillTrigger_8() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, event);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state is the same as the initial state of the transition and the event is null.
	*/
	@Test
	void testWillTrigger_9() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, null);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns false when the current state is null and the event is different from the event of the transition.
	*/
	@Test
	void testWillTrigger_10() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, new Event("otherEvent"));
		
		// Then
		assertFalse(result);
	}
	
}

// Transition_2Test.java
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
class Transition_2Test {
		
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns the outcome state when the current state and the event are the same as the initial state and the event of the transition.
	*/
	@Test
	void testTrigger_1() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, event);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state is the same as the initial state of the transition but the event is different.
	*/
	@Test
	void testTrigger_2() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state is different from the initial state of the transition but the event is the same.
	*/
	@Test
	void testTrigger_3() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(new State("otherState"), event);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state and the event are different from the initial state and the event of the transition.
	*/
	@Test
	void testTrigger_4() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state is null.
	*/
	@Test
	void testTrigger_5() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, event);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the event is null.
	*/
	@Test
	void testTrigger_6() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, null);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state and the event are null.
	*/
	@Test
	void testTrigger_7() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, null);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state is null and the event is the same as the event of the transition.
	*/
	@Test
	void testTrigger_8() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, event);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state is the same as the initial state of the transition and the event is null.
	*/
	@Test
	void testTrigger_9() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, null);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)} method.
	* <p>
	* This test case checks if the method returns null when the current state is null and the event is different from the event of the transition.
	*/
	@Test
	void testTrigger_10() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event event = new Event("event");
		final Transition transition = new Transition("transition", event, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, new Event("otherEvent"));
		
		// Then
		assertNull(result);
	}
	
}

// Transition_3Test.java
package uk.
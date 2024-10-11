// Transition_0Test.java
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
class Transition_0Test {

	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is the trigger event.
	*/
	@Test
	void testTrigger_0() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is not the trigger event.
	*/
	@Test
	void testTrigger_1() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is not the initial state and the event is the trigger event.
	*/
	@Test
	void testTrigger_2() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(new State("otherState"), triggerEvent);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is not the initial state and the event is not the trigger event.
	*/
	@Test
	void testTrigger_3() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is null and the event is the trigger event.
	*/
	@Test
	void testTrigger_4() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, triggerEvent);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is null and the event is not the trigger event.
	*/
	@Test
	void testTrigger_5() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, new Event("otherEvent"));
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is null.
	*/
	@Test
	void testTrigger_6() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(initialState, null);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is not the initial state and the event is null.
	*/
	@Test
	void testTrigger_7() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(new State("otherState"), null);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is null and the event is null.
	*/
	@Test
	void testTrigger_8() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final IState result = transition.trigger(null, null);
		
		// Then
		assertNull(result);
	}
	
	/**
	* Test case for {@link Transition#trigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is the trigger event and the transition has a guard condition.
	*/
	@Test
	void testTrigger_9() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		transition.addGuardCondition(new GuardCondition("guardCondition", new TruePredicate()));
		
		// When
		final IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
}

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
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is the trigger event.
	*/
	@Test
	void testWillTrigger_0() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, triggerEvent);
		
		// Then
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is not the trigger event.
	*/
	@Test
	void testWillTrigger_1() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, new Event("otherEvent"));
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is not the initial state and the event is the trigger event.
	*/
	@Test
	void testWillTrigger_2() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(new State("otherState"), triggerEvent);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is not the initial state and the event is not the trigger event.
	*/
	@Test
	void testWillTrigger_3() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is null and the event is the trigger event.
	*/
	@Test
	void testWillTrigger_4() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, triggerEvent);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is null and the event is not the trigger event.
	*/
	@Test
	void testWillTrigger_5() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, new Event("otherEvent"));
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is null.
	*/
	@Test
	void testWillTrigger_6() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(initialState, null);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is not the initial state and the event is null.
	*/
	@Test
	void testWillTrigger_7() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(new State("otherState"), null);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is null and the event is null.
	*/
	@Test
	void testWillTrigger_8() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		
		// When
		final boolean result = transition.willTrigger(null, null);
		
		// Then
		assertFalse(result);
	}
	
	/**
	* Test case for {@link Transition#willTrigger(IState, Event)}
	* <p>
	* Test if the transition will trigger when the current state is the initial state and the event is the trigger event and the transition has a guard condition.
	*/
	@Test
	void testWillTrigger_9() {
		// Given
		final IState initialState = new State("initialState");
		final IState outcomeState = new State("outcomeState");
		final Event triggerEvent = new Event("triggerEvent");
		final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
		transition.addGuardCondition(new GuardCondition("guardCondition", new TruePredicate()));
		
		// When
		final boolean result = transition.willTrigger(initialState, triggerEvent);
		
		// Then
		
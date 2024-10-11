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
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("currentState");
		Event event = new Event("event");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_2() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("event");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	void testWillTrigger_3() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_4() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_5() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_6() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_7() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_8() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_9() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_10() {
		// Given
		IState initialState = new State("initialState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, triggerEvent);
		IState currentState = new State("initialState");
		Event event = new Event("triggerEvent");
		
		// When
		boolean result = transition.willTrigger(currentState, event);
		
		// Then
		assertTrue(result);
	}
}
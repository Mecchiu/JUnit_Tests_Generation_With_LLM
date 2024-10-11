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
		
	@Test
	void testTrigger_1() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	@Test
	void testTrigger_2() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_3() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), triggerEvent);
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_4() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_5() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	@Test
	void testTrigger_6() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_7() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), triggerEvent);
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_8() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(new State("otherState"), new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
	
	@Test
	void testTrigger_9() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, triggerEvent);
		
		// Then
		assertEquals(outcomeState, result);
	}
	
	@Test
	void testTrigger_10() {
		// Given
		IState initialState = new State("initialState");
		IState outcomeState = new State("outcomeState");
		Event triggerEvent = new Event("triggerEvent");
		Transition transition = new Transition(initialState, outcomeState, triggerEvent);
		
		// When
		IState result = transition.trigger(initialState, new Event("otherEvent"));
		
		// Then
		assertEquals(initialState, result);
	}
}
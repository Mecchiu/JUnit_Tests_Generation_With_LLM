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
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_2() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_3() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_4() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_5() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_6() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_7() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_8() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_9() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testWillTrigger_10() {
		// Arrange
		Transition transition = new Transition();
		IState currentState = new State();
		Event event = new Event();
		
		// Act
		boolean result = transition.willTrigger(currentState, event);
		
		// Assert
		assertTrue(result);
	}
}
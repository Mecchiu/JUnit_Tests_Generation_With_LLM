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
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_1() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_2() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_3() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_4() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_5() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_6() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_7() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_8() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_9() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
				IState result = transition.trigger(initialState, triggerEvent);
				
				// Assert
				assertEquals(outcomeState, result);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* The test case is successful if the method returns the expected state.
		*/
		@Test
		void testTrigger_10() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition(initialState, outcomeState, triggerEvent);
				
				// Act
			
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
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_0() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_1() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_2() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_3() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_4() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_5() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_6() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_7() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_8() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
				final Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				// When
				final IState actual = transition.trigger(initialState, triggerEvent);
				// Then
				assertEquals(outcomeState, actual);
		}
		
		/**
		* Test case for the {@link Transition#trigger(IState, Event)} method.
		* <p>
		* The test case is successful if the method returns the expected outcome state.
		*/
		@Test
		void testTrigger_9() {
				// Given
				final IState initialState = new State("initialState");
				final IState outcomeState = new State("outcomeState");
				final Event triggerEvent = new Event("triggerEvent");
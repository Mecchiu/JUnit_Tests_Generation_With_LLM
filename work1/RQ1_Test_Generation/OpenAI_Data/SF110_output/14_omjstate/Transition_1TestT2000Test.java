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
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void testWillTrigger_1() {
				// Arrange
				final IState pCurrentState = new State("State");
				final Event pEvent = new Event("Event");
				final Transition transition = new Transition("Transition", new Event("Event"), new State("State"), new State("State"));
				
				// Act
				final boolean retVal = transition.willTrigger(pCurrentState, pEvent);
				
				// Assert
				assertFalse(retVal);
		}
		
		/**
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void testWillTrigger_2() {
				// Arrange
				final IState pCurrentState = new State("State");
				final Event pEvent = new Event("Event");
				final Transition transition = new Transition("Transition", new Event("Event"), new State("State"), new State("State"));
				
				// Act
				final boolean retVal = transition.willTrigger(pCurrentState, pEvent);
				
				// Assert
				assertFalse(retVal);
		}
		
		/**
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void testWillTrigger_3() {
				// Arrange
				final IState pCurrentState = new State("State");
				final Event pEvent = new Event("Event");
				final Transition transition = new Transition("Transition", new Event("Event"), new State("State"), new State("State"));
				
				// Act
				final boolean retVal = transition.willTrigger(pCurrentState, pEvent);
				
				// Assert
				assertFalse(retVal);
		}
		
		/**
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void testWillTrigger_4() {
				// Arrange
				final IState pCurrentState = new State("State");
				final Event pEvent = new Event("Event");
				final Transition transition = new Transition("Transition", new Event("Event"), new State("State"), new State("State"));
				
				// Act
				final boolean retVal = transition.willTrigger(pCurrentState, pEvent);
				
				// Assert
				assertFalse(retVal);
		}
		
		/**
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void testWillTrigger_5() {
				// Arrange
				final IState pCurrentState = new State("State");
				final Event pEvent = new Event("Event");
				final Transition transition = new Transition("Transition", new Event("Event"), new State("State"), new State("State"));
				
				// Act
				final boolean retVal = transition.willTrigger(pCurrentState, pEvent);
				
				// Assert
				assertFalse(retVal);
		}
		
		/**
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void testWillTrigger_6() {
				// Arrange
				final IState pCurrentState = new State("State");
				final Event pEvent = new Event("Event");
				final Transition transition = new Transition("Transition", new Event("Event"), new State("State"), new State("State"));
				
				// Act
				final boolean retVal = transition.willTrigger(pCurrentState, pEvent);
				
				// Assert
				assertFalse(retVal);
		}
		
		/**
		* Test case for the {@link Transition#willTrigger(IState, Event)} method.
		* <p>
		* This test case is for the following input:
		* <ul>
		* <li>pCurrentState = {@link State#State(String)}</li>
		* <li>pEvent = {@link Event#Event(String)}</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>retVal = false</li>
		* </ul>
		*/
		@Test
		void test
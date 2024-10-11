// Transition_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#trigger(IState, Event)} method.
*/
class Transition_0Test {
		/**
		* Initialise the test instance.
		*
		* @throws java.lang.Exception is an unexpected error occured.
		*/
		@Test
		public void initialise() throws Exception {
			Trigger t = new Trigger("trigger");
			t.setCurrentState(new State("current state"));
			State s = new State("s");
			t.setState(s);
			assertTrue(t.isTrigger());
		}

		/**
		* Test the trigger method.
		*/
		@Test (expected = java.lang.NullPointerException.class)
		public void triggerNull() {
			Trigger t = new Trigger("trigger");
			t.trigger(null, null);
		}


		/**
		* Test the evaluate method.
		*/
		@Test
		public void evaluate() {
			State s = new State("s");
			Trigger t = new Trigger("trigger");
			t.setCurrentState(s);
			t.trigger(new State("state"), new Event("event"));
			boolean b = t.isTrigger();
			assertTrue(b);
		}

		/**
		* Test the toString method.
		*/
		@Test
		public void toStringTest() {
			Trigger t = new Trigger("trigger");
			boolean b = false;
			assertNull(t.toString());
			assertEquals("Trigger(null)", t.toString());
			assertEquals("Trigger(<State>, (event, <>))", t.toString());
			t.setCurrentState(new State("state"));
			assertNull(t.toString());
		}

		/**
		* Test the equals method.
		*/
		@Test
		public void equalsTest() {
			Trigger t = new Trigger("trigger");
			boolean b = true;
			assertNotEquals("Trigger(null)", t.equals(null));
}
}
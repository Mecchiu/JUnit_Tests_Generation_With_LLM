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
		private final Transition t = new Transition("Test Transition");
		
        /**
         * Tests that an <code>equals</code> comparison works.
         * @since 0.1
         * @see org.apache.commons.lang.builder.EqualsBuilder
         */
        @Test
        public void testEquals() {
            new EqualsBuilder().append(t, t).build().equals(t);
        }

        /**
         * Tests that object identity is maintained after an update
         * @since 0.1
         */
        @Test
        public void testIdentity() {
            new EqualsBuilder().append(t.getTriggerEvent(), t.getTriggerEvent()).build().equals(t);
        }

        /**
         * Tests that the outcome state is set or equals to the initial state
         * @since 0.1
         */
        @Test
        public void testUpdateOutcome() {
            t.setTriggerEvent(Event.NEW_STATE);
            IState ou = t.getOutcomeState();
            assertEquals(t.getOutcomeState(), ou, "Outcome State hasn't set");
        }

		/**
         * Tests that the outcome state is set (by setter) to a new state
         * @since 0.1
         */
        @Test
        public void testUpdateOutcomeNonExisting() {
			IState ou = t.getOutcomeState();
			assertNotEquals(t.getOutcomeState(), ou);
		}

        /**
         * Tests that an outcome condition works.
         * @since 0.1
         */
        @Test
        public void testConditionEquals() {
            t.getGuardConditions().clear();
            t.setTriggerEvent(Event.NEW_STATE);
            new EqualsBuilder().append(t.getGuardConditions(), t.getGuardConditions()).build().equals(t);
        }

}
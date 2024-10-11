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
		private final Transition transition;
    
    public Transition_0Test (Transition oTransition) {
			this.transition = oTransition;
		}

		/**
		* Tests the initial state of the transition when it
		* is triggered by the supplied Event.
		*/
		@Test
		public void initialStateToTriggerState_OnTriggerEvent_True() {
			assertEquals(transition.getInitialState(), transition.trigger(transition.getInitialState(), transition.getTriggerEvent()));
		}
    
        /**
         * Tests the initial state of the transition when it
         * is triggered by the supplied Event.
         * Tests that the initial state match the initial State
         * of the event passed in.
         */
        @Test
        public void initialStateToTrigger_True() {
            assertEquals(transition.getInitialState(), transition.trigger(transition.getInitialState(), transition.getTriggerEvent()));
        }
    
}
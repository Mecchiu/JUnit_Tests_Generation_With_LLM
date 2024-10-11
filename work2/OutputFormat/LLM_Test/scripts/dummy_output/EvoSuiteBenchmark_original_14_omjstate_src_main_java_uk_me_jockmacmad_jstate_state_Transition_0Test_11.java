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
		* Construct the transition
		* containing all of the relevant
		* guard conditions.
		* <p>
		*
		* @since 0.1
		* @return ITransition
         *  
         */
    static ITransition trigger(final IState pTriggerState, final Event pTriggerEvent) {
  		final Transition transition = new Transition(pTriggerState.getName(), pTriggerEvent, pTriggerState, pTriggerState);
  		transition.addGuardCondition(new GuardCondition(true, false).toString());
  		return transition;
    }

    @Test
    public void trigger0Test() {
    		final Transition transition = trigger("StateA", "TriggerA");
    		transition.addGuardCondition(new GuardCondition(true, true).toString());

    		assertTrue("Equals doesn't work.", new EqualsBuilder().
                    reflectionEquals(transition, transition)
                   .isEquals());

    		assertFalse("Hashcode doesn't work.", new HashCodeBuilder().
                    build(transition.getState())
                   .toString(), new EqualsBuilder().
                    reflectionEquals(transition, transition)
                   .isEquals());
 			assertFalse("Hashcode doesn't work.", new HashCodeBuilder().
                    build(transition.getState())
                   .toString(), new EqualsBuilder().
                    reflectionEquals(transition, transition)
                   .isEquals());

			assertTrue("Equals doesn't work.", new EqualsBuilder().
                    reflectionEquals(transition, transition)
                   .isEquals());
    }
	}
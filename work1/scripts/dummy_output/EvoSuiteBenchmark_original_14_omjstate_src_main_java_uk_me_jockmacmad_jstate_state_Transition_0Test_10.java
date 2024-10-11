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
		/* Test conditions and test cases */
    @Test
    void testConditions() {
		final Transition t0 = new Transition_0Builder().trigger(pState0, pEvent0).build();
		final IState iState0 = t0;
		final Transition result = new Transition_0Builder().trigger(pState0, pEvent0).build();
		assertEquals("Trigger conditions for 1st transition should be same", pEvent0, result.getTriggerEvent());
		final IState resultState = result.getOutcomeState();
		assertEquals("Trigger conditions for 2nd transition should be same", pState0, resultState);
    }
}

// End Transition_0Test.java
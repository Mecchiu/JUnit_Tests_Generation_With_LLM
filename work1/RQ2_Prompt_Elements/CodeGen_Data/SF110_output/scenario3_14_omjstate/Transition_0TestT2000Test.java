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

    @Test
    public final void triggerTest() {
        
        final IState state1 = new StateImpl("State1", IState.INIT);
        final Event event1 = Event.START_STATE_EXPECTED;
        
        assertTrue(state1.trigger(state1, event1));
        final IState state2 = state1;
        final Event event2 = Event.START_STATE_EXPECTED;
        
        final boolean result = state2.trigger(state2, event2);
        
        assertTrue(result);
        final IState state3 = state2;
        
        assertTrue(event1==event2);
    }
}
// Transition_1.java

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
public static int STATE_VALUE, EVENT_VALUE;
	@Test
	public void state_and_event_are_correct() {
		assertEquals(STATE_VALUE, Transition.trigger(T.STATE, T.EVENT).getStateValue());
		assertEquals("start", Transition.trigger(T.EVENT, T.STATE).getEvent().name());
	}
	@Test
	public void state_and_event_are_correct_with_guides(){
		assertEquals(STATE_VALUE, Transition.trigger(T.STATE, T.EVENT, T.GUIDE).getStateValue());
		assertEquals("start", Transition.trigger(T.EVENT, T.STATE, T.GUIDE).getEvent().name());
	}
	@Test
	public void end_transition_with_guides(){
		assertTrue(Transition.trigger(T.GUIDE).equals(IState.END));
		assertFalse(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.END));
	}
	@Test
	public void end_event_guider(){
		assertFalse(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.END));
	}
	@Test
	public void end_end_transition_with_guides(){
		assertTrue(Transition.trigger(T.GUIDE, T.EVENT).equals(IState.END));
		assertFalse(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.END));
	}
	@Test
	public void end_end_event_guider(){
		assertFalse(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.END));
	}
	@Test
	public void final_transition_with_guides(){
		assertTrue(Transition.trigger(T.GUIDE, T.EVENT).equals(IState.FINAL));
		assertFalse(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.FINAL));
	}
	@Test
	public void final_end_transition(){
		assertFalse(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.FINAL));
	}
	@Test
	public void to_end_transition(){
		assertTrue(Transition.trigger(T.GUIDE, T.EVENT).equals(IState.FINAL));
	}
	@Test
	public void to_final_transition(){
		assertTrue(Transition.trigger(T.EVENT, T.GUIDE).equals(IState.FINAL));
	}

	// Test Case 9.2:
	@Test
	public void test_to_matching_state_with_guides(){
		assertEquals("State 1, event 4", Transition.trigger(T.GUIDE, T.EVENT).getEvent().name());
		assertEquals("State 1, event 6", Transition.trigger(T.GUIDE, T.EVENT, T.GUIDE).getEvent().name());
	}
	@Test
	public void test_to_matching_state_with_end(){
		assertEquals("State 1, event 4", Transition.trigger(T.GUIDE, T.EVENT, T.END).getEvent().name());
		assertEquals("State 1, event 6", Transition.trigger(T.GUIDE, T.EVENT, T.END, T.GUIDE).getEvent().name());
	}
}
// Transition_0Test.java
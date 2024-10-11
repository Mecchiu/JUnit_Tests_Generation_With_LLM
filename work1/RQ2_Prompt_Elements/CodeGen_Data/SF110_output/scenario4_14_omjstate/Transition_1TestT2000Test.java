// Transition_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#willTrigger(IState, Event)} method.
*/
class Transition_1Test {

	IState initialState;
	IState outcomeState;
	Event triggerEvent;

	/**
	* Method to test the willTrigger, to be added as public.
	* <p>
	* Creates a new State that is not the start state of a State Machine.
	* We should check to ensure that the initialState is still equal to the
	* start state of a State Machine by checking to ensure that
	* this method returns the expected outcome when passed a trigger Event.
	*/
	@Test
	public void test_willTrigger1() {
		initialState = s_initialState;

		outcomeState = s_initialState;
		triggerEvent = s_triggerEvent;
		assertTrue(
				"Expecting a state equal to the start state of "
					+ s_initialState.getClass().getSimpleName()
					+ " when calling willTrigger",
				initialState.equals(s_initialState)
		);
	}

	/**
	* Method to test the willTrigger, to be added as public.
	* <p>
	* Create a new State to hold initialState (as a IState) and a trigger Event
	* for this Transition.
	*/
	@Test
	public void test_willTrigger2() {
		initialState = s_initialState;
		triggerEvent = s_triggerEvent;
		outcomeState = s_initialState;
		assertTrue(
				"Expecting a state equal to the start state of "
					+ s_initialState.getClass().getSimpleName()
					+ " when calling willTrigger",
				initialState.equals(s_initialState)
		);
	}

	/**
	* Method to test the willTrigger, to be added as public.
	* @param pInitState an IState to be used as the initial state of this Transition.
	*/
	@Test
	public void test_willTrigger2(IState pInitState) {
		initialState = p
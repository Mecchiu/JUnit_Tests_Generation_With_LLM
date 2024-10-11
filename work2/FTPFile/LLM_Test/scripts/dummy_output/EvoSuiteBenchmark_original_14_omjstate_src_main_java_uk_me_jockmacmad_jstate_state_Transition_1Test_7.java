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
		/**
		* Test that the transition's willTrigger method will be calling 
		* willTriggerEventAndObserve to initialize State Machine.
		* It uses a state that cannot be set to null as it will compare it
		* against the event.
		* Creation date: (14/02/01 6:21:09 PM)
		* @throws Exception thrown if state is null
		*/
	@Test
	void willTrigger() throws Exception {
				assertNotNull(
						"State can not be null by StateMachine",
						State.get());
				assertFalse("The transition's willTrigger method will have been called",
						State.get().willTrigger(null, null).booleanValue());
		}
			/**
		* Test that the transition's willTrigger method will be calling
		* observe willFireEvent method to observe the event.
		* Creation date: (14/02/01 6:21:09 PM)
		* @throws Exception thrown if event cannot be observed by StateMachine
		*/
	@Test
	void willTrigger() throws Exception {
				assertNull(
						"The transition's willTrigger will not observe an event",
						State.get().willTrigger(State.get(), null));
		}
			/**
		* Test that the transition's willTrigger method will be calling
		* getEventMethod to get the event.
		* Creation date: (14/02/01 6:21:09 PM)
		* @throws Exception thrown if event cannot be retrieved by StateMachine.
		*/
	@Test
	void willTrigger() throws Exception {
				assertEquals(
						"The transition's willTrigger will not retrieve event by StateMachine",
						State.get().willTrigger(State.get(), null),
						State.get().getEventMethod().invoke(State.get()));
		}
}
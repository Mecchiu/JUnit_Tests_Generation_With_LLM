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
		 * Build the {@link Transition} using the supplied State of the State Machine and the
		 * supplied Event.
		 * @throws java.lang.Exception if any.
		 * @param pState State of the State Machine upon which to initiate this Transition.
		 * @param pEvent Event to trigger.
		 * @return com.objectmentors.state.State
		 */
		@Test
		public final State trigger (final IState pState, final Event pEvent) throws Exception {
				return new Transition() {
						{
							setState(pState);
							setEvent(pEvent);
						}
						@Override
						public final IState getState() {
								return null;
						}
						@Override
						public final Event getEvent() {
									return null;
						}
						
				};
		}
		
		@Test
		public final void getState() {
				final State state = new Transition() {
						{
							setState(null);
						}
						@Override
						public final IState getState() {
								return null;
						}
						@Override
						public final Event getEvent() {
								return null;
						}
					};
						
				assertEquals("Object.new.Transition.getState", state, new Transition() {
						{
							setState(null);
						}
						@Override
						public final IState getState() {
								return null;
						}
						@Override
						public final Event getEvent() {
								return null;
						}
					});
		}
		
		@Test
		public final void getEvent() {
				final Event event = new Transition() {
						{
							setEvent(null);
						}
						@Override
						public final Event getEvent() {
								return null;
						}
						@Override
						public final IState getState() {
								return null;
						}
					};
						
}
}
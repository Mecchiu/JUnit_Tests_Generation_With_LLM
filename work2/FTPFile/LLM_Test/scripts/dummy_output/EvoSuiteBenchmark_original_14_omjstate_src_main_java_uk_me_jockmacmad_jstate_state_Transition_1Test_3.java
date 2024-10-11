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
		 * The first element of the list of {@link Transition}
		 */
		private final IState initialState;
		/**
		 * The second element of the list of {@link Transition}
		 */
		private final IState outcomeState;

		public Transition_1Test(final IState pInitialState, final IState pOutcomeState) {
		this(pInitialState, pOutcomeState, "Initial State", "Output");
		}

		public Transition_1Test(final IState pInitialState, final IState pOutcomeState, final String pName, final String pTriggeredBy) {
		this(new IState(pInitialState), new IState(pOutcomeState), pName, pTriggeredBy);
		}

        public Transition_1Test(final IState pInitialState, final IState pOutcomeState, final String pName, final String pTriggeredBy) {
        this(pInitialState, new IState(pOutcomeState), pName, pTriggeredBy);
        }

		public Transition_1Test( final IState pInitialState, final IState pOutcomeState, final String pName, final String pTriggeredBy,
				final IState pInitialStateOutcome) {
		this.initialState = pInitialState;
		this.outcomeState = pOutcomeState;
		this.name = pName;
		this.triggerEvent = pTriggeredBy;
		this.initialStateOutcome = pInitialStateOutcome;
		}

        /**
         * Checks if two transition objects are equal.
         * Creation date: (2/15/01 11:33:07 PM)
         * @since 0.1
         * @param o the object to compare against
         * @return boolean
         * @see #EqualsBuilder(java.lang.Object)
         */
        @Override
	public boolean equals(Object  o) {
}
}
// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#toObject()} method.
*/
class StartState_1Test {
		@Test
		public void testToObject() {
			final Boolean boolean_true = new Boolean (true);
			final Boolean boolean_false = new Boolean (false);
			final Integer int_0 = new Integer (0);

			assertFalse(StartState.SINGLETON == null);

			assertRaise(true, boolean_false);
		}
}
// End StartState_1Test.java
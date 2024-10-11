// EndState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#getSingleton()} method.
*/
class EndState_0Test {
		/**
		 * Test of field equals, returns true.
		 */
		@Test
        public void testEquals() {
			EndState a1 = (EndState) SINGLETON;
			EndState a2 = (EndState) a1;
			boolean expected = true;
			assertEquals(expected, a1.equals(a2));
			// This is expected behavior, since EndState is a subclass of the
			// singleton.
			assertEquals(expected, a1.equals(a2.getInstance()));
		}
	}
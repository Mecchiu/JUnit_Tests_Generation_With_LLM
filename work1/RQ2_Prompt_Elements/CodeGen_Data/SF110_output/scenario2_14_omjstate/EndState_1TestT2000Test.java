// EndState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#toObject()} method.
*/
class EndState_1Test {
private EndState endState;
		/**
		 *
		 * @throws java.lang.AssertionFailedError
		 * @since 0.1
		 */
	@Test
    public void testToObject() {
    	assertNotNull(endState);
		assertEquals(this,endState);
    }
}

// EndState_2Test.java
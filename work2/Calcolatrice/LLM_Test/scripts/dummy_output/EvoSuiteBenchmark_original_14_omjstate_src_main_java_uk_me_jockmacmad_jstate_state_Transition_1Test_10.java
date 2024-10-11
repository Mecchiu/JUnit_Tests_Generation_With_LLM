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
		 * Test method for {@link Transition#willTrigger(IState, Event)}.
		 * @see junit.framework.TestCase#setUp()
		 */
		@Test
		public void test_willTrigger() {
		
			boolean result;
			result = Boolean.TRUE.equals(
					new Transition().willTrigger(
							new IState(),
            new Event()))
				== Boolean.TRUE
			;
			assertTrue("Result is " +(result?"":"NOT ")+", expected:"+Boolean.TRUE, result);
		}
}
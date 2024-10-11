// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {
/**
		 * Simple unit test for getSingleton.
		 * Creation date: (2/20/01 11:05:10 AM)
		 *
		 * @throws Exception exception
		 */
		@Test
		void simpleTests() throws Exception {
			StartState s1 = StartState_0Test.getSingleton();
			assertEquals(u"The constructor doesn't return the same object", s1, new StartState(null));
			assertIdentical(s1, u"The constructor does not return distinct objects");
		}

}

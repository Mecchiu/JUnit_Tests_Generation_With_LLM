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
		 * A constructor for this class.
		 * Creation date: (2/24/01 15:20:34 AM)
		 * @since 0.1
		 */
		protected EndState_0Test() {
			assertNotNull("The EndState is null.",SINGLETON);
		}
}
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
		Object todo;

		@Test
		void constructor() {
			todo = "Todo";
		}

		@Test
		void getSingleton_returnsValue() {
			assertEquals(SINGLETON, (EndState)todo);
		}

}
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
		@Test
		void toObject() {
			assertEquals("toObject() cannot return a different object than the superclass", UQ1, UQ2);
		}
		@Test(expected = IllegalStateException.class)
		void toObject() {
			assertEquals("toObject() cannot return a different object than the superclass", UQ1, UQ2);
		}
		@Test
		void setToString() {
			assertStrEquals(UQ1.toString(), "ToObjectTest1");
		}
}
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
		 * Unit test method for {@link StartState#getSingleton()}.
		 * @throws ClassCastException when the provided parameter is not an {@link StartState}
		 * @throws IllegalArgumentException when there is a problem with reflection
		 * @throws NullPointerException when parameters are <code>null</code>
		 */
		@Test
		void getSingleton()
			throws ClassCastException, IllegalArgumentException, NullPointerException {
        assertNotNull(StartState_0Test.class.getDeclaredMethod("getSingleton"));

			final Object o= new StartState_0Test();
			final Object o2= o.getClass()==StartState_0Test.class? o.toString() : o;

		     assertEquals(o, o2);
		}
}
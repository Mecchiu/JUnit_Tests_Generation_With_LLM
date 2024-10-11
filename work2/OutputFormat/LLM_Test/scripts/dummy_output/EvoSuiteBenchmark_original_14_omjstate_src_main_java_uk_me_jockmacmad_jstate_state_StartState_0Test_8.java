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
		 * Field to get the single instance of the <code>StartState</code> object.
		 * creation date: (2/20/01 10:48:41 AM)
		 * @since 0.1
		 * @return com.objectmentors.state.StartState
		 */
		@Test
		public void getSingleton() {
		// This method tests getSingleton()
				StartState t = new StartState();
				assertNotNull(t);
				assertNotSame(t, null);
				assertEquals(t, null);
				assertEquals(t.getName(), "StartState_0");
		}

}
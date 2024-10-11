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
		/**
		 * This method is called once to instantiate the object from its
		 * <code>object(...)</code> call.
		 */
		@Test
		void Test() {
				EndState e = EndState.SINGLETON;

				// Check fields:
				assertEquals(EndState.getName(), e.toString());
}
/*
 ***************************************************
 * EndState_0.java Written By: Ken Wong
 * 
 * Date: 12-05-2013
 ***************************************************
 */
}
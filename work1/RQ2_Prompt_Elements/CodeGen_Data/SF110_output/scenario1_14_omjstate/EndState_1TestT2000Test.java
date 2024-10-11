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
	 * Test of constructor of an object of {@link EndState}.
	 */
			private String state;
			
		/**
		 * @throws java.lang.Exception
		 */
		@Test
		public void testToObject() throws Exception {
			java.lang.EndState instance1 = 
					this.newInstance(java.lang.EndState.class.getSimpleName() + "1");
			java.lang.EndState instance2 = this.newInstance(java.lang.EndState.class.getSimpleName() + "2");
		}
}


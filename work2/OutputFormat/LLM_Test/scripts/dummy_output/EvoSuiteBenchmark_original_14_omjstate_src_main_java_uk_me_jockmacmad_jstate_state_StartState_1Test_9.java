// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#toObject()} method.
*/
class StartState_1Test {
		/**
		 *  Constructor for StartState_1Test
		 *  Creates the {@link StartState_1Test} object under test
		 */
		
		public StartState_1Test()
		{
			
		}

		/**
		 *  Constructor for StartState_1Test
		 *  Creates the {@link StartState_1Test} object under test
		 *  @since 0.2
		 */
		StartState_1Test( )
		{

		}

		/**
		 *  Tests {@link StartState#equals(Object)}
		 *  creation method.
		 *  @since 0.2
		 */
		@Test
		public void testEquals()
		{
			
			assertEquals( StartState.getSingleton(), StartState.getSingleton());
			assertNotSame( StartState.getSingleton(), null);
			assertNotSame( null, StartState.getSingleton());
		}
}

//End of tests
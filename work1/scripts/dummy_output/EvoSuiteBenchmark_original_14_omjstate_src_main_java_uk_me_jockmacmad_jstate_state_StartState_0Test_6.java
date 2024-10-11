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
	 * Tests the constructor of <code>StartState</code>.
	 *
	 * Creation date: (3/3/2014 12:55:48 AM)
	 * @throws Exception
	 */
	@Test
	void testConstructor() throws Exception {
		
		// Valid cases
		assertEquals( "com.objectmentors.state.StartState_0",
				StartState.class
				.getName() );
		assertEquals( 
				"com.objectmentors.state.StartState_0",
				java.lang.Object.class
				.getName()
				);
		assertEquals(
				new java.lang.Object(),
				java.lang.Object.class
				);
		assertFalse(
				(true)
				);
		assertThrows(
				IllegalStateException.class
				);
		assertEquals(
				new java.lang.Exception()
				);
		assertThrows(
				IllegalStateException.class
				);
		assertThrows(
				NullPointerException.class
				);
	}
}
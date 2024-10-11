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
	 * Constructor test
	 * @throws Throwable a problem setting up the class
	 * @since 2.5.0
	 */
	@Test
	public void Test() throws Throwable {
	
		final StartState obj = new StartState();
		assertNotNull("returns the object passed as <variable>null</variable>.", obj);
	}
		
	/**
	 * Returns a string representation of the object.
	 * @return String a string representation of the instance
	 * @since 2.5.0
	 */
	@Override
	public String toString();
}
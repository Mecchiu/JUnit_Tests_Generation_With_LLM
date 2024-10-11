// StartStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toObject()} method.
*/
class StartStateTest {
		
	/**
	* Test case for {@link StartState#toObject()}.
	*/
	@Test
	void testToObject() {
		StartState startState = new StartState();
		assertEquals(startState, startState.toObject());
	}
}
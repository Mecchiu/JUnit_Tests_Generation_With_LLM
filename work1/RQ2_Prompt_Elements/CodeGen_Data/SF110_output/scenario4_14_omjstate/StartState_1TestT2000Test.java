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
	* Creates a new StartState object, uses the private constructor to build the instance.
	* @since 0.1
	*/
	@Test
	public void testToObject() {
		try {
			new StartState();
		}
		catch(ClassCastException e) {
			fail( e.getLocalizedMessage() );
		}

	}

	/**
	* This test is just to give the {@link StartState} a happy little name space.
	* It contains the test cases.
	* It is used throughout the unit tests.
	*/
	@Test
	public void testName() throws Exception {
		assertEquals( START_STATE.getName(), START_STATE.toString() );
	}

	/**
	* These are the equals and hashcode methods specific to StartState.  
	* We need to ensure that the {@link Start} instances have identical equality and hashcode to other instances of {@link StartState}.
	* We do not test the instances themselves, as this means that they do not participate in a common set of tests.
	* @since 0.1
	*/
	@Test
	public void testEquals_EqualsObject() {
		
		// Note that START_STATE equals START_STATE with this hashcode method
		
		boolean theObjectSameHashCode = new EqualsBuilder().
				appendSuper( START_STATE, new IState(), 0 = hashCode() ).
				append( START_STATE, new IState() ).
				append( START_STATE, new IState() ).
				build().
				equals( START_STATE, new IState() );  // Make sure we did not do the equals check twice and rehash the hash by calling hashCode

		assertFalse( theObjectSameHashCode );
	}

}

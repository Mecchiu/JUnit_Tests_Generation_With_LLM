// EndState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#getSingleton()} method.
*/
class EndState_0Test {
		
	@Test
	void getSingleton() {
		
		EndState endState = EndState.getSingleton();
		
		assertTrue("Getter method did not return correct object for getSingleton().", endState.equals(endState));
		
		assertTrue("The getSingleton() method did not return the correct State.", new EqualsBuilder()
			.append(endState.getName(), "endState")
			.isEquals());
		
		assertEquals("The object is not same as the object returned by the getSingleton() method.", endState, endState.toObject());
		
	}
	
	@Test
	void equals() {
		
		Object otherState = new Object();
		
		// Use to verify object equality
		assertTrue("This test is checking a singleton of EndState.", new EqualsBuilder()
			.append(otherState, new Object())
			.isEquals());
		
		// Use another Object to verify object comparison
		assertFalse("This test has to verify a different object for the object.", new EqualsBuilder()
			.append(otherState, new Object())
			.append(new Object(), otherState)
			.isEquals());
		
		// Test the default constructor
		assertTrue("This test is checking to see if a null instance is equal to a null object.", new EqualsBuilder()
			.append(otherState, null)
			.isEquals());
		
	}
	
	@Test
	void hashCode() {
		
		Object otherState = new Object();
		
		// Use to verify hash code
		assertTrue("This test is checking a singleton of EndState.", new HashCodeBuilder()
			.append(otherState)
			.append(otherState)
			.build()
			.hashCode());
		
		// Use another Object to verify hash code
		assertEquals("The hash codes are not the same.", new HashCodeBuilder()
			.append(otherState)
			.append(otherState)
			.build().hashCode(),
			new HashCodeBuilder()
			.append(otherState)
			.append(otherState)
			.build().hashCode());
		
		// Test the default constructor
		assertEquals("This test is checking to see if a null instance is not an instance of an object.", new EqualsBuilder()
			.append(otherState)
			.append(otherState)
			.append(new Object())
			.append(new Object())
			.isEquals());
		
	}
	
}
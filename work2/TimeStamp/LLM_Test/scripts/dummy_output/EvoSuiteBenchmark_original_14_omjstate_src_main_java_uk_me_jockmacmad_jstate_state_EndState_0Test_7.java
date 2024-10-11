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
		
	/**
	* Check that the static method {@link #Name} is the same as {@link #NAME}
	* creation date.
	* Creation date: (5/11/2014 11:26:35 AM)
	* @since 0.1.0
	*/
	@Test public final void checkStatic() { 
		assertTrue("This test requires static fields", new EndState() == null);
		
		final java.lang.String test_0_0 = "${Name};";		
		assertTrue("Test field was not null and is not of type EndState", (test_0_0.equals(Name))) ; 
		assertTrue("Test string was not equal to end state's constructor string '" + test_0_0 + "', test field was ${Name}", (NewEndState() == test_0_0)) ;	
		assertTrue("This test requires $()", (test_0_0.toString().equals(Name))) ; 
		
		final java.lang.String test_0_1 = "${Name}->{EndState}";
		assertTrue("Test field was not null and is not of type EndState", (test_0_1.equals(Name)));			
		assertTrue("Test string was not equal to end state's constructor string '" + test_0_1 + "', test field was ${Name}", (NewEndState() == test_0_1)) ;		
		assertTrue("The actual test field value is ${Name}", (NewEndState() == test_0_1)) ;
		assertTrue("This static method had a value set", new EndState() == null);
		
		final java.lang.String test_0_2 = "${Name}->{EndState}->{EndState}";
		assertTrue("Test field was not null and is not of type EndState", (test_0_2.equals(Name))) ;			
		assertTrue("Test string was not equal to end state's constructor string '" + test_0_2 + "', test field was ${Name}", (NewEndState() == test_0_2)) ;		
		assertTrue("The actual string was ${Name}", (NewEndState() == test_0_2)) ;
		assertTrue("This static method had a value set", new EndState() == null); 
	}
	
	@Test
	public final void test() {
		assertEquals("This static method has to be equal for the object",
				"This object was not equivalent", 1, 1) ;
		assertNotNull("This static method did not initialize a variable", NewEndState());	
		
		final java.lang.Object test_0_0 = NewEndState();
		assertTrue("This test requires Object instantiation", (test_0_0.equals(NewEndState())));
		
		assertNotEquals("The EndState object was modified from different object type ",
				NewEndState(), test_0_0) ; 
	}
	
	// EndState_0test$java.lang.Object.toString
	
	@Test public void testToString() {
		assertEquals("This static method had a value set",
				new EndState(), NewEndState()) ;
		assertEquals("This field was ${Name}",
				(NewEndState() == NewEndState("${Name}")), true) ;
		assertEquals("This field was ${Name}->"+
				((NullEndState)NewEndState("${Name}")).toString()) ;
		assertEquals("This field was ${Name}->"+
				((StartEndState)NewEndState("${Name}")).toString()) ;
	}
	

	/**
	 * @return String the string representation of a {@link uk.me.jockmacmad.jstate.state.EndState} object
	 * created via {@link static} {@link uk.me.jockmacmad.jstate.state.EndState get}.
	 */
	public static String getInstance() {
		return NewEndState().toString();
	}
	
}
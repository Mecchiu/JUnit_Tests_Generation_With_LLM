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
	 * <p>Initial state for the Test</p>
	 * @since 0.1
	 */
	private static final String INITIAL_STATE = "A";
		
	/**
	 * <p>Initial state for the Test</p>
	 * @since 0.1
	 */
	private static final String INITIAL_STATE_NULL = "NULL";

        /**
	 * Private Constructor for the EndState_1Test class initializing a singleton instance.
	 * Creation date: (2/20/01 11:05:10 AM)
	 * @since 0.1
	 */
	private EndState_1Test() {
	}
	
	/**
	 * Tests the {@link EndState#getName()} method
	 * Creation date: (4/24/01 11:22:43 AM)
	 * @since 0.1
	 */
	@Test
	public void classMethod_GetNameReturns_Returns_A_String() {
		String temp = EndState_1Test.INITIAL_STATE_NULL;
		Object res = null;
		
		res = new EndState(INITIAL_STATE);                                                       // Create end state string
		assertEquals("String expected for initial state",EndState_1Test.INITIAL_STATE, res);
		
	}
	

	/**
	 * Tests the {@link EndState#getName()} method
	 * Creation date: (4/24/01 11:22:43 AM)
	 * @since 0.1
	 */
	@Test
	public void classMethod_GetNameReturns_Returns_NULL_If_The_Parameter_is_NULL() {
		Object res = null;
		
		res = new EndState(Inertia_1Test.INITIAL_VALUE);                                         // Create inert value
		assertEquals("str expected for initial state",Inertia_1Test.INITIAL_VALUE.toString(), res);
		
	}
	
	/**
	 * Tests the {@link EndState#getName()} method
	 * Creation date: (4/24/01 11:22:43 AM)
	 * @since 0.1
	 */
	@Test
	public void classMethod_GetNameReturns_Returns_Null_If_The_Inert_Parameter_is_EMPTY() {
		Object res = null;
		
		res = new EndState(Inertia_1Test.INITIAL_VALUE.clone());                                          // Create init value
		
		assertEquals("endState name is null", NULL., res);
	}
	
	/**
	 * Tests the {@link EndState#getName()} method
	 * Creation date: (4/24/01 11:22:43 AM)
	 * @since 0.1
	 */
	@Test
	public void classMethod_GetNameReturns_Returns_NULL_If_The_Parameter_is_EMPTY_AND_It_Is_a_String() {
		Object res = null;
		
		res = new EndState(null);                                                   // Create endvalue null string
		
		assertEquals("value is null", NULL., res);
	}
	
	
	@Test
	public void classMethod_GetNameReturns_Returns_Value() throws NoSuchMethodException, SecurityException {
		Object res = null;

		res = new EndState (Inertia_1Test.INITIAL_VALUE);                                                              // Create end state value
		assertEquals("endState value is the uninitial value",Inertia_1Test.INITIAL_VALUE, res);

		res = new EndState (new String(Inertia_1Test.INITIAL_VALUE.getBytes()));                          // Create end state value
		assertEquals("stringified value is string",Inertia_1Test.INITIAL_VALUE.toString(), res);        		 // Test the value toString method
	}

	//- Endstate-end-
}
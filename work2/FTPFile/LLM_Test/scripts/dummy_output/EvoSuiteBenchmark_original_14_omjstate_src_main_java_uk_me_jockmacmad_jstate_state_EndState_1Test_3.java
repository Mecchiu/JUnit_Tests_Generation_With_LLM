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
	* Test of toObject method, of class EndState.
		* @since 0.1 (created on 05/09/08)
	*/
	@Test
    public void testToObject() throws Exception {
		System.out.println("=== testToObject ===");
				
		EndState myState = EndState.getSingleton();
		System.out.println("myState: " + myState.getName());
		System.out.println("\n\n\n");
		
		EndState myState2 = myState.toObject();
	    System.out.println("myState2: " + myState2.getName());
	}
}
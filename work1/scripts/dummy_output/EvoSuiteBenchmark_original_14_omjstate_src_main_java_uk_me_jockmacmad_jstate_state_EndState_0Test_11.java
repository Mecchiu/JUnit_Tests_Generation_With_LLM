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
		public static void testGetSingleton_String(String method) {
			final EndState p =
				EndState.SINGLETON;
			System.out.print(
				method + ": " +
				((p == null)? "not initialized or unassigned" :
				"is a properly constructed EndState instance")
				+ ". ");
			assertTrue("p==null", 
				(p!= null) && (p.getName().equals(method)));
		}
		int testGetSingleton_String(final String method) {
			EndState.testGetSingleton_String(method);
			return 0;
		}
}
// EndState_0Test.java
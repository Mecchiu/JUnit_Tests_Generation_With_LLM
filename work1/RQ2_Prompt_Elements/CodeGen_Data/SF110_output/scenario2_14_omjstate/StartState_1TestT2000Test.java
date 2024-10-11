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
@Test
		public void testStartState() throws Exception {
			String message = "This is a test message.";
			StartState toCompare1 = new StartState();
			toCompare1.startState().toString();
			assertEquals("ToString: ", this.getClass().getSimpleName()," - a StartState instance and no message.",
				this.getClass().getSimpleName()+" - a StartState instance.", message);
	}

}

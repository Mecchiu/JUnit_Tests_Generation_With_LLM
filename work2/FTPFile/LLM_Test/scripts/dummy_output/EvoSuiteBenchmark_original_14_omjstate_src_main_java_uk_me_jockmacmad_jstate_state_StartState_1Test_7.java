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
	 * Tests the method throws if the class is not started.
	 * The purpose of this test is to validate that we can start
	 * a StartState instance after it was previously started.
	 *  <p>
	 *  Usage of the <code>equals</code> method is used by the
	 *  {@link StartState}.
	 * @throws Exception
	 * @since 0.1
	 */
	@Test
	void test_equals_Null() throws Exception {
		
		var obj = new StartState();
		fail("It can't be started a new object.");
	}

	/**
	* Tests the method throws if the class is not started.
	* The purpose of this test is to validate that we can start
	* a StartState instance after it was previously started.
	* Usage of the <code>hashCode</code> method is used by the
	* {@link StartState}.
	* @throws Exception
	*/
	@Test
	void test_hashCode() throws Exception {
		
		var obj = new StartState();
		fail("It can't be started a new object.");
	}
	
}
// StartState_1Test_1TestSuite.java
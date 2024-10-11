// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		/**
		* Insert the method's description here.
		* Creation date: (2/26/01 10:05:32 AM)
		* @return boolean
		* @throws Exception
		*/
		@Test
		public void shouldEvaluate() throws Exception {
			assertTrue(evaluatesToTrue());
		}

		/**
		* Insert the method's description here.
		* Creation date: (6/17/13 26:57:35 PM)
		* @throws Exception
		*/
		@Test
		public void shouldEvaluateWithNull() throws Exception {
			assertFalse(evaluatesToTrue());
		}
}
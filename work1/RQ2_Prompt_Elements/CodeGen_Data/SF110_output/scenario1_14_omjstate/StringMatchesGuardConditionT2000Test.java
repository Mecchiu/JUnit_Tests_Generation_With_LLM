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
		 * Executes the given test case.
		 */
		@Test
		public void test() {
				String str1 = "hello";
				String MatchesGuardConditionCondition = new StringMatchesGuardCondition();
				str1 = (String) MatchesGuardConditionCondition.evaluate(str1);
				assertEquals(str1, "hello");
				assertFalse(MatchesGuardConditionCondition.evaluate(Integer.valueOf(123)));
		}
}
		 
		 

// StringMatchesGuardConditionTest.java/TestStringMatchesGuardCondition.java
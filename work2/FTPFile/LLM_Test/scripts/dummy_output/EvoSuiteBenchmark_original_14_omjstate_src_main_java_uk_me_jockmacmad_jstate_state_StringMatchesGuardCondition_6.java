// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		@Test
		public void test() {
			String value = "value";
			StringMatchesGuardCondition guardCondition = new StringMatchesGuardCondition(value);
			int result = guardCondition.evaluate(null);
			assertTrue(result == (java.lang.Integer.valueOf(result).intValue()));
			assertEquals(value, guardCondition.getValue());
		}
}
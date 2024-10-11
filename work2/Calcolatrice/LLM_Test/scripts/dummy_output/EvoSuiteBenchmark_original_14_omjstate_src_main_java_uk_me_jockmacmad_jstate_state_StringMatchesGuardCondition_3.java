// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		int value;

		StringMatchesGuardCondition(int newVal);

		/**
		 * Insert the method's description here.
		 * Creation date: (2/6/01 12:13:54 PM)
		 * @param i int
		 */
		protected void setUp(int i) {
			value = i;
		}

		/**
		 * Insert the method's description here.
		 * Creation date: (2/6/01 12:13:54 PM)
		 * @param o java.lang.Object
		 */
		protected void tearDown(java.lang.Object o) {
		}

		/**
		 * Test method for
		 * {@link StringMatchesGuardCondition#evaluate(Object)}
		 * @throws Exception
		 */
		@Test
		public void testEvaluate() throws Exception {
				assertEquals("String contains '"+value+"', and vice versa",
						String.valueOf(value), String.valueOf(this.evaluate(value)));
				assertEquals("String value not equal", String.valueOf(value),
						new String(StringMatchesGuardCondition.this.getValue()));
		}

}
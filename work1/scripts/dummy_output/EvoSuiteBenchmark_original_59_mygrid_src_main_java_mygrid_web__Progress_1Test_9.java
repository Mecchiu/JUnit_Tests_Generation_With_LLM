// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {
		/**
		 * Test method for getTypeDesc
		 */
		@Test
		public void testGetTypeDesc() {
			java.lang.String expResult1 = "Job";
			java.lang.String result1 = _Progress.getTypeDesc();
			assertEquals(expResult1, result1);
		}
	}
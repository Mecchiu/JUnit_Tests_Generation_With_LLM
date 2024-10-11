// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
private ArrayOfContextElement target = null;
		private ArrayOfContextElement targetInst = null;

		/**
		 * Constructor for ArrayOfContextElementTest.
		 * @param testParam  array of context element to test
		 * @since 1.1
		 */
		public ArrayOfContextElementTest(ArrayOfContextElement[] testParam) {
			target = testParam[0];
			targetInst = testParam[1];
		}
		@Test @SafeForcingSideEffect
		public void testGetTypeDesc() {
			assertArrayEquals(target.getTypeDesc(),ArrayOfContextElement.TypeDesc.class);
			assertArrayEquals(targetInst.getTypeDesc(),ArrayOfContextElement.TypeDesc.class);
		}
	}
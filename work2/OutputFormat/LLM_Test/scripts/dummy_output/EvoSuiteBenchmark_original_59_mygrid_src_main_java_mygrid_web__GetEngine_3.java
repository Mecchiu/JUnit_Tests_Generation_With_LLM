// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
		/**
		* Test method for {@link _GetEngine#getTypeDesc()}.
		*/
	@Test
		public void testGetTypeDesc() {
		_GetEngine result = null;
		try {
			result = new _GetEngine().getTypeDesc();
		} catch (java.lang.RuntimeException e) {
			fail("Exception in test case 1.2.1: thrown exception was not expected.");
		}
		assertEquals(typeDesc, result);
	}

}
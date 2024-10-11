// _GetEngine_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngine_1Test {
		
	@Test
	public void testGetTypeDesc() throws Exception {
		// assert field _GetEngine.getTypeDesc is annotated
	        assertNotNull(typeDesc);
	}

	@Test
	public void test() throws Exception {

		GetEngine _getEngine;

		// first test for a missing field
		{
			_getEngine = new GetEngine();
			fail("Assertion failed");
		}
	}

}
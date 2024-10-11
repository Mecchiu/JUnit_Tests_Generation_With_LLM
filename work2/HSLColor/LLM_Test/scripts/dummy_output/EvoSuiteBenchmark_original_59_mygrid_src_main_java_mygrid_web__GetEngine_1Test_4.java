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
    public void testGetTypeDesc() {
		int result = _GetEngine.getTypeDesc().hashCode();
		assertEquals(result, 35656957);
    }
	
}
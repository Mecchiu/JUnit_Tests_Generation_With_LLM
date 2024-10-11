// _FailResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponse_1Test {
		// BEGIN SUITE BEGINS //
	
	private final String _nullParam0 = null;
	private final String _nullParam1 = "0";
	private final String _nullParam2 = "-1.0";
	private final String _nullParam3 = "-100";
	
	
	private final String _success1 = "2.000000";
	private final String _success2 = "-2.000000";
	private final String _success3 = "1.000000";
	
	// END SUITE BEGINS //
	
	@Test
	public void testGetTypeDesc() {
		// BEGIN SUITE BEGINS //
		
		assertNull((java.lang.Object) _nullParam0);
		assertNull((java.lang.String) _nullParam1);
		assertNull((java.lang.String) _nullParam2);
		assertEquals("0", _nullParam3);	

		assertEquals((java.lang.Object) _success1, ((java.lang.String) _success2).length());
		
        assertEquals((java.lang.Object) _success3, ((java.lang.String) _success3).length()); 
		
		
	}

}
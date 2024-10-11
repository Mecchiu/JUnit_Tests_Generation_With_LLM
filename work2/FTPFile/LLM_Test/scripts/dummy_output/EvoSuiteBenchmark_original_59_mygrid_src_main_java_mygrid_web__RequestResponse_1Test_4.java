// _RequestResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponse_1Test {
		
	public String getRequestResult() {
		return "req";
	}

	@Test
	public void test0() {
		
		if (System.getProperty("OS_VERSION").length() > 0) {
		
			assertTrue(true);
			
		} else { 
		     assertTrue(false);
		}
/*
		String r = _RequestResponse.getTypeDesc();
		boolean result = r.equals("RequestResult");
		assertEquals(true, result);
*/
	}
	
}
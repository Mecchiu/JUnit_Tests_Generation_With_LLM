// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {
		
    final String testName = "__testName";
	java.util.List<java.util.Map> _map1;
	
	public _ProgressResponseTest() {
		this._map1 = new java.util.ArrayList<java.util.Map>();
	}
	
	// Set values (for get)
    @Test
	public void testGetTypeDesc() {
		// assert get value is correct
		assertNotNull(
				_map1
				.get(
						testName
				));
	}	
}
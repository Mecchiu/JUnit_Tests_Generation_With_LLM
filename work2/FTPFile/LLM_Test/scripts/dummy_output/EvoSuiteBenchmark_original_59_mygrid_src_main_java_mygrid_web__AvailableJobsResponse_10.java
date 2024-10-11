// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		
	private final static String _APPLIED_RESOURCE_TYPE = "mygrid.web.AvailableJobsResponse";

	private boolean called;


	@org.junit.jupiter.api.Test
	public void testGetTypeDesc() {
		
		assertEquals(6, _AvailableJobsResponse.getTypeDesc().getType().length);
	}



	@org.junit.jupiter.api.Test
	public void testGetTypeDesc() {
		
		_AvailableJobsResponse.getTypeDesc();

		called = true;
	}
	
}
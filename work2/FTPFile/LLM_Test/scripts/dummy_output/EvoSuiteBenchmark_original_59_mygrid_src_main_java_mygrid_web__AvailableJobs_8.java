// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		private static final long serialVersionUID = 1L;

	int _i;
	public void runTest() throws Exception {
		_AvailableJobs obj = new _AvailableJobs();
		long len = obj.getTypeDesc().compareTo(obj.type, 0, 1, 0);
		if (len > 0) {
			throw new Exception("The type descriptor of _AvailableJobs is different.");
		}
		assertTrue(len == 0);
	}
	
	protected void setUp() throws Exception {
		
	}

	protected void tearDown() throws Exception {

	}
}
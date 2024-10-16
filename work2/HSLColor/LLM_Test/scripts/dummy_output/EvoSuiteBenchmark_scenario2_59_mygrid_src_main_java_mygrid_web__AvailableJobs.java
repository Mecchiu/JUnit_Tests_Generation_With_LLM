// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		
	/**
	* Test case for the {@link _AvailableJobs#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(_AvailableJobs.getTypeDesc());
	}
}
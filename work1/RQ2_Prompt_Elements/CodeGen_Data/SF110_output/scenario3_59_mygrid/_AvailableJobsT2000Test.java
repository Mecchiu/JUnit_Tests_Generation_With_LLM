// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {

    /**
     * SimpleTest method to test the value of the field isAvailable for
     * the {@link mygrid.web.AvailableJobs} object
     */
    @Test
	public void test() {
    	
    	AvailableJobs instance = new AvailableJobs();
    	
		assertTrue(instance.isAvailable());
	}
}
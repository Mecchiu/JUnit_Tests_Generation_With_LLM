// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {

    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
        _AvailableJobs.class);

    @Test
    public void test() {
	
	   _AvailableJobs instance = new _AvailableJobs();
	   assertNotNull("The result can't be null.", instance);
 
    }

}

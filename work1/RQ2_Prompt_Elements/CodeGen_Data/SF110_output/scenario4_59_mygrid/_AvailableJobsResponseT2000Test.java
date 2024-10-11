// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {

	private _AvailableJobsResponse _availableJob;
    
    
    /**
     * Get a new instance of the _AvailableJobsResponseTest class
     */
    public _AvailableJobsResponseTest() {
        this._availableJob = new _AvailableJobsResponse(this);
    }

    /**
     * Test the getTypeDesc method
     */
    @Test
    public void testGetTypeDesc() {
        assertEquals(_availableJob.getTypeDesc(), typeDesc);
    }

    /**
     * Test of setJobs method, of class mygrid.web._AvailableJobsResponse.
     */
//    @Test
//    public void testSetJobs() {
//        // TODO: implement me!
//    }

    /**
     * Test of getAvailableJobsResult method, of class mygrid.web._AvailableJobsResponse.
     */
//    @Test
//    public void testGetAvailableJobsResult() {
//        // TODO: implement me!
//    }
}

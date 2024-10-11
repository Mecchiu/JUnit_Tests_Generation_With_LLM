// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		public static final String TEST_NAME = "mygrid.web.AvailableJobsResponseTest";

	/**
	* Test of the getTypeDesc() method, of class mygrid.web.AvailableJobsResponse.
	*/
	@Test
    public void testGetTypeDesc() {
        System.out.println("getTypeDesc");
        assertEquals(new mygrid.web.ArrayOfJob().getTypeDesc(), _AvailableJobsResponse.getTypeDesc());
    }
}
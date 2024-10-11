// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
static final org.apache.axis.description.TypeDesc typeDesc = 
	    	new org.apache.axis.description.TypeDesc(
	    		_AvailableJobsResponse.class);

		@Test
    public void testTypeDesc() {
    	assertEquals(typeDesc, _AvailableJobsResponse.typeDesc);
    }
}

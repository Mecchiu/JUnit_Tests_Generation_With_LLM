// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		
    /**
     * Test of getTypeDesc method, of class mygrid.web.AvailableJobsResponse.
     */
    @Test
    public void testGetTypeDesc() {
        System.out.println("getTypeDesc");

        // _AvailableJobsResponseTest.java
        _AvailableJobsResponse s = _AvailableJobsResponse.getTypeDesc();
        
        // Since an instance of mygrid.web.AvailableJobsResponse is immutable,
        // the JAXB type is tested in one test class.
        assertNotNull(s);
        assertEquals(s, _AvailableJobsResponse.class);

        java.lang.Class<?> enumType = _AvailableJobsResponse.getClass();
        assertEquals(enumType, getClass());
    }

}
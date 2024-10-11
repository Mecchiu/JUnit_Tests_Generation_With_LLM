// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		private final String getType();

    /**
     * Test for required field getAvailableJobsResult by not null.
     */
    @Test
    public void testBooleanField(){
        _AvailableJobsResponse instance = new _AvailableJobsResponse();
        instance.setAvailableJobsResult(null);

        assertTrue(instance.getAvailableJobsResult()!= null);
    }

    /**
     * Test for required field getAvailableJobsResult property by null.
     * throws NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void test_AvailableJobsResponse_getAvailableJobsResult_null(){
        _AvailableJobsResponse instance = new _AvailableJobsResponse();
        instance.getAvailableJobsResult(null);
    }
    /**
     * Initialize required fields by not null.
     */
    private void setUp() throws Exception {
        // add additional setup code here
    }

    /**
     * Test for required fields.
     */
    @Test
    public void test_booleanField(){
        _AvailableJobsResponse instance = new _AvailableJobsResponse();
        instance.setAvailableJobsResult(true);

    }
}
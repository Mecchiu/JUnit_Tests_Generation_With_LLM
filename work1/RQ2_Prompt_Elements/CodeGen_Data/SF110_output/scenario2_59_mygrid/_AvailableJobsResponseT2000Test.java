// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
private static final int TEST_ID = 1;
        private static final String ENDPOINT = "http://localhost:8082/"+
            "grid.mygrid/api/v2/availablejobs?";

        @Test
        public void test(){
            _AvailableJobsResponse result =   
                new _AvailableJobsResponse();
            result.getTypeDesc();
        }
}

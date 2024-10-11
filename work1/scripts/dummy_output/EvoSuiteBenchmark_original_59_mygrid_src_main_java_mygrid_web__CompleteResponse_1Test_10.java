// _CompleteResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponse_1Test {
		public static final String TEST_PROPERTIES_DIR = "test-resources/org/apache/axis2/webapps/";
	
            /**
             * Test method for getTypeDesc.
             */
            @Test
            public void testGetTypeDesc() {
                    assertEquals("String expected", "BooleanList", _CompleteResponse.getTypeDesc());
            } 
}
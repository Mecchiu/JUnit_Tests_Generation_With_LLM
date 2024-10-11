// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
private static final String REQUEST_RESPONSE_TYPE = "http://mygrid.web:443/TestGridServlet/Get";
		public void testGetTypeDesc() {
	                _RequestResponse reqResponse = new _RequestResponse();
	                reqResponse.getResponseType();
	
	        }

}
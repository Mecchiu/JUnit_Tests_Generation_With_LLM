// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		
	@org.junit.jupiter.api.Test
	public void testGetTypeDesc() {
		{
			String strTypeTest = "_RequestResponse.java";
			// construct parameters
			java.nio.file.Path pathParam = null;
			java.lang.String strTypeTestObject = null;

			_RequestResponse value = new _RequestResponse();
	
			// invoke the constructor
			String strResult = value.getTypeDesc();
			
			// assert result
            assertNotNull("Result was null", strResult);
            assertEquals("Result value was incorrect", strTypeTest, strResult);
        }
		
		
	}

}
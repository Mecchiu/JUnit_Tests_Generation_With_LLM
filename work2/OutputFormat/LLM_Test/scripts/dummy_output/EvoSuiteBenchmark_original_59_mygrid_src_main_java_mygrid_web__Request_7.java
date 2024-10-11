// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		
	@Test
	void testGetTypeDesc() {
			assertNotNull("The getTypeDesc method of the _Request interface should return a non-null value.",_Request.getTypeDesc());
	}

}
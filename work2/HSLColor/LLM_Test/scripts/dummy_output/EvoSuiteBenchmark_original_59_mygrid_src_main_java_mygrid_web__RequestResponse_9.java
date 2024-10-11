// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		
	@Test
        public void test_getTypeDesc(){
		System.out.println("Testing getTypeDesc");
		String returnString;
		returnString = _RequestResponse.getTypeDesc();
		assertNotNull(returnString);
	}

        @Test
        public void test_getTypeInfo(){
		String returnString;
		returnString = _RequestResponse.getTypeInfo();
		assertNotNull(returnString);
	}

	@Test
        public void test_getResponse(){
		String returnString;
		returnString = _RequestResponse.getResponse();
		assertNotNull(returnString);
	}

        @Test
        public void test_getMessage(){
		String returnString;
		returnString = _RequestResponse.getMessage();
		assertNotNull(returnString);
	}

}
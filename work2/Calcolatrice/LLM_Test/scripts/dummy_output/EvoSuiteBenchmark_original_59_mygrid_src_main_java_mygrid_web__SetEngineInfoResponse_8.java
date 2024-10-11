// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {
		
	private static java.lang.String _typeDesc = 
		"Type metadata";
	

    // set test data
	public _SetEngineInfoResponseTest(
		) {
        super();
		
		// TODO:  Implement test code here
	}
	@Test
	  public void test() {
	    // Set the expected return object
	    assertEquals(java.lang.String.class, _GetTypeDesc().getJavaType());
	}

}

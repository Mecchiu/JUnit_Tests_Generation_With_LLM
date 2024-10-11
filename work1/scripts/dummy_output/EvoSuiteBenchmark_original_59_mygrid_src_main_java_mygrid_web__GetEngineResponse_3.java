// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		/**
		* Constructor.
		*/
	public _GetEngineResponseTest() {
	}

	@Test
	public void test$0() {
		mygrid.web.Engine result = _GetEngineResponse.getGetEngineResult();
		System.out.println("result: " + result);
	}
}
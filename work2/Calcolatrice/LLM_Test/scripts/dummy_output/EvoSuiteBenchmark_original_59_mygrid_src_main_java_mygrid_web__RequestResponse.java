// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		/**
		* Test method for
		* {@link _RequestResponse#_RequestResponse(java.lang.String)}
		*/
		@Test
		public void test_0_0() {
			_RequestResponse s = new _RequestResponse();
			boolean r1 = s.requestResult;
			assertTrue(r1);
		}

}
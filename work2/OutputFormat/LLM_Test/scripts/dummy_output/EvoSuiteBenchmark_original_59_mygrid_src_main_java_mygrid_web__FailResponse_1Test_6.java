// _FailResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponse_1Test {
		/**
		* Test case for getTypeDesc function
		*/
		@Test
		public void testGetTypeDesc() {
			_FailResponse _expected = new _FailResponse();
			org.apache.axis.description.TypeDesc typeDesc = _expected.getTypeDesc();
			assertNull(typeDesc);
		
		} 
    }
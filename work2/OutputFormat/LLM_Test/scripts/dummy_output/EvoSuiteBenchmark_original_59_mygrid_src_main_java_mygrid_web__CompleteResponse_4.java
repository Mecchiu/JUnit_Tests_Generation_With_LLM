// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
		_CompleteResponse() {
		}


		@org.junit.jupiter.api.Test
		public void testGetTypeDesc(){
			assertEquals(typeDesc, _CompleteResponse.typeDesc);
		}

		@org.junit.jupiter.api.Test
		public void testEquals(){
			_CompleteResponse result1 = new _CompleteResponse();
			assertEquals(result1, result1);
			assertEquals(result1.hashCode(), result1.hashCode());
			assertNotEquals(result1, null);
			assertNotEquals(result1, new Object());
			
		}
}
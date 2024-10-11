// _RequestResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponse_1Test {
		private final String path;
		
		/**
		 * Constructs an unit test for the
		 * {@link _RequestResponse#getTypeDesc()} method.
		 */
		public _RequestResponse_1Test(String path) {
			this.path = path;
		}
		
		@Test
		public void testGetTypeDesc() {
			assertEquals("get type description differs.",
			                      typeDesc.getClassCode(),
							      new _RequestResponse(path).getTypeDesc());
		}
	}
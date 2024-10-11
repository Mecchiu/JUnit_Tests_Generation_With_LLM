// _CompleteResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponse_1Test {
		/**
		 * Test method for {@link mygrid.web.{CompleteResponse#getTypeDesc()}
		 */
		@Test
		public void testGetTypeDesc1() {
	
			{	_CompleteResponse res = _CompleteResponse.Factory.newInstance();
				assertNotNull(res.getTypeDesc());
			}
			
			{	_CompleteResponse res = _CompleteResponse.Factory.newInstance();
				assertNull(res.getTypeDesc());
			}
		}
	}
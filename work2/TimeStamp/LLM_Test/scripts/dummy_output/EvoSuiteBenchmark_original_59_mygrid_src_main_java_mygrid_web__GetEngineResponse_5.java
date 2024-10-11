// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		private _GetEngineResponse obj;
		
		/**
		* Instantiates a new _GetEngineResponse test set.
		*/
		public _GetEngineResponseTest() {
			super();
		}

		
		/**
		* Test of getGetEngineResult method, of class _GetEngineResponse.
		*/
		@Test
		public void testGetGetEngineResult() {
			obj = _GetEngineResponse.getGetEngineResult();
			assertNotNull(obj);
		}
		@Test
		public void testGetTypeDesc() {
			assertNotNull(obj.getTypeDesc());
			assertEquals(mygrid.web.Engine.class, _GetEngineResponse.getTypeDesc());
		}
		@Test
		public void testEquals() {
			assertEquals(_GetEngineResponse, obj);
		}
	}
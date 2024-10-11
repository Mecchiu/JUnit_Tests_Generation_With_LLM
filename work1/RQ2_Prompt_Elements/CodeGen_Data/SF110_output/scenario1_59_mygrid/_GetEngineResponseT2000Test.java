// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
public void testConstructor() {
			_GetEngineResponse response = new _GetEngineResponse();
			assertNotNull(response);
			assertNull(response.getEngine());
		}

		public void testGetEngine() {
			_GetEngineResponse response = new _GetEngineResponse();
			assertNotNull(response);
			_Engine engine = response.getEngine();
			assertNotNull(engine);
			assertTrue(engine.getKey().length() > 0);
		}

}
// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
		private _GetEngine _getEngine;
		
        public _GetEngineTest(int index) {
            // Use the factory
            this._getEngine = new _GetEngine(index);
        }
        @org.junit.jupiter.api.Test
        public void testctor() {
            {
                _GetEngine _getEngine = new _GetEngine();
                assertEquals(true, _getEngine.getTypeDesc() == null);
                assertEquals(0, _getEngine.size());
            }
            {
                _GetEngine _getEngine;
                _getEngine = null;
                assertNull(true);
            }
            {
                _GetEngine _getEngine = new _GetEngine();
                _getEngine.getTypeDesc();
                assertNull(true);
            }
        }
		@Test(expected = java.lang.NullPointerException.class)
		 public void defaultConstructorNull() {
        }
}
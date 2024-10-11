// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
		
        /**
         * Get type desc.
         */
        @Test
        public void test_GetTypeDesc() {
                
            _Logon testObj = new _Logon();
            
            assertEquals("_LogonTest: getTypeDesc(): type desc", _Logon.class, testObj.getTypeDesc());
        }
}
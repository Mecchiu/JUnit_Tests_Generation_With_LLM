
package mygrid.web;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class _LogonResponseTest {
    @Test
    public void testgetLogonResult() {
     _LogonResponse obj = new _LogonResponse();
     assertFalse(obj.isLogonResult());
     String result = obj.setLogonResult(true);
     assertTrue(result);
     assertEquals(true, obj.getLogonResult());
     Object obj2 = obj.newInstance();
     assertTrue("Unexpected Object", obj2 instanceof _LogonResponse);
     assertNotNull(obj2.getTypeDesc());
 }
    private class _LogonResponse implements java.io.Serializable {
        private boolean logonResult;
        private static final long serialVersionUID = -Long.parseLong("5523262988010971953");
        public _LogonResponse() {
        }
        public boolean isLogonResult() {
            return logonResult;
        }
        public void setLogonResult(boolean logonResult) {
            this.logonResult = logonResult;
        }
    }
}
// ConvertTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @Test
    void testInit_Thread() {
        // Test if thread is created and joined successfully
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(true);
        boolean result = convert.init();
        assertFalse(result);
    }

    @Test
    void testInit_NoThread() {
        // Test if transcode is executed successfully without thread
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        boolean result = convert.init();
        assertFalse(result);
    }

    @Test
    void testInit_ErrorCheck() {
        // Test if error is detected in transcode.log
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "testDir";
        boolean result = convert.init();
        assertTrue(result);
    }

    @Test
    void testInit_ErrorCheck2() {
        // Test if error is detected in mplex.log
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "testDir";
        boolean result = convert.init();
        assertTrue(result);
    }

    @Test
    void testInit_Error() {
        // Test if m_Error is set during Transcode method
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_Error = true;
        boolean result = convert.init();
        assertTrue(result);
    }

    @Test
    void testInit_AllErrors() {
        // Test if all error checks return true
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "testDir";
        convert.m_Error = true;
        boolean result = convert.init();
        assertTrue(result);
    }

    @Test
    void testInit_NoErrors() {
        // Test if no errors occur
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "testDir";
        convert.m_Error = false;
        boolean result = convert.init();
        assertFalse(result);
    }

    @Test
    void testInit_Exception() {
        // Test if exception is caught and error is set
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = null;
        boolean result = convert.init();
        assertTrue(result);
    }

    @Test
    void testInit_Exception2() {
        // Test if exception is caught and error is set
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "";
        boolean result = convert.init();
        assertTrue(result);
    }

    @Test
    void testInit_Exception3() {
        // Test if exception is caught and error is set
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "testDir";
        convert.m_GUI.ErrorCheck("invalidPath");
        boolean result = convert.init();
        assertTrue(result);
    }
}
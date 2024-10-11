// ConvertTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    
    @Test
    void testInit() {
        // Test case 1: When menuChkThread is not selected, Transcode method should be called
        Convert convert = new Convert();
        convert.m_GUI.menuChkThread.setSelected(false);
        boolean result1 = convert.init();
        assertFalse(result1);
        
        // Test case 2: When menuChkThread is selected, a new thread should be started and joined
        convert.m_GUI.menuChkThread.setSelected(true);
        boolean result2 = convert.init();
        assertFalse(result2);
        
        // Test case 3: When an InterruptedException occurs while joining the thread, an error should be returned
        convert.m_Thread = new Thread();
        boolean result3 = convert.init();
        assertTrue(result3);
        
        // Test case 4: When transcode.log contains an error, an error should be returned
        convert.m_GUI.menuChkThread.setSelected(false);
        convert.m_GUI.strOutputDir = "testDir";
        File transcodeLog = new File("testDir/log/transcode.log");
        try {
            transcodeLog.createNewFile();
            FileWriter writer = new FileWriter(transcodeLog);
            writer.write("Error occurred");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean result4 = convert.init();
        assertTrue(result4);
        transcodeLog.delete();
        
        // Test case 5: When mplex.log contains an error, an error should be returned
        File mplexLog = new File("testDir/log/mplex.log");
        try {
            mplexLog.createNewFile();
            FileWriter writer = new FileWriter(mplexLog);
            writer.write("Error occurred");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean result5 = convert.init();
        assertTrue(result5);
        mplexLog.delete();
        
        // Test case 6: When m_Error is true, an error should be returned
        convert.m_Error = true;
        boolean result6 = convert.init();
        assertTrue(result6);
        
        // Test case 7: When there are no errors, no error should be returned
        convert.m_GUI.menuChkThread.setSelected(false);
        boolean result7 = convert.init();
        assertFalse(result7);
    }
}
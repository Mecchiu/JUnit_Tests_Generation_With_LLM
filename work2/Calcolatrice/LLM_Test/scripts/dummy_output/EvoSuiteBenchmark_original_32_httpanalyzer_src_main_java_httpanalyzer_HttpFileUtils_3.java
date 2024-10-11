// HttpFileUtilsTest.java
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.http.HttpEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpFileUtils}.
* It contains one unit test case for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtilsTest {
		
    // Main window
    private final HttpFileUtils mainView;
    
    // JFrame
    private JFrame testFrame;
    
    // Main frame
    private HttpFileUtils mainFrame;
    
    // Receive the messages
	private String msg;

    /**
     * Constructor for {@link HttpFileUtilsTest}
     * @param test the main window to receive messages
     * @param mainView the main frame for test
     * @param mainFrame the {@link HttpFileUtils} instance.
     */
    public HttpFileUtilsTest(HttpFileUtils mainView, HttpFileUtils mainFrame,
            HttpFileUtilsTest anotherTest) {
    
        this.testView = mainView;
        this.mainFrame = mainFrame;
        this.mainView = anotherTest.mainView;
    }
    
    /**
     * Test method for {@link HttpFileUtils#saveEntity(HttpEntity, String)}
     */
    @Test
    public void testSaveEntity() {
        
        Calendar t0 = Calendar.getInstance();
        int msince = t0.get(Calendar.MINUTE);
        String fileLastSaveTime = "2015-02-02T22:00:00Z";
        
}
}
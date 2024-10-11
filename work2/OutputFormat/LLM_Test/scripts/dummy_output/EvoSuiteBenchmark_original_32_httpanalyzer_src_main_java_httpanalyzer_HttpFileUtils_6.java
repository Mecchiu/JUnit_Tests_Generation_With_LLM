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
		
    /**
     * @throws java.io.IOException
     */
    @Test
    void prepare_test() throws IOException {
        // JFileChooser instance
        FileChooser fileChooser = new FileChooser();
        
        // set properties
        PropertiesProperties testProps = new PropertiesProperties();

        // save previous and actual values
        PropertiesProperties oldValue = new PropertiesProperties();
        PropertiesProperties oldValueActual = new PropertiesProperties();
        
        // get saved value
        String savedValue = new String();
        Calendar savedTime = new Calendar();
        String savedTimeActual = "";
        
        // set/retrive saved value
        oldValue.setProperty("savedValue", savedValue);
        oldValueActual.setProperty("savedTime", savedTime);
        oldValue.setProperty("savedTimeActual", savedTimeActual);
        
        byte[] savedBytes = new byte[]{0x02, 0x01, 0x01};
        
        // set/retrive saved bytes
        oldValue.setProperty("savedBytes", savedBytes);
        oldValueActual.setProperty("savedValueBytes", savedBytes);
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
        
        // get saved value from JFileChooser
        savedValue = fileChooser.getSelectedFile().getAbsolutePath();
        
        // get saved bytes from JFileChooser
        savedBytes = new byte[(int) fileChooser.getSelectedFile().length()];
        savedBytes = fileChooser.getSelectedFile().read(savedBytes);

        // get saved time from JFileChooser
        savedTime = fileChooser.getSelectedFile().lastModified();
        
        // get saved bytes from JFileChooser
        savedTimeActual = fileChooser.getSelectedFile().getAbsolutePath();
        
        // get saved bytes in Properties object
        savedBytes = testProps.getBytesValue(savedValue);
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
        
        // get saved value from Properties object
        savedValue = testProps.getPropertyValue("savedValue");
        
        // get saved bytes from Properties object
        savedBytes = testProps.getPropertyBytesValue("savedBytes");
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
        
        // get saved bytes in Properties object
        savedBytes = testProps.getPropertyBytesValue("savedBytes");
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
        
        // get saved value from Properties object
        savedValue = testProps.getPropertyValue("savedValue");
        
        // get saved bytes from Properties object
        savedBytes = testProps.getPropertyBytesValue("savedBytes");
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
        
        // get saved bytes in Properties object
        savedBytes = testProps.getPropertyBytesValue("savedBytes");
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame("test"));
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
        
        // get saved time from JFileChooser
        savedTimeActual = fileChooser.getSelectedFile().lastModified();
        
        // get saved bytes from JFileChooser
        savedBytes = new byte[(int) fileChooser.getSelectedFile().length()];
        savedBytes = fileChooser.getSelectedFile().read(savedBytes);
        
        // show dialog
        fileChooser.showOpenDialog(new JFrame());
    }

    /**
     * @throws java.io.IOException
     */
    @Test
    void save_test() throws IOException {
        FileChooser fileChooser = new DefaultMutableFileChooser("Save preference");
        
        // set properties
        PropertiesProperties testProps = new PropertiesProperties();

        // show dialog
        fileChooser.showSaveDialog(new JFrame());
        
        // get saved value
        String savedValue = new String();
        Calendar savedTime = new Calendar();
}
}
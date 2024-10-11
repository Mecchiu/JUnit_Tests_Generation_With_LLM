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
		
    public HttpFileUtilsTest(){ //Constructor test for new instances of JFileUtils 
    
        final String prop1 = "prop_1";
        final String prop2 = "prop_2";
        
        
        try {
             //Save the properties file
             Properties properties = new Properties();
             properties.put(prop1, "value1");
             properties.put(prop2, "value2");
             properties.save(new File(System.getProperty("user.dir")) + File.separator + "preferences.properties");
            
        } catch (IOException exp) {
            JFileChooser chooser1 = new JFileChooser();
            chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            chooser1.setDialogTitle("Choose File");
            int response = chooser1.showOpenDialog(new JFrame());
            if (response == JFileChooser.APPROVE_OPTION) {
                File f = chooser1.getSelectedFile();
                FileInputStream fis = new FileInputStream(f);
    			try {
    			    properties = new Properties();
    			    properties.load(fis);
    			} finally {
    			    fis.close();
    			}
            }
        }
            
            
        /* Test save entity and read it back to file*/
        /* TODO(vlad): this would fail */
        HttpEntity entity = saveEntity(new HttpEntityWrapper(System.getProperty("user.dir") + File.separator + "replay.html"), System.getProperty("user.dir") + File.separator + "webresources/preferences.properties");
        FileOutputStream fos = new FileOutputStream("preferences.properties");
        try {
            fos.write(entity.getContent());
        } finally {
            fos.close();
        }
        
        /* Test load entity*/
        try {
            entity = loadEntity(System.getProperty("user.dir") + File.separator + "replay.html");
        } catch (Exception e) {
        }
            

        
        /* Test save from the file chooser*/
        try {
            saveFromSelectFileChooser("preferences", System.getProperty("user.dir") + File.separator + "webresources/preferences.properties", new HttpFileUtilsTest());
        } catch (Exception e) {
        }
        
        assertNotNull(entity);
            
    }
}
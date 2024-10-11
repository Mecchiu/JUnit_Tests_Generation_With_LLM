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
// HttpFileUtils.java
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

/**
 * @author vlad
 */
public class HttpFileUtils {

    /**
     * Save Http entity to file
     *
     * @param entity HttpEntity
     * @param fileName String
     */
    public long saveEntity(HttpEntity entity, String fileName) {
        long size = 0L;
        File file = new File(fileName);
        byte[] buffer = new byte[MAX_BUFFER_SIZE];
        // Read from server into buffer.
        InputStream streamEntity;
        RandomAccessFile outFile;
        try {
            streamEntity = entity.getContent();
            outFile = new RandomAccessFile(file, "rw");
            int read = 0;
            // Rewrite file
            outFile.setLength(0);
            System.out.println("Buffer size =" + buffer.length);
            while ((read = streamEntity.read(buffer))!= -1) {
                size = size + read;
                // Write buffer to file
                outFile.write(buffer, 0, read);
            }
            outFile.close();
            streamEntity.close();
        } catch (IOException ex) {
            Logger.getLogger(HttpFileUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(HttpFileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return size;
    }
}

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
		 * Getter for the {@link Properties} value for {@link HttpFileUtilsTest}.
		 * @return the {@link Properties} value for {@link HttpFileUtilsTest}
		 */
    Properties getProperties() {
        Properties properties = new Properties();
        return properties;
    }

	/**
	 * Getter for the {@link String} value for {@link HttpFileUtilsTest}.
	 * @return the {@link String} value for {@link HttpFileUtilsTest}
	 */	 
	String getFilename() {
		return "test.txt";
	}

	/**
	 * Getter for the {@link String} value for {@link HttpFileUtilsTest}.
	 * @return the {@link String} value for {@link HttpFileUtilsTest}
	 */	 
	String getContent() {
		return "Text";
	}

	/**
	 * Getter for the {@link String} value for {@link HttpFileUtilsTest}.
	 * @return the {@link String} value for {@link HttpFileUtilsTest}
	 */	 
	String getResponse() {
		return "Response";
	}

	/**
	 * Getter for the {@link String} value for {@link HttpFileUtilsTest}.
	 * @return the {@link String} value for {@link HttpFileUtilsTest}
	 */	 
	String getResultFileName() {
		return "resultFileName";
	}

	/**
	 * Getter for the {@link String} value for {@link HttpFileUtilsTest}.
	 * @return the {@link String} value for {@link HttpFileUtilsTest}
	 */	 
	String getErrorContent() {
		return "ErrorContent";
	}

	/**
	 * Getter for the {@link Calendar} value for {@link HttpFileUtilsTest}.
	 * @return the {@link Calendar} value for {@link HttpFileUtilsTest}
	 */
	Calendar getCalendar() {
		Calendar c = new GregorianCalendar();
		c.setTime(Calendar.getInstance());
		return c;
	}
	
	/**
	 * Getter for the {@link JFileChooser} value for {@link HttpFileUtilsTest}.
	 * @return the {@link JFileChooser} value for {@link HttpFileUtilsTest}
	 */
	public JFileChooser getChooser() {
		JFileChooser c = new JFileChooser();
		c.setDialogTitle("Select Inputs File");
		c.setDialogType(JFileChooser.OPEN_DIALOG);
		return c;
	}
	
	/**
	 * Getter for the {@link JFrame} value for {@link HttpFileUtilsTest}.
	 * @return The {@link JFrame} value for {@link HttpFileUtilsTest}
	 */
	JFrame getJFrame() {
		JFrame jf = new JFrame();
		return jf;
	}

	/**
	 * Getter for the {@link JFileChooser} value for {@link HttpFileUtilsTest}.
	 * @return The {@link JFileChooser} value for {@link HttpFileUtilsTest}
	 */
	JFileChooser getFileChooser() {
		JFileChooser wmf = new JFileChooser();
		return wmf;
	}   
	/**
	 *  Getter for the {@link PrintWriter} value for {@link HttpFileUtilsTest}.
	 * @return The {@link PrintWriter} value for {@link HttpFileUtilsTest}
	 */
    PrintWriter getOutput() {
		PrintWriter pw = new PrintWriter(new PrintWriter(new FileOutputStream(getFilename()), true));
        return pw;
    }

	/**
	 * Setter for the {@link Properties} value for {@link HttpFileUtilsTest}.
	 * @param properties The {@link Properties} value for {@link HttpFileUtilsTest}
	 */
	protected void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * Test method for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method 3.
	 */
	@Test
	public void testSaveEntity() throws Exception {
		HttpFileUtils.saveEntity(new FileInputStream(new File(getFilename())), getFilename());
	}

	/**
	 * Test method for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method 5.
	 */
	@Test
	public void testSaveEntity2() throws Exception {
		System.setProperty("user.dir", getDirectoryPath());
		Properties properties = getProperties();
		properties.put("file", getFilename());
		String filePath = HttpFileUtils.saveEntity(new RandomAccessFile(new File(getFilename()+"/file.txt")), properties);
		filePath = getFilePath(filePath);
		filePath = getDirectoryPath() + "/" + filePath;
		assertTrue(fileNameRelative(getFilename(), filePath));
		System.setProperty("user.dir", getDirectoryPath());
		properties
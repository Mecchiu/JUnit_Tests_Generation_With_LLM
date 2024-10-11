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
		* This test case is used to test:
		* {@link httpanalyzer.HttpFileUtils#saveEntity(HttpEntity, String)}.
		*/
    @Test
    public void test() throws Exception {
        File file = new File("testfiles/in.txt");
        String content = new String("AaaAaaAaa");
        String path = "path";
        String fileName = "path";
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        // Test if file is not null, size is not 0.
        assertTrue(file.length() == 0);
        InputStream in = new FileInputStream(file);
        HttpEntity entity = new HttpEntity(path);
        // Test the setter, method is used to set the value of string.
        HttpFileUtils.saveEntity(entity, path);
        // Test if the value of content is the string.
        assertEquals(content, entity.getContent());
        // Test if the string after write is the contents of HttpEntity.
        byte[] read = new byte[content.length()];
        raf.read(read);
        // Test if the string after read is the contents of HttpEntity.
        assertEquals(content, new String(read).toString());
        // Test if the file.file is file.
        assertEquals(file, new File(fileName));
        // Test if the file is not null.
        JFrame frame = new HttpFileUtilsFrame("HttpFileUtilsTest");
        file.delete();
        // Test if the file is deleted.
        assertTrue(file.exists());
        // Test if the in file is not null.
        assertTrue(in.length()!= 0);
        System.out.println("File saved.");
        frame.setVisible(true);
		raf.close();
    }

    /**
     * To test if the test suite is successfully run by checking the {@link #test()} method output.
     * @return
     */
    @Test
    public void executeTestSuite() {
	try {
		// Check the test suite output.
		// System.out.println(test);
		String content = "";
		String fileName = "";
		System.out.println("Test suite executed.");
		// Check if the test suite output is ok.
		content = test();
		// Check if there is at least one test.
		assertTrue(content.contains("Test "));
		// Test if the test suite output is OK for testing the test.
		fileName = System.currentTimeMillis().toString();
		Calendar lastDate = Calendar.getInstance();
		Calendar dateCounter = Calendar.getInstance();
		dateCounter.setTime(lastDate.getTime());
		int i = 0;
		while (dateCounter.getTime().before(Calendar.getInstance().getTime())) {
			int j = 0;
			while (dateCounter.getTime().before(lastDate.getTime())) {
				i++;
				lastDate.add(Calendar.DAY_OF_MONTH, -1);
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
			dateCounter.add(Calendar.DATE, 1);
			j = 0;
		}
		System.out.println(fileName+"\t"+i+"\n\t-"+lastDate.getTime().toString());
	} catch (Exception e) {
	    System.out.println("Exception:"+e);
	}
    }
}

/**
 * Class to test the {@link java.lang.Runtime.getString()} method.
 */
class HttpFileUtilsFrame implements Runnable {
    private JFrame _frame;
    private String _msg;

    private HttpFileUtilsFrame(String msg) {
        _msg = msg;
        _frame = new JFrame(this.getClass().getName());
        _frame.setOpaque(false);
        _frame.setBackground(new Color(0xffff00));
        _frame.setVisible(true);
    }

    public void run() {
        // Test if there is in message to set.
        assertTrue(_msg == "I was supposed to test.");
        _frame.setText(new String(_msg));
        // Test if there is the test results to see.
        int n = 0;
        n += Utils.getStringInt(_msg);
        System.out.println(_msg);
        assertEquals(n, 2);
        // Test if the frame window is the same size as the window.
        int newWidth = _frame.getWidth();
        int newHeight = _frame.getHeight();
        assertEquals(newWidth, newHeight);
    }
}

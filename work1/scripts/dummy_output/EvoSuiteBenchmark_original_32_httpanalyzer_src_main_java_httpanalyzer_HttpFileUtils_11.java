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
	 * This is test object class.
	 * It contains one unit test object.
	 */
	private HttpFileUtilsTest() {
	}
	
	// JUnit test methods
	
	/**
	 * Class under test for void saveEntity(HttpEntity, String)
	 */
	@Test
	public void testSaveEntity() {
        Properties properties = new Properties();
        FileOutputStream fos = null;
        try {
        	String baseDirectory = System.getProperty("java.io.tmpdir");
        	fos = new FileOutputStream(new File(baseDirectory + File.separator + "HttpFileUtilsTest-Test"
        			+ File.separator + "Output"));
        	printFile(fos);
        	HttpEntity entity = new ByteArrayEntity(new byte[]{(byte) 'T', 'e'});
        	Properties properties2 = new Properties();
        	properties2.put("key1","value1");
        	properties2.put("key2","value2");
        	properties2.put("key3", "value3");
            // save it as a HttpEntity
            long result = HttpFileUtils.saveEntity(entity, baseDirectory + File.separator + "Testfile",
                    HttpEntity.class.getCanonicalName(), properties2);
            assertEquals("Error - save entity", 1, result);
            fos.close();
        	// retrieve object from HttpEntity
            HttpEntity result2 = HttpFileUtils.fetchEntity(fos);
            assertEquals("Error - entity", "", result2.getContent().toString());
            fos.close();
        } catch (IOException ex) {
        	fail("Error!!" + ex.getMessage());
        }
    }
	
	/**
	 * Class under test of {@link HttpFileUtils#findFile(File)}
	 */
	@Test
	public void testFindFile() {
        String baseDirectory = System.getProperty("java.io.tmpdir");
        File testContent = new File(baseDirectory + File.separator + "HttpFileUtilsTest-Test"
                + "Content").getAbsoluteFile();
        HttpFileUtils.findFile(testContent);
	}
	
	/**
	 * Class under test of {@link FetchFailedException}
	 */
	@Test
	public void testFetchFailedException() {
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentFile(new File(System.getProperty("java.io.tmpdir")));
        try {
            jfc.getSelectedFile();
        } catch (Exception ex) {
            assertTrue("Exception", ex.getClass().getName().startsWith("java.io.InvalidFile"));
        }
    }
	
	/**
	 * Class under test of {@link FetchFailedException}
	 */
	@Test
	public void testFetchFailedException_FileChooser() {
		JFileChooser jfc = new JFileChooser();
		jfc.setCurrentFile(new File(System.getProperty("java.io.tmpdir")));
        try {
            jfc.setSelectedFile(new File("TEST"));
        } catch (Exception ex) {
            assertTrue("Exception", ex.getClass().getName().startsWith("java.io.InvalidFile"));
        }
    }
	
	/**
	 * Class under test of {@link File} object.
	 */
	@Test
	public void testFile() {
		String baseDirectory = System.getProperty("java.io.tmpdir");
        RandomAccessFile raf = null;
        try {
        	File f = getFile(baseDirectory + File.separator + "testFile");
			raf = new RandomAccessFile(f, "r");
		} catch (Exception ex) {
			ex.printStackTrace();
			Logger.getLogger(HttpFileUtilsTest.class.getName()).log(Level.SEVERE, null, ex);
		}
        assertTrue("Error!!", raf!= null);
        FileInputStream fis = null;
}
}
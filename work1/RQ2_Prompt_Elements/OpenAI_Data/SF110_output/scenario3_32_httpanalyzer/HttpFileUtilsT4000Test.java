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
* It contains ten unit test cases for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtilsTest {

	/**
	* Test case 1:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntity() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = "test.txt";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 2:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null file name.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullFileName() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = new HttpEntity();
		String fileName = null;
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 3:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a null file name.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndNullFileName() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = null;
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 4:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and an empty file name.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndEmptyFileName() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = "";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 5:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a file name with spaces.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndFileNameWithSpaces() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = "   ";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 6:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a file name with tabs.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndFileNameWithTabs() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = "\t\t\t";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 7:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a file name with new lines.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndFileNameWithNewLines() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = "\n\n\n";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 8:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a file name with spaces, tabs and new lines.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndFileNameWithSpacesTabsAndNewLines() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = " \t\n\t\n\t ";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 9:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a file name with spaces, tabs, new lines and a valid file name.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndFileNameWithSpacesTabsNewLinesAndValidFileName() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = " \t\n\t\n\t test.txt ";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
	
	/**
	* Test case 10:
	* Test the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method with a null entity and a file name with spaces, tabs, new lines and a valid file name.
	* Expected result:
	* The method should return -1.
	*/
	@Test
	void testSaveEntityWithNullEntityAndFileNameWithSpacesTabsNewLinesAndValidFileName() {
		HttpFileUtils httpFileUtils = new HttpFileUtils();
		HttpEntity entity = null;
		String fileName = " \t\n\t\n\t test.txt ";
		long result = httpFileUtils.saveEntity(entity, fileName);
		assertEquals(-1, result);
	}
}
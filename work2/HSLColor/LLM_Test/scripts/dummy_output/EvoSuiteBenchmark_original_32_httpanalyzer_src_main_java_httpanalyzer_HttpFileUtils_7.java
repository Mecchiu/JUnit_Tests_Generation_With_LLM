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
	 * Empty constructor used by serialized object
	 */
	public HttpFileUtilsTest() {
	}

        /**
	 * Test case for {@link HttpFileUtils#saveEntity(HttpEntity, File)}
	 * @throws IOException
	 */
	@Test
	public void saveEntity() throws IOException {
		
		//Create a temporary directory
		File directory = File.createTempFile("test","tmp");
		
		//Create a random file
		File file = File.createTempFile("filetest","tmp");
		FileOutputStream fos = new FileOutputStream(file);
		int c = HttpFileUtils.saveEntity(new FileInputStream(fos), "someFileName.txt");
		
		//check that saved data is stored as expected
		assertEquals("Error for file name", "someFileName.txt", file.getName());
		assertEquals("Error for save entity status", c, fos.getChannel().position());

		//Delete the temporary file and the temporary directory
		directory.delete();
		file.delete();
		
		//Check for no exception
		assertFalse("File name or saved data is null, should not exist", new File(file.getAbsolutePath()).isFile());
		assertFalse("File name or saved data is null, should not exist", new File(fos.getChannel().position()).isFile());
		
	}

	/**
	 * Load your preferences from XML files
	 * @throws Exception
	 */
	@Test
	public void loadPreferenceFromFile() throws Exception {
		File prefsFile = new File("http_preferences.properties");
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream(prefsFile);
		properties.load(new InputStream() {

			@Override
			public int read() throws IOException {
				return fis.read();
			}

		});
		//load toFileTextField
		HttpFileUtils.fillToFileField(properties.getProperty("mainView", ""),new JFrame());
		fis.close();
	}

	/**
	 * Load all your preferences from XML
	 * @throws Exception
	 */
	@Test
	public void loadAllPreferencesFromFile() throws Exception {
		RandomAccessFile randomAccessFile = new RandomAccessFile("http_preferences.properties", "r");
		Properties properties = new Properties();
		try {
			properties.load(new InputStream() {

				@Override
				public int read() throws IOException {
					return randomAccessFile.read();
				}

				@Override
				public void close() throws IOException {

				}
			});
		} finally {
			randomAccessFile.close();
			new File("http_preferences.properties").delete();
			
		}
		HttpFileUtils.fillToFileField(properties.getProperty("mainView", ""),new JFrame());
	}
		
	/**
	 * Test case for {@link HttpFileUtils#fillToFileField(String, JFrame)}
	 * @throws Exception
	 */
	@Test
	public void fillToFileField() throws Exception {
		//Create properties
		Properties propFile = new Properties();
		String[] files = {"http_preferences.properties"};
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		propFile.put("mainView", "http_preferences.properties#mainView=http"+hour);
		
		//set properties
		propFile.put("mainView", "http_preferences.properties#" + "mainView=http" + hour);
		propFile.put("myHoverMethod", "javax.swing.undo.UndoManager.getInstance()[\"#myHoverMethod\"];" );
		propFile.put("myEditForm", "http_preferences.properties#myEditForm=myForm");
		propFile.put("myDialogPreferences", "http_preferences.properties#myDialogPreferences=dialogs1");
		propFile.put("myViewForm", "http_preferences.properties#myViewForm=myForm");
		propFile.put("myWindowForm", "http_preferences.properties#myWindowForm=myForm");
		
		//Run tests
}
}
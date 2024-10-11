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
	 * Get URL for download
	 * @return URL
	 */
	private static synchronized String getURL() {
		// Set a default URL
		String url = null;
		if (System.getProperty("os.name").indexOf("Windows") == 0) {
			url = "http://www.fcs.unu.edu/~xaswry/webapp/index.php";
		} else {
			url = "ftp://" + System.getProperty("user.name") + '@' + System.getProperty("hostname") + ':' + System.getProperty("port");
		}
		String fileName = new java.io.File(System.getProperty("user.dir") + File.separator + "test" + File.separator + "log") 
				.getAbsolutePath() + '/' + Calendar.getInstance().getTimeInMillis() + ".html";
		return url+"/index.php?arg=".concat(fileName);
	}

	@Test
	public void testGetEntity(HttpAnalyzerView mainView, JFrame parentFrame) {
		// Create a JFileChooser and save information into a file
		String baseDirectory = "./test/net/pfc1/";
		FileChooserChooser fcChooser = new FileChooserChooser(null, null, baseDirectory + "/login.html", baseDirectory + "/login.js", new Properties(new Properties()), new java.io.File(baseDirectory+"/login.html"));
		
		// Create a Filechooser with a title and a window title
		// and save your choice to text field
		JFrame dialogMain = fcChooser.showDialog("LoginDialog", MainView.TITLE);
		JFrame dialogParent = fcChooser.getParentWindow();
		
		// Load properties from the properties file
		System.setProperty("os.name", System.getProperty("os.name").toLowerCase());
		System.setProperty("os.name", System.getProperty("os.name").concat(" ").concat("Windows"));
		System.setProperty("java.class.path", System.getProperty("java.class.path"));
		
		HashMap<String, String> properties = new Properties();
		properties.setProperty("login.title", MainView.TITLE);
		properties.setProperty("login.hostname", "www.fcs.unu.edu");
		properties.setProperty("login.port", "80");
		properties.setProperty("login.username", "xaswry");
		properties.setProperty("login.passwd", "abc123");
		properties.setProperty("login.fileNames", fileName);
		properties.setProperty("login.fileChooser", fcChooser);
		
		// Save the HttpEntity into a file(FileWriter)
		InputStream in = null;
		try {
			in = new FileInputStream(baseDirectory + "/login.js");
			String content1 = saveEntity(getEntity(properties, null), baseDirectory + "/log");
			saveToFile(content1, baseDirectory + "/log.html");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileWriter fw = null; 
		try {
			fw = new FileWriter("test/net/pfc1/login.js");
			fw.write("document.write(document.getElementById('login.js'));");
			fw.write("document.write('&#8011;');");
			fw.write("document.write('&#8010);");
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in!= null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		fcChooser.closeButton.setEnabled(false);
		dialogMain.dispose();
		// Get URL to save the template
		String URL = getURL();
		// Create and display dialog
		JFrame dialog = fcChooser.showDialog("", URL);
		
	}
	
	private HttpEntity getEntity(Properties properties, HttpAnalyzerView mainView) throws Exception {
}
}
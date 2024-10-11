// Menu_1Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#createXML()} method.
*/
class Menu_1Test {
		static final String TEST_PIC = "<?xml version=\"1.0\"?>\n" + 
"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11-strict.dtd\">\n" + 
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:xhtmlx=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n" + 
"<head><title></title></head>\n" + 
"<body>\n" + 
"<a onclick=\"MenuMainMenu\" type=\"link\"><img src=\"dvd-menu/test1.jpg\" alt=\"Video Demo\" width=\"0\" width=\"0\" height=\"0\">" +
"</a>\n" + 
"</body>\n" + 
"</html>";

		static final String TEST_AUDIO = "<?xml version=\"1.0\"?>\n" + 
"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11-strict.dtd\">\n" + 
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:xhtmlx=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n" + 
"<head><title></title></head>\n" + 
"<body>\n" + 
"<audio/>\n" + 
"</body>\n" + 
"</html>";
	
	/**
	 * Method to initialise the test
	 */
	@Test
	public void init() {
		FileInputStream input = null;
		FileOutputStream output = null;
		File dvd = null;
		File dir = null;
		String path = null;
		FileMenu fm = null;
		try {
			input = new FileInputStream(new File("test1.jpg"));
			output = new FileOutputStream("test1.jpg");
			FM.createXMLStream(input, output);
			dvd = FM.dvd_menu.replace("", "");
			dvd = Base_D.deleteDol(dvd);
			baseErr = FM.getErrorMessage();
			dir = new File("dvd-menu");
			FM.dvd_menu.replace("", "");
			FM.dvd_menu.replace("\n", "");
			FM.dvd_menu.replace("\"", "");
            File tmp = File.createTempFile("dvd-menu",".dv");
			dvd = tmp.toString();
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("/", "");
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
            FM.dvd_menu.replace("\"", "");
			FM.dvd_menu.replace("\"", "");
			FM.createXML();
		} catch (FileNotFoundException ex) {
			System.err.println("Unable to create the temporary file.");
			return;
		} catch (IOException ex) {
			System.err.println("Unable to create the temp file.");
			return;
		}
		
}
}
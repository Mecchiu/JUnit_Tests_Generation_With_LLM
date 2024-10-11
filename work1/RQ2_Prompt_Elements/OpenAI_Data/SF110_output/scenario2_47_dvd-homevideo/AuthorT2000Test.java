// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains ten unit test cases for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {

	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is not found.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_not_found() {
		
		// Create a new Author object
		Author author = new Author();
		
		// Create a new GUI object
		GUI DVD_GUI = new GUI();
		
		// Set the dvdauthor command
		author.m_dvdauthor = "dvdauthor";
		
		// Set the output directory
		DVD_GUI.strOutputDir = "test_output";
		
		// Create the output directory
		new File(DVD_GUI.strOutputDir).mkdir();
		
		// Create the log directory
		new File(DVD_GUI.strOutputDir + "/log").mkdir();
		
		// Create the dvdauthor.xml file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/dvdauthor.xml"));
			out.write("<dvdauthor dest=\"" + DVD_GUI.strOutputDir + "/dvd\">\n");
			out.write("<vmgm />\n");
			out.write("<titleset>\n");
			out.write("<titles>\n");
			out.write("<pgc>\n");
			out.write("<vob file=\"" + DVD_GUI.strOutputDir + "/dvd/video_ts/vts_01_1.mpg\" />\n");
			out.write("</pgc>\n");
			out.write("</titles>\n");
			out.write("</titleset>\n");
			out.write("</dvdauthor>\n");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Create the video_ts directory
		new File(DVD_GUI.strOutputDir + "/dvd/video_ts").mkdir();
		
		// Create the vts_01_1.mpg file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/dvd/video_ts/vts_01_1.mpg"));
			out.write("");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Create the dvdauthor.log file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
			out.write("");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Create the dvdauthor.err file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dvdauthor.err"));
			out.write("");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Call the CreateDVDFileStructure method
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		
		// Check the result
		assertTrue(result);
		
		// Delete the test output directory
		deleteDirectory(new File(DVD_GUI.strOutputDir));
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found() {
		
		// Create a new Author object
		Author author = new Author();
		
		// Create a new GUI object
		GUI DVD_GUI = new GUI();
		
		// Set the dvdauthor command
		author.m_dvdauthor = "dvdauthor";
		
		// Set the output directory
		DVD_GUI.strOutputDir = "test_output";
		
		// Create the output directory
		new File(DVD_GUI.strOutputDir).mkdir();
		
		// Create the log directory
		new File(DVD_GUI.strOutputDir + "/log").mkdir();
		
		// Create the dvdauthor.xml file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/dvdauthor.xml"));
			out.write("<dvdauthor dest=\"" + DVD_GUI.strOutputDir + "/dvd\">\n");
			out.write("<vmgm />\n");
			out.write("<titleset>\n");
			out.write("<titles>\n");
			out.write("<pgc>\n");
			out.write("<vob file=\"" + DVD_GUI.strOutputDir + "/dvd/video_ts/vts_01_1.mpg\" />\n");
			out.write("</pgc>\n");
			out.write("</titles>\n");
			out.write("</titleset>\n");
			out.write("</dvdauthor>\n");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Create the video_ts directory
		new File(DVD_GUI.strOutputDir + "/dvd/video_ts").mkdir();
		
		// Create the vts_01_1.mpg file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/dvd/video_ts/vts_01_1.mpg"));
			out.write("");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Create the dvdauthor.log file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
			out.write("");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Create the dvdauthor.err file
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dvdauthor.err"));
			out.write("");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Call the CreateDVDFileStructure method
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		
		// Check the result
		assertFalse(result);
		
		// Delete the test output directory
		deleteDirectory(new File(DVD_GUI.strOutputDir));
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and the dvdauthor.xml file is not found.
	*/
	@Test
	void
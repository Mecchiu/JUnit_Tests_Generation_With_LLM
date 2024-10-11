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
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(err));
			out.write("/bin/sh: dvdauthor: command not found");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(author.CreateDVDFileStructure(DVD_GUI));
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(err));
			out.write("dvdauthor found");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertFalse(author.CreateDVDFileStructure(DVD_GUI));
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_error() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(err));
			out.write("dvdauthor found");
			out.newLine();
			out.write("ERROR: dvdauthor found");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(author.CreateDVDFileStructure(DVD_GUI));
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is a warning.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_warning() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(err));
			out.write("dvdauthor found");
			out.newLine();
			out.write("WARN: dvdauthor found");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertFalse(author.CreateDVDFileStructure(DVD_GUI));
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an IOException.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_IOException() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(err));
			out.write("dvdauthor found");
			out.newLine();
			out.write("IOException");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(author.CreateDVDFileStructure(DVD_GUI));
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is a NoSuchElementException.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_NoSuchElementException() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(err));
			out.write("dvdauthor found");
			out.newLine();
			out.write("NoSuchElementException");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(author.CreateDVDFileStructure(DVD_GUI));
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an InterruptedException.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_InterruptedException() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_
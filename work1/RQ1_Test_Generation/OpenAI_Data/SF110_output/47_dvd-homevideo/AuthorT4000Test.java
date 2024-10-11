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
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertTrue(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertTrue(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
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
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
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
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_error_2() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_error_3() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_error_4() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_error_5() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_found_error_6() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		File dir = new File(DVD_GUI.strOutputDir);
		dir.mkdir();
		File log = new File(DVD_GUI.strOutputDir + "/log");
		log.mkdir();
		File dvdauthor_log = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.log");
		try {
			dvdauthor_log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dvdauthor_err = new File(DVD_GUI.strOutputDir + "/log/dvdauthor.err");
		try {
			dvdauthor_err.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean result = author.CreateDVDFileStructure(DVD_GUI);
		assertFalse(result);
		assertTrue(dvdauthor_log.exists());
		assertTrue(dvdauthor_err.exists());
		assertTrue(dvdauthor_log.length() > 0);
		assertTrue(dvdauthor_err.length() > 0);
		assertFalse(DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/dvdauthor.log"));
		dvdauthor_log.delete();
		dvdauthor_err.delete();
		log.delete();
		dir.delete();
	}
	
	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is found and there is an error.

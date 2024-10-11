// FileEditorTest.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditorTest {

	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file does not exist.
	*/
	@Test
	void testGetCompEnergy_FileNotExist() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_not_exist.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file is empty.
	*/
	@Test
	void testGetCompEnergy_FileEmpty() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_empty.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only one line.
	*/
	@Test
	void testGetCompEnergy_FileOneLine() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_one_line.txt");
		assertEquals(1, result.length);
		assertEquals(1.0, result[0]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only two lines.
	*/
	@Test
	void testGetCompEnergy_FileTwoLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_two_lines.txt");
		assertEquals(2, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only three lines.
	*/
	@Test
	void testGetCompEnergy_FileThreeLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_three_lines.txt");
		assertEquals(3, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only four lines.
	*/
	@Test
	void testGetCompEnergy_FileFourLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_four_lines.txt");
		assertEquals(4, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
		assertEquals(4.0, result[3]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only five lines.
	*/
	@Test
	void testGetCompEnergy_FileFiveLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_five_lines.txt");
		assertEquals(5, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
		assertEquals(4.0, result[3]);
		assertEquals(5.0, result[4]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only six lines.
	*/
	@Test
	void testGetCompEnergy_FileSixLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_six_lines.txt");
		assertEquals(6, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
		assertEquals(4.0, result[3]);
		assertEquals(5.0, result[4]);
		assertEquals(6.0, result[5]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only seven lines.
	*/
	@Test
	void testGetCompEnergy_FileSevenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_seven_lines.txt");
		assertEquals(6, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
		assertEquals(4.0, result[3]);
		assertEquals(5.0, result[4]);
		assertEquals(6.0, result[5]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only eight lines.
	*/
	@Test
	void testGetCompEnergy_FileEightLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_eight_lines.txt");
		assertEquals(6, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
		assertEquals(4.0, result[3]);
		assertEquals(5.0, result[4]);
		assertEquals(6.0, result[5]);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only nine lines.
	*/
	@Test
	void testGetCompEnergy_FileNineLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test/test_files/test_file_nine_lines.txt");
		assertEquals(6, result.length);
		assertEquals(1.0, result[0]);
		assertEquals(2.0, result[1]);
		assertEquals(3.0, result[2]);
		assertEquals(4.0, result[3]);
		assertEquals(5.0, result[4]);
		assertEquals(6.0, result[5]);
	}
}
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
		double[] result = fileEditor.getCompEnergy("test.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file is empty.
	*/
	@Test
	void testGetCompEnergy_FileEmpty() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_empty.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only one line.
	*/
	@Test
	void testGetCompEnergy_FileOneLine() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_one_line.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only two lines.
	*/
	@Test
	void testGetCompEnergy_FileTwoLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_two_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only three lines.
	*/
	@Test
	void testGetCompEnergy_FileThreeLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_three_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only four lines.
	*/
	@Test
	void testGetCompEnergy_FileFourLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_four_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only five lines.
	*/
	@Test
	void testGetCompEnergy_FileFiveLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_five_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only six lines.
	*/
	@Test
	void testGetCompEnergy_FileSixLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_six_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only seven lines.
	*/
	@Test
	void testGetCompEnergy_FileSevenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_seven_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only eight lines.
	*/
	@Test
	void testGetCompEnergy_FileEightLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_eight_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only nine lines.
	*/
	@Test
	void testGetCompEnergy_FileNineLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_nine_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only ten lines.
	*/
	@Test
	void testGetCompEnergy_FileTenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_ten_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only eleven lines.
	*/
	@Test
	void testGetCompEnergy_FileElevenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_eleven_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twelve lines.
	*/
	@Test
	void testGetCompEnergy_FileTwelveLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twelve_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirteen lines.
	*/
	@Test
	void testGetCompEnergy_FileThirteenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirteen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only fourteen lines.
	*/
	@Test
	void testGetCompEnergy_FileFourteenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_fourteen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only fifteen lines.
	*/
	@Test
	void testGetCompEnergy_FileFifteenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_fifteen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only sixteen lines.
	*/
	@Test
	void testGetCompEnergy_FileSixteenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_sixteen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only seventeen lines.
	*/
	@Test
	void testGetCompEnergy_FileSeventeenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_seventeen
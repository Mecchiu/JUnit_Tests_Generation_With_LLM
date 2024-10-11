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
		double[] result = fileEditor.getCompEnergy("test_seventeen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only eighteen lines.
	*/
	@Test
	void testGetCompEnergy_FileEighteenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_eighteen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only nineteen lines.
	*/
	@Test
	void testGetCompEnergy_FileNineteenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_nineteen_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-one lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyOneLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_one_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-two lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyTwoLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_two_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-three lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyThreeLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_three_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-four lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyFourLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_four_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-five lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyFiveLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_five_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-six lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentySixLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_six_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-seven lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentySevenLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_seven_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-eight lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyEightLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_eight_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only twenty-nine lines.
	*/
	@Test
	void testGetCompEnergy_FileTwentyNineLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_twenty_nine_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirty lines.
	*/
	@Test
	void testGetCompEnergy_FileThirtyLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirty_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirty-one lines.
	*/
	@Test
	void testGetCompEnergy_FileThirtyOneLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirty_one_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirty-two lines.
	*/
	@Test
	void testGetCompEnergy_FileThirtyTwoLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirty_two_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirty-three lines.
	*/
	@Test
	void testGetCompEnergy_FileThirtyThreeLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirty_three_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirty-four lines.
	*/
	@Test
	void testGetCompEnergy_FileThirtyFourLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirty_four_lines.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getCompEnergy(String)} method.
	* It tests the case when the file contains only thirty-five lines.
	*/
	@Test
	void testGetCompEnergy_FileThirtyFiveLines() {
		FileEditor fileEditor = new FileEditor();
		double[] result = fileEditor.getCompEnergy("test_thirty_five_lines
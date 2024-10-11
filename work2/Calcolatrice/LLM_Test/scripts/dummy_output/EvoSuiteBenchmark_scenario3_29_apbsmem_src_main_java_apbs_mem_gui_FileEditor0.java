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
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditorTest {
		
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
}
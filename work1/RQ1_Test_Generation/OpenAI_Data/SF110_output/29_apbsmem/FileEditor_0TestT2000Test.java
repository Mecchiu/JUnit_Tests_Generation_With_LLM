// FileEditor_0Test.java
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
class FileEditor_0Test {

	/**
	 * Test of getEnergy method, of class FileEditor.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetEnergy() throws Exception {
		System.out.println("getEnergy");
		String filename = "";
		FileEditor instance = new FileEditor();
		String[] expResult = null;
		String[] result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
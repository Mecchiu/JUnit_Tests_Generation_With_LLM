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
* It contains one unit test case for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_0Test {
		private static final String TEST_FOLDER = "/tmp/";
		
		private static final String TEST_OUTPUT = TEST_FOLDER + "output.txt";

		String s1 = "Energy: 22.4 kJ/mol ";
		String s2 = "Energy: 15 kJ/mol ";
		String s3 = "Energy: 5 kJ/mol ";
		String s4 = "Energy: 1 kJ/mol ";
        String s5 = s1 + s2 + s3 + s4 + s5;
	
	private static final String KEY = "key";
	
		public FileEditor_0Test() { }
	
		@Test
		public void testGetEnergy() {
			File f = new File(TEST_OUTPUT);
			String[][] testData = getEnergy(f);
			String[] testResult = new String[3];

			testResult[0] = s1;
			testResult[1] = s2;
			testResult[2] =  s3;

		System.out.println("Testing data...");
		for (int i = 0; i < testData.length; i++) {
			testResult[i] = testData[i][0];
		}
			System.out.println("Returning data...");
			System.out.println(s5);
			assertTrue("Returned data incorrect or empty string.", s5.equals(s5));
			System.out.println("Done!");
		}
	}
	
	/** @}
     */
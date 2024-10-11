// FileEditor_1Test.java
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
class FileEditor_1Test {

	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * @throws java.io.IOException
	 */
	@Test
	void testGetCompEnergy() throws IOException {
		System.out.println("getCompEnergy");
		FileEditor instance = new FileEditor();
		double[] expResult = new double[6];
		double[] result = new double[6];
		
		// Test 1
		String filename = "test/test_files/test_1.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 2
		filename = "test/test_files/test_2.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 3
		filename = "test/test_files/test_3.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 4
		filename = "test/test_files/test_4.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 5
		filename = "test/test_files/test_5.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 6
		filename = "test/test_files/test_6.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 7
		filename = "test/test_files/test_7.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 8
		filename = "test/test_files/test_8.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 9
		filename = "test/test_files/test_9.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 10
		filename = "test/test_files/test_10.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
	}
}

// FileEditor_2Test.java
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
class FileEditor_2Test {
		
	/**
	 * Test of getEnergy method, of class FileEditor.
	 * @throws java.io.IOException
	 */
	@Test
	void testGetEnergy() throws IOException {
		System.out.println("getEnergy");
		FileEditor instance = new FileEditor();
		String[] expResult = new String[3];
		String[] result = new String[3];
		
		// Test 1
		String filename = "test/test_files/test_1.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 2
		filename = "test/test_files/test_2.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
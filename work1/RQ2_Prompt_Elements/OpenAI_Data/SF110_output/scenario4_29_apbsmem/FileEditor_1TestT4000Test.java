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
		String filename = "test/test_files/test_comp_energy_1.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 2
		filename = "test/test_files/test_comp_energy_2.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 3
		filename = "test/test_files/test_comp_energy_3.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 4
		filename = "test/test_files/test_comp_energy_4.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 5
		filename = "test/test_files/test_comp_energy_5.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 6
		filename = "test/test_files/test_comp_energy_6.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 7
		filename = "test/test_files/test_comp_energy_7.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 8
		filename = "test/test_files/test_comp_energy_8.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 9
		filename = "test/test_files/test_comp_energy_9.txt";
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test 10
		filename = "test/test_files/test_comp_energy_10.txt";
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
		String filename = "test/test_files/test_energy_1.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 2
		filename = "test/test_files/test_energy_2.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 3
		filename = "test/test_files/test_energy_3.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 4
		filename = "test/test_files/test_energy_4.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 5
		filename = "test/test_files/test_energy_5.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 6
		filename = "test/test_files/test_energy_6.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 7
		filename = "test/test_files/test_energy_7.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 8
		filename = "test/test_files/test_energy_8.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 9
		filename = "test/test_files/test_energy_9.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
		
		// Test 10
		filename = "test/test_files/test_energy_10.txt";
		expResult[0] = "-0.0012";
		expResult[1] = "-0.0012";
		expResult[2] = "-0.0012";
		result = instance.getEnergy(filename);
		assertArrayEquals(expResult, result);
	}
}

// FileEditor_3Test.java
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
* It contains ten unit test cases for the {@link FileEditor#toDoublePos(String)} method.
*/
class FileEditor_3Test {
		
	/**
	 * Test of toDoublePos method, of class FileEditor.
	 */
	@Test
	void testToDoublePos() {
		System.out.println("toDoublePos");
		FileEditor instance = new FileEditor();
		double expResult = 0.0;
		double result = 0.0;
		
		// Test 1
		String theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 2
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 3
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 4
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 5
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 6
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 7
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 8
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 9
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 10
		theDouble = "0.0012";
		expResult = 0.0012;
		result = instance.toDoublePos(theDouble);
		assertEquals(expResult, result, 0.0001);
	}
}

// FileEditor_4Test.java
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
* It contains ten unit test cases for the {@link FileEditor#toDoubleNeg(String)} method.
*/
class FileEditor_4Test {
		
	/**
	 * Test of toDoubleNeg method, of class FileEditor.
	 */
	@Test
	void testToDoubleNeg() {
		System.out.println("toDoubleNeg");
		FileEditor instance = new FileEditor();
		double expResult = 0.0;
		double result = 0.0;
		
		// Test 1
		String theDouble = "-0.0012";
		expResult = -0.0012;
		result = instance.toDoubleNeg(theDouble);
		assertEquals(expResult, result, 0.0001);
		
		// Test 2
		theDouble = "-0.0012";
		expResult = -0.0012;
		result
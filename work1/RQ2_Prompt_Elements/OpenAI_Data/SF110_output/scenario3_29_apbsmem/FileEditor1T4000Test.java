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
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with a single energy value.
	 */
	@Test
	public void testGetCompEnergy_1() {
		System.out.println("getCompEnergy_1");
		String filename = "test/test_files/test_getCompEnergy_1.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with two energy values.
	 */
	@Test
	public void testGetCompEnergy_2() {
		System.out.println("getCompEnergy_2");
		String filename = "test/test_files/test_getCompEnergy_2.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with three energy values.
	 */
	@Test
	public void testGetCompEnergy_3() {
		System.out.println("getCompEnergy_3");
		String filename = "test/test_files/test_getCompEnergy_3.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with four energy values.
	 */
	@Test
	public void testGetCompEnergy_4() {
		System.out.println("getCompEnergy_4");
		String filename = "test/test_files/test_getCompEnergy_4.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with five energy values.
	 */
	@Test
	public void testGetCompEnergy_5() {
		System.out.println("getCompEnergy_5");
		String filename = "test/test_files/test_getCompEnergy_5.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with six energy values.
	 */
	@Test
	public void testGetCompEnergy_6() {
		System.out.println("getCompEnergy_6");
		String filename = "test/test_files/test_getCompEnergy_6.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with seven energy values.
	 */
	@Test
	public void testGetCompEnergy_7() {
		System.out.println("getCompEnergy_7");
		String filename = "test/test_files/test_getCompEnergy_7.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with eight energy values.
	 */
	@Test
	public void testGetCompEnergy_8() {
		System.out.println("getCompEnergy_8");
		String filename = "test/test_files/test_getCompEnergy_8.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with nine energy values.
	 */
	@Test
	public void testGetCompEnergy_9() {
		System.out.println("getCompEnergy_9");
		String filename = "test/test_files/test_getCompEnergy_9.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
	
	/**
	 * Test of getCompEnergy method, of class FileEditor.
	 * This test case is for a file with ten energy values.
	 */
	@Test
	public void testGetCompEnergy_10() {
		System.out.println("getCompEnergy_10");
		String filename = "test/test_files/test_getCompEnergy_10.txt";
		FileEditor instance = new FileEditor();
		double[] expResult = {-0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0};
		double[] result = instance.getCompEnergy(filename);
		assertArrayEquals(expResult, result, 0.0);
	}
}
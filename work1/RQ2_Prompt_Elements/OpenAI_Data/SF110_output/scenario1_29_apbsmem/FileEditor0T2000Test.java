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
	* It tests the case when the file does not exist.
	*/
	@Test
	void testGetEnergy_FileNotExist() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists but does not contain the energy.
	*/
	@Test
	void testGetEnergy_FileExist_NoEnergy() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test1.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test2.txt");
		assertNotNull(result);
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test3.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_2() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test4.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_3() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test5.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_4() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test6.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_5() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test7.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_6() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test8.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_7() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test9.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file exists and contains the energy.
	*/
	@Test
	void testGetEnergy_FileExist_Energy_Positive_8() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test10.txt");
		assertNotNull(result);
		assertEquals("1.0E-01 kJ/mol", result[0]);
		assertEquals("2.39E-02 kcal/mol", result[1]);
		assertEquals("4.035E-02 kT", result[2]);
	}
}
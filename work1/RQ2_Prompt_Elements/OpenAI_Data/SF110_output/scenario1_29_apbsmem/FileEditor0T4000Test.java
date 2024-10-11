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
	* It tests the case when the file is empty.
	*/
	@Test
	void testGetEnergy_FileEmpty() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_empty.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file does not contain the energy.
	*/
	@Test
	void testGetEnergy_FileNoEnergy() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_no_energy.txt");
		assertNull(result);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section.
	*/
	@Test
	void testGetEnergy_FileSolvated() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the reference section.
	*/
	@Test
	void testGetEnergy_FileReference() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_reference.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section and the reference section.
	*/
	@Test
	void testGetEnergy_FileSolvatedAndReference() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated_and_reference.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section and the reference section, and the energy in the reference section is larger than the energy in the solvated section.
	*/
	@Test
	void testGetEnergy_FileSolvatedAndReference_ReferenceLarger() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated_and_reference_reference_larger.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section and the reference section, and the energy in the solvated section is larger than the energy in the reference section.
	*/
	@Test
	void testGetEnergy_FileSolvatedAndReference_SolvatedLarger() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated_and_reference_solvated_larger.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section and the reference section, and the energy in the solvated section is larger than the energy in the reference section, and the energy in the reference section is negative.
	*/
	@Test
	void testGetEnergy_FileSolvatedAndReference_SolvatedLarger_ReferenceNegative() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated_and_reference_solvated_larger_reference_negative.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section and the reference section, and the energy in the solvated section is larger than the energy in the reference section, and the energy in the solvated section is negative.
	*/
	@Test
	void testGetEnergy_FileSolvatedAndReference_SolvatedLarger_SolvatedNegative() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated_and_reference_solvated_larger_solvated_negative.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
	
	/**
	* Test case for {@link FileEditor#getEnergy(String)} method.
	* It tests the case when the file contains the energy in the solvated section and the reference section, and the energy in the solvated section is larger than the energy in the reference section, and the energy in the solvated section and the energy in the reference section are negative.
	*/
	@Test
	void testGetEnergy_FileSolvatedAndReference_SolvatedLarger_SolvatedAndReferenceNegative() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test_solvated_and_reference_solvated_larger_solvated_and_reference_negative.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-4.035E-02 kT", result[2]);
	}
}
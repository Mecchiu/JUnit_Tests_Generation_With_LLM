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
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_not_exist.txt");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file is empty.
	 */
	@Test
	void testGetEnergy_FileEmpty() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_empty.txt");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file does not contain the energy.
	 */
	@Test
	void testGetEnergy_FileNoEnergy() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_no_energy.txt");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the solvated section.
	 */
	@Test
	void testGetEnergy_FileEnergySolvated() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_solvated.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the reference section.
	 */
	@Test
	void testGetEnergy_FileEnergyReference() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_reference.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the solvated section and the reference section.
	 */
	@Test
	void testGetEnergy_FileEnergySolvatedReference() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_solvated_reference.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the reference section and the solvated section.
	 */
	@Test
	void testGetEnergy_FileEnergyReferenceSolvated() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_reference_solvated.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the solvated section and the reference section and the energy in the solvated section is larger than the energy in the reference section.
	 */
	@Test
	void testGetEnergy_FileEnergySolvatedReferenceSolvatedLarger() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_solvated_reference_solvated_larger.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the solvated section and the reference section and the energy in the reference section is larger than the energy in the solvated section.
	 */
	@Test
	void testGetEnergy_FileEnergySolvatedReferenceReferenceLarger() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_solvated_reference_reference_larger.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the solvated section and the reference section and the energy in the solvated section is equal to the energy in the reference section.
	 */
	@Test
	void testGetEnergy_FileEnergySolvatedReferenceEqual() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_solvated_reference_equal.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the case when the file contains the energy in the solvated section and the reference section and the energy in the solvated section is equal to the energy in the reference section and the energy is negative.
	 */
	@Test
	void testGetEnergy_FileEnergySolvatedReferenceEqualNegative() {
		FileEditor fileEditor = new FileEditor();
		String[] result = fileEditor.getEnergy("test/apbs_mem_gui/test_files/test_file_energy_solvated_reference_equal_negative.txt");
		assertEquals("-1.0E-01 kJ/mol", result[0]);
		assertEquals("-2.39E-02 kcal/mol", result[1]);
		assertEquals("-9.64E-02 kT", result[2]);
	}
}
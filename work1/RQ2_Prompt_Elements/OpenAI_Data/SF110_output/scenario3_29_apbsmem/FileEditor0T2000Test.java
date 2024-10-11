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

// FileEditor.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;

public class FileEditor {

    /**
     * Extract energy from the final APBS output file.
     *
     * @param filename Path to APBS output file.
     * @return String array of total energies in kilojoules, kilocalories and k_BT
     */
    public String[] getEnergy(String filename) {
        String[] energy = new String[3];
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains("Total energy")) {
                    String[] split = line.split("\\s+");
                    energy[0] = split[3];
                    energy[1] = split[5];
                    energy[2] = split[7];
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return energy;
    }
}

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
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy2() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output2.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy3() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output3.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy4() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output4.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy5() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output5.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy6() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output6.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy7() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output7.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy8() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output8.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy9() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output9.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("-0.0015", energy[2]);
	}
	
	/**
	 * Test case for {@link FileEditor#getEnergy(String)} method.
	 * It tests the method with a valid APBS output file.
	 */
	@Test
	void testGetEnergy10() {
		FileEditor fe = new FileEditor();
		String[] energy = fe.getEnergy("test/test_files/test_output10.out");
		assertEquals("-0.0012", energy[0]);
		assertEquals("-0.0003", energy[1]);
		assertEquals("
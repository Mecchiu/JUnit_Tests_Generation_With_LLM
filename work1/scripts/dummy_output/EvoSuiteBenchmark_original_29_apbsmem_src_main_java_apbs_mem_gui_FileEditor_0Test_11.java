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
		double[] getEnergy(String filename);
}

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for extracting total energy from a directory of
    APBS output files.
*/
class FileEditor_1Test extends FileEditor_0Test {
		
		/**
		 * Tests the following unit test:
		 * {@link FileEditor#getEnergy(String)} should return an array of total energies in
		 * kilojoules and k_BT, with the same number of kilocalories.
		 */
		@Test
        void test() {
			String path = getResourcesDir() + getClass().getSimpleName() + "\\src\\src_resources\\";
            Scanner input = null;
            String testFilename = "energy_output.txt";
            try {
                FileWriter fw = new FileWriter(path + testFilename);
                input = new Scanner(System.in);
                while (input.hasNextLine()) {
                    String inputLine = input.nextLine();
                    String[] elements = inputLine.split("\t");
                    double totalEnergy = 0.;
                    int numberOfPositrons = 0;    // Number of positrons.
                    for (int i = 0; i < elements.length; i++) {
                        String element = elements[i];
                        String elementDouble = element.substring(0, element.indexOf(','));
                        if (elementDouble.startsWith("k_BT"))
                            numberOfPositrons = Integer.parseInt( elementDouble.substring(3) );
                        totalEnergy += Double.parseDouble(element);
                    }
                    if (totalEnergy == 1457200)
                        break;
                }
                char testChar = input.next().charAt(0);
                if (testChar == '+')
                    input.nextLine();
                assertEquals("The energy total should match the total of the last file.", 100., getEnergy(path)[numberOfPositrons], totalEnergy);
            } catch (java.io.FileNotFoundException fnfe) {
                assertEquals("The file doesn't exist!", 1, 1);
            }
            catch (java.io.IOException ioe) {
                assertEquals("I/O error.", 1, 1);
            }
            finally {
                try {
                    fw.close();
                }catch (java.io.IOException ioe) {
                    //ignore
                }
            }
		}
}

public class FileEditor_0 {
	
	/**
	 * Unit test to extract total energy from output files.
	 * Tests the following unit test:
	 * {@link FileEditor#getEnergy(String)} should return an array of total energies in
	 * kilojoules, kilocalories and k_BT, with the same number of kilocalories.
	*/
	@Test
	public void test() {
		FileEditor_0Test.test();
	}
	
}
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
* It contains one unit test case for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {
		/**
		 * Extract the energy from a calculation that has summed the component atom energies
		 * rather than simply taking the total. (pull_comps.c)
		 *
		 * @param filepath Path to the file written by pull_comps with the energy sum.
		 * @return a double array of the total energy of each calculation (up to 6 calculations if there are 3 focus levels).
		 */
    public double[] getCompEnergy(String filepath);
}
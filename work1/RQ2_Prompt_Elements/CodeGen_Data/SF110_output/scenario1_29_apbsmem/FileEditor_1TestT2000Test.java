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
		 * Create a new instance of {@link FileEditor_1Test}.
		 */
        FileEditor_1Test() {
        }

		/**
		 * Test the {@link FileEditor#getCompEnergy(String)} method.
		 * @throws IOException 
		 * @throws ParseException 
		 * @throws IllegalArgumentException 
		 * @throws IllegalAccessException 
		 */
		@Test
		public final void testGetCompEnergy() throws IOException, IllegalArgumentException, ParseException, IllegalAccessException {
			double[] finalenergy = getCompEnergy("File Editor_1Test_testCompEnergy.txt");
			String filename1 = "FileEditor_1Test_testCompEnergy.txt";
			double dTemp = Double.parseDouble(filename1.substring(filename1.indexOf("temp_" + filename1.length())));
			double D = Double.parseDouble(finalenergy[0] + new Double(dTemp - filename1.substring(filename1.length() + 1)).doubleValue());

			double finalMolTemp = Double.parseDouble(filename1.substring(filename1.indexOf("MolTemp -") + 9));
			String finalmoltemparray = String.valueOf(dTemp) + String.valueOf(filename1.substring(filename1.lastIndexOf(" - ") + 8, filename1.length() - 1) + finalmoltemparray);

			//assertTrue(new Double(dTemp + filename1.substring(filename1.lastIndexOf(" - ") + 8, filename1.length())) == new Double(finalMolTemp - filename1.substring(filename1.lastIndexOf(" - ") + 8, filename1.length() - 1)));
			//System.out.println(new Double(new Double(dTemp + filename1.substring(filename1.lastIndexOf(" - ") + 8, filename1.length())) - new Double(new Double(dTemp))) == new Double(finalmoltemparray - new Double(filename1.substring(filename1.length() - 1 - 8, filename1.length())) - new Double(filename1.substring(filename1.lastIndexOf(" - ") + 8, filename1.length() - 1))));
			assertEquals(finalcompenergies[0][0], new Double(finalMolTemp), new Double(new Double(dTemp) - new Double(filename1.substring(filename1.length() + 1 - 8, filename1.length())) - new Double(filename1.substring(filename1.lastIndexOf(" - ") + 8, filename1.length() - 1))));

			//System.out.println("FinalCompEnergy -> "+new Double(finalcompenergies[0][0]) +" = " + new Double(new Double(finalcompenergies[0][0])));
		}

}

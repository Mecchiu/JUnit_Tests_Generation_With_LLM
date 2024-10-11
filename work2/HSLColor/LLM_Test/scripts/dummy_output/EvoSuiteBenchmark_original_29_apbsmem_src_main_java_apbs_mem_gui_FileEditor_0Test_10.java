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
		/**
		 * Constructor for the {@link FileEditor_0Test.class}.
		 *
		 * @since 1.0
		 */
		private FileEditor_0Test() {
		}
	
	/**
	 * Extract energy from the final APBS output file.
	 *
	 * @param filename Filename to APBS output file.
	 * @return Array of total energies in kilojoules, kilocalories and k_BT
	 */
	@Test
	void extractEnergy(String filename) {
		final Field f = FileEditor.class;
		final float[] out1 = {1.0f,.1f,.25f};
		final float[] out2 = {2.0f,.2f,.3f};

		final Scanner c = new Scanner(System.in);
		FileEditor.getEnergy(filename);
		for (int i = 0; i < out1.length - 1; i++) {
			assertEquals("Test line number should be " + (i + 1), out1[i],
		                      Float.floatToIntBinary(c.nextFloat()));
		}

		for (int i = 1; i < out1.length; i++) {
			assertEquals("Test line number should be " + (i + 1), out2[i],
		                      Float.floatToIntBinary(c.nextFloat()));
		}
	}
}
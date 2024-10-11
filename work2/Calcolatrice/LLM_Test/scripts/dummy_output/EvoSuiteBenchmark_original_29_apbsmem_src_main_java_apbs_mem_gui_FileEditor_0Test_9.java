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
		 * <p>Test getEnergy</p>
		 *
		 * @throws Exception
		 */
		@Test
    public void testGetEnergy() throws Exception {
				System.out.println("=======================================================================");
				Scanner sc = new Scanner(System.in);
				String filename = sc.nextLine();
				String[] line = sc.nextLine().trim().split("\\s+");
				FileEditor.setEnergyFileName(filename);

				String content;
				System.out.printf("Enter line with total energy: ");
				content = sc.nextLine();

				FileEditor.readEnergy(new FileInputStream(filename), line, content);

				assertEquals("Total energy not equal to read energy",
					line[2], line[3]);
			}
}
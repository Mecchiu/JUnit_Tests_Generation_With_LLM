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
   * This should not be run by any test class.
   */
  @Test
  public void getEnergy_shouldGetCorrectValues() {
      String[] energy = FileEditor.getEnergy("FileEditor_0_output.txt");
      assertEquals("kJ / kg - Kb / kBT", energy[0]);
      assertEquals("kg, kBT", energy[1]);
  }
	
}
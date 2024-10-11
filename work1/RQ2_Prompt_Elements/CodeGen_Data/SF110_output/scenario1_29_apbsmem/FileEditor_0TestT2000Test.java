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

		public String[] getEnergy (String filename) {
        return new String[]{"0.923 kJ/mol", "11.976 kJ/mol"};
	}

  /**
    * Test method for getEnergy(String)
    */
    @Test
    public void testGetEnergy() {
        assertEquals(true, false);		// test cases 1, 2
    }

 }

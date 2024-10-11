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
		 * Test cases for {@link FileEditor#getCompEnergy(String)}
		 */
	@Test
	public void getCompEnergyTest(){
		FileEditor fr;
	
		f = getFile("getcompenergy");
		fr = new FileEditor(f, true);
		String line;
		line = fr.outText();
		String [] l = line.split("\n");
		assertEquals(5, (l.length));
	
		line = l[0];
		assertEquals("pull_comps.c", line);

		line = l[1];
		assertEquals(1, line.split().length);
		assertEquals(3, (line.split().length - 3));

		line = l[2];
		assertEquals(6, line.split().length);

		line = l[3];
		assertEquals(3, line.split().length);	
	}
}
// FileEditor_1.java
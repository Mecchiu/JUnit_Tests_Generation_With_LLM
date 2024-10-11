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
		 * Test method for {@link FileEditor#getCompEnergy(String)}.
		 */

				/**
				 * File to compare with. (.csv)
				 */
				private String filename = null;

				/**
				 * Method to instantiate this class.
				 * It is expected to start with {@link String#FileDialog}, otherwise it will throw an exception.
				 * @throws Exception
				 */
				@Test
				public void test1() throws Exception {
					doTest(this.filename);
				}

				/**
				 * Method to compare with the reference.
				 * It is expected to have the following format, of which it should have a file field named "filename" in the same format:
				 * [[{filename}]:],
				 * [{name}],
				 * [{energy}} -
				 * [{delta}],
				 * [{alpha}],
				 * [{beta}]]. In other words check is a way to check that the file being compared against has the correct dimensions and types.
				 * In this case this will first compare against the reference set and then compare against a set with all other options if possible.
				 * @throws Exception
				 */
				private void doTest(String dir) throws Exception {

                            try (Scanner scan = new Scanner(this.FilenameReader(dir), "UTF-8");) {

                                assertEquals(this.FilenameReader(dir), scan.next());
                                assertEquals(this.getComponentName(this.FilenameReader(dir)), scan.next());
                                assertEquals(this.getTotalEnergy(this.FilenameReader(dir)), scan.nextDouble(), 0.001);
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir), scan));
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir), scan));
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir), scan));
                                assertFalse(scannerEqualToLine(this.FilenameReader(dir), scan));
                                assertFalse(scannerEqualToLine(this.FilenameReader(dir), scan));
                            }
				}

				/**
 				 * Compare the two files.
 				 * This test is expected to have only some dimensions/types and a number of parameters (in which case the files can
 				 * be compared with the reference).
 				 */
				public void check(String dir)throws Exception {

                        try (Scanner scan1 = new Scanner(this.FilenameReader(dir), "UTF-8");
				        Scanner scan2 = new Scanner(this.FilenameReader(dir), "UTF-8");) {
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir), scan1));
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir), scan2));
                                assertEquals(this.getComponentName(this.FilenameReader(dir)),scan1.next());
                                assertEquals(this.getComponentName(this.FilenameReader(dir)),scan2.next());
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir),scan1));
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir),scan2));
                                assertEquals(this.getTotalEnergy(this.FilenameReader(dir)), scan1.nextDouble(), 0.001);
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir),scan2));
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir),scan1));
                                assertTrue(scannerEqualToLine(this.FilenameReader(dir),scan2));
                                assertFalse(scannerEqualToLine(this.FilenameReader(dir),scan1));
                                assertFalse(scannerEqualToLine(this.FilenameReader(dir),scan2));
                        }
			}

		/**
		 * Returns a reader for the given file.
		 * @param dir Path where the file is.
		 * @return A Reader for the given file.
		 * @throws java.io.IOException
		 */
}
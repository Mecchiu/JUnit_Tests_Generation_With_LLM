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
	 * Test to check the function getCompEnergy(String) is not broken.
	 */
	@Test
	public void energyIsNotEmpty(@SuppressWarnings("EmptyUnitTest") String filename, @SuppressWarnings("EmptyUnitTest") double expected, @SuppressWarnings("EmptyUnitTest") int start, @SuppressWarnings("EmptyUnitTest") int end, @SuppressWarnings({"PointlessBooleanExpression"}) boolean endCalculation) {
		{
		 	File f = new File(filename);
			Scanner in = new Scanner(f);
			String inputString = in.nextLine();
			assertTrue("Didn't expect the energy to include one.", inputString.length() > 0);
			assertEquals(inputString, expected, in.nextInt());
		}
		{
		 	TextFile tf = new TextFile(".", filename);
			Scanner in = new Scanner(tf);
			int index = start;
                        while (index < start + endCalculation && index < end){
			InputStream is = tf.stream();
			String inputString = new String( is );
			try {
				is.mark(1);

				int currentIndex = 1;
				int currentEndIndex = 1;
				in.next();
				while (in.hasNext()) {
					assertEquals("Wrong content of index.", index, currentIndex);
				    assertEquals("Wrong content of currentIndex.", currentIndex, in.nextInt());
					assertEquals("Wrong content of currentEndIndex.", currentIndex + 1 /*endCalculation*/, currentEndIndex);
				    in.next();
					currentIndex++;
					currentEndIndex++;
				}

				is.reset();
				while (is.hasNext()){
					is.next();
					is.next();
				}

				// assertEqual("File was unexpectedly empty", "\n", is.toString());
						// assertEqual("File was unexpectedly empty", "\n\n", in.toString());
				}

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
		}
		{
		 	TextFile tf = new TextFile("", filename);
			Scanner in = new Scanner(tf);

			try {
			in.next();
			} catch (Exception e) {
			}
		}			

	}
}
// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {
		
	/**
	 * @param args
	 */
	public ConvertTest(String[] args) {}

	/**
	 *
	  <b>Note:</b>This method has effect only for testing; tests do not
	 * test whether input streams were populated correctly.
	 * The output streams are not used.
	 */
	@Test
	public void test() {
		
		assertFalse("The stream could not be read properly", init());
	}
}
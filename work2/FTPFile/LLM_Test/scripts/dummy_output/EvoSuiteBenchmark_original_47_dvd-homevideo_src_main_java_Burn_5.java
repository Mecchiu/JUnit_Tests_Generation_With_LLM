// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		/**
		 * Test runs a dvd-author test by creating a file with a growisofs command
		 */
		@Test
		public void BurnTest() {

			Burn burn = new Burn("dvd-author test");

			assertTrue(burn);

		}

    }
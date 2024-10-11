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
     * @param args the command line arguments
     */
		public static void main(String[] args) {
			System.setProperty("javax.imageio.spi.legacy.ClassLoaderUtil", "org.junit.jupiter.api.extension.ConditionStackUtil$LocalClassLoaderUtil");
    }

	/**
	 * This method is called before any other test code may be run
	 *
	 * @param args command line arguments
	 */
		@Test
		public void BurnSetup(String[] args) {

		}

	/**
	 * This method is called after executing the main
	 * teardown and zero exceptions
	 */
		@Test
		public void BurnTestComplete() throws IOException {

		}
}

// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains one unit test case for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {
		
    /**
     * This test test method ensures that the input argument to the {@link #
     * CreateDVDFileStructure(GUI)} method is non-null. It is added to be used
	 * by other tests, such as {@link WriteAudioToDMX}.
	 * @throws  NullPointerException if an input parameter is null
     * @throws  IllegalArgumentException if an input parameter is {@link String}
     * @throws  IllegalArgumentException if an input parameter is {@link File}
     * @throws  IOException if an output stream or file can not be written to
     */
	@Test
	public void testCreateDVDFileStructure() {
		String param = "testCreateDVDFileStructure";
		File file = null;
		try {
			file = new File("inputDirectory/inputFileName");
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
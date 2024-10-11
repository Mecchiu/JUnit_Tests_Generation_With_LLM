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
		
	public static final String PICK_FILE = "output.3gp";

	public static final String OUT = ".1.gmp";

	public static final String IN = ".1.ts";

	public static final String OUT_2 = "output.3gp";

	public static final String IN_2 = "input.3gp";

	public static final String OUT_THUMB = "thumb.3gp";

	public static final String IN_THUMB = "thumb.3gp";

	private File temp;

    /**
     * Test suite
     */

	public ConvertTest(File temp) throws FileNotFoundException {
			this.temp = temp;
			assertTrue("temp folder to test not found", this.temp.getParentFile()!=null);
	}

	/**
	 * test a file
	 */
	@Test
	public void test() throws IOException {
		File temp_out = new File(this.temp.getCanonicalPath()+File.separator+ConvertTest.OUT);
		File temp_in = new File(this.temp.getCanonicalPath()+File.separator+ConvertTest.IN);
		File temp_out_dupt = new File(this.temp.getCanonicalPath()+File.separator+ConvertTest.OUT_2);
		File temp_in_dupt = new File(this.temp.getCanonicalPath()+File.separator+ConvertTest.IN_2);

		// Create a writer to write to "temp" and then
        // read the file and write the transcoded stream
		OutputStreamWriter out_dupt = new OutputStreamWriter(new FileOutputStream(temp_out_dupt));
		InputStreamReader in_dupt = new InputStreamReader(new FileInputStream(temp_in_dupt));
		OutputStream ous = out_dupt.getOutputStream();
		InputStreamReader in_dupt2 = new InputStreamReader(new FileInputStream(temp_in_dupt));
		BufferedReader in = null;
		if (temp_in.getPath().endsWith("flv")) {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(in_dupt2)));
			String in_contents ="";
			try {
				while ((in_contents = in.readLine())!= null) {
					out_dupt.write(in_contents+ "\n");
				}
			} catch (IOException e) { // can't happen
				in = null;
			}
		}
}
}
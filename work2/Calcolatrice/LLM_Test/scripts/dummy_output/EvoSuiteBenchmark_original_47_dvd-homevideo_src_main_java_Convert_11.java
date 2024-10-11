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
		private final List<String> inFilePaths;
		private final List<String> outFilePaths;
		private final File tempOutputStream;
		private final String infileExtension;
		private final String outfileExtension;



		public ConvertTest(File inputDir, List<String> paths) throws IOException {
			try {
				inFilePaths = paths;
				infileExtension = getInputExtension(inputDir);
				outfileExtension = getOutputExtension(inputDir);
				String[] names = inFilePaths.toArray(new String[inFilePaths.size()]);
				String filePath = names[0];
				if (!filePath.endsWith(infileExtension)) filePath += infileExtension;
				tempOutputStream = new File(filePath);
			}
			catch (File.PathNotFoundException e) {
				assertTrue(false);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				assertTrue(false);
			}
		}
		
		/**
		 * Initializes a new test case to be performed from. This test is
		 * expected to return success.
		 */
		private boolean init() {
			InStream input = null;
			OutputStream output = null;
			try {
				input = new InStream(new InputStreamReader(new FileInputStream(tempOutputStream), "UTF-8"), infileExtension);
				output = new DirectOutputStream(new FileOutputStream(tempOutputStream), outfileExtension);
			}
			catch (FileNotFoundException e) {
				return false;
			}

				// Initialize error stream output streams
			assertTrue(output instanceof OutStream);

				return true;
		}

		public void run() {
			try {init();}
			catch (IOException e) {assertTrue(false);}

			if (tempOutputStream.exists()) {
				// We check two ways - if temp is the first, if not, if temp is the last.
				try {// File was just created, so it is empty
					assertTrue(tempOutputStream.delete() == true);
				}
				catch (IOException e) {assertTrue(false);}
			}

			if (tempOutputStream.exists()) {// Temp
				input.setFormat(StreamFormat.DVDS);
				output.setFormat(StreamFormat.MP4);

					try {
						inputStream.setInputStream(input);
						outputStream.setOutputStream(output);
					}
					catch (IOException e) {assertTrue(false);}

					// Let the tests pass
				return;
			}

			// Otherwise, create temporary file
			File tempFile = File.createTempFile("convertTest", null, tempOutputStream.getParentFile());
}
}
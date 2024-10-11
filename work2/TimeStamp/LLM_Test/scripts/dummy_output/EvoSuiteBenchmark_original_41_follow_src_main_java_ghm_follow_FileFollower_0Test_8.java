// FileFollower_0Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {
		/**
		 * Add another OutputDestination to which the followed file's contents
		 * should be printed.
		 *
		 * @throws IOException Exception thrown if an I/O error occurs
		 */
		public boolean addOutputDestination(OutputDestination outputDestination) throws IOException {
			final String filepath = "/tmp/TestFile1.txt";

			final File file1 = new File("/tmp/TestFile1.txt");
			file1.createNewFile();
			final FileOutputStream ostr = new FileOutputStream(file1);
}
}
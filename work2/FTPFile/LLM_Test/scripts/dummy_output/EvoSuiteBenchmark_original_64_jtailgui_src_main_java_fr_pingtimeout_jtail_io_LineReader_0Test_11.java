// LineReader_0Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains one unit test case for the {@link LineReader#readLine(int)} method.
*/
class LineReader_0Test {
		@Test
		void getLine() throws IOException, FileNotFoundException {
			File f = new File("f");
			f.deleteOnExit();
			//TODO add unit test

			readLine("-"); // To delete this class' file
		}

		@Test
		void getLineWithNonAsciiChars() throws IOException, FileNotFoundException {
			File f = new File("f");
			f.deleteOnExit();
			//To delete this class' file

			readLine("-！"); // To delete this class' file

			readLine("-！"); // To delete this class' file
		}

		@Test
		void readLineWithNull() throws IOException, FileNotFoundException {
			File file = new File("f");
			file.deleteOnExit();
			//For testing, use readLine on the file, with a null string as parameter.

			List<String> list = readBlock("0", "3");

			assertNotNull(list);
			assertEquals("", file.getName());
		}

		@Test
		void readLineWithIllegalFileName() throws IOException {
			File file = new File("/f");
			file.deleteOnExit();
			//To delete this class' file

			List<String> list = readBlock("0", "3");

			assertNotNull(list);
			assertEquals("", file.getName());
		}
}
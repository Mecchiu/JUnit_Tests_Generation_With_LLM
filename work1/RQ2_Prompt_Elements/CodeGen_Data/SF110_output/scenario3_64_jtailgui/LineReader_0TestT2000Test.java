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
private final List<String> expected =  new ArrayList<String>();

		/**
		 * test case for the readLine method.
		 *
		 * @throws IOException exception thrown by jtail
		 */
		@Test
		public void testReadLine() throws IOException {
			expected.add("LINE1");
			expected.add("LINE2");
			expected.add("LINE3");
			expected.add("EOF");
			expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE2");
			expected.add("CONTENT LINE3");
			String line = readLine("LINE1");
			String expectedLine = expected.remove(0);
			boolean assert = expectedLine.equals(line);
			assertTrue("Bad read line [" + line + "]", assert);
		}

		/**
		 * Test case for the close method of {@link LineReader}.
		 *
		 * @throws IOException exception thrown by jtail
		 */
		@Test
		public void testClose() throws IOException {
//			int i = 0;
			List<String> expected = new ArrayList<String>();
			//expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE1");
			FileIndex f = new FileIndex(new File("C:\\Program Files\\"+System.getProperty("user.dir")+"\\Lines\\index.txt"));
			expected.add("line 1");
			expected.add("line 2");
			expected.add("line 3");
			expected.add("EOF");
			expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE2");
			expected.add("CONTENT LINE3");
			expected.add("CONTENT LINE4");
			expected.add("EOF");
			expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE2");
			expected.add("CONTENT LINE3");
			expected.add("CONTENT LINE4");
			expected.add("CONTENT LINE5");
			expected.add("CONTENT LINE5");
			expected.add("end");
			expected.add(expected1);
			expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE2");
			expected.add("CONTENT LINE3");
			expected.add("CONTENT LINE5");
			expected.add("EOF");
			expected.add("CONTENT LINE6");
			expected.add("CONTENT LINE7");
			expected.add("CONTENT LINE5");
			expected.add("CONTENT LINE4");
			expected.add("end");
			expected.add(expected2);
			expected.add("CONTENT LINE6");
			expected.add("CONTENT LINE7");
			expected.add("line 3");
			expected.add("line4");
			expected.add("line5");
			expected.add("end");
			expected.add(expected3);
			expected.add("CONTENT LINE4");
			expected.add("CONTENT LINE5");
			expected.add("CONTENT LINE6");
			expected.add("CONTENT LINE5");
			expected.add("line 2");
			expected.add("line 3");
			expected.add("line 4");
			expected.add("line 5");
			expected.add("end");
			expected.add(expected4);
			expected.add("line 6");
			expected.add("line 7");
			List<String> expected2 = new ArrayList<String>();
			expected.add("line 1");
			expected2.add("line 2");
			expected2.add("line 3");
			expected2.add("line 4");
			expected2.add("line 5");
			expected2.add("line 6");
			expected2.add("line 7");
			expected2.add("end");
			expected2.add(expected3);
			expected2.add("CONTENT LINE5");
			expected2.add("CONTENT LINE6");
			expected2.add("CONTENT LINE7");
			expected2.add("end");

			expected.add("line 1");
			expected.add("line 2");
			expected.add("line 3");
			expected.add("end");

			expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE2");
			expected.add("CONTENT LINE3");
			expected.add("end");

			expected.add("line 1");
			expected.add("line2");
			expected.add("line3");
			expected.add("end");


//			expected.add("CONTENT LINE1");
			expected.add("CONTENT LINE3");
			expected.add("end");
			expected.add(expected4);

//			FileIndex f2 = new FileIndex(new File("C:\\Program Files\\"+System.getProperty("user.dir")+"\\Lines\\index.txt"));
//			expected.add("line 1");
//			expected.add("line 2");
//			expected.add("line 3");
//			expected.add(expected4);
//			expected.add("end");
//			expected.add(expected5);
//
//			expected.add("CONTENT LINE1");
//			expected.add("CONTENT LINE2");
//			expected.add("CONTENT LINE3");
//			expected.add("end");
//	
			expected.add(expected4);
//			expected.add("CONTENT LINE5");
//			expected.add(expected5);
//
//			expected.add("line 1");
//			expected.add("line2");
//			expected.add("line3");
//			expected.add("end");
//
//	expected.add("cont")
//			expected.add("CONTENT LINE4");
//			expected.add("CONTENT LINE5");
//			expected.add("end");
//

			expected.add("line 2");
			expected.add("end");
			expected.add(expected4);

	expected.add("line 3");
	expected.add("end");

		List<String> expected1 = new ArrayList<String>();
		expected1.add("line 1");
		expected1.add("line 2");
		expected1.add("line 3");
		expected1.add("end");

		System.out.println("TestCase for readLine");
			String line = readLine("end");
			boolean assert = expected1.remove(0) == line;
			boolean assert1 = expected1.remove(0) == expected1.remove(0);
			//boolean assert1 = line == expected1.remove(0
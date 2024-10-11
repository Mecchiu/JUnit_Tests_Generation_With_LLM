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
		/**
		 * Method for testing, whether {@link LineReader_0#getIndex(String)} is using "readLine".
		 */		public void testGetIndex_Reading()
		{
			final FileIndex index = new FileIndex();
			index.addSection(1, 7, 13, 553);

			final List<String> expected = new ArrayList<String>();
			expected.add("First line 1\n");
			expected.add("First line 2\n");
			expected.add("Second line 1\n");
			expected.add("Second line 2\n");
			expected.add("Second line 3\n");
			expected.add("Third line 1\n");	
			expected.add("Third line 2\n");
			expected.add("Three line 3\n");

			assertEquals("The line number expected to be found in: ", expected, index.get(1, 553));

			final List<String> actual = LineReader_0.readLine(4);

			assertEquals("The line number expected after closing the stream: "   + expected.size(), (int) expected.size() + 1, actual.size());

			// check the contents of the list
			for (int i = 0; i < expected.size(); i++){
				assertEquals("Line was expected to be read: ", expected.get(i), actual.get(i));
			}
		}

		/**
		 * Method for testing, whether {@link LineReader_0#getIndex(String)} is using "getIndex" with index pointing to a section.
		 */		public void testGetIndex_Section()
		{
			final FileIndex index = new FileIndex();
			index.addSection(1, 7, 13, 553);

			final List<String> expected = new ArrayList<String>();
			expected.add("First line 1\n");
			expected.add("First line 2\n");
			expected.add("Second line 1\n");
			expected.add("Second line 2\n");
			expected.add("Third line 1\n");	
			expected.add("Third line 2\n");			

			assertEquals("The line number expected to be found in: ", expected, index.get(1, 553));
		}
}
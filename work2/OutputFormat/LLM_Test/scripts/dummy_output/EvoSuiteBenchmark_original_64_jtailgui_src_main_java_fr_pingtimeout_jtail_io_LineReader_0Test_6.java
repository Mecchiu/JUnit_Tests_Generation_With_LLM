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
		 * Test of line read method of LineReader.
		 */
	@Test
	void testReadLineWithEmptyFile() throws FileNotFoundException {
		String expectedResult;
		expectedResult = "hello";
		JTailLogger.printAllMessagesInAnyThread();
		
		List<String> result = new ArrayList<String>();
		assertEquals(expectedResult, LineReader.readLine(0));
		JTailLogger.printAllMessagesInAnyThread();
		assertEquals(expectedResult, result.size(), result.size());
		for (int i = 0; i < result.size(); i++) {
				assertEquals(expectedResult, result.get(i));
		}
	}
    @Test
    void testReadBlockWithFullFile() throws FileNotFoundException {
    	JTailLogger.printAllMessagesInAnyThread();
        File file = new File("testReadBlockWithFullFile");
        LineReader.closeFile(file);
        try {
            List<String> result = LineReader.readBlock(-1, 2);
            assertEquals(0, result.size());
        } finally {
            LineReader.closeFile(file);
        }
    }
}
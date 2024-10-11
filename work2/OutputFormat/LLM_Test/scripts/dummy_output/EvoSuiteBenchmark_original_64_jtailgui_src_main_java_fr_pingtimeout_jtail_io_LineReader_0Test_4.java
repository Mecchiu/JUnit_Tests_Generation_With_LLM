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
	* Test of <code>readLine()</code> method of class {@link LineReader}
	*/
	@Test
	public void testReadLine() {
		JTailLogger.println();
		List<String> list = new ArrayList<String>();
		LineReader classObject = new LineReader(new File(""), new FileIndex("", ""));
		List<String> expected = new ArrayList<String>();
		expected.add("");
		classObject.close();
		
		classObject.close();
		
		JTailLogger.println();
		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE));
		classObject.close();
		
		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE));
		classObject.close();

		JTailLogger.println();

		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE | READWRITE));
		classObject.close();

		JTailLogger.println();
		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE | READWRITE));
		classObject.close();
		
		JTailLogger.println();
		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE));
		JTailLogger.println();
		classObject.close();
		
		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE | READWRITE));
		classObject.close();
		
		classObject = new LineReader(new File(""), new FileIndex("", READONLY_MODE | READWRITE | READWRITE));
		classObject.close();

	}

    public void close(RandomAccessFile randomAccessIO) {
        try {
            randomAccessIO.close();
        } catch (IOException e) { /* ignore */
        }
    }



}
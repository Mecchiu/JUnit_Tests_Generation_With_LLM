// LineReader_1Test.java
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
* It contains one unit test case for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
		/**
		 * TODO L'un petit pas peut être utilisé pour mettre toutes les tests dans une classe.
		 */
	@Test
	public void testClasseReadBlock() throws FileNotFoundException {
		// TODO FIN DE TESTS
	}

	@Test
    public void testReadLine() throws FileNotFoundException {
    		File f = new File("testReadLine.txt");
    		RandomAccessFile rf = new RandomAccessFile(f, READONLY_MODE);

    		List<String> l = new ArrayList<>();
    		int lines = rf.readLine(Integer.MAX_VALUE);

    		int count = 0;
    		try {
    			while ((count < lines) && (count < f.length())) {
    				l.add(rf.readLine(Integer.MAX_VALUE));
    				count = rf.readLine(Integer.MAX_VALUE);
    			}
    		} catch (java.io.IOException e) {
    			System.out.println("testReadLine FAILED");
    			System.out.println(e);
    		}
    		assertTrue(count == f.length());
    		JTailLogger.info("testReadLine PASSED");
    }

}//LineReader_1Test.java
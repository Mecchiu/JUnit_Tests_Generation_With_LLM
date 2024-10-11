// LineReader.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads a specific line from a file using an index.
 * The index is created by the {@link FileIndexer} class.
 * 
 * @author Pierre Laporte
 * Date: 7 avr. 2010
 */
public class LineReader {

    /**
     * Reads the line whose number is passed as a parameter.
     * The line number must be between 0 and the number of indexed lines.
     *
     * @param lineNumber the number of the line to read. Must be between 0 and the number of indexed lines.
     * @return the line corresponding to the number passed as a parameter
     * @throws IOException if an error occurs during reading
     */
    public String readLine(int lineNumber) throws IOException;
}

// LineReaderTest.java
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
* It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
*/
class LineReaderTest {
    
    @Test
    void testReadFirstLine() {
        // TODO: implement test case
    }
    
    @Test
    void testReadLastLine() {
        // TODO: implement test case
    }
    
    @Test
    void testReadMiddleLine() {
        // TODO: implement test case
    }
    
    @Test
    void testReadLineOutOfRange() {
        // TODO: implement test case
    }
    
    @Test
    void testReadEmptyFile() {
        // TODO: implement test case
    }
    
    @Test
    void testReadFileWithOneLine() {
        // TODO: implement test case
    }
    
    @Test
    void testReadFileWithMultipleLines() {
        // TODO: implement test case
    }
    
    @Test
    void testReadLineWithInvalidIndex() {
        // TODO: implement test case
    }
    
    @Test
    void testReadLineWithNegativeIndex() {
        // TODO: implement test case
    }
    
    @Test
    void testReadLineWithZeroIndex() {
        // TODO: implement test case
    }
}
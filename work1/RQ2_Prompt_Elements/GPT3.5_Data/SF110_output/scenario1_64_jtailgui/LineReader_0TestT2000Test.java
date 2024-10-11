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
 * This class reads a specific line from a file using its line number.
 * It uses a file index to optimize the reading process.
 * 
 * @author Pierre Laporte
 * Date: 7 avr. 2010
 */
public class LineReader {
    
    private RandomAccessFile randomAccess;
    private FileIndex index;
    
    public LineReader(File file) throws FileNotFoundException {
        this.randomAccess = new RandomAccessFile(file, "r");
        this.index = new FileIndex(file);
    }

    /**
     * Reads a specific line from the file using its line number.
     * 
     * @param lineNumber the line number to read
     * @return the content of the line
     * @throws IOException if an I/O error occurs
     */
    public String readLine(int lineNumber) throws IOException {
        this.randomAccess.seek(this.index.getOffsetOfLine(lineNumber));
        if (this.randomAccess.getFilePointer() == this.randomAccess.length()) {
            return "";
        } else {
            return this.randomAccess.readLine();
        }
    }
}

// LineReaderTest.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LineReader}.
 * It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
 */
class LineReaderTest {
    
    private static final String TEST_FILE_PATH = "src/test/resources/test.txt";
    
    @Test
    void testReadFirstLine() throws IOException {
        LineReader reader = new LineReader(new File(TEST_FILE_PATH));
        String line = reader.readLine(1);
        assertEquals("This is the first line.", line);
    }
    
    @Test
    void testReadLastLine() throws IOException {
        LineReader reader = new LineReader(new File(TEST_FILE_PATH));
        String line = reader.readLine(5);
        assertEquals("This is the last line.", line);
    }
    
    @Test
    void testReadMiddleLine() throws IOException {
        LineReader reader = new LineReader(new File(TEST_FILE_PATH));
        String line = reader.readLine(3);
        assertEquals("This is the third line.", line);
    }
    
    @Test
    void testReadEmptyFile() throws IOException {
        LineReader reader = new LineReader(new File("src/test/resources/empty.txt"));
        String line = reader.readLine(1);
        assertEquals("", line);
    }
    
    @Test
    void testReadNonExistingLine() throws IOException {
        LineReader reader = new LineReader(new File(TEST_FILE_PATH));
        String line = reader.readLine(10);
        assertEquals("", line);
    }
    
    @Test
    void testReadNegativeLine() throws IOException {
        LineReader reader = new LineReader(new File(TEST_FILE_PATH));
        assertThrows(IllegalArgumentException.class, () -> {
            reader.readLine(-1);
        });
    }
    
    @Test
    void testReadZeroLine() throws IOException {
        LineReader reader = new LineReader(new File(TEST_FILE_PATH));
        assertThrows(IllegalArgumentException.class, () -> {
            reader.readLine(0);
        });
    }
    
    @Test
    void testReadLineFromFileWithOneLine() throws IOException {
        LineReader reader = new LineReader(new File("src/test/resources/one-line.txt"));
        String line = reader.readLine(1);
        assertEquals("This is a file with only one line.", line);
    }
    
    @Test
    void testReadLineFromFileWithMultipleEmptyLines() throws IOException {
        LineReader reader = new LineReader(new File("src/test/resources/multiple-empty-lines.txt"));
        String line = reader.readLine(3);
        assertEquals("", line);
    }
    
    @Test
    void testReadLineFromFileWithMultipleSpaces() throws IOException {
        LineReader reader = new LineReader(new File("src/test/resources/multiple-spaces.txt"));
        String line = reader.readLine(1);
        assertEquals("This line contains multiple spaces.", line);
    }
}
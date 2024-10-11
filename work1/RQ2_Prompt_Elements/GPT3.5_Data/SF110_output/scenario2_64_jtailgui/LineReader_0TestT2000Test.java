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

    private RandomAccessFile randomAccess;
    private FileIndex index;

    /**
     * Constructor for the LineReader class.
     * 
     * @param file the file to read from
     * @param index the index of the file
     * @throws FileNotFoundException if the file is not found
     */
    public LineReader(File file, FileIndex index) throws FileNotFoundException {
        this.randomAccess = new RandomAccessFile(file, "r");
        this.index = index;
    }

    /**
     * Reads the line at the specified line number.
     * The line number should be between 0 and the number of indexed lines.
     * 
     * @param lineNumber the line number to read
     * @return the line at the specified line number
     * @throws IOException if an error occurs while reading the file
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
 * Test class for the {@link LineReader} class.
 * It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
 */
class LineReaderTest {

    @Test
    void testReadFirstLine() throws IOException {
        File file = new File("test.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This is the first line.";
        String actual = reader.readLine(0);
        assertEquals(expected, actual);
    }

    @Test
    void testReadLastLine() throws IOException {
        File file = new File("test.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This is the last line.";
        String actual = reader.readLine(4);
        assertEquals(expected, actual);
    }

    @Test
    void testReadMiddleLine() throws IOException {
        File file = new File("test.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This is the third line.";
        String actual = reader.readLine(2);
        assertEquals(expected, actual);
    }

    @Test
    void testReadEmptyFile() throws IOException {
        File file = new File("empty.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "";
        String actual = reader.readLine(0);
        assertEquals(expected, actual);
    }

    @Test
    void testReadLineOutOfRange() throws IOException {
        File file = new File("test.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        assertThrows(IndexOutOfBoundsException.class, () -> reader.readLine(5));
    }

    @Test
    void testReadNegativeLineNumber() throws IOException {
        File file = new File("test.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        assertThrows(IndexOutOfBoundsException.class, () -> reader.readLine(-1));
    }

    @Test
    void testReadLineWithCarriageReturn() throws IOException {
        File file = new File("test_cr.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This line has a carriage return.\r";
        String actual = reader.readLine(0);
        assertEquals(expected, actual);
    }

    @Test
    void testReadLineWithNewLine() throws IOException {
        File file = new File("test_nl.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This line has a new line.\n";
        String actual = reader.readLine(0);
        assertEquals(expected, actual);
    }

    @Test
    void testReadLineWithCarriageReturnAndNewLine() throws IOException {
        File file = new File("test_crlf.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This line has a carriage return and a new line.\r\n";
        String actual = reader.readLine(0);
        assertEquals(expected, actual);
    }

    @Test
    void testReadLineWithUnicode() throws IOException {
        File file = new File("test_unicode.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String expected = "This line has some unicode characters: éàç.";
        String actual = reader.readLine(0);
        assertEquals(expected, actual);
    }
}
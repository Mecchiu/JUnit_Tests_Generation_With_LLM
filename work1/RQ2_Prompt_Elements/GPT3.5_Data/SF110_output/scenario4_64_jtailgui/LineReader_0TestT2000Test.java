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
 * This class reads a file and provides methods to read lines or blocks of lines from it.
 * It uses an index of the lines' positions in the file to optimize the reading process.
 * 
 * @author Pierre Laporte
 * Date: 7 avr. 2010
 */
public class LineReader {

    //NON-NLS
    private static final String READONLY_MODE = "r";

    /**
     * The index of the lines in the file.
     */
    private final FileIndex index;

    /**
     * The file to read.
     */
    private final File file;

    /**
     * The stream used to read the file.
     */
    private final RandomAccessFile randomAccess;

    /**
     * Constructor of a LineReader from an index of the lines in the file.
     * The index must indicate the position of the first character of each line in the file.
     *
     * @param file  the file to read
     * @param index the index to use
     * @throws java.io.FileNotFoundException if the file does not exist
     */
    public LineReader(File file, FileIndex index) throws FileNotFoundException {
        this.file = file;
        this.index = index;
        this.randomAccess = new RandomAccessFile(file, READONLY_MODE);
    }

    /**
     * Closes the stream used to read the file.
     *
     * @throws IOException if an error occurs
     */
    public void close() throws IOException {
        randomAccess.close();
    }

    /**
     * Returns the number of indexed lines.
     *
     * @return the number of indexed lines
     */
    public int getIndexSize() {
        return index.size();
    }

    /**
     * Reads the line whose number is passed as parameter.
     * The line number must be between 0 and the number of indexed lines.
     *
     * @param lineNumber the number of the line to read. Must be between 0 and the number of indexed lines.
     * @return the line corresponding to the number passed as parameter
     * @throws IOException if an error occurs during the reading
     */
    public String readLine(int lineNumber) throws IOException {
        long position = index.getPosition(lineNumber);
        randomAccess.seek(position);
        String line = randomAccess.readLine();
        return line;
    }

    /**
     * Reads the lines between <code>fromLine</code> and <code>toLine</code> (exclusive).
     *
     * @param fromLine the number of the first line to read
     * @param toLine   the number of the last line to read (exclusive)
     * @return the lines of the file whose number is between the two parameters
     * @throws IOException if an error occurs during the reading
     */
    public List<String> readBlock(int fromLine, int toLine) throws IOException {
        List<String> lines = new ArrayList<>();
        for (int i = fromLine; i < toLine; i++) {
            String line = readLine(i);
            lines.add(line);
        }
        return lines;
    }
}

// LineReaderTest.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LineReader}.
 * It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
 */
class LineReaderTest {

    /**
     * Tests that reading a line from an empty file returns null.
     */
    @Test
    void testReadLineFromEmptyFile() throws IOException {
        File file = new File("src/test/resources/empty.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String line = reader.readLine(0);
        assertNull(line);
        reader.close();
    }

    /**
     * Tests that reading a line from a file with one line returns the correct line.
     */
    @Test
    void testReadLineFromOneLineFile() throws IOException {
        File file = new File("src/test/resources/one_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String line = reader.readLine(0);
        assertEquals("This is a test line.", line);
        reader.close();
    }

    /**
     * Tests that reading a line from a file with multiple lines returns the correct line.
     */
    @Test
    void testReadLineFromMultiLineFile() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String line = reader.readLine(2);
        assertEquals("This is the third line.", line);
        reader.close();
    }

    /**
     * Tests that reading a line with an index greater than the number of lines in the file returns null.
     */
    @Test
    void testReadLineWithIndexGreaterThanNumberOfLines() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String line = reader.readLine(10);
        assertNull(line);
        reader.close();
    }

    /**
     * Tests that reading a line with a negative index returns null.
     */
    @Test
    void testReadLineWithNegativeIndex() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String line = reader.readLine(-1);
        assertNull(line);
        reader.close();
    }

    /**
     * Tests that reading a block of lines from a file with one line returns the correct line.
     */
    @Test
    void testReadBlockFromOneLineFile() throws IOException {
        File file = new File("src/test/resources/one_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(0, 1);
        assertEquals(1, lines.size());
        assertEquals("This is a test line.", lines.get(0));
        reader.close();
    }

    /**
     * Tests that reading a block of lines from a file with multiple lines returns the correct lines.
     */
    @Test
    void testReadBlockFromMultiLineFile() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(1, 3);
        assertEquals(2, lines.size());
        assertEquals("This is the second line.", lines.get(0));
        assertEquals("This is the third line.", lines.get(1));
        reader.close();
    }

    /**
     * Tests that reading a block of lines with an invalid range returns an empty list.
     */
    @Test
    void testReadBlockWithInvalidRange() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(3, 1);
        assertTrue(lines.isEmpty());
        reader.close();
    }

    /**
     * Tests that reading a block of lines with a range that exceeds the number of lines in the file returns the available lines.
     */
    @Test
    void testReadBlockWithRangeExceedingNumberOfLines() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(1, 10);
        assertEquals(3, lines.size());
        assertEquals("This is the second line.", lines.get(0));
        assertEquals("This is the third line.", lines.get(1));
        assertEquals("This is the fourth line.", lines.get(2));
        reader.close();
    }

    /**
     * Tests that reading a block of lines with a negative range returns an empty list.
     */
    @Test
    void testReadBlockWithNegativeRange() throws IOException {
        File file = new File("src/test/resources/multi_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(-1, 1);
        assertTrue(lines.isEmpty());
        reader.close();
    }
}
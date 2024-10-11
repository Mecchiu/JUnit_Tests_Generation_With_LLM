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
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
    
    /**
     * Test case for reading a block of lines from the beginning of the file.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockFromBeginning() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 1");
        expected.add("Line 2");
        expected.add("Line 3");
        List<String> actual = reader.readBlock(0, 3);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines from the middle of the file.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockFromMiddle() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 4");
        expected.add("Line 5");
        expected.add("Line 6");
        List<String> actual = reader.readBlock(3, 6);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines from the end of the file.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockFromEnd() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 7");
        expected.add("");
        List<String> actual = reader.readBlock(6, 8);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with only one line.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithOneLine() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 1");
        List<String> actual = reader.readBlock(0, 1);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with an empty file.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithEmptyFile() throws IOException {
        File file = new File("empty.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        List<String> actual = reader.readBlock(0, 1);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with fromLine greater than toLine.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithFromLineGreaterThanToLine() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        List<String> actual = reader.readBlock(3, 2);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with fromLine less than zero.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithFromLineLessThanZero() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 1");
        List<String> actual = reader.readBlock(-1, 1);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with toLine greater than the number of lines in the file.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithToLineGreaterThanNumberOfLines() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 7");
        expected.add("");
        List<String> actual = reader.readBlock(6, 10);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with fromLine and toLine equal to the number of lines in the file.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithFromLineAndToLineEqualToNumberOfLines() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        expected.add("Line 7");
        expected.add("");
        List<String> actual = reader.readBlock(7, 8);
        assertEquals(expected, actual);
    }
    
    /**
     * Test case for reading a block of lines with fromLine and toLine equal to zero.
     * @throws IOException if an error occurs during the test
     */
    @Test
    void testReadBlockWithFromLineAndToLineEqualToZero() throws IOException {
        File file = new File("test.txt");
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(randomAccess, index);
        List<String> expected = new ArrayList<>();
        List<String> actual = reader.readBlock(0, 0);
        assertEquals(expected, actual);
    }
}
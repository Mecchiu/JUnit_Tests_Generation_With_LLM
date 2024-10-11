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

    @Test
    /**
     * Test with a test file and line ending (".a").
     * All values should be in the range of 0x55 -> 0x1f.
     * 
     * @throws IOException
     * @throws IOException
     */
    public void testWithA() throws FileNotFoundException {
        final FileIndex testFile = LineReader.readSourceFile(0x1f, 8, "a");
        assertNotNull(testFile);
        assertTrue(testFile.hasText());
        assertTrue(JTailLogger.isOkLogged(testFile));
        
        final List<String> line = new ArrayList<String>();
        final int nbLines = testFile.getNumberOfLines();
        final List<String> output = new ArrayList<String>();
        for (int linei = 0; linei < nbLines; linei++) {
            final RandomAccessFile raf = new RandomAccessFile(testFile.getLine(linei), "r");
            final String line = raf.readLine();
            assertNotNull(line);
            raf.close();
            line.split("\t").forEach(output::add);
            assertEquals(line, expectedArray(String.valueOf(0x55)));
            r.reset();
        }
        
        final byte[] expectedArray = new byte[] {0x55, 0x11, 0x11, 0xff, 0x11};
        assertArrayEquals(expectedArray, output.toArray());
        
        testFile.close();
    }

    @Test
    /**
     * Test with a test file and line ending (".a" or null.
     * All values should be in the range of 0x55 -> 0x1f.
     * 
     * @throws IOException
     * @throws IOException
     */
    public void testWithBoth() throws FileNotFoundException {
        final File indexFile = LineReader.readSourceFile(0x1f, 8, "a");
        assertNotNull(indexFile);
        assertTrue(indexFile.hasText());
        assertTrue(JTailLogger.isOkLogged(indexFile));
        
        final List<String> line = new ArrayList<String>();
        final int nbLines = indexFile.getNumberOfLines();
        final List<String> output = new ArrayList<String>();
        for (int linei = 0; linei < nbLines; linei++) {
            final RandomAccessFile raf = new RandomAccessFile(indexFile.getLine(linei), "r");
            final String line = raf.readLine();
            assertNotNull(line);
            raf.close();
            line.split("\t").forEach(output::add);
            assertEquals(line, expectedArray(String.valueOf(0x55)));
            r.reset();
        }
        
        final byte[] expectedArray = new byte[] {0x11, 0x11, 0x11, 0xff, 0x11};
        assertArrayEquals(expectedArray, output.toArray());
        
        indexFile.close();
    }
    
    /**
     * Test with an invalid file and line ending (".a").
     * All values should be in the range of 0x55 -> 0x1f.
     * 
     * @throws Exception
     */
    @Test
    public void testWithAnInvalidLineEnding() throws Exception {
        final File indexFile = LineReader.readSourceFile(0x1f, 8, "a");
        assertNotNull(indexFile);
        assertTrue(indexFile.hasText());

        final List<String> line = new ArrayList<String>();
        final int nbLines = indexFile.getNumberOfLines();
        for (int linei = 0; linei < nbLines; linei++) {
            final RandomAccessFile raf = new RandomAccessFile(indexFile.getLine(linei), "r");
            final String line = raf.readLine();
            assertNotNull(line);
            raf.close();
            line.split("\t").forEach(line);
            assertTrue(line.length() <= 3);
            r.reset();
        }
        
        final byte[] expectedArray = new byte[] {0x11, 0x11, 0x11, 0xff, 0x11};
        assertArrayEquals(expectedArray, line.toArray());
        
        indexFile.close();
    }

    @Test
    /**
     * Test without an index file.
     * 
     * @throws Exception
     */
    public void testWithoutIndexFile() throws Exception {
        final File indexFile = new File(
            new File(new File(System.getProperty("java.io.tmpdir"), "temp"), ".jtail"));
        assertNotNull(indexFile);
        
        System.setProperty("java.io.tmpdir", ""); /* to avoid the default directory */
        final List<String> line = new ArrayList<String>();
        final int nbLines = 0x1f - 16;
        for (int linei = 0; linei < nbLines; linei++) {
            final RandomAccessFile raf = new RandomAccessFile(indexFile.getLine(linei), "r");
            final String line = raf.readLine();
            assertNotNull(line);
            raf.close();
            line.split("\t").forEach(line);
            assertTrue(line.length() <= 3);
            r.reset();
        }
    }

    private void assertArrayEquals(final byte[] expected, final byte[] actual) {
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            final byte expectedChar = (byte) expected[i];
            final byte actualChar = (byte) actual[i];
            assertEquals(expectedChar, actualChar);
            assertEquals(0x1f, (byte) (expectedChar & 0x1f));
        }
    }

    private void assertNotNull(final Object actual) {
        assertNotNull(String.valueOf(actual));
    }

    private String expectedArray(final String str) {
        final String expected = str.substring(0, 3);
        return expected;
    }
    
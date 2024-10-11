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
		
	private final String name = LINEREADER + 0;

	@Test
    void test1() throws IOException {
        final FileIndex _index = new FileIndex("index1");
		final LineReader _reader = new LineReader(new RandomAccessFile("Test.txt", READONLY_MODE), _index); //$NON-NLS-1$
		final List<Long> _l = _reader.readBlock(1, 0);
		assertEquals(2, _l.size());
		assertEquals(1, _l.get(0).intValue());
		assertEquals(2, _l.get(1).intValue());
		assertTrue(_reader.isEOF());
        final String s = _reader.readLine(0);
        assertEquals("1\n", s);
        assertTrue(_reader.isEOF());
    }
	
    @Test
	void test2() throws FileNotFoundException, IOException {
        final FileIndex _index = new FileIndex("index1");
		final LineReader _reader = new LineReader(new RandomAccessFile("Test.txt", READONLY_MODE), _index);
		final List<Long> _l = _reader.readBlock(2, 8);
		assertEquals(4, _l.size());
		assertEquals(1, _l.get(0).intValue());
		assertEquals(4, _l.get(1).intValue());
        final String s = _reader.readLine(0);
        assertEquals("2\n", s);
        final String s1 = _reader.readLine(8);
        assertEquals("2\n", s1);
        assertTrue(_reader.isEOF());
        final String s2 = _reader.readLine(0);
        assertEquals("3\n", s2);
        
        assertTrue(_reader.readBlock(8, 8).isEmpty());
        assertTrue(_reader.readBlock(0, 6).isEmpty());
		
        final String str = _reader.readLine(0);
		assertEquals("\n", str);
		final List<Long> l2 = _reader.readBlock(9, 6);
		assertEquals(5, l2.size());
		assertEquals(1, l2.get(0).intValue());
		final List<Long> l3 = _reader.readBlock(8, 8);
		assertEquals(5, l3.size());
		final List<Long> l4 = _reader.readBlock(8, 8);
		assertFalse(l3.get(0).equals(l4.get(0)));
        
        assertTrue(_reader.readBlock(8, 2).isEmpty());
        assertTrue(_reader.readBlock(2, 0).isEmpty());
		assertTrue(_reader.readBlock(1, 0).isEmpty());
		_reader.clear();
		_reader.readBlock(2, 0);
        final List<Long> l1 = _reader.readBlock(2, 0);
        assertEquals(1, l1.size());
        
        final List<Long> l5 = _reader.readBlock(2, 2);
        assertEquals(2, l5.size());
        assertEquals(1, l5.get(0).intValue());
        assertEquals(1, l5.get(1).intValue());
        
    }

	@Test
	void test3() throws IOException {
        final FileIndex _index = new FileIndex("index1");
		final LineReader _reader = new LineReader(new RandomAccessFile("Test.txt", READONLY_MODE), _index);
		final List<Long> l = _reader.readBlock(0, 8);
		
		final List<Long> l2 = _reader.readBlock(0, 8);
		assertEquals(1, l.size());
        assertTrue(l2.isEmpty());
        
		final List<Long> l3 = _reader.readBlock(9, 8);
		assertEquals(1, l3.size());
        
		final List<Long> l4 = _reader.readBlock(8, 0);
		assertTrue(l4.isEmpty());
		
		assertFalse(_reader.readBlock(0, 4).isEmpty());
    }
    
}
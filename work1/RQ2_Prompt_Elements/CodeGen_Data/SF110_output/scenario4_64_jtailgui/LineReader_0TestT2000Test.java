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

	@Test
	void readLineFromFileFailsOnOpen() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
        // Line is 0, so we can't check the end of the file
        reader.readLine();
        assertEquals("Line is 0, should be the same as the file length.\n", file.length(), reader.getIndexSize());
	}
	
	@Test
	void readLineFailsOnShortFileRead() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
		try {
			reader.readLine(1);
		} catch (FileNotFoundException e) {
			assertEquals(String.valueOf(0), e.getClass().toString());
		}
		//Line is not 0, so we can't check the end of the file
	}

	@Test
	void readLinesFromFileFailsOnRead() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
		try {
			reader.readBlock(1, 0);
		} catch (FileNotFoundException e) {
			assertEquals(String.valueOf(0), e.getClass().toString());
		}
		//Line is not 0, so we can't check the end of the file
	}

	@Test
	void readLinesFromFileFailsOnRead_MultipleFroms() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		RandomAccessFile randomAccess = new RandomAccessFile("test.txt", READONLY_MODE);
		LineReader reader = new LineReader(randomAccess, new FileIndex());
		try {
			reader.readBlock(0, 1);
		} catch (FileNotFoundException e) {
			assertEquals(String.valueOf(0), e.getClass().toString());
		}
	}

	@Test
	void readBlockFailsOnLineTooLong() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
		try {
			readBlock(0, 2);
		} catch (FileNotFoundException e) {
			assertEquals(String.valueOf(0), e.getClass().toString());
		}
		//Line is not 0, so we can't check the end of the file
	}

	@Test
	void readBlockFailsOnRead_MixedNumbers() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
		readBlock(0, 1);
		assertEquals("The number is bigger than the file length.\n", String.valueOf(0), reader.getIndexSize());
	}

	@Test
	void readBlockFailsOnRead_MixedNumbersEmptyLine() throws IOException {
		File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
		readBlock(0, 1);
		assertEquals("The number is bigger than the file length.\n", String.valueOf(0), reader.getIndexSize());
	}


	@Test
	void readBlockFailsWithBlankLine() throws IOException {
		jTail.write(null, 0, 1);
        File file = new File("test.txt");
		LineReader reader = new LineReader(file, new FileIndex());
		try {
			readBlock(0, 2);
		} catch (FileNotFoundException e) {
			assertEquals(String.valueOf(0), e.getClass().toString());
		}
	}
	
	@Test
	void readBlockSucceedsWithValidLine() throws IOException {
        jTail.write(null, 0, 1);
        File file = new File("test.txt");
		lineRead
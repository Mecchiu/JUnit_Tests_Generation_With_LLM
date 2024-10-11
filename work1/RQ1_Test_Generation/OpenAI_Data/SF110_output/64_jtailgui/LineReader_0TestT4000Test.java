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
* It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
*/
class LineReader_0Test {

		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is negative.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadLine_0() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readLine(-1);
				});
				
				// Then
				assertEquals("Line number must be positive", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is zero.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadLine_1() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readLine(0);
				});
				
				// Then
				assertEquals("Line number must be positive", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is greater than the number of lines in the file.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadLine_2() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readLine(index.getIndexSize() + 1);
				});
				
				// Then
				assertEquals("Line number must be less than the number of lines in the file", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadLine_3() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readLine(index.getIndexSize());
				});
				
				// Then
				assertEquals("Line number must be less than the number of lines in the file", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file minus one.
		* It expects the last line of the file to be returned.
		*/
		@Test
		void testReadLine_4() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final String line = lineReader.readLine(index.getIndexSize() - 1);
				
				// Then
				assertEquals("This is the last line of the file", line);
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to one.
		* It expects the first line of the file to be returned.
		*/
		@Test
		void testReadLine_5() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final String line = lineReader.readLine(1);
				
				// Then
				assertEquals("This is the first line of the file", line);
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file minus two.
		* It expects the penultimate line of the file to be returned.
		*/
		@Test
		void testReadLine_6() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final String line = lineReader.readLine(index.getIndexSize() - 2);
				
				// Then
				assertEquals("This is the penultimate line of the file", line);
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two.
		* It expects the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_7() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final String line = lineReader.readLine(index.getIndexSize() / 2);
				
				// Then
				assertEquals("This is the middle line of the file", line);
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two plus one.
		* It expects the line after the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_8() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final String line = lineReader.readLine(index.getIndexSize() / 2 + 1);
				
				// Then
				assertEquals("This is the line after the middle line of the file", line);
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two minus one.
		* It expects the line before the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_9() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_0Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final String line = lineReader.readLine(index.getIndexSize() / 2 - 1);
				
				// Then
				assertEquals("This is the line before the middle line of the file", line);
				lineReader.close();
		}
}

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
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the first line number is negative.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadBlock_0() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_1Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readBlock(-1, 1);
				});
				
				// Then
				assertEquals("Line number must be positive", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the first line number is zero.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadBlock_1() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_1Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readBlock(0, 1);
				});
				
				// Then
				assertEquals("Line number must be positive", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the first line number is greater than the number of lines in the file.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadBlock_2() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_1Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readBlock(index.getIndexSize() + 1, 1);
				});
				
				// Then
				assertEquals("Line number must be less than the number of lines in the file", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the first line number is equal to the number of lines in the file.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadBlock_3() throws IOException {
				// Given
				final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_1Test.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
						lineReader.readBlock(index.getIndexSize(), 1);
				});
				
				// Then
				assertEquals("Line number must be less than the number of lines in the file", exception.getMessage());
				lineReader.close();
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the last line number is negative.
		* It expects an {@link IllegalArg
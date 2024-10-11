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
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				try {
						reader.readLine(-1);
						fail("An IllegalArgumentException should have been thrown");
				} catch (IllegalArgumentException e) {
						// Then
						assertEquals("The line number must be positive", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadLine_1() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				try {
						reader.readLine(index.getIndexSize());
						fail("An IllegalArgumentException should have been thrown");
				} catch (IllegalArgumentException e) {
						// Then
						assertEquals("The line number must be less than the number of lines in the file", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is greater than the number of lines in the file.
		* It expects an {@link IllegalArgumentException} to be thrown.
		*/
		@Test
		void testReadLine_2() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				try {
						reader.readLine(index.getIndexSize() + 1);
						fail("An IllegalArgumentException should have been thrown");
				} catch (IllegalArgumentException e) {
						// Then
						assertEquals("The line number must be less than the number of lines in the file", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to zero.
		* It expects the first line of the file to be returned.
		*/
		@Test
		void testReadLine_3() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				String line = reader.readLine(0);
				
				// Then
				assertEquals("This is a test file", line);
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file minus one.
		* It expects the last line of the file to be returned.
		*/
		@Test
		void testReadLine_4() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				String line = reader.readLine(index.getIndexSize() - 1);
				
				// Then
				assertEquals("This is the last line", line);
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two.
		* It expects the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_5() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				String line = reader.readLine(index.getIndexSize() / 2);
				
				// Then
				assertEquals("This is the middle line", line);
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two plus one.
		* It expects the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_6() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				String line = reader.readLine(index.getIndexSize() / 2 + 1);
				
				// Then
				assertEquals("This is the middle line", line);
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two minus one.
		* It expects the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_7() throws IOException {
				// Given
				File file = new File("src/test/resources/test.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				String line = reader.readLine(index.getIndexSize() / 2 - 1);
				
				// Then
				assertEquals("This is the middle line", line);
		}
		
		/**
		* Test case for {@link LineReader#readLine(int)} method.
		* It tests the case where the line number is equal to the number of lines in the file divided by two minus two.
		* It expects the middle line of the file to be returned.
		*/
		@Test
		void testReadLine_8() throws IOException {
				// Given
				File file = new File("
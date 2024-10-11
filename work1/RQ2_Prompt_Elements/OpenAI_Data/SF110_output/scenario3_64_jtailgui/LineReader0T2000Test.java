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

		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is negative.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithNegativeLineNumber() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(-1);
				
				// Then
				assertNull(line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is greater than the number of lines indexed.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberGreaterThanNumberOfLinesIndexed() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(10);
				
				// Then
				assertNull(line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexed() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(9);
				
				// Then
				assertNull(line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to zero.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToZero() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(0);
				
				// Then
				assertEquals("line 1", line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed minus one.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexedMinusOne() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(8);
				
				// Then
				assertEquals("line 9", line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed minus two.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexedMinusTwo() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(7);
				
				// Then
				assertEquals("line 8", line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed minus three.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexedMinusThree() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(6);
				
				// Then
				assertEquals("line 7", line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed minus four.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexedMinusFour() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(5);
				
				// Then
				assertEquals("line 6", line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed minus five.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexedMinusFive() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test.log.index")));
				
				// When
				String line = lineReader.readLine(4);
				
				// Then
				assertEquals("line 5", line);
		}
		
		/**
		 * Test case for {@link LineReader#readLine(int)} method.
		 * It tests the case where the line number is equal to the number of lines indexed minus six.
		 *
		 * @throws IOException if an error occurs during the test
		 */
		@Test
		void testReadLineWithLineNumberEqualToNumberOfLinesIndexedMinusSix() throws IOException {
				// Given
				LineReader lineReader = new LineReader(new File("/tmp/test.log"), new FileIndex(new File("/tmp/test
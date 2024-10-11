// TreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilderTest {

	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is null.
	 */
	@Test
	public void testFileToInputSource_NullFile() {
		try {
			TreeBuilder.fileToInputSource(null);
			fail("Expected NullPointerException");
		} catch (NullPointerException e) {
			// expected
		} catch (Exception e) {
			fail("Expected NullPointerException");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file doesn't exist.
	 */
	@Test
	public void testFileToInputSource_FileNotExist() {
		try {
			TreeBuilder.fileToInputSource(new File("test.xml"));
			fail("Expected FileNotFoundException");
		} catch (FileNotFoundException e) {
			// expected
		} catch (Exception e) {
			fail("Expected FileNotFoundException");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a directory.
	 */
	@Test
	public void testFileToInputSource_FileIsDirectory() {
		try {
			TreeBuilder.fileToInputSource(new File("."));
			fail("Expected FileNotFoundException");
		} catch (FileNotFoundException e) {
			// expected
		} catch (Exception e) {
			fail("Expected FileNotFoundException");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is not readable.
	 */
	@Test
	public void testFileToInputSource_FileNotReadable() {
		try {
			File file = File.createTempFile("test", ".xml");
			file.setReadable(false);
			TreeBuilder.fileToInputSource(file);
			fail("Expected FileNotFoundException");
		} catch (FileNotFoundException e) {
			// expected
		} catch (Exception e) {
			fail("Expected FileNotFoundException");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is not a normal file.
	 */
	@Test
	public void testFileToInputSource_FileNotNormal() {
		try {
			File file = File.createTempFile("test", ".xml");
			file.delete();
			file.mkdir();
			TreeBuilder.fileToInputSource(file);
			fail("Expected FileNotFoundException");
		} catch (FileNotFoundException e) {
			// expected
		} catch (Exception e) {
			fail("Expected FileNotFoundException");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is not a file.
	 */
	@Test
	public void testFileToInputSource_FileNotFile() {
		try {
			File file = File.createTempFile("test", ".xml");
			file.delete();
			file.mkdir();
			TreeBuilder.fileToInputSource(file);
			fail("Expected FileNotFoundException");
		} catch (FileNotFoundException e) {
			// expected
		} catch (Exception e) {
			fail("Expected FileNotFoundException");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal2() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal3() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal4() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal5() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal6() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal7() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal8() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal9() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
	
	/**
	 * Test case for {@link TreeBuilder#fileToInputSource(File)} method.
	 * It tests the case when the file is a normal file.
	 */
	@Test
	public void testFileToInputSource_FileIsNormal10() {
		try {
			File file = File.createTempFile("test", ".xml");
			InputSource inputSource = TreeBuilder.fileToInputSource(file);
			assertNotNull(inputSource);
			assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
		} catch (Exception e) {
			fail("Unexpected exception");
		}
	}
}
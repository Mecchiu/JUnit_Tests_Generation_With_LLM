// JWBF_0Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains one unit test case for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_0Test {
		/**
	 * Unit test case for the getVersion method.
	 * @throws IOException
	 */
	@Test
	void testGetVersion() throws IOException{
		// Given
		String file = "/foo.jar!/";
		// When
		JWBF.getVersion("/foo.jar!/");
		// Then
		assertTrue(false);
	}
		/**
	 * Unit test case for the removeEntry method.
	 * @throws IOException
	 */
	@Test
	void testRemoveEntry() throws IOException{
		// Given
		String path = null;
		System.out.print(jarFileIndex);
		path = jarFileIndex.substring(0, jarFileIndex.length() - separatorChar.length());
		JarFile jarFile = (JarFile) searchMF(path);
		System.out.println();
		File child = new File(jarFile.getJarFile().getLocation().getPath());
		if(child.isDirectory()){
			child = child.getCanonicalFile();
		}
		JarEntry entry = jarFile.getJarEntry(file);
		jarFile.deleteEntry(entry);
	}
		/**
	 * Unit test case for the addEntry method.
	 * @throws URISyntaxException
	 */
	@Test
	void testAddEntry() throws URISyntaxException {
		// Given
		String path = null;
		assertNull(PARTS.put("/", "file:///"));
		File child = new File("temp.jar!/");
		Collections.addAll(PARTS, path, "/", child.getAbsolutePath());
	}
		/**
	 * Unit test case for the addSubString method.
	 * @throws URISyntaxException
	 */
	@Test
	void testAddSubString() throws URISyntaxException {
		// Given
		JWBF.TITLE = "jwbf";
		String path = "/";
		// When
		String result = JWBF.addSubString(path, "/", "jwbf");
		// Then
		assertEquals(PARTS.merge(path, result.toCharArray()), PARTS.get("/jwbf"));
		assertEquals(parsePartId(JWBF.TITLE), JWBF.getPartId(JWBF.TITLE));
	}
		/**
	 * The test is only a stub to replace JWBF functionality.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Test public void testFile() throws IOException, URISyntaxException {
		// Given
		String fname = "/foo.jar/";
		String path = "/";
		// When
		Map<String,FileEntry> result =
				(Map<String,FileEntry>) searchMF(fname);
		// Then
		assertTrue(result.isEmpty());
		FileEntry entry = result.remove("/jwbf");
		assertNotNull(entry);
		assertTrue(result.isEmpty());
		assertEquals(fname, entry.getFile());
		assertEquals("/foo.jar!/", result.get(path).getPath());
		assertEquals(JWBF.TITLE, result.get(fname).getName());
		assertFalse(result.get("/jwbf").isDirectory());
		entry = result.get("/jwbf/");
		assertNotNull(entry);
		assertEquals(fname, entry.getFile());
		assertEquals("/foo.jar!/", entry.getPath());
	}
	@Test public void testJarDir() throws Exception {
		// Given
		String path = "/";
		String fname = "/foo.jar/";
		String content = "/";
		String mfpath = "/foo.jar!/";
		File f = new File("file:" + fname);
		System.out.println("f=" + f);

		// When
		File[] jpaths = searchMF(fname);
		System.out.println("Jpaths:" + jpaths.length);
		for (File jpath : jpaths) {
			System.out.println("-- Jpath:" + jpath.getAbsolutePath() + "--");
			assertTrue(jpath.getAbsolutePath().endsWith("/" + fname));
			FileEntry jentry = getJarEntry(jpath);
			// System.out.println(jentry.getJarFile().getURL().toString());
			assertTrue(f.getAbsolutePath().endsWith("/foo.jar!/"));
			assertTrue(jpath.getAbsolutePath().startsWith(mfpath));
			assertTrue(jentry.getFile().endsWith(content));
		}
	}
}
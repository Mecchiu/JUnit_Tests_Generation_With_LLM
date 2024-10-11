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

	static File getFile(String fileName) {
		return getFile(fileName, ".");
	}

	static File getFile(String fileName, String ext) {
		File f = new File(getClass().getResource(fileName).toString());
		if (!f.isAbsolute()) {
			f = new File(ClassLoader.getSystemClassLoader().getResource(fileName).toString() + ext);
		}
		return f;
	}
	
	// JWBF_1Test.java
	private final static HashMap<String, String> manifestMap = new HashMap();
	
	@Test
	void testGetVersion() {
		
		Class<?> clazz = GetClass.class;
		String libName = "libJwbf/1.1.1";
		int majorNum = 1; 
		int minorNum = 1;
		String version = getVersion(clazz);
		
		assertNotNull(version);
		assertEquals("1.1.1.2", version);
		if (version.endsWith("-1.0")) { // Version is "1.0.1.2-4"
			System.out.println(version);
		} else {
			System.out.println(version+" is not current version");
			assertFalse("current version", version.endsWith("-1.0"));
		}
		
	}
	
	@Test
	void testGetFile() {
		
		assertNull(getFile("file_does_not_exist"));
		assertEquals("Test file.", getFile("file"));
		assertEquals("Test file.ext", getFile("file.ext"));
		assertNotNull(getFile("JWBF.jar"));
		assertNotNull(getFile("libJwbf/JWBF.jar"));
	}

	@Test
	/**
	 * Test getFiles(String) method.
	 */
	public void testGetFiles() {
		
		final File parentDir = new File("/abc");
		assertEquals(1, parentDir.listFiles(new TestFileFilter("*.txt")).length);
		assertEquals(0, parentDir.listFiles(new TestFileFilter("*/*.txt")).length);
		assertEquals(2, parentDir.listFiles(new TestFileFilter("test/*.txt")).length);
		assertEquals(1, parentDir.listFiles(new TestFileFilter("test/test.txt")).length);
		
    }
	
	/**
	 * Test reading Manifest File.
	 */
	@Test
	public void testManifestFile() {
		
		String fileName;
		try {
			fileName = getFile("/abc.txt");
		} catch (IOException ignore) {
			fileName = "test.txt";
		}
		Manifest m = null;
		try {
			m = getManifest(fileName);
		} catch (IOException ignore) {
			m = null;
		}
		assertNotNull("Test ManifestFile not null", m);
		assertNotNull(m.getValue("Manifest-Version"));
		assertNotNull(m.getValue("Manifest-Title"));
		assertNotNull(m.getValue("Manifest-Name"));
		try {
			m.getValue("Manifest-Version");
			fail("Test error - Manifest should have a 'Version' attribute in manifest-mf file");
		} catch (IllegalArgumentException ignore) {}
		
	}
	
	final static FileFilter testFileFilter = new TestFileFilter("test*.txt");
	
	final static FileFilter testFileFilter2 = new TestFileFilter("test/*.txt");
	private final static FileFilter testFileFilter3 = new TestFileFilter("test/test.txt");
	private final static FileFilter testFileFilter4 = new TestFileFilter("test/test2.txt");
	private final static FileFilter testFileFilter5 = new TestFileFilter("test/Test1.txt");
	
	static File getFile(String fileName, String ext) {
		URL url = JWBF_0Test.class.getResource(fileName);
		return getFile(url, fileName, ext);
	}
	
	static File getFile(URL url, String fileName, String ext) {
			
		String path;
		try {
			path = url.toURI().toASCIIString();
		} catch (URISyntaxException ignore) {
			path = url.toString();
		}
		
		File subDir = null;
		try {
			subDir = File.createTempFile("/abc", ext);
		} catch (IOException ignore) {
			fail("Test error - File.createTempFile(...) is not supported by JBTM");
		}

		try {
			File out = File.createTempFile("/", "_"+path.replace('\\','/')+"." + (ext));
			out.deleteOnExit();
			
			JarOutputStream jarOutput = new JarOutputStream(out);
			JarEntry entry = new JarEntry(path+"."+ext);
			jarOutput.putNextEntry(entry);
			
			jarOutput.closeEntry();
			final Enumeration<JarEntry> classes = new Manifest().getEntries(path);
			if (classes.hasMoreElements()) {
				classes.nextElement().openProperties();
			} else {
				while (!classes.hasMoreElements()) {
					classes = getManifest().getEntries(path);
				}
			}
			while (classes.hasMoreElements()) {
				classes.nextElement();
				jarOutput.putNextEntry(classes.nextElement());
				jarOutput.closeEntry();
			}

			JarFile jarFile = new JarFile(subDir);
			Manifest manifest = jarFile.getManifest();
			File classFile = getClassFile(manifest);
			String name1 = fileName;
			String name2 = fileName;
			String name3 = fileName;
			Map<String,String> map2 = new HashMap<String,String>();
			map2.put("filename", name1);
			map2.put("mf", name1);
			map2.put("filename", name2);
			map2.put("mf", name2);
			map2.put("filename", name3);
			map2.put("mf", name3);
			manifest.putEntries("Manifest-Version", map2);
			jarFile.close();
			
		} catch (IOException e) {
			fail("failed to read " + fileName + ":\n" + e);
		}
		return subDir;
	}
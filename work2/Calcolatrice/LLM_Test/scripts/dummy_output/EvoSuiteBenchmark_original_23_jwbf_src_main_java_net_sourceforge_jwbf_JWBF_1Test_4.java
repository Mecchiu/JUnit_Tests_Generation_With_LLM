// JWBF_1Test.java
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
* It contains one unit test case for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_1Test {
		/**
		 * @param _file
		 *            a
		 * @return the part id of the given jar file.
		 * @throws IOException
		 *             if an error occurs while trying to read the manifest file.
		 */
	public static String getPartId(File _file) throws IOException {
		Manifest mf = null;
		try {
			if (_file.getName().endsWith(".jar")) {
				_file.getCanonicalFile().getParentFile().mkdirs();
				JarFile jf = new JarFile(_file);
				Enumeration e = jf.entries();
				e = Collections.enumeration(e);
				String key;
				while (e.hasMoreElements()) {
					KeyValue kv = (KeyValue) e.nextElement();
					key = kv.getKey();
					key = key.toLowerCase();
					if (key.equals("MANIFEST")) {
						Manifest m = Manifest.get(jf);
						m.define(key, mf.getMainAttributes().getValue(key));
					}
				}
				Manifest man = Manifest.get(jf);
				String name = jf.getManifest().getMainAttributes().getValue("name");
				mf = man.getMainAttributes().getValue(name);
			}
		} catch (IOException e) {
			e.printStackTrace();
			errorInfo = true;
		}
		assertNotNull(mf);
		Map<String, String> map = getParams(mf);
		return map.get("PART");
	}

	private final static Class<?>[] jwbf_class_array = new Class<?>[] { JWBF.class };
	private final static String[] jwbf_full_class_array = new String[] {
			"net.sourceforge.jwbf.JWBF"
	};
	
	private static Map<String, String> readManFile(String path) throws IOException; 
	
	private static Map<String, String> findManFile(String path) throws IOException;
	private static HashMap<String, String> getParams(Manifest manifest) throws IOException {
		HashMap<String, String> params = manifest.getMainAttributes();
		return params;
	}

	@Test
	void getPartIdTest() throws IOException {
		System.setProperty("JWBF_PATH", "E:\\jwbf.jar"); // set a path so that there's jwbf.jar in it.
		assertTrue(new File("E:\\jwbf.jar").exists());
		assertTrue(new File("E:\\jwbf.jar").isFile());
		assertTrue(new File("E:jwbf-1.0.jar").isFile());
//		String mfPath = "E:\\jwbf.jar";
		String mfPath = "E:\\jwbf.jar";
		try {
			assertTrue(new File(mfPath).isFile());
		} catch (FileNotFoundException e) {
			assertFalse(e.getMessage(), true);
		}
		assertFalse(errorInfo);

		Map<String, String> params = readManFile(mfPath);
		assertTrue(params.size() > 0);
		assertNotNull(getPartInfo(JWBF.class));
	}

	@Test
	void findManFileReturnsTheCorrectFile() throws IOException {
		try {
			System.setProperty("JWBF_PATH", "E:\\jwbf.jar"); // set a path so that there's jwbf.jar in it.
			assertTrue(new File("E:\\jwbf.jar").exists());
			// assertTrue(new File("E:\\jwbf.jar").isFile());
			assertTrue(new File("E:\\jwbf.jar").isFile());
			String content = FileUtils.readFileToString(new File("E:\\jwbf.jar")).toLowerCase();
			content += "content";
			assertEquals("jwbf.jar", content);
//			assertTrue(new File("E:jwbf-1.0.jar").isFile());
			assertEquals(mfPath, new File("E:\\jwbf.jar"));
		} finally {
			System.setProperty("JWBF_PATH", "E:\\"); // set a path since all jar files are in E:
			assertFalse(new File("E:\\jwbf.jar").exists());
		}
	}

	static void setUp() throws Exception {
		errorInfo = false;
		assertTrue(new File("E:\\jwbf.jar").exists());
}
}
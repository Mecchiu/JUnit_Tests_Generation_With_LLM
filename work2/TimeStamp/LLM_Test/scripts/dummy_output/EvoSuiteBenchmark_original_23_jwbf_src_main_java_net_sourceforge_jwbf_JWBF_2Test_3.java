// JWBF_2Test.java
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
* It contains one unit test case for the {@link JWBF#getVersion()} method.
*/
class JWBF_2Test {
		
    /**
     * @return the part id as a {@link String}
     */
    @Test
    public void part_Id() {
		
		{
			Map<String, String> m = new HashMap<String, String>();
			m.put("jwbf", "1.0");
			String part_id = JWBF.getVersion(JWBF.class);
			assertEquals(m, part_id);
		}
		{
			Map<String, String> m = new HashMap<String, String>();
			m.put("jwbf.", "1.0");
			String part_id = JWBF.getVersion(JWBF.class);
			assertEquals(m, part_id);
		}
		{
			Map<String, String> m = new HashMap<String, String>();
			m.put("jwbf.jwbf", "2.0.0");
			String part_id = JWBF.getVersion(JWBF.class);
			assertEquals(m, part_id);
		}
		{
			Map<String, String> m = new HashMap<String, String>();
			m.put("jwbf,jwbf.jwbf", "2.0.0");
			String part_id = JWBF.getVersion(JWBF.class);
			assertEquals(m, part_id);
		}
		{
			Map<String, String> m = new HashMap<String, String>();
			m.put("jwbf", "2.0.0");
			String part_id = JWBF.getVersion(JWBF.class);
			assertNotEquals(m, part_id);
			
		}
	}

	/**
     * Test of getVersion method, of class JWBF.
     */
	@Test
	public void test_getVersion() throws IOException {
		
		String jar_path = "d:/jwbf_2test_jwbf/";

		File directory_a = new File(jar_path + "a/");
		try (JarFile jar = new JarFile(directory_a)) {

			try (Enumeration<? extends ZipEntry> enumeration = jar.entries()) {

				int count = enumeration.nextElement();

				File file_name = null;
				do {
					JarEntry jar_entry = enumeration.nextElement();

					if (jar_entry.getName().equalsIgnoreCase(".class")) {
						try (ZipEntry z_jar_entry = new ZipEntry(jar_path + jar_entry.getName())) {
							z_jar_entry.setUnixMode(
									0);
							jar.closeEntry();
							createVersion(jarEntry);
							break;
						}
					}
				} while (count++ < 5);
				
				file_name = jarEntry.getName();

				JarEntry jar_entry = jar.getJarEntry(jar_path + (jar_entry.isDirectory()? "/" : file_name));
				assertNotNull(jar_entry);

				String version = JWBF.getVersion(jarEntry.getName());
				assertEquals(jarEntry.toString(), version);

			}
			catch (IOException e) {
				throw e;
			}
			catch (URISyntaxException e) {
				throw new IllegalArgumentException("url error", e);
			}

		}
	}

	/**
	 * Creates the JWBF version by reading from a file.
	 * 
	 * @param fileName
	 *            the name of the file to read
	 */
	private static void createVersion(File file) {
		String jar_path = "d:/jwbf_2test_jwbf/";

		File directory_a = new File(jar_path + "a/");
}
}
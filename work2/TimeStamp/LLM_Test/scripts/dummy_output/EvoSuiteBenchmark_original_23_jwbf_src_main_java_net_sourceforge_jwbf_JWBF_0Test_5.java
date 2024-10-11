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
		* @throws IOException
		*/
		@Test
		public void getVersion() throws IOException {
			assertEquals("1.0", JWBF.getVersion(JWBF_0Test.class));
			File dataFile = new File("src/test/resources/test_resources/tests.MF");
			assertEquals(new File("src/test/resources/test_resources/tests.MF"), dataFile.getCanonicalFile());
			assertTrue(dataFile.exists());
			assertEquals(1, JWBF.getVersion(JWBF_0Test_class));
		}
		
		/**
		* @throws IOException
		*/
		@Test
		public void getVersion_test1() throws IOException {
			assertEquals(new File("src/test/resources/test_resources/tests.MF"), findFile("src/test/resources/test_resources/test1test.MF"));
			assertEquals(new File("src/test/resources/test_resources/tests.MF"), findFile("src/test/resources/test_resources/test-1.MF"));
			assertEquals(new File("src/test/resources/test_resources/tests.MF"), findFile("src/test/resources/test_resources/test-1.MF"));
			try { Thread.sleep(2000); } catch(Exception x) {}
			assertEquals("1.1", JWBF.getVersion(JWBF_0Test_class));
			assertEquals("1.1", readMFVersion(new File("src/test/resources/test_resources/tests.MF")));		
		}

		private File findFile(String file) throws IOException {
			File root = null;
			Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(file);
			while(urls.hasMoreElements()) {
				URL url = urls.nextElement();
				if(url.toURI().toString().contains(jarFileIndex)) {		
			        root = new File(url.toURI().toString().split("!")[0]);
			    }
			}
			return root;
		}

		/**
		* @throws IOException
		*/
		@Test
		public void getVersion_test2() throws IOException {
			File root = new File("src/test/resources/test_resources/test2");
			assertEquals(new File("src/test/resources/test_resources/test2"),root.getCanonicalFile());
			assertEqual(new File("src/test/resources/test_resources/test2"),root.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					return file.isDirectory();
				}
			}));
			assertNotNull(root.getParentFile());
			assertEquals("1.2", JWBF.getVersion(JWBF_0Test_class));
			assertFalse(root.exists());
		}

		/**
		* @throws IOException
		*/
		@Test
		public void getVersion_test3() throws IOException {
			File dataFile = new File("src/test/resources/test_resources/tests.MF");
			assertEquals(new File("src/test/resources/test_resources/tests.MF"), dataFile.getCanonicalFile());
			File toReturn = new File("src/test/resources/test_resources/test3test.MF");
			assertFalse(toReturn.exists());
			assertFalse(dataFile.exists());
			assertEquals(toReturn.toURI().toString().split("!")[0], toReturn.getCanonicalPath());
			assertTrue(toReturn.mkdir());
			assertFalse(dataFile.delete());
			assertTrue(toReturn.createNewFile());
			assertFalse(dataFile.delete());
			assertTrue(toReturn.delete());
		}
}
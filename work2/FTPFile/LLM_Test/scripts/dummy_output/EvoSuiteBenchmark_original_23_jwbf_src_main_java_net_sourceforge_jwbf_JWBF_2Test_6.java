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
		 * @throws FileNotFoundException
		 *             if the JVM has not been tested yet
		 */
		@Test
		void test() throws FileNotFoundException {
			File jarFile = new File(System.getProperty("java.io.tmpdir"), getFileName());

			/*
			 * Create a jar.
			 */
			URL url = JWBF_.class.getResource("/" + getFileName() + "_2.jar");
			JarFile jarFileTest = new JarFile(jarFile);

			/*
			 * Check the manifest is present.
			 */
			Manifest manifestTest = jarFileTest.getManifest();
			assertNotNull(manifestTest);
			Enumeration eManifest = manifestTest.getEntries();
			assertNotNull(eManifest);
			while (eManifest.hasMoreElements()) {
				Manifest.Entry entryTest = (Manifest.Entry) eManifest.nextElement();
				String nameTest = entryTest.getName();
				assertNotNull(nameTest);
				String pathTest = nameTest.substring(jarFileIndex.length());
				if (pathTest.startsWith(getFileName())) {
					assertEquals(
							getFileName(),
							pathTest,
							getFileName()
					);
				}
			}
			JarEntry jarEntry = jarFileTest.getJarEntry(getFileName());
			Manifest manifestTest1 = jarFileTest.getManifest();
			assertNotNull(manifestTest1);
			Manifest manifestTest2 = Manifest.getInstance(jarFileTest.getInputStream());
			assertNotNull(manifestTest2);
			Enumeration eManifest1 = manifestTest1.getEntries();
			assertNotNull(eManifest1);
			while (eManifest1.hasMoreElements()) {
				Manifest.Entry entryTest1 = (Manifest.Entry) eManifest1.nextElement();
				String nameTest1 = entryTest1.getName();
				String pathTest1 = nameTest1.substring(
						(jarEntry!= null)? jarEntry.getName().length() : 0
				);
				if (pathTest1.startsWith(getFileName())
						&& (jarEntry == null)
				) {
					Manifest manifestTest2 = Manifest.getInstance(jarFileTest.getInputStream());
					assertNotNull(manifestTest2);

					Enumeration eManifest2 = manifestTest2.getEntries();
					assertNotNull(eManifest2);
					while (eManifest2.hasMoreElements()) {
						Manifest.Entry entryTest2 = (Manifest.Entry) eManifest2.nextElement();
						String nameTest2 = entryTest2.getName();
						String pathTest2 = pathTest1 + getFileName()
						+ getSeparatorChar() + nameTest2;
						assertTrue(
								"Found manifest entry, key " + pathTest2
								+ ", should be true",
								entryTest2.isEntryOf(
										Manifest.Entry.Kind.JAVA_MANIFEST_VERSION, manifestTest2
								)
						);
					}
				}
			}
		}
		/**
		 * @param path
		 * @return
		 */
		public static String getFileName() {
			return "/" + (version.length() > 0? version : "");
		}
		/**
		 * @param path
		 * @return
		 */
		private static String getFileName(String path) {
			String pathString = path.endsWith(separatorChar)? path : path + separatorChar;
			int startIndex = getPartId(pathString).length();
			for ( ; ; ) {
				String name = path.substring(startIndex);
				if (name.startsWith("/"))
					return name;

				startIndex = path.lastIndexOf("/");
			}
		}
}
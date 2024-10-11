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
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_0Test {

		private static final Map<String, String> PARTS = new HashMap<String, String>();
		
		private static String version = "";
		
		private static String title = "";
		
		private static Manifest manifest = null;
		
		private static final char separatorChar = '/';
		
		private static boolean errorInfo = true;
		
		static {
			init(JWBF.class);
			/*
			String[] cp = System.getProperty("java.class.path").split(":");
			for (int i = 0; i < cp.length; i++) {
				try {
					
					if (cp[i].endsWith(".jar") && cp[i].contains("jwbf")) {
						registerModule(readArtifactId("file:" + cp[i]),
								readVersion("file:" + cp[i]));
						
					} else if (cp[i].contains("jwbf")) {
						registerModule(readArtifactId("file:" + cp[i]),
								readVersion("file:" + cp[i]));
					}
				} catch (Exception e) {
					System.err.println(cp[i] + " seems to be no regular module");
				}
				
			}
			*/
		}
		
		private static final String jarFileIndex = "jar:file:";
		
		private static void init(Class<?> clazz) {
			PARTS.clear();
			version = "";
			title = "";
			manifest = null;
			String packagename = clazz.getPackage().getName().replace('.', separatorChar);
			URL url = clazz.getClassLoader().getResource(packagename);
			boolean isJar = url.toExternalForm().toLowerCase().contains(jarFileIndex);
			if (isJar) {
				try {
					int jarEnd = url.toExternalForm().indexOf("!" + separatorChar);
					String jarFileName = url.toExternalForm().substring(jarFileIndex.length(), jarEnd);
					JarFile jar = new JarFile(jarFileName);
					Enumeration<JarEntry> je = jar.entries();
					while (je.hasMoreElements()) {
						JarEntry jarEntry = je.nextElement();
						String slashCount = jarEntry.getName().replaceAll("[a-zA-Z0-9]", "");
						if (jarEntry.isDirectory() && jarEntry.getName().contains(packagename) && slashCount.length() == 4) {
							registerModule(readMFProductTitle(jarFileName) + "-" + jarEntry.getName().split(separatorChar + "")[3], readMFVersion(jarFileName));
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					File root = new File(url.toURI());
					File[] dirs = root.listFiles(new FileFilter() {
						
						public boolean accept(File f) {
							return f.isDirectory();
						}
					});
					for (File dir : dirs) {
						int lastIndex = dir.toString().lastIndexOf(separatorChar) + 1;
						String partTitle = dir.toString().substring(lastIndex, dir.toString().length());
						registerModule(readMFProductTitle(root + "") + "-" + partTitle, readMFVersion(root + ""));
					}
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/**
		*/
		private JWBF_0Test() {
			// do nothing
		}
		
		/**
		* @param artifactId
		*            a
		* @param version
		*            a
		*/
		private static void registerModule(String artifactId, String version) {
			PARTS.put(artifactId, version);
		}
		
		/**
		* @param clazz
		*            a class of the module
		* @return the version
		*/
		public static String getVersion(Class<?> clazz) {
			try {
				return getPartInfo(clazz)[1];
			} catch (Exception e) {
				return "Version Unknown";
			}
		}
		
		/**
		* @param clazz
		*            a class of the module
		* @return the version
		*/
		public static String getPartId(Class<?> clazz) {
			try {
				return getPartInfo(clazz)[0];
			} catch (Exception e) {
				return "No Module for " + clazz.getName();
			}
		}
		
		private static String[] getPartInfo(Class<?> clazz) {
			String classContainer = clazz.getPackage().getName().split("\\.")[3];
			Iterable<String> keys = PARTS.keySet();
			for (String key : keys) {
				if (key.contains(classContainer)) {
					String[] result = { key, PARTS.get(key) };
					return result;
				}
			}
			return null;
		}
		
		/**
		* Prints the JWBF Version.
		*/
		public static void printVersion() {
			System.out.println(PARTS);
		}
		
		public static void main(String[] args) {
			printVersion();
		}
		
		/**
		* @return the JWBF Version.
		*/
		public static Map<String, String> getVersion() {
			return Collections.unmodifiableMap(PARTS);
		}
		
		/**
		* @param path
		*            a
		* @return the version from manifest
		* @throws IOException
		*             if path invalid
		*/
		private static String readMFVersion(String path) throws IOException {
			if (version.length() < 1) {
				String implementationVersion = null;
				implementationVersion = readFromManifest(path, "Implementation-Version");
				if (implementationVersion == null) {
					version = "DEVEL";
				} else {
					version = implementationVersion;
				}
			}
			return version;
		}
		
		/**
		* @param path
		*            a
		* @return the
		* @throws IOException
		*             if path invalid
		*/
		private static String readMFProductTitle(String path) throws IOException {
			if (title.length() < 1) {
				String implementationTitle = null;
				implementationTitle = readFromManifest(path, "Implementation-Title");
				if (implementationTitle == null) {
					title = "jwbf-generic";
				} else {
					title = implementationTitle;
				}
			}
			return title;
		}
		
		/**
		* @param path
		*            a
		* @param key
		*            a
		* @return value
		* @throws IOException
		*             if path invalid
		*/
		private static String readFromManifest(String path, String key) throws IOException {
			if (manifest == null) {
				URL manifestUrl;
				if (path.endsWith(".jar")) {
					manifestUrl = new URL("jar:file:" + path + "!/META-INF/MANIFEST.MF");
				} else {
					if (!path.endsWith(File.separator))
						path += File.separatorChar;
					manifestUrl = searchMF(path);
				}
				if (manifestUrl != null)
					manifest = new Manifest(manifestUrl.openStream());
			}
			if (manifest == null) {
				if (errorInfo) {
					errorInfo = false;
					String msg = "E: no MANIFEST.MF found, please create it.";
					System.err.println(msg);
				}
				return null;
			}
			return manifest.getMainAttributes().getValue(key);
		}
		
		private static URL searchMF(String f) throws IOException {
			if (f == null)
				return null;
			File fi = new File(f);
			String foundE = "target" + File.separatorChar + "MANIFEST.MF";
			if (new File(fi, foundE).exists()) {
				return new URL("file:" + fi + File.separatorChar + foundE);
			} else {
				return searchMF(fi.getParent());
			}
		}
		
		@Test
		void testGetVersion() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF.class));
		}
		
		@Test
		void testGetPartId() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF.class));
		}
		
		@Test
		void testGetVersion_1() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_0Test.class));
		}
		
		@Test
		void testGetPartId_1() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_0Test.class));
		}
		
		@Test
		void testGetVersion_2() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_1Test.class));
		}
		
		@Test
		void testGetPartId_2() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_1Test.class));
		}
		
		@Test
		void testGetVersion_3() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_2Test.class));
		}
		
		@Test
		void testGetPartId_3() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_2Test.class));
		}
		
		@Test
		void testGetVersion_4() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_3Test.class));
		}
		
		@Test
		void testGetPartId_4() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_3Test.class));
		}
		
		@Test
		void testGetVersion_5() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_4Test.class));
		}
		
		@Test
		void testGetPartId_5() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_4Test.class));
		}
		
		@Test
		void testGetVersion_6() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_5Test.class));
		}
		
		@Test
		void testGetPartId_6() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_5Test.class));
		}
		
		@Test
		void testGetVersion_7() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_6Test.class));
		}
		
		@Test
		void testGetPartId_7() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_6Test.class));
		}
		
		@Test
		void testGetVersion_8() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_7Test.class));
		}
		
		@Test
		void testGetPartId_8() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_7Test.class));
		}
		
		@Test
		void testGetVersion_9() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_8Test.class));
		}
		
		@Test
		void testGetPartId_9() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_8Test.class));
		}
		
		@Test
		void testGetVersion_10() {
			assertEquals("0.0.1-SNAPSHOT", JWBF.getVersion(JWBF_9Test.class));
		}
		
		@Test
		void testGetPartId_10() {
			assertEquals("jwbf-core-0.0.1-SNAPSHOT", JWBF.getPartId(JWBF_9Test.class));
		}
		
		@Test
		void testGetVersion_11() {
			assertEquals("0.0.1-SN
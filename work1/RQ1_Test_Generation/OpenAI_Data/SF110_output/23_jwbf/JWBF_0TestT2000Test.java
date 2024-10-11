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
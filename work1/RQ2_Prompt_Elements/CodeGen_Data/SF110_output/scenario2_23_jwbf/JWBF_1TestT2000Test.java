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
		* Main method.
		* It runs the tests at {@link #run()} and checks if the execution of all tests is successful.<br>
		* It prints the test result to Stderr and also the class and the actual version.
		* @throws java.io.IOException thrown if something goes wrong with the JWBF
		*/
		@Test
		public void run() throws Exception {
			ClassLoader classPathClassLoader = new ClassPathClassLoader(classpath);
			JWBF.runJar(classPathClassLoader, "net.sourceforge.jwbf", getClass().getName(), "net.sourceforge.jwbf.JWBF.java");
		}

//	@Test
	public void runJar(ClassLoader classPathClassLoader, String moduleName, String moduleVersion, String jarName) throws Exception {
		Map<String, Object> parameters = new HashMap<String, Object>();
		// Get the module Manifest
		Manifest manifest = getManifest(moduleName);
		// Get the module Version
		String moduleVersionString = manifest.getMainAttributes().getValue("Module-Version");
		assertNotNull("Could not get Module-Version for Module " + moduleName, moduleVersionString);
		// Find the Module jar name
		String jarFileName = null;
		File manifestFile = newFile(manifest, jarName);
		try {
			jarFileName = manifestFile.getName();
			JarFile jarFile = new JarFile(manifestFile);
			for (Enumeration<JarEntry> entries = jarFile.entries(); entries.hasMoreElements(); ) {
				JarEntry jarEntry = entries.nextElement();
				String entryName = jarEntry.getName();
				if (entryName.equals(jarName)) {
					File jarEntryFile = newFile(jarFile,
							jarEntryName = jarEntry.getName());
					JarEntry jarEntryJar = new JarEntry(jarEntryName);
					manifestFile.copy(jarEntryFile, jarEntryJar);
					while (jarEntryJar.getName().startsWith("META-INF")) {
						jarEntryJar = jarEntryJar.next;
					}
					if (jarEntryJar.getName().endsWith(MANIFEST_EXTENSION)) {
						File jarEntryFile2 = newFile(
								jarFile,
								jarEntryJar.getName()
								+ VERSION_JAR_SUFFIX);
						manifestFile.copy(jarEntryFile2, jarEntryFile);
						jarFile = new JarFile(jarEntryFile2);
						JarEntry jarEntryJarFile = jarEntryJar.getNextJarEntry();
						entries = jarEntryJar.entries();
						while (entries.hasMoreElements()) {
							JarEntry jarEntry = entries.nextElement();
							if (jarEntryJar.getName().endsWith(jarEntry.getName())) {
								File jarEntryFile2 = newFile(jarFile,
										jarEntryName = jarEntry.getName());
								jarFile.getInputStream(jarEntryFile2);
								jarEntryJarFile = jarEntry;
								entries = jarEntry.entries();
							} else {
								entries = null;
							}
						}
					} else {
						entries = null;
					}
					// Create the new JarEntry with the correct name and file
					jarFile.addJarEntry(jarEntry);
				}
			}
		} finally {
			jarFile = null;
			manifestFile.delete();
		}
		// check part id
		assertNotNull("Couldn't get the part-id", getPartId(moduleName));
		assertNotNull("Couldn't find the manifest", manifest);
		assertTrue("could not get the jar files", jarFile!= null);
		// Find the part jar and read all the information from it
		JarEntry manifestEntry = manifest.getEntries().nextElement();
		File manifestFile2 = newFile(jarFile, manifestEntry.getName());
		JarFile jarFile2 = null;
		try {
			jarFile2 = new JarFile(manifestFile2, false);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			Manifest manifest2 = new Manifest(baos);
			if (manifest2!= null) {
				manifest = manifest2;
				JarEntry jarEntryEntry = manifestEntry.getNextEntry();
				jarFile2 = jarFile2.getJarEntry(jarEntryName = jarEntryEntry.getName());
				assertNotNull("Couldn't get the manifest", manifest2);
				assertNotNull("Couldn't get the jar files", jarFile2);
				Manifest manifest2Manifest = jarFile2.getManifest();
				manifest = manifest2Manifest;
			}
		} catch (IOException e) {
			Assertions.fail(e.getMessage(), Enumeration.class, "getManifest", Manifest.class);
		}
		while (jarFile2.entries().hasMoreElements()) {
			JarEntry jarEntry = jarFile2.getEntry(jarEntryName = jarEntry.getName());
			if (jarFile2.getName().endsWith(manifestEntry.getName() + VERSION_JAR_SUFFIX)) {
				File jarEntryFile = newFile(jarFile, "jarEntry.jar");
				zipFile(jarEntryFile, jarEntryFile2);
			}
		}
		// The part id, test class and the actual version
		parameters.put("Part-Id", getPartId(moduleName));
		parameters.put("Class", manifest.getMainAttributes().getValue("Manifest-Version"));
		parameters.put("Actual-Version", moduleVersion);
		parameters.put("Test-Class", moduleName.replace(".", "/"));
		parameters.put("Test-Version", "Test class");

		// Test with the jar and the manifest.
		Parameters parametersJar = new Parameters(System.getProperty("test.dir", null), manifest);
		parametersJar.putAll(parameters);
		if (jarFile!= null) {
			parameters.put("Jar-File", jarFileName);
			parameters.put("Manifest", manifestJarName);
		}
		parameters.put("Parameters", parametersJar);
		parameters.putAll(parametersUrl);
		System.setProperty("test.dir", "/tmp/jwbf");
		// Test with jar and the manifest without url parameters
		parameters.put("Manifest", jarFile2Name);
		parametersJar.putAll(parameters);
		parameters.put("Parameters", parametersJar);
		JWBF.run(classPathClassLoader, params, jarFile2, manifestFile2, manifest.getMain
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
		 * This method contains one unit test case for the {@link JWBF#getVersion(Class)} method.
		 * It reads a JAR file and finds the {@link JarEntry} {@code "META-INF/MANIFEST.MF"}
		 * in the path {@code /META-INF} (in this case, the manifest file as well).
		 */
	public static void testGetVersion() {
		String jarFilePath  = "/META-INF/MANIFEST.MF";
		String expectedMvf     = "JAVA-BETA-2_0";

		try {
			File jarFile = new File(jarFilePath);

			File jarFileMfp = manifest.getJarFile(jarFile);

			if (jarFileMfp == null)  return;

			byte[] manifestBytes = Utils.readStream(jarFileMfp);

			Manifest manifestMf = new Manifest(manifestBytes);
			String manifestMFText = manifestMf.getMainAttributes().getValue(
			                                                       Manifest.MANIFEST_NAME);
			assertNotNull("The manifest file has to contain the value", manifestMFText);
			assertEquals("The manifest file has to contain one manifest line with version name",
					expectedMvf,
					manifestMFText);

			String[] versionLines = manifestMFText.split("\n");
			String[] version = versionLines[0].split("/");
			if (versionLines.length > 1) {
				return;
			}

			Object[] parts = version[0].split("/");
			if (parts.length == 1) {
				return;
			}
			assertEquals("The version line",
			             getPartId(getClass()),
			             parts[0]);

		}catch (IOException ioe) {
			errorInfo = false;
			System.out.println("No Manifest file found on : " + jarFilePath);
			assertTrue("The Manifest file has been successfully read", ioe instanceof IOException);
			throw ioe;
		}
	}

	/**
	 * This method contains one unit test case for the {@link JWBF#readMFVersion(String)} method.
	 * It finds the Manifest Manifest Entry {@code "META-INF/MANIFEST.MF"}
	 * in the path {@code /META-INF} (in this case, the manifest file as well).
	 * The method has two cases: version is
	 *         null
	 *         ==> JAVA_2_0
	 */
	public static void testReadMFVersion() {
		String manifestMFId = "/META-INF/MANIFEST.MF";
		String manifestMFPath = manifestMFId + separatorChar + "VERSION";
		if (!readMFVersion(manifestMFId).equals(version)) {
			assertTrue("The manifest file has not been read correctly", readMFVersion(manifestMFId) == manifestMFText);
		}
	}

	/**
	 * This method contains one unit test case for the
	 * {@link JWBF#readMFProductTitle(String)} method.
	 * It finds the Manifest ManifestEntry {@code "META-INF/MANIFEST.MF"}
	 * in the path {@code /META-INF} (in this case, the manifest file as well).
	 * The method has two cases: version is
	 *         null
	 *         ==> JAVA_2_0
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public static void testReadMFProductTitle() throws IOException, URISyntaxException {

		String manifestMFId = "/META-INF/MANIFEST.MF";
		String manifestMFPath = manifestMFId + separatorChar + "MANIFEST.MF";
		// It finds the Manifest ManifestEntry {@code "META-INF/MANIFEST.MF"}
		// in the path {@code /META-INF} (in this case, the manifest file as well).
		// The method has two cases: version is
		//         null
		//         ==> JAVA_2_0
		if (!readMFProductTitle("JAR", manifestMFId).equals(getMFProductTitle())) {
			assertTrue("The manifest file has not been read correctly",
			             readMFProductTitle("JAR", manifestMFId) == getMFText("JAR"));
		}
	}

	private static String getMFText(String jarFileName) {
		JarFile jarFile = new JarFile(jarFileName);
}
}
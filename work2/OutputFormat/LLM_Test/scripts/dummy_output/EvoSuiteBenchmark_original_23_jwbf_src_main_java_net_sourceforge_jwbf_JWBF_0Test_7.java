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
		
	// Private constructor prevents instantiating this class for the various test cases.

	private JWBF_0Test() {
		
	}

	private static final char separatorChar = '/';

	/**
     * @return the version from manifest
     * @throws IOException
     * @throws URISyntaxException
     */
	private String readMFVersion(String filePath) throws IOException, URISyntaxException {
		
		File jarFile = new File(filePath);
		String extractedFilePath = jarFile.getAbsolutePath();

		ExtractingMFProduct extractingMF = new ExtractingMFProduct(jarFile.getAbsolutePath());
		Manifest extractedManifest = extractingMF.extractManifest();
		
		return extractedManifest.getMainAttributes().getValue(KEY_MF_VERSION.getKey());
	}

	/**
     * @param filePath a
     *            a
     * @return the version from manifest
     * @throws FileNotFoundException
     * @throws IOException
     * @throws URISyntaxException
     */
	private String readMFProductTitle(String filePath) throws FileNotFoundException, IOException, URISyntaxException {
		
		File jarFile = new File(filePath);

		ExtractingMFProduct extractingMF = new ExtractingMFProduct(jarFile.getAbsolutePath());
		Manifest extractedManifest = extractingMF.extractManifest();
		String extractedFilePath = extractedManifest.getMainAttributes().getValue(KEY_MF_FILE.getKey());
		
		return extractedFilePath.substring(0, extractedFilePath.indexOf('!'));
	}

	/**
	 * @return get version from manifest
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private Map<String, String> getPartInfo(Manifest manifest) throws IOException, URISyntaxException {

		final String version = manifest.getMainAttributes().getValue(KEY_MF_VERSION.getKey());

		@SuppressWarnings("unchecked")
		final Map<String, String> map = (Map<String, String>) manifest.getMainAttributes().getValue(KEY_MF_ARTIFACT.getKey());

		@SuppressWarnings("unchecked")
		final Map<String, String> list = (Map<String, String>) manifest.getMainAttributes().getValue(KEY_MF_REVISION.getKey());
		// list is only used for testing!

		return map;

	}

	/**
     * @param filePath
     *            a
     * @return the
     * @throws URISyntaxException
     * @throws IOException
     */
	private URL getMFManifestURL(String path) throws IOException, URISyntaxException {
		
		File f = new File(path);
		// JWBF_0Test.java:getMFManifestURL
		return f.toURI().toURL();
	}

	/**
     * Main test method.
     * @throws Exception
     * @throws IOException
     */
	@Test
	public void testMF() throws Exception {

		assertNotNull(getMFManifest());
		assertNotNull(getMFManifest().getURL());
	}

	/**
     * Main test method.
     * @throws FileNotFoundException
     * @throws IOException
     * @throws URISyntaxException
     */
	@Test
	public void testMFFile() throws Exception {

		// JWBF_0Test.java:testMFFile
		// this method works only for the jwbf manifest
	}

	/**
     * @param path
     *            a
     * @param key
     * @param file
     *            a file to save the mf part
     * @throws IOException
     */
	private void testMDFFile(String path, String key, File file) throws IOException {

		try {
			FileOutputStream fos = new FileOutputStream(new File(file.getAbsolutePath()));

			Manifest mf = new Manifest();

			mf.getMainAttributes().putValue(KEY_MF_URL.getKey(), getMFManifestURL(path));
			mf.getMainAttributes().putValue(KEY_MF_VERSION.getKey(), getMFVersion(path));
			fos.write(mf.getMainBytes());

			fos.close();

		} finally {

            File manifestFile = new File(path + "/manifest.mf");
            if(manifestFile.exists()) {
                manifestFile.delete();
            }

		}

		// JWBF_0Test.java:testMDFFile
		// this method works only for the manifest file
}
}
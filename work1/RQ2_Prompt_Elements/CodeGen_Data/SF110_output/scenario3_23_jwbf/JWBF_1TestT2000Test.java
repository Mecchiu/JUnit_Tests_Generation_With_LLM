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
	 * Test method for {@link JWBF#getPartId(Class)}.
	 */
	@Test
	void getPartId1() {
		// get class-path, get directory-containing-entry-and remove first element in directory
		File dir = new File("jwbf-1/classes/net/sourceforge.net.jwbf");
		JavaArchive jar = (JavaArchive) new File(dir,"jwbf-1/jwbf1.jar");
		String expected1 = "net.sourceforge";
		File actual1 = JWBF.getPartId(jar.getManifest().getMainAttributes().getValue("Class-Path"))[0];
		assertEquals("jwbf-1's path was incorrect",expected1,actual1);
	}
	
	/**
	 * Test method for {@link JWBF#getPartId(Class)}.
	 */
	@Test
	void getPartId2() {
		// get class-path, get directory-containing-entry-and remove first element in entry
		File dir = new File("jwbf-2/classes/net/sourceforge.net.jwbf");
		String path[] = dir.list(new FileFilter() {

				@Override
				public boolean accept(File path) {
					if(path.isDirectory())
						return true;
					return path.getName().endsWith(".jar");
				}
				
			});
		JarFile jar = null;
		try {
			jar = new JarFile(new File(dir,"jwbf-2/jwbf2.jar"));
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		assertFalse(jar.isDirectory(), "Directory must be empty");
		String expected2 = "jwbf-2's path was incorrect";
		String actual2 = this.getPartId(jar.getManifest().getMainAttributes().getValue("Class-Path"))[0];
		assertTrue("jwbf-2's path was not detected as a valid jar URL", actual2.startsWith(expected2));
	}


}



// Class with class-path entries under "jwbf/classes" directory

class JavaArchiveWithClasspath {
	
	private Manifest manifest = null;
	
	public Manifest getManifest() {
		if(manifest==null) {
			File dir = new File("jwbf/classes");
			if(dir.exists()) {
				Manifest manifest1 = new Manifest();
				try {
					manifest1.readResource("META-INF/MANIFEST.MF");
					manifest = manifest1;
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			else {
				System.err.println("No jwbf/classes file found");
			}
		}
		return manifest;
	}

	
	
	
 
	
}



// Test class of {@link Manifest}

class ManifestTest {
	
	
	
	public static final String mainAttributes[] = new String[] { "Filename", "Start-Class", "Start",
			"End", "Package", "Version" };
	public static final String fileAttributes[] = new String[] {"Filename", "Manifest-Version", "Class-path"};

	
	public static final String packageAttributes[] = new String[] {"Package", "Version"};
	Manifest manifest = null;

	@Test
	void javaManifest() {

		File dir = new File(getClass().getClassLoader().getResource("jwbf.properties").getFile());
		assertTrue("Manifest file does not exist", dir.exists());
		assertTrue("Manifest file is incorrect", dir.isFile());

		Manifest actual = new Manifest();
		actual.read(new FileInputStream(dir));
		assertTrue("Manifest file is incorrect", actual!= null && "META-INF/MANIFEST.MF was not found".equals(actual.getMainAttributes().getValue(MainAttributes.MANIFEST_ATTRIBUTE_NAME.toString())));
		
	}
	
	@Test
	public void getUrlWithClasspath() throws IOException, URISyntaxException, ReflectiveOperationException, ClassNotFoundException, SecurityException {
		File jarFile = new File("jwbf.jar");
		JarFile zipFile = new JarFile(jarFile);
		URL url = zipFile.getJarEntry("META-INF/MANIFEST.MF");
		assertNotNull("META-INF/MANIFEST.MF was not parsed properly",url);
	}
	
	private static ManifestTest INSTANCE = null;
	public synchronized static ManifestTest getInstance() {
		if (INSTANCE == null) {
			synchronized(ManifestTest.class) {
				if (INSTANCE == null) {
					INSTANCE = new ManifestTest();
				}
			}
		}
		return INSTANCE;
	}
	
	private ManifestTest() {
		try {
			Manifest m = createManifest();
			System.err.println(m.toString());
			assertTrue(m.getMainAttributes().length == 3);
		} catch (IOException | ReflectiveOperationException | ClassNotFoundException | SecurityException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}	
		
	private Manifest createManifest()
		throws IOException, ClassNotFoundException, SecurityException, IOException {
		
		Manifest manifest = new Manifest();
		File dir = new File("jwbf/classes");
		
		Manifest m = manifest;
		URL url = null;
		url = getClass().getClassLoader().getResource("jwbf.properties");
		m.read(url.openStream());
		String manifestMainAttributes[] = manifest.getMainAttributes();
		String manifestFileAttributes[] = manifest.getMainAttributes();

		String expectedMainAttrs[] = new
			String[][] { manifestMainAttributes, fileAttributes,  packageAttributes };
	
		for(int i=0;i<expectedMainAttrs.length;i++) {
			for(int j=0;j<3;j++)
			{
				assertEquals("Main Attributes not matched in jwbf.",expectedMainAttrs[i],m.getMainAttributes()[j]);
			
			}
		}
		
		
		Enumeration<? extends ZipEntry> entries = new Enumeration<ZipEntry>() {

			@Override
			public synchronized boolean hasMoreElements() {
				return false;
			}

			@Override
			public synchronized ZipEntry nextElement() {
				return null;
			}
			
		};
		
		ZipEntry e;
		while(entries.hasMoreElements()) {
			e = entries.nextElement
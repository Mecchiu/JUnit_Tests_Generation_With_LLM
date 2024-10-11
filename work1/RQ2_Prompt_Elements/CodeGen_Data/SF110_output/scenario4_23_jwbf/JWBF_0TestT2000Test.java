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

	@Test
	void testVersion() {
		Version version = JWBF.getVersion("META-INF/MANIFEST.MF");
		assertEquals(Version.M3, version);
	}
	
	
	@Test
	void testFindManifest() { 
		Manifest manifest = JWBF.getManifest();
		assertNotNull(manifest);
		assertTrue(manifest.isMain());
		assertFalse(manifest.isEmpty());
		assertEquals(6, manifest.getMainAttributes().size());
		assertTrue(manifest.containsKey("META-INF/MANIFEST.MF"));
		assertNotNull(manifest.get("META-INF/MANIFEST.MF"));
		assertEquals("META-INF/MANIFEST.MF", manifest.getMainAttributes().getValue("MANIFEST-FILENAME"));
		assertEquals("META-INF", manifest.getMainAttributes().getValue("MANIFEST-ENTRIES-PATH"));
		assertEquals("META-INF/MANIFEST.MF", manifest.getMainEntries().get(0));
		assertEquals("META-INF/MANIFEST.MF", manifest.getMainEntries().get(1));
		assertEquals("META-INF/MANIFEST.MF", manifest.getMainEntries().get(2));
		
		String path = manifest.getMainAttributes().getValue("MANIFEST-FILENAME");
		Path p = Path.fromLocalFile(new File(path));
		Map<String, String> map = p.getEntryMap();
		map.clear();
		path = p.removeEntry(0).getEntryPath();
		assertEquals(path, p.getEntry(0));
		List<String> r = new LinkedList<String>();
		p.forEach(r::add);
		System.out.println(p);
	}
	
	@Test
	void testFindManFileWithExt() { 
		Manifest manifest = JWBF.getManifest();
		assertNotNull(manifest);
		assertTrue(manifest.isMain());
		assertFalse(manifest.isEmpty());
		assertEquals(6, manifest.getMainAttributes().size());
		assertTrue(manifest.containsKey("META-INF/MANIFEST-FILENAME"));
		assertNotNull(manifest.get("META-INF/MANIFEST-FILENAME"));
		assertEquals("META-INF/MANIFEST-ENTRIES-PATH", manifest.getMainAttributes().getValue("MANIFEST-FILENAME"));
		assertEquals("META-INF", manifest.getMainAttributes().getValue("MANIFEST-ENTRIES-PATH"));
		List<Entry> e = Collections.unmodifiableList(manifest.getMainEntries());
		List<String> r = new LinkedList<String>();
		manifest.forEachEntry((JarFile.Entry entry) -> { r.add(entry.getName()); });
		Map<String, String> map = e.get(0).get(MANIFEST-FILENAME);
		System.out.println(e);
		System.out.println(r);
		assertEquals("META-INF/MANIFEST-ENTRIES-PATH", map.get("MANIFEST-FILENAME"));
		assertEquals("META-INF", map.get("MANIFEST-ENTRIES-PATH"));
		r = new LinkedList<String>();
		manifest.forEachEntry((JarFile.Entry entry) -> { r.add(entry.getName()); } );
		System.out.println(r);
	}
	
	
	@Test
	void testFindManEntries() { 
		Manifest manifest = JWBF.getManifest();
		assertNotNull(manifest);
		assertTrue(manifest.isMain());
		assertFalse(manifest.isEmpty());
		assertEquals(6, manifest.getMainAttributes().size());
		assertTrue(manifest.containsKey("META-INF/MANIFEST.MF"));
		assertNotNull(manifest.get("META-INF/MANIFEST.MF"));
		assertEquals("META-INF/MANIFEST.MF", manifest.getMainAttributes().getValue("MANIFEST-FILENAME"));
		assertEquals("META-INF", manifest.getMainAttributes().getValue("MANIFEST-ENTRIES-PATH"));
		List<Entry> e = Collections.unmodifiableList(manifest.getMainEntries());
		Map<String, String> map = e.get(0).get(MAN
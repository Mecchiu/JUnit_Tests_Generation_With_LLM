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

	@Test
	public void test01GetVersion() throws IOException
	{
		final String test_title="JWBF_2Test";

		final Manifest manifest = ManifestUtils.getManifestFromJarFile();
		
		final Map<String, String> fileParts = new HashMap<String, String>();
		
		final String pckVersion=System.getProperty("java.ext.dirs") + "/" + "pck";
		
		final File pckFile=new File(pckVersion);
		assertNotNull(pckFile);
		final File dirWithDirFile=new File(pckVersion);
		assertNotNull(dirWithDirFile);
		fileParts.put(jarFileIndex, dirWithDirFile.getAbsolutePath());

		final File[] jars=pckFile.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().endsWith(".jar");
            }
        });

		final Map<String,String> jarsPart = new HashMap<String,String>();
		
		final String version=null;
		for(File jar:jars) {
			if(!jar.isDirectory()) {
                final Manifest manifest = ManifestUtils.getManifestFromJarFile();
				if(manifest!=null) {
					final String versionFromManifest=manifest.getVersion();
					if(versionFromManifest!=null) {
						if(versionFromManifest.equals(version)) {
							version=(String)jar.getAbsoluteFile().getName().substring(0, jar.getAbsoluteFile().getName().length()-4);
						}
					}
				}
				jarsPart.put(jar.getName(),version);
			}
		}

		assertEquals(Collections.unmodifiableMap(fileParts),fileParts);
		assertEquals(Collections.unmodifiableMap(jarsPart),jarsPart);
		
		assertEquals(Collections.unmodifiableMap(Collections.map(jars,new File(jarFile)))
		,Collections.unmodifiableMap(Collections.map(jars,new File(jarFile))));

		final Map<String,String> manifestParts = new HashMap<String,String>();

		final String pckPart=fileParts.get("manifest");
		if(pckPart!=null) {
			manifestParts.put(manifest.getMainAttributes().getValue("main-class"),pckPart);
			manifest=ManifestUtils.getManifestFromFile(new File(pckFile, manifestParts.get(manifest.getMainAttributes().getValue("main-class"))));
			assertNull(manifest.getMainAttributes().getValue("jboss.as.version"));
		}

		final String pckVers=filesAsStrings(pckFile.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().endsWith(".jar");
        }
        }));

        assertNotNull(pckVers);
        final Map<String,String> pckVersPart = new HashMap<String,String>();
        for(Map.Entry<String,String> entry:pckVers.entrySet()) {
            pckVersPart.put(entry.getKey(),entry.getValue());
        }
        assertEquals(Collections.unmodifiableMap(manifestParts.put(manifest.getMainAttributes().getValue("jboss.as.version"),pckVers)),pckVersPart);

        final Map<String,String> mfParts = new HashMap<String,String>();
        final String[] parts = pckPart.split(separatorChar);

        for(String s:parts) {
            if(s.equals("MANIFEST-INF/META-INF/MANIFEST.MF")) {
                mfParts.put(s.substring(s.indexOf("/META-INF")+5),null);
                mfParts.put(s,s);
            }

            if(s.startsWith("pck")) {
                assertEquals(s,f);
            }
        }

        jarsPart.put("pck",pckPart);
        assertEquals(Collections.unmodifiableMap(jarsPart),new HashMap<String,String>(jarsPart));

		assertEquals(Collections.unmodifiableMap(Collections.map(Collections.list(
					Collections.list(
					Collections.singletonList(new File(pckFile.getAbsolutePath(), manifestParts.get("manifest"))).toArray(new File[0])
				),new File(pckFile.getAbs
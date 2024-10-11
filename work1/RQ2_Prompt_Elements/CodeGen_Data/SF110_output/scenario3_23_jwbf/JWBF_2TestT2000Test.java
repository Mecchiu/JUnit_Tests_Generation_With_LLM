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
private static final File srcDir = new File("src/test/resources");
    static final File tmpDir = new File("tmp");
    static final String APP_ID = "test";
    static final String APP_KEY = "Test key";
    static final String APP_SECRET = "Test secret";

    static final String APP_POM_META = "org.apache.jackrabbit.core.pom";
	public static final File src = new File(srcDir, "mvn/junit-4.7");

    /**
    * This test case is run in both mode {@link JWBF#JWBImportJcr} and
    * {@link JWBImportJcrWithLocks}. It performs test {@link #setUp} and its
    * tests against a single test JVFS {@link JWFJUnit} instance.
    */
    @Test
	void testJVFS_2() throws Exception {
    	final JWFJUnit jwf = JWF_2.INSTANCE;
        jwf.setUp();

        try {
            jwf.newJwtJson();
            jwf.assertVersion();
            String version = jwf.getVersion().get(VERSION);
            if (version == null && APP_ID.startsWith("junit")) {
                jwf.setVersion(String.valueOf(JWBImport.JWT_VERSION));
                version = jwf.getVersion().get(VERSION);
            }
            if (version == null) {
                throw new RuntimeException("JWBImport failed but no version returned");
            }
            String[] versionAndKey = version.split("\\.");

            assertEquals(version.length(),
                versionAndKey[0],
                String.valueOf(APP_VERSION));

            assertEquals(version.length(),
                versionAndKey[1],
                appId());

            assertEquals(version.length(),
                versionAndKey[2],
                APP_KEY);

			/*
			* The appId should contain the app id we are trying to import as well
			* as the current session id we started with.
			*/
            assertTrue(versionAndKey[0].startsWith(VERSION) 
                && versionAndKey[0].contains(APP_VERSION.replace(VERSION, APP_ID)));
            
            assertEquals(APP_ID, versionAndKey[0]);

            assertEquals(JWBImport.JWT_VERSION, versionAndKey[1]);
            assertEquals(APP_ID + "/" + APP_VERSION, versionAndKey[2]);
            assertEquals(APP_KEY + "/" + APP_VERSION, versionAndKey[3]);            
            
            // create manifest
            Map<String, String> m = new HashMap<String, String>();
            m.put(MACHINE, versionAndKey[4]);
            m.put(MANIFEST_PATH, src);
            File f = new File(jwf.pomFilePath(APP_ID), "pom.xml");
            try {   m.put(MANIFEST_FILE, f.toURI());  } catch (URISyntaxException ex2) {
            }
        	JWF_2_TEST.file = f;
            //
            
        } finally { 
            jwf.tearDown();
        }
    }
    
    static final String VERSION = "1.0";

    static final String appId() {
        return "app";
    }
    
    static final String APP_ID = "app";
    static final String APP_VERSION = "1.0";
    static final String APP_SECRET = "JWFB";

    void newJwtJson() throws Exception {
    	File targetFile = new File(JWF_2_TEST.file);
        Manifest m;
        File parent = targetFile.getParentFile();     
        try {
            File parentDir = parent.getParentFile();
            // check for the jar file in the manifest 
            m = new Manifest(targetFile);
            StringBuilder sb = new StringBuilder();
            sb.append(MANIFEST_NAME).append(" manifest");
            Manifest tmpMF = new Manifest();
            tmpMF.getMainAttributes().putValue(
                "Manifest-Version", MANIFEST_VERSION);
            sb.append(MANIFEST_FILENAME).append("." + MANIFEST_EXTENSION);
            sb.append(".xml");
            parentDir.mkdir();

            Map<String, ManifestEntry> mfs = m.getEntries("META-INF");
            for (ManifestEntry me : mfs.values()) {
            	if (me.getAttributes().getValue("jcr:content")!= null
            		&& me.getAttributes().getValue("jcr:content").length() > 0) {
            		mfs.put(me.getName(), me);
            	}
            }
            
            JarFile jar = null;
            if (parentDir.exists())
            	jar = new JarFile(parentDir);
            else if (parentDir.mkdir())
            	jar = new JarFile(parentDir);
            
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
            	JarEntry entry = entries.nextElement();
            	if (entry.getName().endsWith(MANIFEST_EXTENSION)) {
                	String name = entry.getName();
                	if (mfs.containsKey(name)) {
                    	String content = mfs.get(name).getContents();
                    	sb.append(name).append(".0");
            			if (content == null)
            				continue;
                    	targetFile.delete();
                    	try {
                    		targetFile.createNewFile();
                    		FileOutputStream fo = new FileOutputStream(targetFile);
                    		try {
                    			fo.write(content.getBytes());
                    		} finally {
                    			fo.close();
                    		}
                    	}
                    	catch (IOException ex) {
                    		throw new RuntimeException(ex);
                    	}
                	}
            	}
            }

            JarEntry entry = jar.getJarEntry("META-INF/MANIFEST.MF");
            FileOutputStream fo = new FileOutputStream(targetFile);
            try {
            	fo.write(targetFile.getCanonicalFile().getAbsolutePath()
                   .getBytes());
            } finally {
            	fo.close();
            }
            targetFile.delete();
            
            /*
            * Write "jwf=app?version=1" in the manifest - this allows the test to
            * use test server.
            */
            Map<String, String> mf = new HashMap<String, String>();
            mf.put("
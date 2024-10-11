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
		
    /**
     * Test method for
     * {@link net.sourceforge.jwbf.JWBF#getVersion(java.lang.Class)}
     * with parameters incompatible with File
     * @throws IOException
     *             if the tests fail
     */
    final  class GetVersionTest6 extends JWBF_Test {
        
        /*
         * @see net.sourceforge.jwbf.JWBF#getVersion(java.lang.Class)
         */
        @Override
        public void runTest() throws IOException {
            assertExceptionHandling("Unable to determine version for " + key,
                                   IOException.class);
            
            class MyInput {
                public String first;
                public String second;
            }
            MyInput testInput = new MyInput();
            testInput.first = "first";
            testInput.second = "second";
            System.out.println("Test class " + key + " has first and third as param");
            String result = JWBF.getVersion(TestClass6.class);
            assertEquals("version with first!= third",
                         testInput.first,
                         result);
            
            // Test that the next two line are ok...
            result = JWBF.getVersion(TestClass8.class);
            assertEquals("version with first == third",
                         testInput.first,
                         result);
            

            // Also test that if you want to use the manifest
            // you need to add it to the list...
            Manifest manifest = new Manifest();
            manifest.getMainAttributes().putValue("Manifest-Version", "2");
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Manifest manifestFromClassLoader = classLoader.getResourceAsStream("test-classes/manifest.manifest");
            URL manifestUrl = null;
            for (Enumeration<JarEntry> iter = manifest.entries(); iter.hasMoreElements();)
            {
                JarEntry entry = iter.nextElement();
                if (jarFileIndex.equals(entry.getName()))
                    manifestUrl = entry.getURL();
            }
            if (manifestUrl!= null)
            {
                File dir = new File("test-classes/manifest.manifest");
                Manifest manifest2;
                manifest2 = new Manifest();
                manifest2.addMainAttrib("Class-Path", dir.getAbsolutePath());
                Map<String, Attributes> m = new HashMap<String, Attributes>();

                if (manifestUrl.toExternalForm().endsWith(jarFileIndex + ".class"))
                    manifest2.read(manifestUrl);
                else if (manifestUrl.toExternalForm().endsWith(jarFileIndex + ".jnilib.class"))
                    manifest2.read(manifestUrl);
                else
                    manifest2.read(manifestUrl);

                manifest2.getMainAttributes().putValue("URL-Manifest-Manifest", manifestUrl.toExternalForm());
                Map<String, Attributes> m2 = manifest2.getMainAttributes();

                for (String key : m.keySet())
                    m2.putAll(m.remove(key));

                m.putAll(m2);
                manifest = manifest2;
            }
            
            assertTrue("Version is not valid!", result.contains("version with first == third"));        
        }
    }
    
    /**
     * Test method for
     * {@link net.sourceforge.jwbf.JWBF#searchMF(java.lang.String)}
     * with parameters incompatible with Manifest
     * @throws IOException
     *             if the tests fail
     */
    @Test
    public final void Test7() throws IOException {
        assertExceptionHandling("Unable to determine file name for " + key,
                                IOException.class);
        
        String file = "file";
        String file2 = "file_2";

        JarFile jar = new JarFile(new File(TestClass1.path + "/" + file));
        Set<JarEntry> entries = jar.getJarEntrySet() ;

        for (Map.Entry<Enumeration<JarEntry>, File> entry : entries) {
            for (String entryFile : entry.getKey())
            {
                File file = resolver(entryFile);
                String name = entryFile.toString();
                assertTrue("Entry "+ entryFile + " File with name '"+name+"' not found", file.getName().equals(name));
                jar.close();
            }
        }
    }
    
    private static File resolver(File entryFile) throws IOException {
        File file = resolver(entryFile.getAbsolutePath());
        
        return (file==null)? new File(".") : file;
}
}
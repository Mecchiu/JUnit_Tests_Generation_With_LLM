// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains one unit test case for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
Class<?> classe = LocalFileStorageTest.class;


	@Test
    public void testFileLastModified() throws Exception {
        final String str = "<a></a>";
        final LocalFileStorage fs0 = makeTestFile(new String[] {str});
        
        File file = null;
        int result = fs0.isFile(str);
        
        assertTrue("Expected not the file to exists, not " + (result & 0x00000080), (result & 0x00000080) == 0);
        
        assertNull("Expected no file exists, but got one", fs0.getFile(str));
        assertEquals("Expected the file to be as expected, has", str, fs0.getFile(str));
    }

	@Test
    public void testFileOpen() throws Exception {
        final String str = "<a></a>";
        final LocalFileStorage fs0 = makeTestFile(new String[] {str});
        
        File file = null;

        IOException ex = null;
        try {
            file = fs0.open(str);
        } catch (IOException e) { ex = e; }

        assertTrue("Expected file not to exist, but got one: " + (ex!= null? ex.getMessage() : "null"), (ex!= null? ex.getMessage()
        		: "expected to exist"))
        assertNull("Expected no file to exist but got one", file);
    }
	
	@Test
    public void testFileRead() throws Exception {
        final String str = "<a></a>";
        final LocalFileStorage fs0 = makeTestFile(new String[] {str});
        
        String strRes = fs0.getFile(str);
        
        assertNull("Expected a no file, but got one ", str);
        assertNull("Expected no file to exist, but got one"," " + strRes);
    }
	
	@Test
    public void testFileWrite() throws Exception {
        final String str = "<a></a>";
        final LocalFileStorage fs0 = makeTestFile(new String[] {str});
        
        File file = null;
        int result = fs0.isFile(str);
        
        assertFalse("Expected the file to not exist, but got one", result);

        System.out.println("File exists " + (result & 0x00000080));
	
        assertFalse("Expecting file to not exist", result & 0x00000080!= 0);
        
        assertNotNull("Expected a file to exist, but got one", file);
        
        String str2 = "";
        file.writeString(str2, "UTF-8");

        result = fs0.isFile(str);
        
        assertTrue("Expected the file to not exist", result);
        
        assertFalse("Expecting file to exist", (result & 0x00000080 == 0));
        System.out.println("File " + (result & 0x00000080) + " present");
        
    }
    
	@Test
    public void testFileCreateNew() throws Exception {
        final String str = "<a></a>";
        final LocalFileStorage fs0 = makeTestFile(new String[] {str});
        
        File file = null;
        int result = fs0.isFile(str);
        
        assertTrue("Expected file not to exist, but got one", result);

        System.out.println("File exists " + (result & 0x00000080));
	
        assertFalse("Expecting file to not exist", result & 0x00000080!= 0);
        
        assertTrue("Expected a new file should exist",!fs0.exists(str));

        int lastMod = fs0.fileLastModified(str);        
        
        assertEquals("Expected the last modification time to be the same as the new file", lastMod, lastMod);

        assertTrue("Expected new file to exist, but was not", fs0.exists(str));
        
        String content = fs0.getFile(str);
        
        assertEquals("Expecting the content of the new file", str, content);
        
        System.out.println("File " + (result & 0x00000080) + " closed");
    }

    private LocalFileStorage makeTestFile(String[] args) throws IOException {
        return new LocalFileStorage(new File(args[2]).getAbsolutePath());
    }
    
}

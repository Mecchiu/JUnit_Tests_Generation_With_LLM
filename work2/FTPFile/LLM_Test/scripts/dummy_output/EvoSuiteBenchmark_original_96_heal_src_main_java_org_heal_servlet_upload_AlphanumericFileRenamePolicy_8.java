// AlphanumericFileRenamePolicyTest.java
package org.heal.servlet.upload;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AlphanumericFileRenamePolicy}.
* It contains one unit test case for the {@link AlphanumericFileRenamePolicy#rename(File)} method.
*/
class AlphanumericFileRenamePolicyTest {
		
    @Test
    public void test() {
    
        AlphanumericFileRenamePolicy alphanumericFileRenamePolicy = new AlphanumericFileRenamePolicy(new AlphanumericFileRenamePolicy.FileRenamePolicy());
        String fileReference = alphanumericFileRenamePolicy.rename(new File("file/"));
        
        assertNotNull("fileReference is null", fileReference);
        assertNotSame("file reference is the same", fileReference.trim(), "");
        assertEquals("file reference should be an aString", 'test', fileReference);
        
		File originalFile = new File("file/original");
		
		assertTrue("Original file reference should be a file", originalFile.isFile());
        
        fileReference = alphanumericFileRenamePolicy.rename(originalFile);
		
		assertEquals("fileReference should be the same", originalFile, new File("file/original"));
        
        assertTrue("Original file reference should be a file", originalFile.isFile());
        
        fileReference = alphanumericFileRenamePolicy.rename(new File("anotherFile/"));
		
		assertEquals("fileReference should be the same", new File("anotherFile/"), new File("anotherFile/"));
        
        assertFalse("Original and modified file references should not be the same", originalFile.equals(new File("anotherFile")));
        
    }
    


}
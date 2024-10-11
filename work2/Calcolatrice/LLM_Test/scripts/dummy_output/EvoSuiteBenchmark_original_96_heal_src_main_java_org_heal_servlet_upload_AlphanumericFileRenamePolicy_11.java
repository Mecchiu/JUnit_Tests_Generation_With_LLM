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
		/**
	    * Test class of {@link AlphanumericFileRenamePolicy#rename(File[])}.
	    */
	    @Test
	    public void testFileRenameOperation() {

	    	String dir = "DONE";
	        File original = new File("src/test/resources/test_files");
	        assertNotNull(original);

	        File destDir = new File("dummy");
	        assertTrue(destDir.exists());
	        assertTrue(destDir.isDirectory());

	        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();

	        File newFilename = new File(destDir, "original.txt").getCanonicalFile();
	        
	        assertNull(newFileRename(original, newFilename, dir).getCanonicalFile());
	    }


	}
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
		public void testRename() {
			String original = "file";
			String dest = "dest";
	    
	    AlphanumericFileRenamePolicy a = new AlphanumericFileRenamePolicy();
	    AlphanumericFileRenamePolicy b = new AlphanumericFileRenamePolicy();
	    
	    // Test file renaming
	    assertEquals(a.rename(new File(original)), new File(dest));
	    
	    // Test exception (for no file)
	    try {
	        assertEquals(b.rename(new File(original)), null);
	    } catch (Exception e) {
	        assertEquals(e.getMessage(), "File does not exist '" + original + "'");
	        return;
	    }
	    
	    // Test exception (file not existed)
	    try {
	        b.rename(new File("invalid_file"));
	    } catch( Exception e) {
	        assertTrue(e.getMessage().startsWith("File does not exist 'invalid_file'"));
		}
	}
}

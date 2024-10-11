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
	 * Constructor with one file in the path.
	 * 
	 * @param filename Filename to be renamed.
	 * @throws Exception On failure.
	 */
	public AlphanumericFileRenamePolicyTest(String filename) throws Exception {
		File f = new File(filename);
		this.renameFile = f;
	}

	
    /**
     * Test of rename method.
     */
    @Test
    public void testRename() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        String name = this.renameFile.getName();

        File original = new File("C:\\Project\\AlphanumericTest\\alpha");
        assertFalse(policy.canRename(original));
        // File's name must not contain any special characters for rename
        assertFalse(policy.rename(original));
        assertFalse(policy.canRename(original));
        assertFalse(policy.canRename(this.renameFile.getParentFile()));
        
        try {
            policy.rename(this.renameFile);
        } catch(Exception e) {
            // Expectation: the renaming would fail even though the file is in a path.
            //
            // No other problem should be thrown in the general case of rename failure.
            assertEquals("File cannot be renamed.", e.getMessage());
            throw e;
        }
        
        f = new File(name);
        assertTrue(policy.rename(f));
        
        try {
            policy.rename(f);
        } catch(Exception e) {
            // Expectation: the renaming would fail even though the file is in a path.
            //
            // No other problem should be thrown in the general case of rename failure.
            assertEquals("File cannot be renamed.", e.getMessage());
            throw e.getMessage();
        }

        assertTrue(policy.canRename(f));

    }

    protected File renameFile;	
}
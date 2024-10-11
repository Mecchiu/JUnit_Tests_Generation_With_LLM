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
		 * Test default constructor.
		 */
	@Test
    public void create_no_arguments() {
        assertNull(AlphanumericFileRenamePolicy.defaultRenamePolicy);
    }

    /**
     * Test construction with file paths.
     */
    @Test
    public void construct_file_paths1() {
        final File path1 = new File("Path1, File1");
        AlphanumericFileRenamePolicy p1 = new AlphanumericFileRenamePolicy();                        
        File[] path2Arr = {path1, path1};

        // Test constructors of file policies with File objects.
        assertNotNull(p1.defaultRenamePolicy);
        assertNotNull(p1.concatRenameHandler);
        assertNotNull(p1.concatSepRenameHandler);

        assertEquals(p1, p1.defaultRenamePolicy);
        assertEquals(p1, p1.concatRenameHandler);
        assertEquals(p1, p1.concatSepRenameHandler);
        
        assertNotNull(p1.rename(path1));
        assertNotNull(p1.rename(path2Arr[0]));
        assertNull(p1.rename(path2Arr[1]));
        
        assertNull(p1.rename(new File(path1, "File1")));
        assertNotNull(p1.rename(null));

        // Note that p1 does not create a File object when the "concat" method
        // is invoked.  This means that a File object will be thrown at
        // runtime when the file does not already exist, but will be treated
        // as an argument for the concat (if the "concat" parameter is false)
    }

    /**
     * Test construction with path objects.
     */
    @Test
    public void construct_path1() {
        final File path1 = new File("Path1, File1");
        AlphanumericFileRenamePolicy p1 = new AlphanumericFileRenamePolicy();                        
        File[] path2Arr = {path1, path1};

        // Test constructors of file policies with files objects.
        assertNotNull(p1.defaultRenamePolicy);
        assertNotNull(p1.concatRenameHandler);
        assertNotNull(p1.concatSepRenameHandler);

        assertNotNull(p1.rename(path1));
        assertNotNull(p1.rename(path2Arr[0]));
        assertNotNull(p1.rename(path2Arr[1]));
        
        assertNull(p1.rename(new File(path1, "File1")));
        assertNotNull(p1.rename(null));

        // Here the path objects contain a null entry, so this test does not
        // assert(p1.defaultRenamePolicy.rename(null) == null);

        assertNull(p1.rename(new String("Path1")));
        assertNotNull(p1.rename(new String(null)));

        // Note that p1 does not create a File object when the "concat" method
        // is invoked.  This means that a File object will be thrown at
        // runtime when the file does not already exist, but will be treated
        // as an argument for the concat (if the "concat" parameter is false)
    }

}

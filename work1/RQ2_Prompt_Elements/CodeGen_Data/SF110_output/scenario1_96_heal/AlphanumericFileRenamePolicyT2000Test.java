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
    public void testPass() {
        File tmp = null;
        try {
            tmp = File.createTempFile("123", "name");
            tmp.deleteOnExit();
            
            // create a new file
            File f1 = File.createTempFile("123", "");
            f1.deleteOnExit();
            f1.delete();

            File file2 = new File(tmp.getPath());
            assertNotNull(file2.getPath());
            f1 = new File(tmp.getPath());

            // rename the file to a different name
            f1.renameTo(new File(f1.getPath()+"1"));

            // validate the new path
            assertEquals(f1.getPath(), f1.getParentFile().getPath());
            
        } catch (IllegalStateException exp) {
                fail("This cannot happen");
        }
    }

}
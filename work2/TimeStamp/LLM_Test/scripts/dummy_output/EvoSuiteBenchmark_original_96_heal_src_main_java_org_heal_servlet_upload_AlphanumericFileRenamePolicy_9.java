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
		private String filename;

    /**
     * Default constructor.
     */
    public AlphanumericFileRenamePolicyTest() {
        //empty
    }

    /**
     * Method {@link #filename}() Testing method.
     */
    @Test
	public void filename() {
        this.filename = AlphanumericFileRenamePolicy.stripSpecialCharacters("fileName.txt");
        assertEquals(new File("fileName.txt").getName(), this.filename);
    }

    /**
     * Method {@link #stripSpecialCharacters(String)} Testing method.
     */
    @Test
	public void stripSpecialCharacters() {
        this.filename = AlphanumericFileRenamePolicy.stripSpecialCharacters("filename-%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        assertEquals(new File("filename-%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"), this.filename);
    }
}
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
		
    String removeAlpha = "ABCDEFGHIJKLMNOPQRG";

    AlphanumericFileRenamePolicy test;

    public AlphanumericFileRenamePolicyTest() {
        test = new AlphanumericFileRenamePolicy();
    }
    /**
    * Test of create() method, of class AlphanumericFileRenamePolicy.
    */
    @Test
    void testCreate() {
        test.create("Foo.doc", new File("doc"), null);
        test.create("Foo.pdf", new File("pdf"), null);
        test.create("Foo.exe", new File("exe"), null);
    }

    @Test
    public void testRemove() throws Exception {
        File original = test.rename(null);
        assertNotNull(original);
        File normalized = test.remove("Foo.doc", original);
        assertNotNull(normalized);
        File norm = test.remove("Foo.pdf", original);
        assertNull(norm);
        File ex = test.remove("Foo.exe", original);
        assertNotNull(ex);
        assertEquals(original, ex);

        File newName =  test.rename("Foo.doc", null, "Foo.doc");
        assertNotNull(newName);
        assertEquals("doc", newName.getName());
    }

    /**
    * Test of rename() method, of class AlphanumericFileRenamePolicy.
    */
    @Test
    void testRename() throws Exception {
        File file = test.rename(new File("Foo.doc"), null);
        assertNotNull(file);
        assertEquals("Foo.doc", file.getName());
        file = test.rename(new File("Foo.pdf"), null);
        assertNotNull(file);
        assertEquals("Foo.pdf", file.getName());
        file = test.rename(new File("Foo.exe"), null);
        assertNotNull(file);
        assertEquals("Foo.exe", file.getName());
    }
    /**
     * Test of rename with null argument.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRenameWithNullFile() {
        test.rename((File) null);
    }

    /**
     * Test of rename with invalid file argument.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRenameWithInvalidFile() {
        File invalidFile = new File("/nonExistentName");
        test.rename(invalidFile);
    }

}
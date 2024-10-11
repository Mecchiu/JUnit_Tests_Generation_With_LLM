// ApplicationConfiguration_1Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {

    /**
     * Test that the openFileModel method returns a non-null object.
     */
    @Test
    void testOpenFileModelNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertNotNull(openFileModel);
    }

    /**
     * Test that the openFileModel method returns the same object when called twice.
     */
    @Test
    void testOpenFileModelSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel1 = configuration.openFileModel();
        OpenFileModel openFileModel2 = configuration.openFileModel();
        assertSame(openFileModel1, openFileModel2);
    }

    /**
     * Test that the openFileModel method returns an object with a non-null file list.
     */
    @Test
    void testOpenFileModelFileListNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertNotNull(openFileModel.getFileList());
    }

    /**
     * Test that the openFileModel method returns an object with an empty file list.
     */
    @Test
    void testOpenFileModelFileListEmpty() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertTrue(openFileModel.getFileList().isEmpty());
    }

    /**
     * Test that the openFileModel method returns an object with a non-null current file.
     */
    @Test
    void testOpenFileModelCurrentFileNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertNotNull(openFileModel.getCurrentFile());
    }

    /**
     * Test that the openFileModel method returns an object with a null current file.
     */
    @Test
    void testOpenFileModelCurrentFileNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertNull(openFileModel.getCurrentFile());
    }

    /**
     * Test that the openFileModel method returns an object with a non-null current file content.
     */
    @Test
    void testOpenFileModelCurrentFileContentNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertNotNull(openFileModel.getCurrentFileContent());
    }

    /**
     * Test that the openFileModel method returns an object with an empty current file content.
     */
    @Test
    void testOpenFileModelCurrentFileContentEmpty() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertTrue(openFileModel.getCurrentFileContent().isEmpty());
    }

    /**
     * Test that the openFileModel method returns an object with a non-null current file name.
     */
    @Test
    void testOpenFileModelCurrentFileNameNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertNotNull(openFileModel.getCurrentFileName());
    }

    /**
     * Test that the openFileModel method returns an object with an empty current file name.
     */
    @Test
    void testOpenFileModelCurrentFileNameEmpty() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileModel openFileModel = configuration.openFileModel();
        assertTrue(openFileModel.getCurrentFileName().isEmpty());
    }
}
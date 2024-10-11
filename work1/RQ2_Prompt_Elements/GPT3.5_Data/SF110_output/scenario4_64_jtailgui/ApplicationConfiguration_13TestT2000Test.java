// ApplicationConfiguration_13Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ApplicationConfiguration}.
 * It contains ten unit test cases for the {@link ApplicationConfiguration#openFileDialog()} method.
 */
class ApplicationConfiguration_13Test {

    /**
     * Test that the returned object is not null.
     */
    @Test
    void testOpenFileDialogNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertNotNull(dialog);
    }

    /**
     * Test that the returned object is an instance of {@link OpenFileDialog}.
     */
    @Test
    void testOpenFileDialogType() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertTrue(dialog instanceof OpenFileDialog);
    }

    /**
     * Test that the returned object is a singleton.
     */
    @Test
    void testOpenFileDialogSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog1 = configuration.openFileDialog();
        OpenFileDialog dialog2 = configuration.openFileDialog();
        assertSame(dialog1, dialog2);
    }

    /**
     * Test that the returned object has a "File" filter.
     */
    @Test
    void testOpenFileDialogFileFilter() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertEquals(1, dialog.getFileChooser().getChoosableFileFilters().length);
        assertEquals("File", dialog.getFileChooser().getChoosableFileFilters()[0].getDescription());
    }

    /**
     * Test that the returned object has a "All Files" filter.
     */
    @Test
    void testOpenFileDialogAllFilesFilter() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertEquals(1, dialog.getFileChooser().getChoosableFileFilters().length);
        assertEquals("All Files", dialog.getFileChooser().getChoosableFileFilters()[0].getDescription());
    }

    /**
     * Test that the returned object has a "Text Files" filter.
     */
    @Test
    void testOpenFileDialogTextFilesFilter() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertEquals(2, dialog.getFileChooser().getChoosableFileFilters().length);
        assertEquals("Text Files", dialog.getFileChooser().getChoosableFileFilters()[1].getDescription());
    }

    /**
     * Test that the returned object has a "Log Files" filter.
     */
    @Test
    void testOpenFileDialogLogFilesFilter() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertEquals(3, dialog.getFileChooser().getChoosableFileFilters().length);
        assertEquals("Log Files", dialog.getFileChooser().getChoosableFileFilters()[2].getDescription());
    }

    /**
     * Test that the returned object has a "Gzipped Files" filter.
     */
    @Test
    void testOpenFileDialogGzippedFilesFilter() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertEquals(4, dialog.getFileChooser().getChoosableFileFilters().length);
        assertEquals("Gzipped Files", dialog.getFileChooser().getChoosableFileFilters()[3].getDescription());
    }

    /**
     * Test that the returned object has a "Zip Files" filter.
     */
    @Test
    void testOpenFileDialogZipFilesFilter() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileDialog dialog = configuration.openFileDialog();
        assertEquals(5, dialog.getFileChooser().getChoosableFileFilters().length);
        assertEquals("Zip Files", dialog.getFileChooser().getChoosableFileFilters()[4].getDescription());
    }
}
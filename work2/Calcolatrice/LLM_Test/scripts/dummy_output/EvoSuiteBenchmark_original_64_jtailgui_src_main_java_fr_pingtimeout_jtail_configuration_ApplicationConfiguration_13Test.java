package fr.pingtimeout.jtail.configuration;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfiguration_13Test {

    @Test
    void testOpenFileDialogNotNull() {
        assertNotNull(new ApplicationConfiguration().openFileDialog());
    }

    @Test
    void testOpenFileDialogSingleton() {
        assertSame(new ApplicationConfiguration().openFileDialog(), new ApplicationConfiguration().openFileDialog());
    }

    @Test
    void testOpenFileDialogInstanceOfOpenFileDialog() {
        assertTrue(new ApplicationConfiguration().openFileDialog() instanceof OpenFileDialog);
    }

    @Test
    void testOpenFileDialogChooseFileActionNotNull() {
        assertNotNull(new ApplicationConfiguration().openFileDialog().getChooseFileAction());
    }

    @Test
    void testOpenFileDialogSelectIndexTypeListenerNotNull() {
        assertNotNull(new ApplicationConfiguration().openFileDialog().getSelectIndexTypeListener());
    }

    @Test
    void testOpenFileDialogIndexFileActionNotNull() {
        assertNotNull(new ApplicationConfiguration().openFileDialog().getIndexFileAction());
    }

    @Test
    void testOpenFileDialogChooseFileActionSingleton() {
        assertSame(new ApplicationConfiguration().openFileDialog().getChooseFileAction(), new ApplicationConfiguration().openFileDialog().getChooseFileAction());
    }

    @Test
    void testOpenFileDialogSelectIndexTypeListenerSingleton() {
        assertSame(new ApplicationConfiguration().openFileDialog().getSelectIndexTypeListener(), new ApplicationConfiguration().openFileDialog().getSelectIndexTypeListener());
    }

    @Test
    void testOpenFileDialogIndexFileActionSingleton() {
        assertSame(new ApplicationConfiguration().openFileDialog().getIndexFileAction(), new ApplicationConfiguration().openFileDialog().getIndexFileAction());
    }
}

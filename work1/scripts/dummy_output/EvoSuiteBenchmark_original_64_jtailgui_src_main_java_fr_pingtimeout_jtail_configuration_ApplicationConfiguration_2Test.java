java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.MenuAction;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfiguration_2Test {

    @Test
    void testFileMenuActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction fileMenuAction = configuration.fileMenuAction();
        assertNotNull(fileMenuAction);
    }

    @Test
    void testFileMenuActionLabel() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction fileMenuAction = configuration.fileMenuAction();
        assertEquals("File", fileMenuAction.getLabel());
    }

    @Test
    void testFileMenuActionMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction fileMenuAction = configuration.fileMenuAction();
        assertEquals("F", fileMenuAction.getMnemonic());
    }

    @Test
    void testToolsMenuActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertNotNull(toolsMenuAction);
    }

    @Test
    void testToolsMenuActionLabel() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals("Tools", toolsMenuAction.getLabel());
    }

    @Test
    void testToolsMenuActionMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals("T", toolsMenuAction.getMnemonic());
    }

    @Test
    void testChooseFileActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = configuration.chooseFileAction();
        assertNotNull(chooseFileAction);
    }

    @Test
    void testSelectIndexTypeListenerNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = configuration.selectIndexTypeListener();
        assertNotNull(selectIndexTypeListener);
    }

    @Test
    void testIndexFileActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertNotNull(indexFileAction);
    }

    @Test
    void testOpenActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        OpenFileAction openAction = configuration.openAction();
        assertNotNull(openAction);
    }
}

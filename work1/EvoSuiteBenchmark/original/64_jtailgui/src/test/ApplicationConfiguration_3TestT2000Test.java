```java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.MenuAction;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfiguration_3Test {

    @Test
    void testToolsMenuActionNotNull() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertNotNull(toolsMenuAction);
    }

    @Test
    void testToolsMenuActionLabel() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertEquals("Tools", toolsMenuAction.getLabel());
    }

    @Test
    void testToolsMenuActionMnemonic() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertEquals("T", toolsMenuAction.getMnemonic());
    }

    @Test
    void testToolsMenuActionSingleton() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction1 = applicationConfiguration.toolsMenuAction();
        MenuAction toolsMenuAction2 = applicationConfiguration.toolsMenuAction();
        assertSame(toolsMenuAction1, toolsMenuAction2);
    }

    @Test
    void testToolsMenuActionInstance() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertNotNull(toolsMenuAction);
        assertTrue(toolsMenuAction instanceof MenuAction);
    }

    @Test
    void testToolsMenuActionNotEqualsFileMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        assertNotEquals(fileMenuAction, toolsMenuAction);
    }

    @Test
    void testToolsMenuActionNotSameAsFileMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        assertNotSame(fileMenuAction, toolsMenuAction);
    }

    @Test
    void testToolsMenuActionProxyMode() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertNotNull(toolsMenuAction);
        assertFalse(toolsMenuAction.isProxy());
    }

    @Test
    void testToolsMenuActionScope() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertNotNull(toolsMenuAction);
        assertEquals("singleton", toolsMenuAction.getScope());
    }
}
```
```
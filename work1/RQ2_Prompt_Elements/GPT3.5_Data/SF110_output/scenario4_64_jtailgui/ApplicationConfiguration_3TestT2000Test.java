// ApplicationConfiguration_3Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {
    
    /**
     * Test case to verify that the tools menu action is not null.
     */
    @Test
    void testToolsMenuActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertNotNull(configuration.toolsMenuAction());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct name.
     */
    @Test
    void testToolsMenuActionName() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals("Tools", toolsMenuAction.getName());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct mnemonic.
     */
    @Test
    void testToolsMenuActionMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals('T', toolsMenuAction.getMnemonic());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct tooltip.
     */
    @Test
    void testToolsMenuActionTooltip() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals("Tools", toolsMenuAction.getTooltip());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct icon.
     */
    @Test
    void testToolsMenuActionIcon() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertNotNull(toolsMenuAction.getIcon());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct accelerator.
     */
    @Test
    void testToolsMenuActionAccelerator() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertNull(toolsMenuAction.getAccelerator());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct mnemonic index.
     */
    @Test
    void testToolsMenuActionMnemonicIndex() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals(0, toolsMenuAction.getMnemonicIndex());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct enabled state.
     */
    @Test
    void testToolsMenuActionEnabled() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertTrue(toolsMenuAction.isEnabled());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct visible state.
     */
    @Test
    void testToolsMenuActionVisible() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertTrue(toolsMenuAction.isVisible());
    }
    
    /**
     * Test case to verify that the tools menu action has the correct children.
     */
    @Test
    void testToolsMenuActionChildren() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = configuration.toolsMenuAction();
        assertEquals(0, toolsMenuAction.getChildren().size());
    }
}
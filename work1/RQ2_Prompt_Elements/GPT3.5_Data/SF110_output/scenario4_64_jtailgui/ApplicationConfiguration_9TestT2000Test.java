// ApplicationConfiguration_9Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
    
    /**
     * Test case to verify that the closeAllAction() method returns a non-null object.
     */
    @Test
    void testCloseAllActionNotNull() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertNotNull(config.closeAllAction());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object of type CloseAllAction.
     */
    @Test
    void testCloseAllActionType() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertTrue(config.closeAllAction() instanceof CloseAllAction);
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct name.
     */
    @Test
    void testCloseAllActionName() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertEquals("Close All", config.closeAllAction().getName());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct description.
     */
    @Test
    void testCloseAllActionDescription() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertEquals("Close all open files", config.closeAllAction().getDescription());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct mnemonic.
     */
    @Test
    void testCloseAllActionMnemonic() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertEquals('A', config.closeAllAction().getMnemonic());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct accelerator.
     */
    @Test
    void testCloseAllActionAccelerator() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertEquals("control shift W", config.closeAllAction().getAccelerator());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct icon.
     */
    @Test
    void testCloseAllActionIcon() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertNotNull(config.closeAllAction().getIcon());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct tooltip.
     */
    @Test
    void testCloseAllActionTooltip() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertEquals("Close all open files", config.closeAllAction().getTooltip());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct enabled state.
     */
    @Test
    void testCloseAllActionEnabled() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertTrue(config.closeAllAction().isEnabled());
    }
    
    /**
     * Test case to verify that the closeAllAction() method returns an object with the correct visible state.
     */
    @Test
    void testCloseAllActionVisible() {
        ApplicationConfiguration config = new ApplicationConfiguration();
        assertTrue(config.closeAllAction().isVisible());
    }
}
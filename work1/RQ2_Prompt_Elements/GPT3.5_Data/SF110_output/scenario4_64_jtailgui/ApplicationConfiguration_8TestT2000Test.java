// ApplicationConfiguration_8Test.java
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
 * It contains ten unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
 */
class ApplicationConfiguration_8Test {

    /**
     * Test case to verify that the close action is not null.
     */
    @Test
    void testCloseActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertNotNull(closeAction);
    }

    /**
     * Test case to verify that the close action has the correct name.
     */
    @Test
    void testCloseActionName() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertEquals("Close", closeAction.getName());
    }

    /**
     * Test case to verify that the close action has the correct description.
     */
    @Test
    void testCloseActionDescription() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertEquals("Close the current file", closeAction.getDescription());
    }

    /**
     * Test case to verify that the close action has the correct mnemonic.
     */
    @Test
    void testCloseActionMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertEquals('C', closeAction.getMnemonic());
    }

    /**
     * Test case to verify that the close action has the correct accelerator.
     */
    @Test
    void testCloseActionAccelerator() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertEquals("control W", closeAction.getAccelerator());
    }

    /**
     * Test case to verify that the close action has the correct icon.
     */
    @Test
    void testCloseActionIcon() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertNotNull(closeAction.getIcon());
    }

    /**
     * Test case to verify that the close action has the correct tooltip.
     */
    @Test
    void testCloseActionTooltip() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertEquals("Close the current file", closeAction.getTooltip());
    }

    /**
     * Test case to verify that the close action has the correct enabled state.
     */
    @Test
    void testCloseActionEnabled() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertTrue(closeAction.isEnabled());
    }

    /**
     * Test case to verify that the close action has the correct visible state.
     */
    @Test
    void testCloseActionVisible() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertTrue(closeAction.isVisible());
    }

    /**
     * Test case to verify that the close action has the correct confirmation message.
     */
    @Test
    void testCloseActionConfirmationMessage() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        CloseAction closeAction = configuration.closeAction();
        assertEquals("Are you sure you want to close this file?", closeAction.getConfirmationMessage());
    }
}
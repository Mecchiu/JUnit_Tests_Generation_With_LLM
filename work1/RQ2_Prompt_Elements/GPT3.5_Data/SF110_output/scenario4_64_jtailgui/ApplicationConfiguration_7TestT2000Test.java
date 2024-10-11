// ApplicationConfiguration_7Test.java
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
 * It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
 */
class ApplicationConfiguration_7Test {

    /**
     * Test case to verify that the openAction method returns a non-null object.
     */
    @Test
    void testOpenActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertNotNull(configuration.openAction());
    }

    /**
     * Test case to verify that the openAction method returns an object of type OpenFileAction.
     */
    @Test
    void testOpenActionType() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertTrue(configuration.openAction() instanceof OpenFileAction);
    }

    /**
     * Test case to verify that the openAction method returns an object with a non-null name.
     */
    @Test
    void testOpenActionNameNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertNotNull(configuration.openAction().getName());
    }

    /**
     * Test case to verify that the openAction method returns an object with a non-empty name.
     */
    @Test
    void testOpenActionNameNotEmpty() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertFalse(configuration.openAction().getName().isEmpty());
    }

    /**
     * Test case to verify that the openAction method returns an object with a name equal to "Open".
     */
    @Test
    void testOpenActionName() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertEquals("Open", configuration.openAction().getName());
    }

    /**
     * Test case to verify that the openAction method returns an object with a non-null icon.
     */
    @Test
    void testOpenActionIconNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertNotNull(configuration.openAction().getIcon());
    }

    /**
     * Test case to verify that the openAction method returns an object with a non-null tooltip.
     */
    @Test
    void testOpenActionTooltipNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertNotNull(configuration.openAction().getTooltip());
    }

    /**
     * Test case to verify that the openAction method returns an object with a non-empty tooltip.
     */
    @Test
    void testOpenActionTooltipNotEmpty() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertFalse(configuration.openAction().getTooltip().isEmpty());
    }

    /**
     * Test case to verify that the openAction method returns an object with a tooltip equal to "Open a file".
     */
    @Test
    void testOpenActionTooltip() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertEquals("Open a file", configuration.openAction().getTooltip());
    }

    /**
     * Test case to verify that the openAction method returns an object with a non-null mnemonic.
     */
    @Test
    void testOpenActionMnemonicNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertNotNull(configuration.openAction().getMnemonic());
    }

    /**
     * Test case to verify that the openAction method returns an object with a mnemonic equal to 'O'.
     */
    @Test
    void testOpenActionMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        assertEquals('O', configuration.openAction().getMnemonic());
    }
}
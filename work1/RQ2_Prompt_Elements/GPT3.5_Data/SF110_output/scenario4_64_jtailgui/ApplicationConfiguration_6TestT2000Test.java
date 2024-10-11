// ApplicationConfiguration_6Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.IndexFileAction;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ApplicationConfiguration}.
 * It contains ten unit test cases for the {@link ApplicationConfiguration#indexFileAction()} method.
 */
class ApplicationConfiguration_6Test {

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} is not null.
     */
    @Test
    void testIndexFileActionNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertNotNull(indexFileAction);
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} is of type {@link IndexFileAction}.
     */
    @Test
    void testIndexFileActionType() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertTrue(indexFileAction instanceof IndexFileAction);
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} is a singleton.
     */
    @Test
    void testIndexFileActionSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction1 = configuration.indexFileAction();
        IndexFileAction indexFileAction2 = configuration.indexFileAction();
        assertSame(indexFileAction1, indexFileAction2);
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct scope.
     */
    @Test
    void testIndexFileActionScope() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        Scope scope = IndexFileAction.class.getAnnotation(Scope.class);
        assertNotNull(scope);
        assertEquals(scope.value(), BeanDefinition.SCOPE_SINGLETON);
        assertEquals(scope.proxyMode(), ScopedProxyMode.NO);
        assertEquals(scope.scopeName(), "");
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct dependencies.
     */
    @Test
    void testIndexFileActionDependencies() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertNotNull(indexFileAction.getJTailMainModel());
        assertNotNull(indexFileAction.getSelectIndexTypeListener());
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct properties set.
     */
    @Test
    void testIndexFileActionProperties() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertEquals("indexFileAction", indexFileAction.getName());
        assertEquals("Index", indexFileAction.getMenuName());
        assertEquals("Index", indexFileAction.getButtonName());
        assertEquals("Index", indexFileAction.getToolTip());
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct action command.
     */
    @Test
    void testIndexFileActionCommand() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertEquals("index", indexFileAction.getActionCommand());
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct mnemonic.
     */
    @Test
    void testIndexFileActionMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertEquals('I', indexFileAction.getMnemonic());
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct accelerator.
     */
    @Test
    void testIndexFileActionAccelerator() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertEquals("control shift I", indexFileAction.getAccelerator());
    }

    /**
     * Test case to verify that the bean created by {@link ApplicationConfiguration#indexFileAction()} has the correct icon.
     */
    @Test
    void testIndexFileActionIcon() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = configuration.indexFileAction();
        assertNotNull(indexFileAction.getIcon());
    }
}
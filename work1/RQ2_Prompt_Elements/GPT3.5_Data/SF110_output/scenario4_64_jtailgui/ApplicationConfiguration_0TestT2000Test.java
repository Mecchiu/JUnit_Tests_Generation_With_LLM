// ApplicationConfiguration_0Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_0Test {

    /**
     * Test case to verify that the JTailMainModel bean is not null.
     */
    @Test
    void testJTailMainModelNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertNotNull(model);
    }

    /**
     * Test case to verify that the JTailMainModel bean is a singleton.
     */
    @Test
    void testJTailMainModelSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertSame(model1, model2);
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a prototype.
     */
    @Test
    void testJTailMainModelNotPrototype() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertNotSame(model1, model2.createPrototype());
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a proxy.
     */
    @Test
    void testJTailMainModelNotProxy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(model instanceof org.springframework.aop.SpringProxy);
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a lazy initialization.
     */
    @Test
    void testJTailMainModelNotLazy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(model instanceof org.springframework.beans.factory.FactoryBean);
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a prototype with a singleton parent.
     */
    @Test
    void testJTailMainModelNotPrototypeWithSingletonParent() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertNotSame(model1.createPrototype(), model2);
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a prototype with a prototype parent.
     */
    @Test
    void testJTailMainModelNotPrototypeWithPrototypeParent() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertNotSame(model1.createPrototype(), model2.createPrototype());
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a prototype with a singleton grandparent.
     */
    @Test
    void testJTailMainModelNotPrototypeWithSingletonGrandparent() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertNotSame(model1.createPrototype().createPrototype(), model2);
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a prototype with a prototype grandparent.
     */
    @Test
    void testJTailMainModelNotPrototypeWithPrototypeGrandparent() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertNotSame(model1.createPrototype().createPrototype(), model2.createPrototype());
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a proxy with a singleton parent.
     */
    @Test
    void testJTailMainModelNotProxyWithSingletonParent() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertFalse(model1.createProxy().equals(model2));
    }

    /**
     * Test case to verify that the JTailMainModel bean is not a proxy with a prototype parent.
     */
    @Test
    void testJTailMainModelNotProxyWithPrototypeParent() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertFalse(model1.createPrototype().createProxy().equals(model2));
    }
}
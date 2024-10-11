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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public ViewMainModel viewMainModel() {
        ViewMainModel mockViewModel = new ViewMainModel();
        mockViewModel.setBundle(bundle);
        mockViewModel.setBundleName("test-bundle");
        return mockViewModel;
    }

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public ViewMainFrame viewMainFrame() {
        return new ViewMainFrame();
    }

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public ModelManager modelManager() {
        ModelManager mockModelManager = new ModelManager();
        mockModelManager.setBundle(bundle);
        return mockModelManager;
    }

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public ModelManager2 modelManager2() {
        ModelManager2 mockModelManager = new ModelManager2();
        mockModelManager.setBundle(bundle);
        return mockModelManager;
    }

    @Test(expected = NullPointerException.class)
    public void whenDestroyWhenNoMainFrameBeanThenThrowException() throws Exception {
}
}
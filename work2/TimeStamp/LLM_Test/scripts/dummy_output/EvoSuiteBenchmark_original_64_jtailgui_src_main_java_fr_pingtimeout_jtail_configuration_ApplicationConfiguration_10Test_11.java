// ApplicationConfiguration_10Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {
		private final ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
    /**
     * Quit action method that will be called when the user presses the "quit" button
     */
    @Test
    void quitAction() {
        this.applicationConfiguration.quitAction();
        assertTrue("The application should not be empty", this.applicationConfiguration.jTailMainModel.getModel().size() > 0);
        this.applicationConfiguration.quitAction();
        assertTrue("The application should be empty", this.applicationConfiguration.jTailMainModel.getModel().size() == 0);
    }

    @Bean
    public SelectIndexTypeListener getIndexTypeListener() {
        return new SelectIndexTypeListener();
    }

    @Bean
    static BeanDefinition selectIndexTypeListenerBean() {
        return  new BeanDefinition(SelectIndexTypeListener.class, "");
    }
}
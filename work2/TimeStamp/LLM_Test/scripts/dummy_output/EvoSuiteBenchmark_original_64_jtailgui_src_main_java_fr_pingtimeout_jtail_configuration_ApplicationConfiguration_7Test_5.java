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
* It contains one unit test case for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {
		
    /**
     * Create an application model.
     *
     * @return a new application model
     */
    @Bean
    private JTailMainModel jTailMainModel() {
        return new JTailMainModel();
    }

    /**
     * Create a "open file" model.
     *
     * @return a new "open file" model
     */
    @Bean
    static OpenFileModel getOpenFileModel() {
        return new OpenFileModel();
    }

    /**
     * Create "close all" action.
     *
     * @return a new "close all" action
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    private ChooseFileAction getCloseAllAction() {
        return new ChooseFileAction();
    }

    /**
     * Create "close all" action.
     *
     * @return a new "close all" action
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    private CloseAllAction closeAllAction() {
        return new CloseAllAction();
    }

    /**
     * Create "open" action.
     *
     * @return a new "open" action
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    private OpenAction openAction() {
        return new OpenAction();
    }
}

/**
* JTail configuration
*/
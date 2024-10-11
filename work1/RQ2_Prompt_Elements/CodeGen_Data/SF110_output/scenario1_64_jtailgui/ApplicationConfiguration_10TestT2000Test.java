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

    @Bean
    @Scope(value = BeanDefinition.SCOPE_NONE, proxyMode = ScopedProxyMode.INTERFACES)
    public QuitAction  quitAction(){
        return new CloseAllFilesAction();
    }
    
	@Test
	@org.junit.jupiter.api.Test
    public void newInstance_with_constructor() {
        assertNotNull(new ApplicationConfiguration());
    }
}

// ApplicationConfiguration_Actions.java
// ApplicationConfiguration_testAction_10Test.java

// ApplicationConfiguration_2Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfiguration_2Test {
		
    /**
     * Create an application main frame of the application.
     *
     * @return the application main frame
     */
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public JTailMainFrame jTailMainFrame() {
        return new JTailMainFrame();
    }
        
    @Bean
    public ResourceBundle resourceBundle() {
        return bundle;
    }

    @Configuration
    public static class ApplicationConfiguration_2 {

    	@Bean
    	public JTailMainModel jTailMainModel() {
    		return new JTailMainModel();
    	}
    	
    }
}
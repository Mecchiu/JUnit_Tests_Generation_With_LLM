// ApplicationConfiguration_0Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_0Test {
		
    @Test
    void testJTailMainModel() {
	    BeanDefinition config = new BeanDefinition();
	    config.setBeanClass(JTailMainModel.class);
	    config.setScope(Scope.TARGET_SCOPE);
	    config.setTargetScope(Scope.PROTOTYPE);
	    config.initialize(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language", ResourceBundle.getLocale("lang")));
	    assertNotNull(config.getBeanDefinition());
	    AbstractJTailMainModel jTailMainModelInstance = new JTailMainModel();
	    assertNotNull(jTailMainModelInstance);
	    jTailMainModelInstance.configure(config); 
    }
	
    @Test
    void testOpenFileModel() {
	    BeanDefinition config = new BeanDefinition();
	    config.setBeanClass(OpenFileModel.class);
	    config.setScope(Scope.TARGET_SCOPE);
	    config.setTargetScope(Scope.PROTOTYPE);
	    config.initialize(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language", ResourceBundle.getLocale("lang")));
	    assertNotNull(config.getBeanDefinition());
	    AbstractOpenFileModel openFileModelInstance = new OpenFileModel();
	    assertNotNull(openFileModelInstance);
}
}
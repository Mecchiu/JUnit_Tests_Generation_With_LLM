// ApplicationConfiguration_1Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {
@Configuration
    private ResourceBundle resources = ResourceBundle.getBundle("Config");
  @Test
  void getInstance() {
    assertNotNull(new ApplicationConfiguration_1_1A());
  }

	@Test
 			public void test() {
     	assertNotNull(new ApplicationConfiguration_1_1A().createController());
     	assertNotNull(new ApplicationConfiguration_1_1A().createController() instanceof OpenFileModel);  
    }

    private Class<?> createController() {
        switch (resources.getString("controller")) {
        case "Open file":
            return OpenFileModel.class;
        default:
            return null;
    }
	}
}

// ApplicationConfiguration_2.java

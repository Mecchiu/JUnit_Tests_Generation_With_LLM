// ApplicationConfiguration_12Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {
/**
* @test {@link ApplicationConfiguration#jTailMainFrame()}
*/
									 
  @Test
  public void constructorOfApplicationConfiguration_12() {
        assertNotNull(ApplicationConfiguration_12Test.jTailMainFrame());
  }

		/**
* @test {@link ApplicationConfiguration#jTailMainFrame(ResourceBundle)}
*/
							 
  @Test
  public void constructorOfApplicationConfiguration_13() {
        BeanDefinition beanDefinition = new ApplicationConfiguration_13().applicationConfiguration().jTailMainFrame(getClass().getResourceAsStream("/fr.pingtimeout.jtail.configuration.application/fr.pingtimeout.jtail_configuration.application_12.properties"));
        assertNotNull(beanDefinition);
  }

}
// ApplicationConfiguration_12.java
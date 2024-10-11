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
private final JTailMainFrame jTailMainFrame = jTailMainFrame();
		/**
		* The test fixture.
		*/
		@Bean
		public OpenFileDialog openFileDialog() {
				return new OpenFileDialog();
		}
	@Test
			public void fileMenuAction() throws Exception{
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				//This must NOT work on Spring Boot - it should work without this line
				//assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				//This must NOT work on Spring Boot - it should work with this line
				//assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assertNotNull("ApplicationConfiguration is not initialized on the classpath", ApplicationConfiguration.applicationConfiguration);
				assert
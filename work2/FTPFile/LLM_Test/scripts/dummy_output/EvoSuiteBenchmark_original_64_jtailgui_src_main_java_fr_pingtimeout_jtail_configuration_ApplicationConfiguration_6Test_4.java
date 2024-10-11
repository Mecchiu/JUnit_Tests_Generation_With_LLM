// ApplicationConfiguration_6Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#indexFileAction()} method.
*/
class ApplicationConfiguration_6Test {
		/**
		* Create a configuration.
		*/
		@Configuration
		public class ApplicationConfiguration_6Test extends ApplicationConfiguration {

			/**
			* {@link OpenFileDialog} that will be used by the test
			*/
			@Bean
			@Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
			public OpenFileDialog openFileDialog() {
				return new OpenFileDialog();
			}

			/**
			* {@link JTailMainFrame} that will be created during a test
			*/
			@Bean
			@Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
			public JTailMainFrame jTailMainFrame() {
				return new JTailMainFrame();
			}
		}

		/**
		* Test case for the {@link ApplicationConfiguration#indexFileAction()} method.
		* @throws Exception the exception to throw when the index field is null
		*/
		@Test
		public void testCreateWithNullIndex() throws Exception {
			JTailMainModel model = this.jTailMainFrame();
			assertNotNull("Null index field", model.getIndex(1));
		}
}
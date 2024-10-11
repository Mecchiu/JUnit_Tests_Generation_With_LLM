// ApplicationConfiguration_3Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {
		/**
		 * Create the {@link ApplicationConfiguration} class with a new configuration
		 * model and view application.
		 *
		 * @return a new {@link ApplicationConfiguration} class with a new configuration
		 * model and view application.
		 */
		@Bean
		@Scope(BeanDefinition.SCOPE_PROTOTYPE)
		public ApplicationConfiguration applicationConfiguration() {
			return new ApplicationConfiguration();
		}

		/**
		 * Create the {@link ApplicationConfiguration} class from a new configuration
		 * model and view application.
		 *
		 * @return a new {@link ApplicationConfiguration} class from a new configuration
		 * model and view application.
		 */
		@Bean
		public ApplicationConfiguration applicationConfiguration(OpenFileModel openFileModel){
			return (ApplicationConfiguration)applicationConfiguration();
		}

		/**
		 * Create the {@link ApplicationConfiguration} class
		 *
		 * @return a new {@link ApplicationConfiguration} class
		 *
		 */
		@Bean
		public ApplicationConfiguration applicationConfiguration() {
			return ApplicationConfiguration_3Test.applicationConfiguration;
		}

		/**
		 * Create the {@link JTailMainFrame} instance
		 *
		 * @return the instance of {@link JTailMainFrame}
		 */
		@Bean
		public JTailMainFrame jTailMainFrame() {
			return JTailMainFrame_3Test.openFileDialog;
		}

}
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
		 * Load a JTailing application based on a class name.
		 *
		 * @param className the name of a single class that will be loaded
		 *                    by the JTailing application based on the class path
		 */
		@Configuration
		public static class LoadJTailingApplication {
				/**
				 * Create the JTailing framework.
				 */
				@Bean
				public JTailMainModel jTailingMainModel() { return new JTailMainModel(); }

				/**
				 * Create the JTailing application.
				 */
				@Bean
				public JTailMainFrame jTailingMainFrame() { return new JTailMainFrame(); }
		}
	}
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
		/*
		 * Note: The code for this test is a copied from the base class
		 * ApplicationConfigurationTest.testOpenFileModel().
		 * For a separate unit test, look for its javadoc
		 */

		private static final int FILE_NOT_OPEN_MAX = 8;
		private static final int FILE_NOT_RENAMED_MAX = 8;

		@Test
		void testGetOpenFileModel() {
						assertNotNull(ApplicationConfiguration.openFileModel());
		}

		@Test
		void testGetOpenFileDialog() {
					JTailMainModel jTailMainModel = JTailMainFrame.frameMainModel();
					assertNotNull(jTailMainModel);
		}

		@Configuration
		public static class ApplicationConfiguration {
				@Bean
				public JTailMainModel jTailModel() {
						return new JTailMainModel();
				}

				@Bean
				public JTailMainModel jTailModel(JTailMainModel jTailMainModel) {
						return jTailMainModel;
				}
		}
}
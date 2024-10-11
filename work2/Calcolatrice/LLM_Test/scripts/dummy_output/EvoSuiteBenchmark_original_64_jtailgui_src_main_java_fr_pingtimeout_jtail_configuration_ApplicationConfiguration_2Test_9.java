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
		private final String applicationName = "ApplicationConfiguration";
		private final String defaultPath = "/" ;
		private final String defaultUrl = defaultPath ;
		private final ResourceBundle resourceBundle = ResourceBundle.getBundle(bundle.getString("application.configuration.message"));
		private final String indexPath = defaultUrl+"/"+FileMenuAction.file.getName() ;
		
		/**
		 * Test method for {@link fr.pingtimeout.jtail.gui.configuration.ApplicationConfiguration#fileMenuAction()}
		 * @throws Exception if method call fails
		 */
		@Test
		public void testFileMenuAction() throws Exception {
			System.out.println("--> " + resourceBundle.getString("application.configuration.start"));
     		final JTailMainFrame mainFrame = new JTailMainFrame(IndexFileAction.main, true, false);

			// Get current application.
			final JTailMainModel mainModel = mainFrame.getMainModel();
			assertTrue(mainModel.getConfigurations().size() == 1);
			assertTrue("ApplicationConfiguration was created by an unproper parent application", mainModel.getConfigurations().get(0).isProperConfiguration());
			assertTrue("ApplicationConfiguration was not created by a registered Open File Action", mainModel.getOpenFileModel().getAction() instanceof OpenFileAction);	

		}

		/**
		 * 
		 */
		@Test
		public void testDefaultPathConfig() {
}
}
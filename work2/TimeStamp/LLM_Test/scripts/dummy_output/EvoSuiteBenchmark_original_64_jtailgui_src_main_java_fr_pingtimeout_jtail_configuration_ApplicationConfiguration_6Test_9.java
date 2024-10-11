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
	 * Test the constructor
	 *
	 */
	@Test
	void testConstructor() {
		//No parameters

		ResourceBundle messageResources = null;

		assertNull(JTailMainFrame.isOpenFileDialog());
		assertNull(JTailMainFrame.getIndexFileDialog());

	}
	@Configuration
	static class ApplicationConfiguration_6TestOne {

		/**
		 * No constructor
		 */
		@Bean
		public ApplicationConfiguration_6TestOne(ResourceBundle messageResources) {
			//This is a constructor only for testing

			this.messageResources = messageResources;
		}

		BeanDefinition createIndexFileDialogBeanDefinition() {
			BeanDefinition beanDefinition = BeanDefinitionBuilder.beanDefinition();
			beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
			return beanDefinition;
		}

		ResourceBundle messageResources;
	}
}
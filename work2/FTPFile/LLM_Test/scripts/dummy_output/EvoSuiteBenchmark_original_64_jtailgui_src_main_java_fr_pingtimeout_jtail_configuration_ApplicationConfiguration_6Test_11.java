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
		* Run all the unit tests.
		*/
			
	@Test
	public void test_indexFileAction() {
		
		assertNotNull("indexing of an action was null.", indexActionMethod());

		assertEquals("indexing of the action was non-existing.", -1, indexActionMethod().returnResult());
	}
	
	// FIXME
	@Test
	public void test_indexFileModel() {
		
		assertNotNull("indexing of an model was null.", indexFileModel());

		assertEquals("indexing of the model was non-existing.", -1, indexFileModel().returnResult());
	}
		// @formatter:off
		
		@Configuration
		public class ApplicationConfiguration_6__Test {}
	
		@ScopedProxyMode
		@Bean
		public static ApplicationConfiguration_6 testProxiedApplicationConfiguration() {
			return new ApplicationConfiguration_6();
		}
		// @formatter:on
		
		@Bean
		public JTailMainModel jTailMainModel() {
			return new JTailMainModel();
		}
		
		@Bean
		public JTailMainFrame jTailMainFrame() {
			return new JTailMainFrame();
		}

		@Bean
		public SelectIndexTypeListener indexActionMethod() {
}
}
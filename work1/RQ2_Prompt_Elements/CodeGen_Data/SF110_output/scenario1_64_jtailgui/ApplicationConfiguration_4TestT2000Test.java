// ApplicationConfiguration_4Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {
// Test case Name (description of test )
	@Test
	void configureOpenFileAction() {
		// We configure the ApplicationConfiguration for a view with the right view. (this view is also in the Open File View)
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		// But this is a new bean as you will be starting up the application context
		assertNotNull(scopedConfig.getView());
	}

		// Test method named configureOpenFileAction() of ApplicationConfiguration class
	@Test
	void configureOpenFileActionAndView() {
		// We configure the ApplicationConfiguration and View for a view with the right view. (this view is also in the Open File View)
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.setView("test");
		scopedConfig.afterPropertiesSet();
	}

	@Configuration
	public static class TestConfiguration {
		@Bean
		public JTailMainFrame create(JTailMainModel mainModel, OpenFileModel openFileModel) {
			JTailMainFrame jtMainFrame = new JTailMainFrame(mainModel);
			return jtMainFrame;
		}
	}

	// ApplicationConfiguration_7Test.java
	
	@Test
	void configureShowOpenFileDialog() {
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		OpenFileDialog openFileDialog = new OpenFileDialog(null);
		assertNotNull(openFileDialog);
	}

	@Test
	void configureShowOpenFileDialogForProject() {
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		OpenFileDialog openFileDialog = new OpenFileDialog(null);
		assertNotNull(openFileDialog);
	}

	@Test
	void configureViewName(ResourceBundle resourceBundle) {
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		assertNotNull(resourceBundle);
	}

	@Test
	void configureNoIndexType(ResourceBundle resourceBundle) {
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		assertNotNull(resourceBundle);
	}

	@Test
	void configureNoFileType(ResourceBundle resourceBundle) {
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		assertNotNull(resourceBundle);
	}

	@Test
	void configureNoView(ResourceBundle resourceBundle) {
		ApplicationConfiguration scopedConfig = new ApplicationConfiguration();
		scopedConfig.afterPropertiesSet();
		assertNotNull(resourceBundle);
	}

	// ApplicationConfiguration_6Test.java

	@Configuration
    public static class TestConfiguration {
		@Bean
		public JTailMainFrame create(JTailMainModel mainModel, OpenFileModel openFileModel) {
		return new JTailMainFrame(mainModel);
		}
    }
}

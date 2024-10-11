// ApplicationConfiguration_13Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {
		
	// Create the model and a "view" action
	@Bean(name="applicationConfiguration" )
	public AppConfiguration openFileDialog() {
		return new AppConfiguration();
	}

	// Create the model and a "view" action
	private OpenFileModel openFileModel() {
		return new OpenFileModel();
	}

	//  Create the model and a "view" action
	@Bean
	public OpenFileDialog openFileDialog () {
		BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(OpenFileDialog.class).getBeanDefinition();
		return new OpenFileDialog(beanDefinition);
	}
	
	/**
	 * Initialize the model object and the view actions
	 *
	 * @param model the model object of the application
	 * @param viewAction the view action
	 */
	private void initModelObject(JTailMainModel model, ViewAction viewAction) throws Exception {
		
		// Model constructor
		try { model.setIndex(-1); } catch (Exception e) { assertNull(e.getMessage(), e); } assertNull("model.getIndex()", model.getIndex());
		try { model.setOpenFileModel(openFileModel()); } catch (Exception e) { assertNull(e.getMessage(), e); } assertNull("model.getOpenFileModel()", model.getOpenFileModel());
}
}
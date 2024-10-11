// ApplicationConfigurationTest.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileList());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileList());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel().getFileList());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel().getFileListModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel().getFileListModel().getFileList());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel().getFileListModel().getFileListModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel().getFileListModel().getFileListModel().getFileList());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model_with_a_null_value_for_the_file_list_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNull(closeAllAction.getModel().getFileListModel().getFileListModel().getFileListModel().getFileListModel().getFileListModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_instance_with_a_JTailMainModel_instance_
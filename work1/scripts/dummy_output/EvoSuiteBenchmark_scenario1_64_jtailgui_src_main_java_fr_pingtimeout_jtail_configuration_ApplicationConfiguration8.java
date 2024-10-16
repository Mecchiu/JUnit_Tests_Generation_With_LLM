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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void closeAction_should_return_a_CloseAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction);
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_name() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileName());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContent());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content_as_string() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContentAsString());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content_as_string_with_line_numbers() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContentAsStringWithLineNumbers());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content_as_string_with_line_numbers_and_index() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContentAsStringWithLineNumbersAndIndex());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content_as_string_with_index() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContentAsStringWithIndex());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content_as_string_with_index_and_line_numbers() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContentAsStringWithIndexAndLineNumbers());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_instance_with_a_JTailMainModel_instance_as_parameter_with_a_null_value_for_the_file_content_as_string_with_index_and_line_numbers_and_index() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNull(closeAction.getModel().getFileContentAsStringWithIndexAndLineNumbersAndIndex());
	}
	
}
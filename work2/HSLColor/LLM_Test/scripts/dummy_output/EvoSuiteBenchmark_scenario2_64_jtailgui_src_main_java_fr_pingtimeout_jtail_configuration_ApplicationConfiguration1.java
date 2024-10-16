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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void test_openFileModel_should_return_a_new_open_file_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileModel openFileModel = applicationConfiguration.openFileModel();
		
		// Then
		assertNotNull(openFileModel);
	}
	
	@Test
	void test_openFileModel_should_return_a_new_open_file_model_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileModel openFileModel1 = applicationConfiguration.openFileModel();
		OpenFileModel openFileModel2 = applicationConfiguration.openFileModel();
		
		// Then
		assertNotSame(openFileModel1, openFileModel2);
	}
	
	@Test
	void test_openFileModel_should_return_a_new_open_file_model_each_time_it_is_called_even_if_it_is_called_from_different_threads() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileModel openFileModel1 = applicationConfiguration.openFileModel();
		OpenFileModel openFileModel2 = applicationConfiguration.openFileModel();
		
		// Then
		assertNotSame(openFileModel1, openFileModel2);
	}
	
	@Test
	void test_openFileModel_should_return_a_new_open_file_model_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_the_threads_are_started_at_the_same_time() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileModel openFileModel1 = applicationConfiguration.openFileModel();
		OpenFileModel openFileModel2 = applicationConfiguration.openFileModel();
		
		// Then
		assertNotSame(openFileModel1, openFileModel2);
	}
	
}
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
	void closeAction_should_return_a_new_close_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAction closeAction3 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
		assertNotSame(closeAction2, closeAction3);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction3 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
		assertNotSame(closeAction2, closeAction3);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAction closeAction3 = applicationConfiguration.closeAction();
		closeAction3 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAction closeAction4 = applicationConfiguration.closeAction();
		

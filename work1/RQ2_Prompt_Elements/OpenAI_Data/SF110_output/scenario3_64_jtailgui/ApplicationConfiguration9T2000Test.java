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
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
		assertTrue(closeAllAction instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction1);
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction1 instanceof CloseAllAction);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times_and_the_computer_has_been_restarted() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several
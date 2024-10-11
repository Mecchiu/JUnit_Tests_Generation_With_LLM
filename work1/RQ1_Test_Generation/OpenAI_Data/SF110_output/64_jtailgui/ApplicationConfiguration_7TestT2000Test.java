// ApplicationConfiguration_7Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {

	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_twice() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_three_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_four_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_five_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_six_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_seven_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_eight_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called_even_if_the_previous_one_is_garbage_collected_nine_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		openAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {

	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory_and_the_factory_is_a_singleton() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory_and_the_factory_is_a_singleton_and_the_singleton_is_a_prototype() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory_and_the_factory_is_a_singleton_and_the_singleton_is_a_prototype_and_the_prototype_is_a_singleton() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory_and_the_factory_is_a_singleton_and_the_singleton_is_a_prototype_and_the_prototype_is_a_singleton_and_the_singleton_is_a_prototype() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory_and_the_factory_is_a_singleton_and_the_singleton_is_a_prototype_and_the_prototype_is_a_singleton_and_the_singleton_is_a_prototype_and_the_prototype_is_a_singleton() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(openFileDialog1, openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_instance_of_OpenFileDialog_each_time_it_is_called_even_if_the_method_is_called_from_different_instances_of_ApplicationConfiguration_and_the_instances_are_created_by_the_same_factory_and_the_factory_is_a_singleton_and_the_singleton_is_a_prototype_and_the_prototype_is_a_singleton_and_the_singleton_is_a_prototype_and_the_prototype_is_a_singleton_and_the_singleton_is_a_prototype() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration1.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration2.openFileDialog();
		
		// Then
		assertNotSame(open
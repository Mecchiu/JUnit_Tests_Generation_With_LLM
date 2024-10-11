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
* It contains ten unit test cases for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_instances() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders_and_different_jvms() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders_and_different_jvms_and_different_machines() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders_and_different_jvms_and_different_machines_and_different_continents() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders_and_different_jvms_and_different_machines_and_different_continents_and_different_galaxies() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders_and_different_jvms_and_different_machines_and_different_continents_and_different_galaxies_and_different_universes() {
		// Given
		ApplicationConfiguration applicationConfiguration1 = new ApplicationConfiguration();
		ApplicationConfiguration applicationConfiguration2 = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration1.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration2.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_each_time_it_is_called_even_if_it_is_called_from_different_threads_and_different_instances_and_different_classloaders_and_different_jvms_and_different_machines_and_different_continents_and_different_galaxies_and_different_universes_and_different_dimensions() {
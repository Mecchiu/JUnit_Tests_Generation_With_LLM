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
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction);
		assertTrue(chooseFileAction instanceof ChooseFileAction);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction);
		assertTrue(chooseFileAction instanceof ChooseFileAction);
		assertNotNull(chooseFileAction.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction1.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction2.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction1.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction2.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction1.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction2.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction1.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction2.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction1.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction2.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction1);
		assertNotNull(chooseFileAction2);
		assertTrue(chooseFileAction1 instanceof ChooseFileAction);
		assertTrue(chooseFileAction2 instanceof ChooseFileAction);
		assertNotNull(chooseFileAction1.getOpenFileModel());
		assertNotNull(chooseFileAction2.getOpenFileModel());
		assertSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
		assertTrue(chooseFileAction1.getOpenFileModel() instanceof OpenFileModel);
		assertTrue(chooseFileAction2.getOpenFileModel() instanceof OpenFileModel);
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction1.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), chooseFileAction2.getOpenFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
		assertSame(applicationConfiguration.openFileModel(), applicationConfiguration.openFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_instance_of_ChooseFileAction_with_a_non_null_OpenFileModel_each_time_it_is_called_but_the_same_instance_of_OpenFileModel_each_
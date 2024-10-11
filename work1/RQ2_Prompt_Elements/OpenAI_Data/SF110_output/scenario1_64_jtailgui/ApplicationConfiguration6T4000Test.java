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
* It contains ten unit test cases for the {@link ApplicationConfiguration#indexFileAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_OpenFileModel_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
		assertNotNull(indexFileAction.getOpenFileDialog());
		assertTrue(indexFileAction.getOpenFileDialog() instanceof OpenFileDialog);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter_and_a_SelectIndexTypeListener_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
		assertNotNull(indexFileAction.getOpenFileDialog());
		assertTrue(indexFileAction.getOpenFileDialog() instanceof OpenFileDialog);
		assertNotNull(indexFileAction.getSelectIndexTypeListener());
		assertTrue(indexFileAction.getSelectIndexTypeListener() instanceof SelectIndexTypeListener);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter_and_a_SelectIndexTypeListener_as_parameter_and_a_ResourceBundle_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
		assertNotNull(indexFileAction.getOpenFileDialog());
		assertTrue(indexFileAction.getOpenFileDialog() instanceof OpenFileDialog);
		assertNotNull(indexFileAction.getSelectIndexTypeListener());
		assertTrue(indexFileAction.getSelectIndexTypeListener() instanceof SelectIndexTypeListener);
		assertNotNull(indexFileAction.getResourceBundle());
		assertTrue(indexFileAction.getResourceBundle() instanceof ResourceBundle);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter_and_a_SelectIndexTypeListener_as_parameter_and_a_ResourceBundle_as_parameter_and_a_OpenFileAction_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
		assertNotNull(indexFileAction.getOpenFileDialog());
		assertTrue(indexFileAction.getOpenFileDialog() instanceof OpenFileDialog);
		assertNotNull(indexFileAction.getSelectIndexTypeListener());
		assertTrue(indexFileAction.getSelectIndexTypeListener() instanceof SelectIndexTypeListener);
		assertNotNull(indexFileAction.getResourceBundle());
		assertTrue(indexFileAction.getResourceBundle() instanceof ResourceBundle);
		assertNotNull(indexFileAction.getOpenFileAction());
		assertTrue(indexFileAction.getOpenFileAction() instanceof OpenFileAction);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter_and_a_SelectIndexTypeListener_as_parameter_and_a_ResourceBundle_as_parameter_and_a_OpenFileAction_as_parameter_and_a_CloseFileAction_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
		assertNotNull(indexFileAction.getOpenFileDialog());
		assertTrue(indexFileAction.getOpenFileDialog() instanceof OpenFileDialog);
		assertNotNull(indexFileAction.getSelectIndexTypeListener());
		assertTrue(indexFileAction.getSelectIndexTypeListener() instanceof SelectIndexTypeListener);
		assertNotNull(indexFileAction.getResourceBundle());
		assertTrue(indexFileAction.getResourceBundle() instanceof ResourceBundle);
		assertNotNull(indexFileAction.getOpenFileAction());
		assertTrue(indexFileAction.getOpenFileAction() instanceof OpenFileAction);
		assertNotNull(indexFileAction.getCloseFileAction());
		assertTrue(indexFileAction.getCloseFileAction() instanceof CloseFileAction);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter_and_a_SelectIndexTypeListener_as_parameter_and_a_ResourceBundle_as_parameter_and_a_OpenFileAction_as_parameter_and_a_CloseFileAction_as_parameter_and_a_ExitAction_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.getJTailMainFrame() instanceof JTailMainFrame);
		assertNotNull(indexFileAction.getOpenFileDialog());
		assertTrue(indexFileAction.getOpenFileDialog() instanceof OpenFileDialog);
		assertNotNull(indexFileAction.getSelectIndexTypeListener());
		assertTrue(indexFileAction.getSelectIndexTypeListener() instanceof SelectIndexTypeListener);
		assertNotNull(indexFileAction.getResourceBundle());
		assertTrue(indexFileAction.getResourceBundle() instanceof ResourceBundle);
		assertNotNull(indexFileAction.getOpenFileAction());
		assertTrue(indexFileAction.getOpenFileAction() instanceof OpenFileAction);
		assertNotNull(indexFileAction.getCloseFileAction());
		assertTrue(indexFileAction.getCloseFileAction() instanceof CloseFileAction);
		assertNotNull(indexFileAction.getExitAction());
		assertTrue(indexFileAction.getExitAction() instanceof ExitAction);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_instance_of_IndexFileAction_with_a_JTailMainModel_as_parameter_and_a_OpenFileModel_as_parameter_and_a_JTailMainFrame_as_parameter_and_a_OpenFileDialog_as_parameter_and_a_SelectIndexTypeListener_as_parameter_and_a_ResourceBundle_as_parameter_and_a_OpenFileAction_as_parameter_and_a_CloseFileAction_as_parameter_and_a_ExitAction_as_parameter_and_a_AboutAction_as_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
		assertTrue(indexFileAction instanceof IndexFileAction);
		assertNotNull(indexFileAction.getJTailMainModel());
		assertTrue(indexFileAction.getJTailMainModel() instanceof JTailMainModel);
		assertNotNull(indexFileAction.getOpenFileModel());
		assertTrue(indexFileAction.getOpenFileModel() instanceof OpenFileModel);
		assertNotNull(indexFileAction.getJTailMainFrame());
		assertTrue(indexFileAction.
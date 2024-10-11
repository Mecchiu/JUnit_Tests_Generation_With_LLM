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
	void test_indexFileAction_returns_a_new_IndexFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction);
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getOpenFileModel());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener_with_a_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener().getOpenFileModel());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener_with_a_OpenFileModel_with_a_ResourceBundle() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener().getOpenFileModel().getResourceBundle());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener_with_a_OpenFileModel_with_a_ResourceBundle_with_a_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener().getOpenFileModel().getResourceBundle().getJTailMainModel());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener_with_a_OpenFileModel_with_a_ResourceBundle_with_a_JTailMainModel_with_a_JTailMainFrame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener().getOpenFileModel().getResourceBundle().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener_with_a_OpenFileModel_with_a_ResourceBundle_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener().getOpenFileModel().getResourceBundle().getJTailMainModel().getJTailMainFrame().getOpenFileDialog());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener_with_a_OpenFileModel_with_a_ResourceBundle_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertNotNull(indexFileAction.getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener().getOpenFileModel().getResourceBundle().getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener());
	}
	
	@Test
	void test_indexFileAction_returns_a_new_IndexFileAction_with_a_JTailMainModel_with_a_JTailMainFrame_with_a_OpenFileDialog_with_a_SelectIndexTypeListener
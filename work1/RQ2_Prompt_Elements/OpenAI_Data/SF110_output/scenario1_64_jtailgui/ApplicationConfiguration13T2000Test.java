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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertTrue(openFileDialog instanceof OpenFileDialog);
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getOpenFileModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_ChooseFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getChooseFileAction());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_SelectIndexTypeListener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getSelectIndexTypeListener());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_IndexFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getIndexFileAction());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_OpenFileModel_with_a_non_null_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getOpenFileModel());
		assertNotNull(openFileDialog.getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_ChooseFileAction_with_a_non_null_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getChooseFileAction());
		assertNotNull(openFileDialog.getChooseFileAction().getOpenFileModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_SelectIndexTypeListener_with_a_non_null_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getSelectIndexTypeListener());
		assertNotNull(openFileDialog.getSelectIndexTypeListener().getOpenFileModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_IndexFileAction_with_a_non_null_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getIndexFileAction());
		assertNotNull(openFileDialog.getIndexFileAction().getOpenFileModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_OpenFileModel_with_a_non_null_JTailMainModel_with_a_non_null_JTailMainFrame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getOpenFileModel());
		assertNotNull(openFileDialog.getOpenFileModel().getJTailMainModel());
		assertNotNull(openFileDialog.getOpenFileModel().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_ChooseFileAction_with_a_non_null_OpenFileModel_with_a_non_null_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getChooseFileAction());
		assertNotNull(openFileDialog.getChooseFileAction().getOpenFileModel());
		assertNotNull(openFileDialog.getChooseFileAction().getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_SelectIndexTypeListener_with_a_non_null_OpenFileModel_with_a_non_null_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getSelectIndexTypeListener());
		assertNotNull(openFileDialog.getSelectIndexTypeListener().getOpenFileModel());
		assertNotNull(openFileDialog.getSelectIndexTypeListener().getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_openFileDialog_returns_a_new_instance_of_OpenFileDialog_with_a_non_null_IndexFileAction_with_a_non_null_OpenFileModel_with_a_non_null_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
		assertNotNull(openFileDialog.getIndexFileAction());
		assertNotNull(openFileDialog.getIndexFileAction().get
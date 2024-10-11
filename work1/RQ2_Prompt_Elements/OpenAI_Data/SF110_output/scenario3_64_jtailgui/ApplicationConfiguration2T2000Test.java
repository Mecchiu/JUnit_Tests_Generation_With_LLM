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
* It contains ten unit test cases for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction);
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel().getSelectIndexTypeListener());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener_with_a_non_null_j_tail_main_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel().getSelectIndexTypeListener().getJTailMainModel());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener_with_a_non_null_j_tail_main_model_with_a_non_null_j_tail_main_frame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel().getSelectIndexTypeListener().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener_with_a_non_null_j_tail_main_model_with_a_non_null_j_tail_main_frame_with_a_non_null_resource_bundle() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel().getSelectIndexTypeListener().getJTailMainModel().getJTailMainFrame().getResourceBundle());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener_with_a_non_null_j_tail_main_model_with_a_non_null_j_tail_main_frame_with_a_non_null_resource_bundle_with_a_non_null_open_file_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel().getSelectIndexTypeListener().getJTailMainModel().getJTailMainFrame().getResourceBundle().getOpenFileAction());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener_with_a_non_null_j_tail_main_model_with_a_non_null_j_tail_main_frame_with_a_non_null_resource_bundle_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction.getOpenFileAction().getOpenFileDialog().getOpenFileModel().getSelectIndexTypeListener().getJTailMainModel().getJTailMainFrame().getResourceBundle().getOpenFileAction().getOpenFileDialog());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_new_file_menu_action_with_a_non_null_open_file_action_with_a_non_null_open_file_dialog_with_a_non_null_open_file_model_with_a_non_null_select_index_type_listener_with_a_non_null_j_tail_main_model_with_a_non_null_j_tail_main_frame_with_a_non_null_resource_bundle_with_a_non_null_open_file_action_with_a
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertNotNull(actual);
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_mnemonic_equal_to_action_tools_mnemonic() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
		assertNull(actual.getAccelerator());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null_and_icon_equal_to_null() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
		assertNull(actual.getAccelerator());
		assertNull(actual.getIcon());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null_and_icon_equal_to_null_and_actionListener_equal_to_null() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
		assertNull(actual.getAccelerator());
		assertNull(actual.getIcon());
		assertNull(actual.getActionListener());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null_and_icon_equal_to_null_and_actionListener_equal_to_null_and_enabled_equal_to_true() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
		assertNull(actual.getAccelerator());
		assertNull(actual.getIcon());
		assertNull(actual.getActionListener());
		assertTrue(actual.isEnabled());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null_and_icon_equal_to_null_and_actionListener_equal_to_null_and_enabled_equal_to_true_and_selected_equal_to_false() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
		assertNull(actual.getAccelerator());
		assertNull(actual.getIcon());
		assertNull(actual.getActionListener());
		assertTrue(actual.isEnabled());
		assertFalse(actual.isSelected());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null_and_icon_equal_to_null_and_actionListener_equal_to_null_and_enabled_equal_to_true_and_selected_equal_to_false_and_tooltip_equal_to_null() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("action.tools.label", actual.getLabel());
		assertEquals("action.tools.mnemonic", actual.getMnemonic());
		assertNull(actual.getAccelerator());
		assertNull(actual.getIcon());
		assertNull(actual.getActionListener());
		assertTrue(actual.isEnabled());
		assertFalse(actual.isSelected());
		assertNull(actual.getTooltip());
	}
	
	@Test
	void test_toolsMenuAction_should_return_a_new_MenuAction_instance_with_label_equal_to_action_tools_label_and_mnemonic_equal_to_action_tools_mnemonic_and_accelerator_equal_to_null_and_icon_equal_to_null_and_actionListener_equal_to_null_and_enabled_equal_to_true_and_selected_equal_to_false_and_tooltip_equal_to_null_and_actionCommand_equal_to_null() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction actual = applicationConfiguration.toolsMenuAction();

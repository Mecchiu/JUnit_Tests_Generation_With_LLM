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
	void test_fileMenuAction_should_return_a_new_menu_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(menuAction);
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_label_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("File", menuAction.getLabel());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_mnemonic_f() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("F", menuAction.getMnemonic());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_accelerator() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getAccelerator());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_icon() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getIcon());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_action_listener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getActionListener());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_action_command() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getActionCommand());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_short_description() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getShortDescription());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_long_description() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getLongDescription());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_small_icon() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getSmallIcon());
	}
	
	@Test
	void test_fileMenuAction_should_return_a_menu_action_with_no_large_icon() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(menuAction.getLargeIcon());
	}
	
}
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
	void test_toolsMenuAction_returns_a_new_MenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertNotNull(menuAction);
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_label_from_bundle() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("Tools", menuAction.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_mnemonic_from_bundle() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("T", menuAction.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_label_from_bundle_when_bundle_is_changed() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("Outils", menuAction.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_mnemonic_from_bundle_when_bundle_is_changed() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("O", menuAction.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_label_from_bundle_when_bundle_is_changed_and_changed_back() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("Tools", menuAction.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_mnemonic_from_bundle_when_bundle_is_changed_and_changed_back() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("T", menuAction.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_label_from_bundle_when_bundle_is_changed_and_changed_back_and_changed_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("Outils", menuAction.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_mnemonic_from_bundle_when_bundle_is_changed_and_changed_back_and_changed_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("O", menuAction.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_label_from_bundle_when_bundle_is_changed_and_changed_back_and_changed_again_and_changed_back_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("Tools", menuAction.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_mnemonic_from_bundle_when_bundle_is_changed_and_changed_back_and_changed_again_and_changed_back_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("T", menuAction.getMnemonic());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_label_from_bundle_when_bundle_is_changed_and_changed_back_and_changed_again_and_changed_back_again_and_changed_again_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("Outils", menuAction.getLabel());
	}
	
	@Test
	void test_toolsMenuAction_returns_a_new_MenuAction_instance_with_mnemonic_from_bundle_when_bundle_is_changed_and_changed_back_and_changed_again_and_changed_back_again_and_changed_again_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("en"));
		ResourceBundle.clearCache();
		ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.action.MenuAction", new Locale("fr"));
		
		// When
		MenuAction menuAction = applicationConfiguration.toolsMenuAction();
		
		// Then
		assertEquals("O", menuAction.getMnemonic());
	}
}
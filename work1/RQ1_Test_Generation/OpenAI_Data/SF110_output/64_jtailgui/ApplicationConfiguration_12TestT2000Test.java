// ApplicationConfiguration_12Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {

	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_JTailMainModel_instance_as_first_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getModel());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_MenuAction_instance_as_second_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getFileMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_OpenFileAction_instance_as_third_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getOpenAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_CloseAction_instance_as_fourth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getCloseAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_CloseAllAction_instance_as_fifth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getCloseAllAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_QuitAction_instance_as_sixth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getQuitAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_MenuAction_instance_as_seventh_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getToolsMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_HighlightAction_instance_as_eighth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getHighlightAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_JTailMainModel_instance_as_first_parameter_and_a_MenuAction_instance_as_second_parameter_and_a_OpenFileAction_instance_as_third_parameter_and_a_CloseAction_instance_as_fourth_parameter_and_a_CloseAllAction_instance_as_fifth_parameter_and_a_QuitAction_instance_as_sixth_parameter_and_a_MenuAction_instance_as_seventh_parameter_and_a_HighlightAction_instance_as_eighth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getModel());
		assertNotNull(jTailMainFrame.getFileMenuAction());
		assertNotNull(jTailMainFrame.getOpenAction());
		assertNotNull(jTailMainFrame.getCloseAction());
		assertNotNull(jTailMainFrame.getCloseAllAction());
		assertNotNull(jTailMainFrame.getQuitAction());
		assertNotNull(jTailMainFrame.getToolsMenuAction());
		assertNotNull(jTailMainFrame.getHighlightAction());
	}
	
}

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
	void test_openFileDialog_should_return_a_new_OpenFileDialog_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
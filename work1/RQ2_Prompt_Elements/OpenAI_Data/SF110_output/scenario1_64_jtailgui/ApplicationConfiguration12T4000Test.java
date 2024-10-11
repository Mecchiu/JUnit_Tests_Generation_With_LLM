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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_FileMenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getFileMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_OpenAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getOpenAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_CloseAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getCloseAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_CloseAllAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getCloseAllAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_QuitAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getQuitAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_ToolsMenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getToolsMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_HighlightAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getHighlightAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_with_a_OpenFileModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel().getOpenFileModel());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_with_a_OpenFileModel_instance_with_a_OpenFileDialog_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel().getOpenFileModel().getOpenFileDialog());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_with_a_OpenFileModel_instance_with_a_OpenFileDialog_instance_with_a_SelectIndexTypeListener_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel().getOpenFileModel().getOpenFileDialog().getSelectIndexTypeListener());
	}
	
}

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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_FileMenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getFileMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_OpenAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getOpenAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_CloseAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getCloseAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_CloseAllAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getCloseAllAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_QuitAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getQuitAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_ToolsMenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getToolsMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_HighlightAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getHighlightAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_with_a_OpenFileModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel().getOpenFileModel());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_with_a_OpenFileModel_instance_with_a_OpenFileDialog_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel().getOpenFileModel().getOpenFileDialog());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_with_a_OpenFileModel_instance_with_a_OpenFileDialog_instance_with_a_SelectIndexTypeListener_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel().getOpenFileModel().getOpenFileDialog().getSelectIndexTypeListener());
	}
	
}

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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_FileMenuAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getFileMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_OpenAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMain
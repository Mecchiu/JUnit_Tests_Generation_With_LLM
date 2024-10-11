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
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_JTailMainModel_instance_as_first_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getModel());
		assertTrue(jTailMainFrame.getModel() instanceof JTailMainModel);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_FileMenuAction_instance_as_second_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getFileMenuAction());
		assertTrue(jTailMainFrame.getFileMenuAction() instanceof FileMenuAction);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_OpenAction_instance_as_third_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getOpenAction());
		assertTrue(jTailMainFrame.getOpenAction() instanceof OpenAction);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_CloseAction_instance_as_fourth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getCloseAction());
		assertTrue(jTailMainFrame.getCloseAction() instanceof CloseAction);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_CloseAllAction_instance_as_fifth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getCloseAllAction());
		assertTrue(jTailMainFrame.getCloseAllAction() instanceof CloseAllAction);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_QuitAction_instance_as_sixth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getQuitAction());
		assertTrue(jTailMainFrame.getQuitAction() instanceof QuitAction);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_ToolsMenuAction_instance_as_seventh_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getToolsMenuAction());
		assertTrue(jTailMainFrame.getToolsMenuAction() instanceof ToolsMenuAction);
	}
	
	@Test
	void test_jTailMainFrame_returns_a_JTailMainFrame_instance_with_a_HighlightAction_instance_as_eighth_parameter() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
		assertTrue(jTailMainFrame instanceof JTailMainFrame);
		assertNotNull(jTailMainFrame.getHighlightAction());
		assertTrue(jTailMainFrame.getHighlightAction() instanceof HighlightAction);
	}
	
}

// ApplicationConfiguration.java
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

@Configuration
public class ApplicationConfiguration {

    /**
     * Create the main frame of the application
     *
     * @return the main frame of the application
     */
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public JTailMainFrame jTailMainFrame() {
        return new JTailMainFrame(jTailMainModel(), fileMenuAction(), openAction(), closeAction(), closeAllAction(), quitAction(), toolsMenuAction(), highlightAction());
    }
}

// ApplicationConfigurationTest.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.
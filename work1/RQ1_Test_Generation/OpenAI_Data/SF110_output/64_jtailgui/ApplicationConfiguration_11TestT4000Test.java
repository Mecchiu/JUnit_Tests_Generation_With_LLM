// ApplicationConfiguration_11Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {

	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = new JTailMainModel();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertEquals(jTailMainModel, highlightAction.getJTailMainModel());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction_and_a_null_CloseAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
		assertNull(highlightAction.getCloseAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction_and_a_null_CloseAction_and_a_null_CloseAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
		assertNull(highlightAction.getCloseAction());
		assertNull(highlightAction.getCloseAllAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction_and_a_null_CloseAction_and_a_null_CloseAllAction_and_a_null_QuitAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
		assertNull(highlightAction.getCloseAction());
		assertNull(highlightAction.getCloseAllAction());
		assertNull(highlightAction.getQuitAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction_and_a_null_CloseAction_and_a_null_CloseAllAction_and_a_null_QuitAction_and_a_null_ChooseFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
		assertNull(highlightAction.getCloseAction());
		assertNull(highlightAction.getCloseAllAction());
		assertNull(highlightAction.getQuitAction());
		assertNull(highlightAction.getChooseFileAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction_and_a_null_CloseAction_and_a_null_CloseAllAction_and_a_null_QuitAction_and_a_null_ChooseFileAction_and_a_null_ToolsMenuAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
		assertNull(highlightAction.getCloseAction());
		assertNull(highlightAction.getCloseAllAction());
		assertNull(highlightAction.getQuitAction());
		assertNull(highlightAction.getChooseFileAction());
		assertNull(highlightAction.getToolsMenuAction());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_null_JTailMainModel_and_a_null_JTailMainFrame_and_a_null_OpenFileModel_and_a_null_OpenFileDialog_and_a_null_SelectIndexTypeListener_and_a_null_IndexFileAction_and_a_null_OpenFileAction_and_a_null_CloseAction_and_a_null_CloseAllAction_and_a_null_QuitAction_and_a_null_ChooseFileAction_and_a_null_ToolsMenuAction_and_a_null_FileMenuAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
		assertNull(highlightAction.getJTailMainModel());
		assertNull(highlightAction.getJTailMainFrame());
		assertNull(highlightAction.getOpenFileModel());
		assertNull(highlightAction.getOpenFileDialog());
		assertNull(highlightAction.getSelectIndexTypeListener());
		assertNull(highlightAction.getIndexFileAction());
		assertNull(highlightAction.getOpenFileAction());
		assertNull(highlightAction.getCloseAction());
		assertNull(highlightAction.getCloseAllAction());
		assertNull(highlightAction.getQuitAction());
		assertNull(highlightAction.getChooseFileAction());
		assertNull(highlightAction.getToolsMenuAction());
		assertNull(highlightAction.getFileMenuAction());
	}
	
}

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
* It
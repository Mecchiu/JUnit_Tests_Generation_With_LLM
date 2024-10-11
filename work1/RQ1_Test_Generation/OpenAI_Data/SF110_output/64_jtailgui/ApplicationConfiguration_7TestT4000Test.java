// ApplicationConfiguration_7Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {

	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction.getJTailMainModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction.getOpenFileModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction.getOpenFileDialog());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_jTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1.getJTailMainModel(), openAction2.getJTailMainModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1.getOpenFileModel(), openAction2.getOpenFileModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileDialog_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1.getOpenFileDialog(), openAction2.getOpenFileDialog());
	}
	
}

// ApplicationConfiguration_8Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
		
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction);
	}
	
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance_with_a_non_null_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction.getJTailMainModel());
	}
	
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance_with_a_non_null_jTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1.getJTailMainModel(), closeAction2.getJTailMainModel());
	}
	
}

// ApplicationConfiguration_9Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		
	@Test
	void test_closeAllAction_should_return_a_new_CloseAllAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
	}
	
	@Test
	void test_closeAllAction_should_return_a_new_CloseAllAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void test_closeAllAction_should_return_a_new_CloseAllAction_instance_with_a_non_null_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction.getJTailMainModel());
	}
	
	@Test
	void test_closeAllAction_should_return_a_new_CloseAllAction_instance_with_a_non_null_jTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1.getJTailMainModel(), closeAllAction2.getJTailMainModel());
	}
	
}

// ApplicationConfiguration_Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_Test {
		
	@Test
	void test_quitAction_should_return_a_new_QuitAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction);
	}
	
	@Test
	void test_quitAction_should_return_a_new_QuitAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
}

// ApplicationConfiguration_1Test.java
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
class ApplicationConfiguration_1Test {
		
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_non_null_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction.getJTailMainModel());
	}
	
	@Test
	void test_highlightAction_should_return_a_new_HighlightAction_instance_with_a_non_null_jTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1.getJTailMainModel(), highlightAction2.getJTailMainModel());
	}
	
}

// ApplicationConfiguration_2Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.
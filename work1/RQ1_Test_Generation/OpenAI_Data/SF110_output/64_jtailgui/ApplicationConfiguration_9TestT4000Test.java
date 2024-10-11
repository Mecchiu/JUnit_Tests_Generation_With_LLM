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
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_non_null_model_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1.getModel(), closeAllAction2.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertTrue(closeAllAction.getModel() instanceof JTailMainModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertTrue(closeAllAction1.getModel() instanceof JTailMainModel);
		assertTrue(closeAllAction2.getModel() instanceof JTailMainModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction.getModel().getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_non_null_model_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1.getModel().getModel(), closeAllAction2.getModel().getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertTrue(closeAllAction.getModel().getModel() instanceof JTailModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertTrue(closeAllAction1.getModel().getModel() instanceof JTailModel);
		assertTrue(closeAllAction2.getModel().getModel() instanceof JTailModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction.getModel().getModel().getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel_with_a_non_null_model_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1.getModel().getModel().getModel(), closeAllAction2.getModel().getModel().getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel_with_a_model_that_is_a_JTailModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertTrue(closeAllAction.getModel().getModel().getModel() instanceof JTailModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel_with_a_model_that_is_a_JTailModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertTrue(closeAllAction1.getModel().getModel().getModel() instanceof JTailModel);
		assertTrue(closeAllAction2.getModel().getModel().getModel() instanceof JTailModel);
	}
	
}

// ApplicationConfiguration_10Test.java
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
class ApplicationConfiguration_10Test {
		
	@Test
	void quitAction_should_return_a_new_instance_of_QuitAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction);
	}
	
	@Test
	void quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
}

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
	void highlightAction_should_return_a_new_instance_of_HighlightAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
	}
	
	@Test
	void highlightAction_should_return_a_new_instance_of_HighlightAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction.getModel());
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_non_null_model_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1.getModel(), highlightAction2.getModel());
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_model_that_is_a_JTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertTrue(highlightAction.getModel() instanceof JTailMainModel);
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_model_that_is_a_JTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertTrue(highlightAction1.getModel() instanceof JTailMainModel);
		assertTrue(highlightAction2.getModel() instanceof JTailMainModel);
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_model_that_is_a_JTailMainModel_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction.getModel().getModel());
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_model_that_is_a_JTailMainModel_with_a_non_null_model_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1.getModel().getModel(), highlightAction2.getModel().getModel());
	}
	
	@Test
	void highlightAction_should_return_a_HighlightAction_with_a_model_that_is_a_JTailMainModel_with_a_model_that_is_a_JTailModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertTrue(highlightAction.getModel
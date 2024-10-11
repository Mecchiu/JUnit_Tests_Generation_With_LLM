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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void closeAllAction_should_return_a_new_close_all_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_in_a_row() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_in_a_row_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_in_a_row_and_then_used_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		closeAllAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_in_a_row_and_then_used_again_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		closeAllAction2.actionPerformed(null);
		closeAllAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_close_all_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_in_a_row_and_then_used_again_several_times_in_a_row() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1.actionPerformed(null);
		closeAllAction1.actionPerformed(null);
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		closeAllAction2.actionPerformed(null);
		closeAllAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
}
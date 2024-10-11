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
	void test_quitAction_should_return_a_new_quit_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		quitAction2.actionPerformed(null);
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		quitAction2.actionPerformed(null);
		quitAction2.actionPerformed(null);
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again_several_times_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		quitAction2.actionPerformed(null);
		quitAction2.actionPerformed(null);
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again_several_times_and_then_used_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1.actionPerformed(null);
		quitAction1.actionPerformed(null);
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		quitAction2.actionPerformed(null);
		quitAction2.actionPerformed(null);
		quitAction2.actionPerformed(null);
		
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
* It contains eleven unit test cases for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {
		
	@Test
	void test_highlightAction_should_return_a_new_highlight_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertNotNull(highlightAction);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		highlightAction2.actionPerformed(null);
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		highlightAction2.actionPerformed(null);
		highlightAction2.actionPerformed(null);
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again_several_times_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		highlightAction2.actionPerformed(null);
		highlightAction2.actionPerformed(null);
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
	}
	
	@Test
	void test_highlightAction_should_return_a_new_highlight_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_used_again_several_times_and_then_used_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		HighlightAction highlightAction1 = applicationConfiguration.highlightAction();
		highlightAction1.actionPerformed(null);
		highlightAction1.actionPerformed(null);
		HighlightAction highlightAction2 = applicationConfiguration.highlightAction();
		highlightAction2.actionPerformed(null);
		highlightAction2.actionPerformed(null);
		highlightAction2.actionPerformed(null);
		
		// Then
		assertNotSame(highlightAction1, highlightAction2);
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
* It contains twelve unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/

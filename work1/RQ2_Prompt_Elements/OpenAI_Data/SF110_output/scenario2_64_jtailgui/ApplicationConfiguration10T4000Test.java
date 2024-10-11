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
* It contains ten unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_quitAction_returns_a_new_quit_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_returns_a_new_quit_action_each_time_it_is_called_even_if_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times_and_the_previous_one_has_been_garbage_collected_several_times_and_the_application_configuration_has_been_recreated_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
}

// JTailMainFrame.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_Q;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.FILES_ONLY;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.KeyStroke.getKeyStroke;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class JTailMainFrame extends JFrame {

    private final JTailMainModel model;
    private final OpenFileModel openFileModel;
    private final ResourceBundle resourceBundle;
    private final JFileChooser fileChooser;
    private final JMenuItem openFileMenuItem;
    private final JMenuItem quitMenuItem;
    private final JMenuItem aboutMenuItem;
    private final JMenuItem helpMenuItem;
    private final JMenuItem findMenuItem;
    private final JMenuItem findNextMenuItem;
    private final JMenuItem findPreviousMenuItem;
    private final JMenuItem findAllMenuItem;
    private final JMenuItem findAllNextMenuItem;
    private final JMenuItem findAllPreviousMenuItem;
    private final JMenuItem findAllAllMenuItem;
    private final
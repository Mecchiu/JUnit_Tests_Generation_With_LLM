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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void closeAction_should_return_a_new_close_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used_several_times_and_then_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used_several_times_and_then_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2.actionPerformed(null);
		closeAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used_several_times_and_then_used_several_times_and_then_not_used() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2.actionPerformed(null);
		closeAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_close_action_each_time_it_is_called_even_if_the_previous_one_is_used_several_times_and_then_not_used_several_times_and_then_used_several_times_and_then_not_used_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		closeAction1.actionPerformed(null);
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction2.actionPerformed(null);
		closeAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
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

public class JTailMainFrame extends JFrame {

    private final JTailMainModel model;
    private final CloseAction closeAction;

    public JTailMainFrame(JTailMainModel model, CloseAction closeAction) {
        this.model = model;
        this.closeAction = closeAction;
    }

    public void init() {
        setTitle("JTail");
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeAction.actionPerformed(null);
            }
        });
        setSize(800, 600);
        setLocationRelativeTo(null);
    }
}

// JTailMainFrameTest.java
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTailMainFrame}.
* It contains ten unit test cases for the {@link JTailMainFrame#init()} method.
*/
class JTailMainFrameTest {
		
	@Test
	void init_should_set_the_title_of_the_frame() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("JTail");
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set_to_another_value() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("Another title");
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set_to_another_value_and_then_set_to_null() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set_to_another_value_and_then_set_to_null_and_then_set_to_another_value() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		jTailMainFrame.setTitle("Another title");
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set_to_another_value_and_then_set_to_null_and_then_set_to_another_value_and_then_set_to_null() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set_to_another_value_and_then_set_to_null_and_then_set_to_another_value_and_then_set_to_null_and_then_set_to_another_value() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		jTailMainFrame.setTitle("Another title");
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}
	
	@Test
	void init_should_set_the_title_of_the_frame_even_if_it_is_already_set_to_another_value_and_then_set_to_null_and_then_set_to_another_value_and_then_set_to_null_and_then_set_to_another_value_and_then_set_to_null() {
		// Given
		JTailMainFrame jTailMainFrame = new JTailMainFrame(null, null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		jTailMainFrame.setTitle("Another title");
		jTailMainFrame.setTitle(null);
		
		// When
		jTailMainFrame.init();
		
		// Then
		assertEquals("JTail", jTailMainFrame.getTitle());
	}

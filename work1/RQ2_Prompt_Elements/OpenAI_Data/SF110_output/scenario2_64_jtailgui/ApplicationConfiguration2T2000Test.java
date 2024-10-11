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
* It contains ten unit test cases for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void should_return_a_new_file_menu_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction);
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_label_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("File", fileMenuAction.getLabel());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_mnemonic_f() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("F", fileMenuAction.getMnemonic());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_accelerator_ctrl_f() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("ctrl F", fileMenuAction.getAccelerator());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_icon_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("file", fileMenuAction.getIcon());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_description_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("file", fileMenuAction.getDescription());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_action_command_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("file", fileMenuAction.getActionCommand());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_action_listener_null() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNull(fileMenuAction.getActionListener());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_enabled_true() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertTrue(fileMenuAction.isEnabled());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_selected_false() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertFalse(fileMenuAction.isSelected());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_visible_true() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertTrue(fileMenuAction.isVisible());
	}
}
```

## Step 3: Refactoring

### Step 3.1: Extracting the test data

The first step is to extract the test data from the test cases.

```java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void should_return_a_new_file_menu_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertNotNull(fileMenuAction);
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_label_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("File", fileMenuAction.getLabel());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_mnemonic_f() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("F", fileMenuAction.getMnemonic());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_accelerator_ctrl_f() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("ctrl F", fileMenuAction.getAccelerator());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_icon_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("file", fileMenuAction.getIcon());
	}
	
	@Test
	void should_return_a_new_file_menu_action_with_description_file() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
		
		// Then
		assertEquals("file", fileMenuAction.getDescription
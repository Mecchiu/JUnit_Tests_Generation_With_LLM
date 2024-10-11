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
* It contains ten unit test cases for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel().getJTailMainModel(), chooseFileAction2.getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel().getJTailMainModel().getJTailMainFrame(), chooseFileAction2.getOpenFileModel().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_with_a_non_null_OpenFileDialog_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel().getJTailMainModel().getJTailMainFrame().getOpenFileDialog());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_with_a_non_null_OpenFileDialog_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel().getJTailMainModel().getJTailMainFrame().getOpenFileDialog(), chooseFileAction2.getOpenFileModel().getJTailMainModel().getJTailMainFrame().getOpenFileDialog());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_with_a_non_null_OpenFileDialog_instance_with_a_non_null_SelectIndexTypeListener_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel().getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_with_a_non_null_OpenFileDialog_instance_with_a_non_null_SelectIndexTypeListener_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel().getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener(), chooseFileAction2.getOpenFileModel().getJTailMainModel().getJTailMainFrame().getOpenFileDialog().getSelectIndexTypeListener());
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
     * Create the "choose a file" action that will be used by menus and buttons.
     *
     * @return a new "choose a file" action
     */
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public ChooseFileAction chooseFileAction() {
        return new ChooseFileAction(openFileModel());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfigurationTest {
		
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1, chooseFileAction2);
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel(), chooseFileAction2.getOpenFileModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel().getJTailMainModel(), chooseFileAction2.getOpenFileModel().getJTailMainModel());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotNull(chooseFileAction.getOpenFileModel().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		ChooseFileAction chooseFileAction1 = applicationConfiguration.chooseFileAction();
		ChooseFileAction chooseFileAction2 = applicationConfiguration.chooseFileAction();
		
		// Then
		assertNotSame(chooseFileAction1.getOpenFileModel().getJTailMainModel().getJTailMainFrame(), chooseFileAction2.getOpenFileModel().getJTailMainModel().getJTailMainFrame());
	}
	
	@Test
	void test_chooseFileAction_returns_a_new_ChooseFileAction_instance_with_a_non_null_OpenFileModel_instance_with_a_non_null_JTailMainModel_instance_with_a_non_null_JTailMainFrame_instance_with_
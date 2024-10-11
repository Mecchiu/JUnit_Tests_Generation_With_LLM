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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_jTailMainModel_returns_a_new_application_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_singleton_application_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init_and_an_init_method() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init_and_an_init_method_and_a_destroy_method() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init_and_an_init_method_and_a_destroy_method_and_a_factory_method() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init_and_an_init_method_and_a_destroy_method_and_a_factory_method_and_a_factory_bean() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init_and_an_init_method_and_a_destroy_method_and_a_factory_method_and_a_factory_bean_and_a_lookup_method() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_new_application_model_when_called_twice_with_a_proxy_and_a_singleton_and_a_prototype_and_a_request_and_a_session_and_a_global_session_and_a_custom_scope_and_a_lazy_and_a_depends_on_and_an_autowire_and_a_primary_and_a_lazy_init_and_an_init_method_and_a_destroy_method_and_a_f
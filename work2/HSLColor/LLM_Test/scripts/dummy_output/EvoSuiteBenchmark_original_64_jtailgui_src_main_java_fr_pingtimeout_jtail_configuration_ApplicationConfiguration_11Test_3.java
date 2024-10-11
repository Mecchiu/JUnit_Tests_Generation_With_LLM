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
* It contains one unit test case for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {
		
	@Test
	void test_HighlightAction() {
		assertTrue(highlightAction()==null);
	}
	
	@Test
	void test_highlightAction_no_action() {
		highlightAction = null;
		assertTrue(highlightAction()==null);
	}
	
	TestCase() {
		assertNull(selectIndexTypeListener());
		assertNull(((SelectIndexTypeListener) selectIndexTypeListener()));
		((SelectIndexTypeListener) selectIndexTypeListener()).setSelectionType(SelectIndexTypeListener.SelectionType.ALL);
		assertNotNull(((SelectIndexTypeListener) selectIndexTypeListener()).getSelectionType());
	}
	
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.PROTECTED_GLOBAL)
	SelectIndexTypeListener selectIndexTypeListener() {
		return new SelectIndexTypeListener();
	}
	
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.SPRING)
	ResourceBundle bundle() {
		return ResourceBundle.getBundle("fr.pingtimeout.jtail.Language");
	}
	
	@Test
	void test_load_highlightAction() {
		
		assertTrue(selectIndexTypeListener().getSelectionType().equals(SelectIndexTypeListener.SelectionType.SEARCH));
}
}
// ApplicationConfiguration_13Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {
		private final JTailMainFrame mainFrame;
		private final ResourceBundle resources = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

	@Test
	void test_openFileDialog_returns_true_if_configured() {
		// Setup the "open" and "close" actions
		BeanDefinition bean = configuration.openFileDialog();

		assertNotNull(bean);

		assertNotNull(bean.getPropertyNames());
		assertTrue(bean.getPropertyNames().length > 0);

		// Assert that the "open" and "close" actions are defined
		String name = bean.getPropertyNames()[0];
		assertTrue(name.equals("open") || name.equals("openFileModel"));

		// Return the "open" action, by checking its class
		assertNotNull(bean.getProperty("open"));

		// Assert that the "open" action is named "open"
		assertNotNull(bean.getProperty("openAction"));
	}

	@Test
	void test_configuration() {
		// Setup the "open" and "close" actions
		BeanDefinition bean = configuration.openFileDialog();

		assertNotNull(bean);

		assertNotNull(bean.getPropertyNames());
		assertTrue(bean.getPropertyNames().length > 0);

		// Assert that the "open" and "close" actions are defined
		String name = bean.getPropertyNames()[0];
}
}
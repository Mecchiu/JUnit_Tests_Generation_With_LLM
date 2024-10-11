// ApplicationConfiguration_8Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
		/**
		* This is a small test class that will test closeAction method in the Configuration class.
		*
		* @throws Exception exception
		*/

	@Test
	void testCloseAction() throws Exception {
		ApplicationConfiguration _object = new ApplicationConfiguration();
		assertNotNull(_object.closeAction());
	}

	@Test
	public void testCloseAction_2() {
		ApplicationConfiguration _object = new ApplicationConfiguration();
		assertNotNull(_object.closeAction());

	}

	@Test
	public void testOpenFileAction() {
		OpenFileDialog dialog = new OpenFileDialog();
		System.setProperty("javax.net.debug", "all");
		System.setProperty("javax.net.ssl.trustStore.location", "META-INF/test-rsa.jks");
		System.setProperty("javax.net.debug", "all");
		ApplicationConfiguration _object = new ApplicationConfiguration();
		assertNotNull(dialog.getContent());
		assertEquals(dialog.getContent().toString(), "Open a file...");
	}

	@Test
	public void testOpenFileAction_3() {
		OpenFileDialog dialog = new OpenFileDialog();
		_object = dialog;
		assertNotNull(_object.closeAction());

	}
}
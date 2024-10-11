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

	/**
	* Test method openFileDialog.
	*/
	@Test
	void testOpenFileDialog() {
		
		OpenFileDialog target = new OpenFileDialog();
		
		ResourceBundle resources = new ResourceBundle();
		BeanDefinition bd = resources.getBeanDefinition("bundle");
		assertNotNull(bd);
		assertEquals("bundle", bd.getBeanType().getName());
		assertEquals(ApplicationConfiguration_13.class.getClassLoader(), bd.getBeanClassLoader());
		
		target.doAction(openAction());
		
		String messageDialog = target.getMessage("openFileDialog");
		assertNotNull(messageDialog);
		assertEquals("The 'open File' dialog has been created", messageDialog);
		assertEquals(OpenFileAction.class, target.getActionClass());
		assertEquals("index.txt", target.getFile());
		
		assertFalse("The default behaviour is to exit", target.exit);
		
	}
}
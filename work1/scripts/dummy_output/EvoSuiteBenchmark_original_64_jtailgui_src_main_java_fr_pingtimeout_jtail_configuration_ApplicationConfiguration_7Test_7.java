// ApplicationConfiguration_7Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {
		
	/**
	* Use the {@link ApplicationConfiguration#openAction()} method to create an application configuration.
	*/
	@org.junit.Ignore
	@Test
	public void testOpenAction() {
	
		/**
		* Create an application configuration.
		*/
		ApplicationConfiguration config = new ApplicationConfiguration();
		
		/**
		* Check the "open" action.
		*/
		assertEquals(1, config.openAction().size());
		
		/**
		* Check if the "open" action has the "select" action.
		*/
		BeanDefinition selectDialog = config.openAction().get(SelectAction.class);
		assertNotNull("No'select' action found", selectDialog);
		assertEquals("No'select' action found", SelectAction.class, selectDialog.getBeanDefinition().getBeanClass());
	}
	}
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
	* This test must be executed at first
	*/
	@Test
	void testCloseAction() {
		ApplicationConfiguration testConfiguration = new ApplicationConfiguration(); //NON-NLS
		
		String testMessage = "Hello World!";
		CloseAction action1 = new CloseAction(testConfiguration, testMessage);
		assertTrue(action1.isValid()); //NON-NLS
		
		String testMessage2 = "Hello World!";
		CloseAction action2 = new CloseAction(testConfiguration, testMessage2);
		assertTrue(action2.isValid()); //NON-NLS
		
		CloseAction action3 = new CloseAction(testConfiguration, testMessage);
		assertEquals(action3.getMessage(), testMessage); //NON-NLS
		
		String testMessage3 = "Hello World!";
		CloseAction action4 = new CloseAction(testConfiguration, testMessage3);
		assertEquals(action4.getMessage(), testMessage3); //NON-NLS
	}
	
	@Configuration
	public static class ApplicationConfiguration {
		
		@Bean
		public static JTailMainModel jTailMainModel() {
			return new DefaultMainModel(1, 1, 0, 0);//NON-NLS
		}
		
		@Bean
		public static OpenFileModel openFileModel() {
			return new DefaultMainModel(1, 1, -1, 0);//NON-NLS
		}
		
}
}
// ApplicationConfiguration_9Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		/**
		 * Test the action "close all" method.
		 * It checks if the action has been called.
		 */
		@Test
		public void actionClosenAll() {
				
				new SelectIndexTypeListener(){
						
						@Override
						public void afterIndexTypeChanged(SelectIndexTypeCommand command) {
							
								assertTrue(command.getIndexType().equals(SelectIndexType.NONE));
								closeAction();
								
						}
				}.register();
				
				JTailMainFrame mainFrame = JTailMainFrame.getInstance();
				assertNotNull(mainFrame);        
				
				mainFrame.setMainModel(new JTailMainModel());
				mainFrame.setClosed(true);
				assertFalse(mainFrame.isClosed());
			}
	}
// ApplicationConfiguration_1Test.java
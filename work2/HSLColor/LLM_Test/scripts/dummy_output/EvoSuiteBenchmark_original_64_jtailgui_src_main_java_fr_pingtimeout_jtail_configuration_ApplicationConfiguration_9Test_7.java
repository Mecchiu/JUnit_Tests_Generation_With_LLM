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
		
	@Bean
	@Scope(value=BeanDefinition.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.INTERFACES)
				 public CloseAllAction closeAllAction() {
	                       	return new CloseAllAction();
	                    }
	                   
				/**
				 * Create the "close" action.
				 * @return a new "close" action
				 */
				@Bean
				public CloseAction closeAction() {
					return new CloseAction();
				}
				
				/**
				 * Create the "close all" action.
				 * @return a new "close all" action
				 */
				@Bean
				public CloseAllAction closeAllAction() {
					return new CloseAllAction();
				}
				
		
		//endregion 
	
	@Test
	public void test() {
		JTailMainFrame frame = new JTailMainFrame();
		@Bean
		@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
		JTailMainModel model = new JTailMainModel();
		
		assertNotNull(model);
		assertNotNull(model.getJTailMainFrame());
		assertNotNull(model.getJTailMainFrame().getModel());
		assertNotNull(model.getCloseAction());
		
		assertTrue(model == null || model.getCloseAction()!= null);
		
		JTailMainFrame closeAllAction = model.getCloseAllAction();
}
}
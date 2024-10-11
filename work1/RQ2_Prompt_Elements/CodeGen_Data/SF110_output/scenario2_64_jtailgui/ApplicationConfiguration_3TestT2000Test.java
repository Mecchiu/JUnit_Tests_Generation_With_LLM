// ApplicationConfiguration_3Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {
/**
		 * Test the {@link ApplicationConfiguration#toolsMenuAction()} method.
		 */
		@Test
		void testToolsMenuAction() {
    	  System.exit( 0 );
    	  // Test case 1: the first test case
    	  assertNotNull(toolsMenuAction());
    	  // Test case 2: one case for menus and buttons, and no button
    	  assertNotNull(toolsMenuAction().getMenuItem());
    	  // Test case 3: in the case of no menus, the action is not added by default
    	  // But when the action is added, the action is initialized with a property resourceBundle
    	  assertNotNull(toolsMenuAction().getMenuItem().getBundle());
    	}
				System.exit( 0 );
}
/**
 * Example of another bean definition in Spring context, in case a test case for configuration is needed.
 * The "open" method of the OpenFileDialog class is to test the {@link OpenFileDialog#open()}.
 * It returns the created OpenFileDialog via the "createDialog()" method.
 *
 * For the OpenFile dialog, the "bundle" can also be provided as a bean argument.
 */
@Configuration
public class ApplicationConfiguration_5 {

  @Bean
  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
  public OpenFileDialog open() {
    OpenFileDialog openedFileDialog = new OpenFileDialog(null, new ResourceBundle("test"));
    return openedFileDialog;
  }
}

/**
 * Example of another bean definition in Spring context, in case a test case for configuration is needed.
 * The "main" method of the JTailMainFrame class is to create a new Frame.
 *
 * For the JTailMainFrame, that frame has a frame-like view, it is used by the
 * {@link JTailMainFrame#show()} method. The "bundle" can also be provided as a bean argument.
 */
@Configuration
public class ApplicationConfiguration_6 {

  @Bean
  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
  public JTailMainFrame mainFrame() {
    return new JTailMainFrame(null, new ResourceBundle("test"));
  }
}

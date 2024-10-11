// ApplicationConfiguration_1Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {
		
	private static final ResourceBundle _BUNDLE = ResourceBundle.getBundle("MainConfiguratorTest");
	
	/**
	 * Create a controller for the application.
	 * @return the controller
	 */
	@Bean
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public ControllerController controller() {
		return new ControllerController();
	}
	/**
	 * Create a controller for the application.
	 * @return the controller
	 */
	@Bean
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public ControllerController openFileController() {
		return new ControllerController();
	}
	/**
	 * Create a controller for the application.
	 * @return the controller
	 */
	@Bean
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public ControllerController indexFileController() {
		return new ControllerController();
	}

	/**
	 * Create an action for the application.
	 * @return the action
	 */
	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public OpenFileAction openAction() {
		return new OpenFileAction();
	}

	/**
	 * Create an action for the application.
	 * @return the action
	 */
}
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

	private static final String CLOSE_ALL_ACTION_NAME = "applicationConfiguration_9Test.closeAllAction";
	
	@Bean
	public CloseAction closeAllAction() {
		return null;
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public JTailMainModel jTailMainModel() throws Exception {
		return new JTailMainModel();
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public OpenFileModel openFileModel() throws Exception {
		return new OpenFileModel();
	}

	@Test
	public void testCloseAllAction() {
		assertNotEquals(CLOSE_ALL_ACTION_NAME, applicationConfiguration.closeAllAction().getName());
	}
}

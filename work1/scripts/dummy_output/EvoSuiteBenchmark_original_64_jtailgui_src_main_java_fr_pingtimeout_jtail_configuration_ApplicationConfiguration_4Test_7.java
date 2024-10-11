// ApplicationConfiguration_4Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {
		
	static final ResourceBundle bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");
	
	/**
	 * create an application configuration that checks the functionality of 
	 * "choose a file"
	 * 
	 * @return an instance of {@link ApplicationConfiguration} created
	 */ 
	@Configuration
    public static ApplicationConfiguration configuration() {
        return new ApplicationConfiguration();
    }
	
	/**
	 * tests the functionality of "choose a file" and all those "open file" methods
	 */
	@Test
	void testChooseFileAction() {
		final ApplicationConfiguration config = new ApplicationConfiguration();
		
		final String defaultBundle = "fr.pingtimeout.jtail.gui.language.application." + bundle.getString("defaultbundle");
		final String message = "Hello.";
		
		final String message1 = bundle.getString("message1");
		final String message2 = bundle.getString("message2");
		final String message3 = bundle.getString("message3");
		final String message4 = bundle.getString("message4");
		final String message5 = bundle.getString("message5");
		
		assertNotNull(config);
		
		final JTailMainModel model = config.jTailMainModel();
		
		final OpenFileAction open = config.openFileAction();

		assertNotNull(config);
		
		// Test "choose a file"
		//TestJTailMainModel model =
}
}
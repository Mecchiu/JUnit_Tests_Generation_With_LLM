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
	 * Test suite for an open action.
	 */
	@Test
	void openAction() {
	
		final String PATH = "src/tests/com/mycompany/jTailMain/src/main/java/fr/pingtimeout/jtail/configuration/ApplicationConfiguration.java";
	

	
		
	
		
		assertNotNull(PATH + "is not present", PATH);
		
		// Test case with the default "choose a file" action
		{
			final ResourceBundle bundle = ResourceBundle.getBundle(PATH);
			assertNotNull(bundle.getString("choose-file"));
		}
		
		// Test case showing a file that was never selected before
		String expected = bundle.getString("choose-file");
		final String original = "<!DOCTYPE html> <html> <head> "+
								"<base url=\""+PATH+"\"> "+
								"<h1>Choise un choix de l'élément est-il sûr de le préprie?"+
								"</h1>"+
								"</head>"+
								"<body>"+
								"<input type=\"file\" id=\"tb\" name=\"tb\"/>"+
								"</body>"+ 
								"</html>";
		
		assertEquals(expected, OpenFileModel.SHOW_NO_CHOOSE_WITH_VALUE_ERROR);
}
}
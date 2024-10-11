// ApplicationConfiguration_11Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {

	/**
	 * Unit Test for {@link ApplicationConfiguration#highlightAction()} method.
	 *
	 * @throws Exception If one ore more aspects of the test failed for some
	* reason.
	 */
	@Test
	public void testHighlightAction() throws Exception {
		
		// Prepare
		ResourceBundle resource = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");
		assertNotNull(resource.getString("highlightAction"));
		
		// Test
		ApplicationConfiguration.highlightAction();
	}
}

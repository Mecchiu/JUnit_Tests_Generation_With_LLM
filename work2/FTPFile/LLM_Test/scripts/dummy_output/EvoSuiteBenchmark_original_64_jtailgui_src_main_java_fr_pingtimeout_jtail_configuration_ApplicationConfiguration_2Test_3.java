// ApplicationConfiguration_2Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfiguration_2Test {
		
	/**
	 * @throws Exception
	 * 	If at least one variable has to be created for test
	 */
	@Test
	public void fileMenuActionTest() throws Exception {
		
		System.out.println("fileMenuActionTest()");
		
		assertGetValue("fileMenuAction", "fileMenuAction");
		
		assertSetValue("fileMenuAction", "fileMenuAction");
		
		assertNotNull(this.jTailMainFrame);
		
		assertTrue(this.jTailMainFrame instanceof JTailMainFrame);
		
		assertSetValue("fileMenuAction", "fileMenuAction");
		
	}
}
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
		
	/**
	 * Make the test.
	 *
	 * @return the test
	 */
	@SuppressWarnings("javadoc")
    private junit.framework.Test make()
	{
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		OpenFileModel model = new OpenFileModel();
		
		jTailMainFrame.setModel(model);
		jTailMainFrame.setVisible(false);
		return new Test("Test");
	}
	
	/**
	 * Test the method of {@link ApplicationConfiguration#openFileModel()}
	 *
	 * @throws Exception if invalid parameters are used
	 */
	@Test
	public void openFileModelImplTest() throws Exception {
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		OpenFileModel model = new OpenFileModel();
		
		jTailMainFrame.setModel(model);
		jTailMainFrame.setVisible(false);
		
		assertTrue(false);
	}
		
	/**
	 * Test the method of {@link ApplicationConfiguration#getMainModel()}
	 *
	 * @throws Exception for invalid parameters
	 */
	@Test
	public void getMainModelImplTest() throws Exception {
		assertNotNull(ApplicationConfiguration.getMainModel());
	}
	
}
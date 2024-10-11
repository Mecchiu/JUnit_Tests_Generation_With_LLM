// ApplicationConfiguration_12Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {
		
	/**
	 * Tests {@link ApplicationConfiguration#jTailMainFrame()} with empty 
	 * <code>controller</code>s and no valid model.
	 * @throws Exception
	 */
	@Test
	void jTailMainFrameWhenEmptyValid() throws Exception {
		
		// Initialize the controller.
		OpenFileDialog openFileDialog = new OpenFileDialog();
		
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		
		ResourceBundle bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");
		
		// Create an empty model.
		OpenFileModel openFileModel = new OpenFileModel("test");
		
		BeanDefinition beanDefinition = createBeanDefinition();
		
		// Initialize view model.
		JTailMainModel jTailMainModel = new JTailMainModel(null, bundle, openFileModel, "", bundle);
		
		/*
		 * Test default bean.
		 */
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getModel());
		assertNotNull(jTailMainFrame.getController());
		assertNotNull(jTailMainFrame.getView());
		
		// Set the view model by controller.
		jTailMainFrame.setModel(jTailMainModel);
		
		// Set the view with controller (view model will be an empty object).
}
}
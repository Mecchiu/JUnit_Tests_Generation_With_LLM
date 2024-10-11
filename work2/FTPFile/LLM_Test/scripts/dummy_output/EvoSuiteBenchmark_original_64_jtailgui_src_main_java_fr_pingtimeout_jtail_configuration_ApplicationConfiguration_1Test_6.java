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
	 * Test if the "open file" menu action "select file" will be working.
	*/
	
	@Test
	void testOpenFileMenu() {
			
		// Arrange
		BeanDefinition bd = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language").getDefinition(
				"File"
				);

		
		// Act
		{
			// Create the model
			JTailMainModel model = new JTailMainModel();
			
			// Act
			OpenFileModel openFile = ApplicationConfiguration.applicationConfiguration.openFileModel();

			
			// Assert
			assertNotNull(openFile);
	 		bd = openFile.getBeanDefinition();
	 		assertNotNull(bd);
	 		assertTrue(bda.equals(bd));

	 		// Assert
			assertFalse(openFile.getSelectedType().hasSelected());
		}
		assertTrue("The index file should have been chosen!", openFile.getSelectedType().hasSelected());
		
	}
	

	/* **************  End of ApplicationConfiguration_1Test  ************** */
}
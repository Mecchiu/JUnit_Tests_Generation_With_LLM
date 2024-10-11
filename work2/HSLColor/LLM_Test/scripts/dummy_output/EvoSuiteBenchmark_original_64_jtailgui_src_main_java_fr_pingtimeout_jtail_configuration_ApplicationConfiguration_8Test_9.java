// ApplicationConfiguration_8Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
		
	/**
	* Test closing application.
	*/
	@Test
	void testCloseAction() {
		
		// Test close
		JTailMainModel model = JTailMainFrame.testClosed();
		assertNotNull(model);
		model.closeFileMenuAction().execute(null);
	}
	
	/**
	* Test selecting a file.
	*/
	@Test
	void testSelectFileMenuAction() {
		
		// Test selecting a file
		OpenFileModel model = OpenFileDialog.openFile();
		assertNotNull(model);
		SelectIndexTypeListener.clickSelectIndex(model.getModel());

	}
}
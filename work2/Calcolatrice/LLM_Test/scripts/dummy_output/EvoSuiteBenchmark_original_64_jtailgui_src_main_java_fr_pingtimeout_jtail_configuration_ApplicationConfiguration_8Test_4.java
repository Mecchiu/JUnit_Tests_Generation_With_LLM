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
	* Test method for 'fr.pingtimeout.jtail.gui.configuration.ApplicationConfiguration.ApplicationConfiguration()'
	*/
	@Test
	void testConstructor() {
	}
	
	/**
	* test opening the "File" menu item
	*/
	@Test
	@SuppressWarnings("PMD.CloseVariableAS")
	void getFileMenuItemTest() {		
		assertNotNull("FileMenuItem", openFileModel().getFileMenuItem());
	}
	
	/**
	* test opening the "File" menu item with an already opened file 
	*/
	@Test
	@SuppressWarnings({"PMD.CloseVariableAS", "PMD.AvoidUsingSensitiveBoolean", 
			"PMD.AvoidUsingParameterizedTypes",
			"PMD.CloseUseSoftLock"})
	void getFileMenuItemWithAlreadyOpenedTest() {
		OpenFileModel openFileModel = new OpenFileModel();		
		openFileModel.setResourceBundle(bundle);
		openFileModel = (OpenFileModel) openFileModel.duplicate(bundle);

		assertTrue("OpenFile", openFileModel.getFileMenuItem().isSelected());
		assertTrue("OpenFile", openFileModel.hasActiveFile());
		assertTrue("OpenFile", openFileModel.hasFileToOpen());
	}
}
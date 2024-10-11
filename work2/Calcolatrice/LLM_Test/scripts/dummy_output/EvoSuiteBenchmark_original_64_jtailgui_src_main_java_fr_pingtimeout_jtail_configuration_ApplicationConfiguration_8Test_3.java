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
	 * Test case for main menu.
	 * Assertion: the menu won't be closed
	 *
	 */
	@Test
	void  menuMainMenuShouldBeOpened() {
		JTailMainModel model = createJTailModel();
		menuMainMenuWasOpened(model);
	}

	/**
	 * Test case for 'close All' button.
	 * Assertion: an indication of a closed application menu
	 */
	@Test
	void closeAllShouldBeClosed() {
		JTailMainModel model = createJTailModel();
		model.selectModel(OpenFileModel.CREATE);
		assertTrue(closeAllAction().isPresent());
	}

	/**
	 * Test case for an indication of opened main menu
	 * 
	*/
	@Test
	void openApplicationMenuShouldBeOpened() {
		JTailMainModel model = createJTailModel();
		model.openSystemMenu();
		model.selectModel(OpenFileModel.CREATE);
		assertFalse(openFileDialog().isPresent());
	}

}
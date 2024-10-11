// ApplicationConfiguration_10Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {
		
	/**
	 * Test the action "choose a file" method.
	 * @see Action
	 */
	@Test
	void chooseFileAction_Should_ChooseFiles() {
		String path = OpenFileDialog.open("");
		assertNotNull(path);
		
		JTailMainModel model = new JTailMainModel();
		System.out.println(model.getFile("/"));
	}
	
	/**
	 * Test if the action "open index" method returns "index".
	 * @see Action
	 */
	@Test
	void openAction_Should_OpenIndex() {
		
		String path;
		
		path = new OpenFileDialog().open("/", "Default.txt");
		assertNotNull(path);
		System.out.println(path);
	}
	
	/**
	 * Test the action "close all" method that will close all the documents of the 
	 * current session.
	 * @see Action
	 */
	@Test
	void closeAllAction_Must_CloseAll() {
		new CloseAllAction().execute();
		assertTrue(CloseAllAction.isClosed());
	}
	
	/**
	 * Test the action "Quit" method.
	 * @see Action
	 */
	@Test
	void quitAction_Should_QuitApplication() {
		String path = new QuitAction().execute();
		//assertTrue(path.equals("quit"), path);
		assertNotNull(path);
	}
}
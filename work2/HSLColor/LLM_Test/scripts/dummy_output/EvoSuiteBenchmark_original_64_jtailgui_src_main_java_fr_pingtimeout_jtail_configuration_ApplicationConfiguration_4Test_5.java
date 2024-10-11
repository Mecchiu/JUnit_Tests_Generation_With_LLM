// ApplicationConfiguration_4Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {
		
	/**
	 * Create an application model.
	 *
	 * @return a new application model
	 */
	@Bean(name = "fileServiceModel")
	JTailMainModel chooseFileModel() {
		return new JTailMainModel();
	}
	
	/**
     * Create the "choose file" menu action that will be used by menus and buttons.
	 *
     * @return a new "choose file" menu action
     */
	@Bean(name = "menuFileChooseFile")
	SelectIndexTypeListener chooseFileAction() {
		return new SelectIndexTypeListener(null);
	}

	@Test
	public void testSimpleFile() {
		
	    JTailMainFrame mainFrame = new JTailMainFrame();

	    // First, create the "Choose File" menu item
	    MenuAction chooseFileAction = new ChooseFileAction();
	    String text = bundle.getString("choose_file");
	    MenuItem item = new MenuItem(text);
	    item.addAction(chooseFileAction);
	    mainFrame.menuFile.addMenuItem(item);
	    assertNotNull(mainFrame.menuFile.getSelectedMenuItem());

	    // Now, create the "Open File" menu item and apply 
	    // the selected "choose file" menu item
	    openFileModel().setFileName(OpenFileModel.OP.fileName_chooseFile);
}
}
// ApplicationConfiguration_3Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {

	/**
	* Test method.
	*/
	@Test
	public void testLauncherMenuActionConstructor() {
		new JTailMainFrame( new JTailMainModel(), new SelectIndexTypeListener());
		assertNotNull(ApplicationConfiguration.toolsMenuAction());
	}

        /**
	* Test method.
	*/
	@Test
	public void testLauncherMenuActionWithSelectedIndex() {
        OpenFileDialog fileDialog=new OpenFileDialog(ResourceBundle.getBundle("java.bundle",JTailMainFrame.BUNDLE_NAME),JTailMainFrame.SELECT_FILE_ACTION_ID);
        fileDialog.setVisible(true);
        assertNotNull(ApplicationConfiguration.toolsMenuAction().getExecutionMenu().getAction(fileDialog));

	}

        /**
	* Test method.
	*/
	@Test
	public void testlauncherMenuActionWithNullAction() {
        OpenFileDialog fileDialog=new OpenFileDialog(ResourceBundle.getBundle("java.bundle",JTailMainFrame.BUNDLE_NAME),JTailMainFrame.UNSELECTED_ACTION_ID);
        fileDialog.setVisible(true);
        assertNotNull(ApplicationConfiguration.toolsMenuAction().getExecutionMenu().getAction(fileDialog));

	}

        /**
	* Test method.
	*/
	@Test
	public void testlauncherNoAction() {
		OpenFileDialog fileDialog=new OpenFileDialog(ResourceBundle.getBundle("java.bundle",JTailMainFrame.BUNDLE_NAME),JTailMainFrame.TEXT_ACTION_ID);
		fileDialog.setVisible(true);
        assertNull(ApplicationConfiguration.toolsMenuAction().getExecutionMenu().getAction(fileDialog));
		
	}
	
}
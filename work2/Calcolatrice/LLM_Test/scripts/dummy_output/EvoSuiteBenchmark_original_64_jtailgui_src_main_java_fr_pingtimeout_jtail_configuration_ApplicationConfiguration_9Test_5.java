// ApplicationConfiguration_9Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		
	/**
	* Test closeAll action that will be used by menus and buttons.
	*
	* @throws Exception if the test failed
	*/ 
	@Test
	public void testCloseAllAction() throws Exception {
        
		JTailMainModel model = new JTailMainModel();
		
		assertTrue(model instanceof OpenFileModel);
		assertTrue(!model.getFileList().isEmpty());
		
		model.updateIndexTypeList();
		
		JTailMainFrame frame = new JTailMainFrame();
		
		model.setMainFrame(frame);
		
		frame.openApplicationConfigureAction().actionPerformed(null);
		
		OpenFileModel openFileModel = (OpenFileModel) model;
		
		assertTrue(openFileModel.getFileList().isEmpty());
		
	}
	
	/**
	* Test index file menu action that will be used by menus and buttons.
	*
	* @throws Exception if the test failed
	*/ 
	@Test
	public void testIndexFileMenuAction() throws Exception {
		
		JTailMainModel model = new JTailMainModel();
		
		assertTrue(model instanceof OpenFileModel);
		assertTrue(!model.getFileList().isEmpty());
		
		model.updateIndexTypeList();
		
		assertTrue(model.getMainFrame()!= null);
	}
	
}
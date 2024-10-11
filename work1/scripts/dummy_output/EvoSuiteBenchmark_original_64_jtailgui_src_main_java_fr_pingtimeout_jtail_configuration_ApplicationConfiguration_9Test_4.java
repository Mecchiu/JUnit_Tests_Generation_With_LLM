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
	* Unit test for {@link ApplicationConfiguration#openAction()}.
	*/
	@Test
	public void testClosAll() {
		// arrange
		final JTailMainFrame mainFrame = new JTailMainFrame(); 	//the view
		final JTailMainFrame mainFrame2 = new JTailMainFrame();	//the view
		final JTailMainModel model = new JTailMainModel();	//the model
		
		// act
		final SelectIndexTypeListener listener = new SelectIndexTypeListener();
		mainFrame.addCloseAction(new JTailMainFrame.CloseActionListener(model, listener));  //closeAllAction is supported
		mainFrame.addCloseAction(new JTailMainFrame.CloseActionListener(model, listener)); 	//closeAllAction is not supported
		mainFrame.actionPerformed(null);
		
		// assert
		final OpenFileDialog openFileDialog = (OpenFileDialog) mainFrame.view;
		
		// assert
		assertNotNull(openFileDialog);
		assertEquals("openFileDialog", openFileDialog.getTitle());
		assertFalse(openFileDialog.isSelectedFileSetListView());
		assertTrue(openFileDialog.isEmptyListView());
		assertFalse(model.hasOpenFiles());
		assertNotNull(listener.getListenerList().get(0));
		
		// clean up
		MainFrameController.getInstance(0).view.remove(0);
		model.shutdown();
}
}
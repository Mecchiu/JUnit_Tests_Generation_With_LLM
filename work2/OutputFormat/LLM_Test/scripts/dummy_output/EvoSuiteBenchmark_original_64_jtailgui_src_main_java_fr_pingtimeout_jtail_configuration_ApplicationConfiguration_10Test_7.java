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
	* Main test for
	* class
	* <code>{@link ApplicationConfiguration_10Test}</code>
	*/
	@Test
	void testJTailMainFrame() {
		
		JTailMainModel jTailMainModel = new JTailMainModel();
		OpenFileModel openFileModel = new OpenFileModel();
		CloseAction closeAction = new CloseAction();
		HighlightAction highlightAction = new HighlightAction();
		
		jTailMainModel.setOpenFileModel(openFileModel);
		jTailMainModel.setCloseAction(closeAction);
		jTailMainModel.setHighlightAction(highlightAction);
		jTailMainFrame  = new JTailMainFrame(jTailMainModel);
		
		assertNotNull(jTailMainFrame);
		assertNotNull(jTailMainFrame.getCloseAction());
		assertNotNull(jTailMainFrame.getHighlightAction());	
		assertNotNull(jTailButton.getCloseAction());
		assertNotNull(jTailButton.getHighlightAction());
		assertNotNull(jTailButton2.getCloseAction());
		assertNotNull(jTailButton2.getHighlightAction());	
		
		assertFalse(jTailButton.getCloseAction().equals(jTailButton2.getCloseAction()));
		assertFalse(jTailButton.getHighlightAction().equals(jTailButton2.getHighlightAction()));
}
}
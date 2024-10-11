// ApplicationConfiguration_11Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {
		/**
		* Test of the "get a specific index type".
		*/
	private ResourceBundle configuration;
		/**
		* Test of the "highlight the file".
		*/
	private String highlight;

	@Test
	void testHighlight() {
		System.out.println("testHighlight");
		JTailMainModel model = JTailMainModel.getInstance();
		assertNotNull(model);
		assertTrue(model.getFileMainModel().isIndexed(0));
		assertTrue(model.isFileHighlighted(highlight));
        
		JTailMainFrame frame = new JTailMainFrame();
		StringBuilder sb = new StringBuilder();
		sb.append("select <h1>").append(highlight).append("</h1>");
		//TODO: check if these are properly defined
		JTailMainFrame.SelectedList selection = new JTailMainFrame.SelectedList();
		model.highlightFile(sb.toString(), selection);
		frame.goTo(0);
		assertTrue(frame.existsForList(selection));
		
		//TODO: check if we can access the control panel
		//        if there is a "open file" open for the index
	}
	
	@Test
	void testHighlightIndexedFile() {
		System.out.println("testHighlight indexed file");
		// create a new model
		JTailMainModel model = JTailMainModel.getInstance();
}
}
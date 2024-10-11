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
	 * Test the highlight action
	 */
	@Test
	void testHighlightAction() {
		// Test the "Highlight" action
		assertEquals(HighlightAction.HIGHLIGHT, highlightAction());
	}

	@Test
	void testCreateController() {
		// Test the "create" controller
		assertEquals(Controller.DEFAULT, createController());
	}

	@Test
	void testAddAction() {
		// Test the Add Action
		String name = "Highlight Action";
		assertEquals(HighlightAction.LINK, highlightAction());
		Object action = highlightAction();
		assertEquals(name, action.toString());
	}

	@Test  
	void testRemoveAction() {
		// Test the Remove Action
		String name = "Highlight Action";
		assertEquals(HighlightAction.LINK, highlightAction());
		Object action = highlightAction();
		assertEquals(name, action.toString());
		highlightAction().clear();
		highlightAction().remove();
		assertFalse(highlightAction().isEmpty());
	}

	@Test 
	void testUpdateAction() {
		String name = "Highlight Action";
		highlightAction().add(name);
		assertEquals(name, highlightAction().remove(name));
	}

}
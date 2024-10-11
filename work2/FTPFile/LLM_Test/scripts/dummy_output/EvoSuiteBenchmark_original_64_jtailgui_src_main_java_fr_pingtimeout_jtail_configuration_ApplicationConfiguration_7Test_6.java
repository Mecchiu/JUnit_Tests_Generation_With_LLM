// ApplicationConfiguration_7Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {
		/**
		 * Unit test case for the "open file" menu action.
		*/
    @Test
	public void openFileAction() {
		final OpenFileAction openAction = new OpenFileAction();
		JTailMainModel model;
        
		model = new JTailMainModel();
        model.addSelectIndexListener(new SelectIndexTypeListener().create(model));
        openAction.indexFile = model;
		assertEquals("open file", openAction.getDefaultActionName());
        assertNotNull(openAction.indexFile);
        assertEquals(OpenFileAction.class, openAction.getClass());
	}
}
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
		* Initialization of "file" menu action that will be used by menus and buttons.
		* All the "file" menu actions should be in the "choose a file" menu, however,
		* the list of menus created by the "choose a file" action are not limited to "open"
		*/
		@Test
		public void openFileMenuAction() {
   assertNotNull(chooseFileAction());
		}
    }
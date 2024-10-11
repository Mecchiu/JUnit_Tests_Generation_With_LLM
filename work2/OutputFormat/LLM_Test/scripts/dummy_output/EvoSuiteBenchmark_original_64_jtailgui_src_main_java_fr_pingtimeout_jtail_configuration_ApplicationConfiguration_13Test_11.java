// ApplicationConfiguration_13Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {
		/**
         * This method is called to initialize the class.
         *
         * @throws Exception if anything goes wrong
         */
        @Test
        void openFileDialog() throws Exception {
            // create a new main model object
            JTailMainModel mainModel = new JTailMainModel();
            // make and return a new menu action
			MenuAction menuAction = new MenuAction(mainModel);
            // make and return a new file action
			FileAction fileAction = new FileAction(menuAction);
			// create the new action
			OpenFileAction openFileDialogAction = new OpenFileAction(fileAction);
      // make and return a new action
			OpenFileDialog openDialogAction = new OpenFileDialog(openFileDialogAction);
      // make and return an open action
      OpenFileAction openDialogAction2 = new OpenFileAction(openDialogAction);
			// build the controller for the menu action
			ApplicationController applicationController = ApplicationController.createController(menuAction);
      // build the controller for the open file action
			ApplicationController openFileController = ApplicationController.createController(openFileAction2);
			// create a new tool action
			OpenFileAction toolOpenFileAction = new OpenFileAction(openFileAction2);
      // create a new "open" action action
			OpenFileAction toolOpenAction = new OpenFileAction(toolOpenFileAction);
			// create a new close action action
			CloseAction closeAction = new CloseAction(toolOpenAction);
      // create a new "Highlight" action action
}
}
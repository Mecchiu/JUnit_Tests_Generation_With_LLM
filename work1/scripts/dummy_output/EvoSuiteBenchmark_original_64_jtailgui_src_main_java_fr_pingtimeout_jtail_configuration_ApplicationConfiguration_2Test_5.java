// ApplicationConfiguration_2Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfiguration_2Test {
		@Test
		public void checkToSelectFABricMenuAction(){
			/**
			 * We will check the "file" menu action
			 */
			assertFalse("We will not have 'File' menu action here", true);
		}
		/**
		 * Create a JTail main model, the {@link JTailMainFrame} will be displayed at the end of the class
		 * @return the model
		 */
		private JTailMainModel createModel(){
			return new JTailMainModel(new JTailMainModel.MainModel<>(new JTailMainModel.MainModel.Context<>(new JTailMainModel.MainModel.FileModel(),"/root", ResourceBundle.getBundle("fr.pingtimeout.jtail.resources.libraries"))), new JTailMainFrame());
		}
	}
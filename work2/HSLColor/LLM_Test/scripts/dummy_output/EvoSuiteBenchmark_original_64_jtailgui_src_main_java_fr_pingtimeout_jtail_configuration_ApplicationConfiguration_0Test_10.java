// ApplicationConfiguration_0Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_0Test {
		/**
		 * This unit test case generates the following diagram:
		 * 
		 * <pre>
		 * 
		 * 
		 *        |________|<- main frame (window)------------------>|
		 * 	  | ________________| | ________________________| | ________________|          |
		 *        | | ________|-->| | | |   | | |   | |       |     | |         | _______|
		 *        | | ________________| | | | || | | | |   |   |     |     |          | | |
		 *        | | ________|-->| | | | \| | | |   \   |     \   |          |          |
		 *        | |                 | | | | | | |   \   \|    |     \   |         |
		 *        | ________|---| | | | |   | |   | |   |     |     |         |
		 * 
		 * </pre>
		 * 
		 * @throws Exception on exception
		 */
		@Test
		void getMainFrame() throws Exception {
			JTailMainModel jTailMainModel  = new JTailMainModel();
			jTailMainModel.setMainWindow(new JTailMainFrame());
			assertTrue(ApplicationConfiguration.jTailMainModel.equals(jTailMainModel));
		}

}
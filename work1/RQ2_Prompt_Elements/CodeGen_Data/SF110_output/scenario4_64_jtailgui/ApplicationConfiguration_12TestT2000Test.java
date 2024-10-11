// ApplicationConfiguration_12Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {

	/**
	 * Create an "open" dialog
	 *
	 * @return the "open" dialog
	 * @throws Exception if an error occurs
	 */
	@Test
	void openFileDialog() throws Exception {
		
		OpenFileDialog openFileDialog = JTailMainFrame.createOpenFileDialog();
		
		if (openFileDialog == null) {
			fail("The 'openFileDialog' bean should not be null (it's a bug).");
		}
		
		// Test if the "open" dialog displays the proper dialog box
		assertEquals("The dialogue box displayed by the OpenFileDialog failed after the call of the constructor.",
				openFileDialog, JTailMainFrame.createOpenFileDialog());
		
		// Test if the "open" dialog displays the proper message
		assertEquals("The dialogue box displayed by the OpenFileDialog failed after the call of the call of the constructor.",
				"Open file dialog succesful!", openFileDialog.showInfoMessage());
	}

	/**
	 * Create the main frame of the application
	 *
	 * @return the main frame of the application
	 * @throws Exception if an error occurs
	 */
	@Bean
	@Scope(value = BeanDefinition.SCOPE_PROCESS, proxyMode = ScopedProxyMode.INTERFACES)
	public JTailMainFrame jTailMainFrame() throws Exception {
		
		// Test for an object of class jTailMainModel
		JTailMainModel myJTail
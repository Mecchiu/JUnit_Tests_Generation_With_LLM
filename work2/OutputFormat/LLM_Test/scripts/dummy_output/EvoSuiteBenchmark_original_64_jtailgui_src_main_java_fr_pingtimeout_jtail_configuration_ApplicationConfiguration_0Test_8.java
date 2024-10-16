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
	 * @throws Exception in case the test fail.
	*/
	@Test
	public void jTailMainModel1() throws Exception {
		final OpenFileDialog fdlg = new OpenFileDialog(
				"",
//				ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language").getString("OPENCMDTEXT_")); 
				OpenFileDialog.CommandMode.TEXT);
		final OpenFileDialog fdlg = new OpenFileDialog(
				"",
//				ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language").getString("OPENCMDTEXT_"));
				OpenFileDialog.CommandMode.TEXT);
		
		final JTailMainModel model = new JTailMainModel();

		assertEquals("jTailMainModel should be the same",
				"",
				model.getIndexFileName());
		
		assertNotEquals("Open file dialog command shouldn't be executed",
				fdlg.getCommand());
		
		assertNotEquals("Open file dialog should be executed only if selected",
				fdlg.getSelect().toString(),
				getClass().getField("SELECTED").get(model).toString());
		assertEquals("The command executed for default mode should be one one",
				fdlg.getCommand(),
				fdlg.getCommand());
		
}
}
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
		
	@Test
	void openFileDialog() {
		String filename = "";
		OpenFileModel model = null;
		OpenFileDialog openFileDialog = openFileDialog();
		
		openFileDialog.setFilename(filename);
		openFileDialog.setModel(model);

		assertNotNull(model);
		assertNotNull(model.getValue());
		assertEquals(filename, model.getFilename());

		OpenFileDialog openFileDialog2 = openFileDialog();
		assertNotNull(model);
		assertNotNull(model.getValue());
		assertFalse(model.getValue().exists());
		assertEquals(filename, model.getFilename());
	}

	@Test
	void openFileDialog_nonNullValue() {
		String filename = "";
		JTailMainModel model = null;
		OpenFileModel model2 = null;
		OpenFileDialog openFileDialog = openFileDialog();
		
		openFileDialog.setFilename(filename);
		openFileDialog.setModel(model);
		assertNotNull(model);
		assertNotNull(model.getValue());
		
		assertNotNull(model2);
		assertNotNull(model2.getValue());
		assertFalse(model2.getValue().exists());
		assertEquals(filename, model2.getFilename());
	}

	@Test
	void openFileDialog_getTitle() {
		String filename = "";
		OpenFileDialog openFileDialog = openFileDialog();
		String title = "";
}
}
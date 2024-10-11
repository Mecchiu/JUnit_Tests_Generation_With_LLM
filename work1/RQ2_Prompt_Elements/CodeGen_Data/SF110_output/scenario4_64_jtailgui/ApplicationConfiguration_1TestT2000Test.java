// ApplicationConfiguration_1Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {
/**
		* Test method for {@link ApplicationConfiguration#openFileModel()}.
		*/
	@Test
	public void testOpenFileModel() {
		openFileModel();
	}

	/**
	* Test case for {@link ApplicationConfiguration#jTailMainFrame()}.
	*/
	@Test
	public void testJTailMainFrame() {
		JTailMainModel model = JTailMainFrame.jTailMainModel();
		assertNotNull(model);
		assertTrue(!model.isTerminated());
		String test = bundle.getString("jTailMainFrame.file");
		assertEquals(test, model.getFile());
		model.start();
		//model.stop();
		model.waitExistingFile("test");
	}

	/**
	* Test case for {@link ApplicationConfiguration#openFileDialog()}.
	*/
	@Test
	public void testOpenFileDialog() {
		openFileDialog();
		ResourceBundle r = ResourceBundle.getBundle("fr.pingtimeout.jtail.resources/testbundle");
		assertNotNull(r);
		String message = bundle.getString("openFileDialog.notopen");
		assertEquals(message, bundle.getString("openFileDialog.open"));
	}

	/**
	* Test case for {@link ApplicationConfiguration#jTailMainFrame()}.
	*/
	@Test
	public void testJTailMainFrame() {
		JTailMainModel model = J
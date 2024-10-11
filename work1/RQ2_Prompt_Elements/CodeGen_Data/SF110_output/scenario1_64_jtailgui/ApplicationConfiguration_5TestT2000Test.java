// ApplicationConfiguration_5Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {
private final static String BUNDLE_NAME = "jtail.configuration";
					static final String INDEX_TYPE_MEMBER_BEAN_NAME = "t";
					static final ResourceBundle BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
	private final String openFilePath = "src/test/resources/testclasses/src/test/resources/testclasses/openFile.txt";
	private final JTailMainModel activeMainModel;
	private final JTailMainFrame mainFrame;
		private final OpenFileDialog openFileDialog; 
		private OpenFileModel activeOpenFileModel;
		
	@Test
	public void ensureNoParametersProvided() {
		assertNotNull("The bean 'openFileDialog' must be present", openFileDialog);
		assertNotNull("The bean 'openFileModel' must be present", openFileModel);
		assertNotNull("The bean 'activeMainModel' must be present", activeMainModel);
		assertNotNull("The bean 'activeMainModel' must be present", activeMainModel);
		assertNotNull("The bean'mainFrame' must be present", mainFrame);
	}
	
	/**
	* This is the run-and-test test of the {@link ApplicationConfiguration#openFileModel()} method.
	 * Its purpose is to ensure that we can retrieve "from" values and that they are not lost.
	*/
	@Test
	public void getModelShouldReturnExpectedValues() {
		final String path = "/path";

		final String displayFilePath = openFileModel.getDisplayFilePath();
		assertEquals("The path for " + openFilePath + " must be " + openFilePath.toString(), displayFilePath, path);
		final JTailMainModel mainModel = new JTailMainModel();
		mainFrame.setMainModel(mainModel);
		assertNotNull("The main model is not set correctly.", mainModel);
		openFileDialog.setModel(mainModel);
		assertNotNull("The dialog is set correctly.", openFileDialog);
	}
	
	@Test
	public void retrieveFromResourceShouldSetCorrectPropertyValue() {
		assertEquals("The resource path for " + openFilePath.toString() + " must be " + openFilePath, openFilePath, openFileDialog.getSelectedFilePathFile());
	}
	
	@Test
	public void retrieveFromResourceShouldSetCorrectPropertyValueIfNotSet() {
		assertTrue("The resource path for " + openFilePath.toString() + " is not set correctly.", openFileDialog.getModel().getDisplayFilePath().equals(openFileModel.getDisplayFilePath()));
	}
	
	// test the "withMainModel" bean-configuratoin
	@Test
	public void withMainModelShouldSetCorrectPropertyValue() {
		final String path = "/path";
		final JTailMainModel expectedMainModel = new OpenFileModel();
		final OpenFileDialog openFileDialog = new OpenFileDialog();
		openFileDialog.setModel(expectedMainModel);
		final JTailMainModel mainModel = new JTailMainModel();
		mainFrame.setMainModel(mainModel);
		assertEquals("The main model should be changed correctly. The model should be equal to the current main model.", expectedMainModel, mainModel );
		final String modifiedOpenFilePath = openFileDialog.hasModifiedFilePath();
		assertEquals("The resource path for " + openFilePath + " must be " + path;
		assertTrue("The new model should be set to the resource path.", path.equals(openFileModel.getDisplayFilePath()));
		assertFalse("The path should not have been modified.", modifiedOpenFilePath!= null && modifiedOpenFilePath.startsWith(openFileModel.getDisplayFilePath()));
	}
}


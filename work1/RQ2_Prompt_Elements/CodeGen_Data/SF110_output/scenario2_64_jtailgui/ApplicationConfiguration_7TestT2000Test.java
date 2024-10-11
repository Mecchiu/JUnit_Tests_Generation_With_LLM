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

	// Variables
	private static JTailMainModel jTailMainModel = new JTailMainModel();
	private final JTailMainFrame parent;

	/**
	* Constructor of ApplicationConfiguration_7Test.
	* It creates a {@link JTailMainFrame} that is a child of the given parent.
	*
	* @param parent the parent where the {@link JTailMainFrame} will be create
	* @param args the arguments for the {@link JTailMainFrame}'s creation (see the {@link JTailMainFrame} Javadoc for more details)
	*/
	public ApplicationConfiguration_7Test(JTailMainFrame parent, String[] args) {
		this.parent = parent;
	}

	/**
	* An test method to assert whether the {@link OpenFileModel} is in the initial state or not.
	*/
	@Test
	void openFileModelIsInInitialStateTest() {
		OpenFileModel openFileModel = this.parent.testOpenFileModel();
		assertNotNull("openFileModel is null", openFileModel);
		assertTrue("openFileModel has not be initialized with " + OpenFileDialog.class.getName(), this.parent.testOpenFileModelIsInInitialState());
	}

	/**
	* An test method to assert whether the {@link OpenFileDialog} is in the initial state or not.
	*/
	@Test
	void openFileDialogIsInInitialStateTest() {
		OpenFileDialog openFileDialog = this.parent.testOpenFileDialog();
		assertNotNull("openFileDialog is null", openFileDialog);
		assertTrue("openFileDialog has not been added to " + this.parent.testOpenFileDialog(), this.parent.testOpenFileDialogIsInInitialState());
	}

	/**
	* A test method to assert whether the {@link JTailMainFrame} is in the initial state or not.
	*/
	@Test
	void jTailMainFrameIsInInitialStateTest() {
		assertNotNull(this.parent.jTailMainFrame());
		assertTrue("jTailMainFrame is null", this.parent.jTailMainFrame().isPresent());
	}

	/**
	* An test method to assert whether the {@link JTailMainFrame} is in the initial state or not.
	*/
	@Test
	void jTailMainFrameIsInActiveStateTest() {
		assertTrue(this.parent.jTailMainFrame().get().isRunning());
	}

	/**
	* Asserts that the given bundle has the given key.
	*
	* <p></p>
	* See the {@link ApplicationConfiguration#ApplicationConfiguration(ResourceBundle, String[], JTailMainFrame)}
	* for how to use the {@link ApplicationConfiguration#getBundle()} method.
	*/
	@Test
	void assertBundleHasKeyTest() {
		String keyToCheck = "Test";
		this.parent.assertBundleHasKey(keyToCheck);
	}
	
	/**
	* Asserts that the given bundle has the given key.
	* @param keyToCheck the key used to return the bundle
	* @param args the arguments used to call the bundle
	*/
	@Test
	void assertBundleHasKeyTest(String keyToCheck, String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle(this.getClass().getName() + "-" + keyToCheck, LocaleController.getLocale());
		this.parent.assertBundleHasKey(bundle, keyToCheck, args);
	}
	
	/**
	 * A test method of {@link org.junit.jupiter.api.Test}
	*/
	@Test
	void assertBundleIsNotNullTest() {
		assertNotNull("The given bundle is null", ApplicationConfiguration_7Test.this.parent.parent.parent.parent.jTailMainFrame());
	}

	/**
	* Creates and initializes a new {@link OpenFileDialog}.
	*/
	@Test
	void createOpenFileDialogTest() {
		assertNotNull("The the specified name was not provided", ApplicationConfiguration_7Test.this.parent.parent.parent.parent.parent.jTailMainFrame().testCreateOpenFileDialog(null));
	}
}

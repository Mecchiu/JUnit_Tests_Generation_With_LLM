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
		* The default constructor.
		*/
		ApplicationConfiguration_12Test() {
		}

		/**
		* Test the main frame of the application.
		*
		* @throws Exception error when test fails
		*/
		@Test
    public void testMainFrame() throws Exception {
     	JTailMainFrame jMainFrame1 = jTailMainFrame();

		OpenFileModel ome = new OpenFileModel(jMainFrame1, 0, null, null);
    	jTailMainFrame = OpenFileDialog.show(jMainFrame1, "", "", null, "", ome, 1, 1, 0, 0, null);	// Load selected index number

		assertEquals("The frame should be'main frame'", JTailMainFrame.TRUE, jTailMainFrame.isMainFrame());

		assertEquals("The main frame is incorrect", jMainFrame1, jTailMainFrame.getApplicationContext().getBean("mainFrame"));
	}


		/**
		* The test methods below are executed in the following order:
		*
		* {@link CloseFileDialog}
		* {@link DeleteFileDialog}
		*
		* They are executed just before each other, so test order is:
		* - {@link CloseFileDialog}
		* - {@link DeleteFileDialog}
		*
		* Then, test methods are executed in the order they belong to the following classes:
		* - SelectIndexByModel
		* - SelectIndexByDialog
		* - SelectIndexByListener
		* - OpenFileByModel
		* - OpenFile
		* - JTailMainFrame
		* - ApplicationConfiguration
		* - MessageSource
		*
		* The test methods to execute in one of several order are:
		* JTailMainFrame
		* ApplicationConfiguration
		* MessageSource
		* SelectIndexByModel
		* CloseFileDialog
		* DeleteFileDialog
		* OpenFileController
		* DefaultOpenFileModel
		* OpenFileDialog
		* SelectIndexByDialog
    *
		*
		* @generatedBy CodePro at 9 Oct 2017 09:59:07 +0200
		*/
    @Test
    public void testConfigurations() {
			CloseFileDialog jMainFrame = new CloseFileDialog(jTailMainFrame);
			ResourceBundle rb = ResourceBundle.getBundle("test", "test", new ResourceBundle() {});
			int index = Integer.parseInt(rb.getString("index"));
			JTailMainModel model = new DefaultOpenFileModel(jMainFrame);

			JTailMainModel aModel = new JTailMainModel(model);
			SelectIndexByModel listener = new SelectIndexByModel();
			SelectIndexByDialog listener2 = new SelectIndexByDialog();
			SelectIndexByListener listener3 = new SelectIndexByListener();

			jTailMainFrame = new JTailMainFrame();
			jMainFrame1 = jTailMainFrame;

			jTailMainFrame.add(bkIndexModel, model);
			this.controller = new OpenFileController(listener, listener2, listener3, aModel);
			model.addOpenFileModelListener(controller);

			assertEquals("The main frame should be 'true'", JTailMainFrame.TRUE, model.isMainFrame());

			assertEquals("The main frame should be 'JTailMainFrame'", JTailMainFrame.TRUE, jMainFrame1.isMainFrame());

			assertNull("The open file dialog should be null", jMainFrame1.openFileDialog());

			assertEquals("The main frame should contain 'DeleteFileDialog'", bkJTailFrame, jMainFrame1.getApplicationContext().getBean("mainFrame"));

			assertTrue("The main frame should contain controller class", listener.isActive());
			assertEquals("The main frame should contain model class name", bkIndexModel, listener.getModel());

			assertEquals("MessageSource should contain 'javax.swing.JTailMainFrame'", this.getClass().getSimpleName(), MessageSource.JANINO.getMappedName());


			CheckCloseButton click = new CheckCloseButton(4, OpenFileDialog.CLOSED);
			assertTrue("The message should contain the label 'Do you want to close'", click.isVisible());

			if (eventDisplayed) {
				assertTrue("The message should contain 'Do you want to close: Yes'", click.isC());
			} else {
				assertTrue("The message should contain 'Do you want to close: No'", click.isN());
			}


			// -----------------------------------------------------------
			// Close the current tab of the application and delete the model and
			// the model.
			// -----------------------------------------------------------

			model.delete(index);

			assertTrue("The model should be null before opening it", model.getModel() == null);
			assertTrue("The tab which contained the model should be 'jTailMainFrame'", jMainFrame1.getApplicationContext().getBean("mainFrame") == jMainFrame1);

			assertTrue("The model should be not null after closing the current tab", model.getModel()!= null);
			assertTrue("The model should contains the closing model", model.getModel().getModel() instanceof JTailMainModel);
			model.getModel().setModel(null);

			assertTrue("The model should be null after deleting the model itself", model.getModel() == null);

			assertTrue("The model should be null after deleting the current tab", model.getModel() == null);


			// -----------------------------------------------------------
			// Test the closing of the model.
			// -----------------------------------------------------------

			model = new JTailMainModel(jMainFrame1);
			model.setModel(aModel);

			assertTrue("The model should be 'JTailMainModel' after closing it", model.getModel() instanceof JTailMainModel);
			assertEquals("The model should contain the model of the new created model", bkJTailModel, model.getModel());

			// -----------------------------------------------------------
			// Test the closing of the model by closing the tab of the application.
			// -----------------------------------------------------------


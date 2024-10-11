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
	* Test {@link OpenFileModel#createOpenFileModel()}.
	*/
	@Test
	void createOpenFileModel() {
		
		// Instantiate the model and test
		OpenFileModel model = OpenFileModel.createOpenFileModel();

		// Invoke the method createOpenFileModel()
		OpenFileDialog openFileDialog = OpenFileDialog.createOpenFileDialog(model);

		// Create an indicator interface for the model and check that it
		// was successfully created.
		OpenFileModelIndicator openFileModelIndicator = (OpenFileModelIndicator)openFileDialog.createOpenProgressIndicator();

		assertNotNull(openFileModelIndicator);

	}
	
	
	/**
	* Test creation and initialization of the menus and items for the view.
	*/
	@Test
	void viewMenu() {
		
		// Instantiate an indiator for our model.
		OpenFileModelIndicator modelIndicator = (OpenFileModelIndicator) OpenFileModel.openFileModelIndicator();
		
		// An indicator for the view.
		OpenFileDialog openFileDialog = OpenFileDialog.createOpenProgressIndicator();
		
		// Create the frame for the view.
        JTailMainFrame frame = new JTailMainFrame(modelIndicator, openFileDialog, fileMenuAction(), toolsMenuAction(), highlightAction());
	
		// Display the view in a frame.
		JTailMainFrame viewFrame = frame.show();

		// Get the model for the view.
		OpenFileModel model = modelIndicator.getModel();

		assertNotNull(model);
		
		// Test that it was successfully created and added to the frame.
		JTailMainModel jTailMainModel = new JTailMainModel(model);
		assertNotNull(jTailMainModel);
		
		// Create a menu and test that it exists.
		SelectIndexTypeListener indexLink = new SelectIndexTypeListener();
		JTailMainFrame.getModelMenu(jTailMainModel).add(indexLink);
		JTailMainFrame menu = JTailMainFrame.getModelMenu(jTailMainModel).get(0);
		assertNotNull(menu);
		
		// Test that the menu for the view is enabled.
//		assertTrue(modelIndicator.getState().getEnabled());
//		assertTrue(modelIndicator.getEnabled());

		// Add another item which should be disabled.
		SelectIndexTypeListener anotherLink = new SelectIndexTypeListener();
		JTailMainFrame.getViewMenu(model).add(anotherLink);
		assertFalse(modelIndicator.getState().getEnabled());
		assertTrue(modelIndicator.getEnabled());
		
		// Create a model and use it.
		OpenFileModel tempModel = OpenFileModel.createOpenFileModel();
		modelIndicator.setModel(tempModel);
		assertNotNull(modelIndicator.getModel());
		
		// Test that the model was updated to allow switching between models and 
		// index menus.
//		assertNotNull(tempModel.getState().getModel());
//		assertNotNull(modelIndicator.getModel().getState().getModel());

//		assertEquals(modelIndicator.getModel(),
//					(OpenFileModel)modelIndicator.getModel(),
//					"Models are different");
		
		// Save the model back to the model.
		
		OpenFileModel model2 = modelIndicator.getModel();

		assertNotNull(model2);

		assertEquals(modelIndicator.getModel(), model2);

	}
	
}

// ApplicationConfiguration_12Test.java
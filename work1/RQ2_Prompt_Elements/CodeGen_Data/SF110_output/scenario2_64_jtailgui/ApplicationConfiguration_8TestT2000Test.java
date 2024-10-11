// ApplicationConfiguration_8Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {

	/**
	* Test
	* @throws Exception should not happen
	*/
	@Test
    public void test() throws Exception {
        ResourceBundle properties = ResourceBundle.getBundle("application-configuration");
        String testName = properties.getString("test");
        Class<? extends CloseAction> expected = closeAction();
        Class<? extends OpenFileAction> expectedAction = OpenFileAction.class;
        Object[] actions = {expectedAction, expected(testName)};

        CloseAction closeAction = (CloseAction) actions[0];
        // This should be OK in a UnitTest
        assertNotNull("The CloseAction should not be null", closeAction);

        ResourcesBundle resources = PropertiesFactory.create(testName, closeAction);
       

        assertNotNull("The resources bundle should not be null, " +
                      "it should contain the close action: "+closeAction,
                     resources);
        assertNotNull("The resources bundle should contain the expected OpenFileAction (not null)",
                      resources.get("resource"));
	
	// This should create a view model
	assertNotNull("The view model should not be null!", resources.getModel("resource"));
	
	OpenFileModel openFileModel = (OpenFileModel) resources.getModel("resource");
	
	assertNotNull("The view model should not be null!", openFileModel);
	
	// This should add a listener to be triggered at opening the file dialog
	JTailMainFrame frame = (JTailMainFrame) resources.getViewModel("main");
	assertNotNull("The view model should not be null!", frame);
	assertNotNull("The listener is null!", frame.addIndexTypeListener(new SelectIndexTypeListener()));
	
	// This should add a listener to be triggered at closing the file dialog
	OpenFileDialog dialog = (OpenFileDialog) resources.getViewModel("file");
	assertNotNull("The view model should not be null!", dialog);
        assertNotNull("The listener is null!", dialog.setListener(new CloseActionImplListener()));
        
        // This should just remove the listeners!!!
	assertNotNull("The view model should not be null!", frame.removeIndexTypeListener(new SelectIndexTypeListener()));
    }
	
	/**
	* Implementation of "close" action.
	*/
	public static class CloseAction extends org.springframework.context.annotation.Description.CloseAction {

		public CloseAction() {
			this("Close Action");
		}
		
		public CloseAction(String description) {
			super(description);
		}
		
		@Override
		public void close() {
			super.close();
			
			if (jTailMainModel!= null) {
				((SelectIndexTypeListener) jTailMainModel.getIndexTypeListener()).onSelectIndexType(null);
			}
		}
	}
	
	/**
	* Implementation of "OpenFile" action using OpenFileAction.
	*/
	abstract public class OpenFileAction
		extends org.springframework.context.annotation.Description.OpenFileAction {

		@Override
		public final void open(OpenFileDialog file) {
			
			if (jTailMainModel!= null) {
			
				// This should just close
				this.close();
				
				// Return
				return;
			}
			
			System.out.println("Application configuration: starting up of " +
                    file.getText());
			
			/*
			// Create the view model if none was provided
			if (file.getViewModel() == null) {
				System.out.println( "Application configuration: view model is null. " +
                        "Creating an instance of viewModel");
				viewModel = new JTailMainViewModel();
			}
			*/
			
			// Create a resource bundle
			final ResourceBundle resources = PropertiesFactory.create(file.getDescription(), this);
			
			// Create and initialize the view model
			viewModel = new JTailMainModel(resources);
			
			// Now that the viewModel is set, create and add the index type listener 
			if (file.getIndexTypeListener() == null) {
				jTailMainModel.addIndexTypeListener(new SelectIndexTypeListenerImpl());
			}
		}
	}
	
	/**
	* Implementation of "OpenFile" action using OpenFileAction.
	*/
	abstract public class OpenFileAction
		extends org.springframework.context.annotation.Description.OpenFileAction {

		public OpenFileAction() {
			this("Open FileAction");
		}

		public OpenFileAction(String description) {
			super(description);
		}
	}
	
}


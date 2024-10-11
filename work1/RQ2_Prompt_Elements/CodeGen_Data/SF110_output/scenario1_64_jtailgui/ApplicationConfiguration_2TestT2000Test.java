// ApplicationConfiguration_2Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfiguration_2Test {

    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("Bundle");
	
    /**
     * Create an array of {@link JTailMainModel} object.
     * It's supposed to return a model object, but in this case will return null.
     * @return jTailMainModel array of {@link JTailMainModel}
     */
    private OpenFileModel[] arrayOfFileModel() {
        return new OpenFileModel[]{null};
    }
    
    /**
     * Create an array of {@link JTailMainModel} object.
     * @return jTailMainModel array of {@link JTailMainModel}
     */
    private OpenFileModel[] arrayOfFileModelInModel() {
        return new OpenFileModel[]{createModel(bundle.getString("model.title")), createModel(bundle.getString("model.content"))};
    }
	
	private static OpenFileModel createModel(String text) {
		return new OpenFileModel() {
			public boolean isOpen() {
				return false;
			}
			public String getText() {
				return text;
			}
			public void setText(String text) {
				this.text = text;
			}
			public void open() throws Exception {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			public void move(int columnNumber, int rowNumber) throws Exception {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			public void restore() throws Exception {
				throw new UnsupportedOperationException("Not implemented yet");
			}
 		}; 
	}

	private static JTailMainFrame createWindow(String title, String content) {
		return new JTailMainFrame(null);
	}

	@Test
    void testBasicConfiguration() {
    	
    	assertNull(arrayOfFileModel());
    	
    	OpenFileDialog openFileDialog = new OpenFileDialog(null, "Open a file", arrayOfFileModel());
    	
    	assertTrue(openFileDialog.isReadOnly());
    	
    	for (FileMenuAction fileMenuAction: fileMenuAction().toArray()) {
    		assertTrue(openFileDialog.createOpenFile(fileMenuAction.text()).isOpen() == fileMenuAction.isOpen());
    	}
    }
    
	@Test
    void testNoSelection() {
    	
    	OpenFileDialog openFileDialog = new OpenFileDialog(null, "Open a file", arrayOfFileModel());
    	
    	assertTrue(openFileDialog.isReadOnly());

    	for (FileMenuAction fileMenuAction: fileMenuAction().toArray()) {
    		assertTrue(openFileDialog.createOpenFile(fileMenuAction.text()).isEmpty());
    	}
    }
    
	@Test
    void testMultipleSelection() {
    	
    	OpenFileDialog openFileDialog = new OpenFileDialog(null, "Open a file", arrayOfFileModelInModel());
    	
    	assertFalse(openFileDialog.isReadOnly());
    	
    	for (FileMenuAction fileMenuAction: fileMenuAction().toArray()) {
    		assertNotNull(openFileDialog.createOpenFile(fileMenuAction.text()).isEmpty());
    	}
    }
}

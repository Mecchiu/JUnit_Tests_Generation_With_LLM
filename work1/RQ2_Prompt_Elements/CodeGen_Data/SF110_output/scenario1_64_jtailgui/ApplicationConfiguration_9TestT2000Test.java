// ApplicationConfiguration_9Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {

	@Test
	public void testCloseAction() {
		
		final String testFilePath = "file.txt";

		// ApplicationConfiguration_9Test.CloseAction_11.txt
		
		// Method testCloseAction()
		
		//
		SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener();
		selectIndexTypeListener.indexTypeChanged(OpenFileDialog.INDEX_TYPE_FILE);
		
		closeAllAction().selectFile(testFilePath, JTailMainModel.INDEXES_FILE);
		
		assertNotNull(this.jTailMainModel());
		assertEquals(OpenFileModel.FILE, this.jTailMainModel().fileTypeID());
		assertTrue("the index has not been closed", this.jTailMainModel().indexType() == OpenFileModel.INDEXES_FILE);

		assertNotNull(this.closeAllAction());
		
		assertFalse(this.closeAllAction().isExecuting());
		
		//
		
		this.jTailMainModel().addAction(new CloseAllAction(jTailModel()));
		
		//
		
		assertTrue("execute() method after index type has been changed", this.closeAllAction().isExecuting());
		selectIndexTypeListener.indexTypeChanged(null);
		assertTrue("execute() method after index type has been changed", this.closeAllAction().isExecuting());

	}.
	
	/**
	 * To have some test coverage.
     
	@Test
	public void testIndexType() {
        
        final String testFilePath = "file.txt";

		SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener();
		int expectedType = OpenFileDialog.INDEX_TYPE_FILE;
		
		selectIndexTypeListener.indexTypeChanged(expectedType);
		
		assertNotNull(this.jTailMainModel());
		assertEquals(expectedType, this.jTailMainModel().fileTypeID());
		assertTrue("the index has not been closed", this.jTailModel().indexType() == OpenFileModel.INDEX_FILE);
		selectIndexTypeListener.indexTypeChanged(expectedType);
		assertFalse(this.jTailModel().indexType() == OpenFileModel.INDEX_FILE);
		//
		
    }
}

// ApplicationConfiguration_9Test.CloseAllAction_12.txt
// ApplicationConfiguration.ApplicationConfiguration

// ApplicationConfiguration_9Test.IndexesFile_3.txt
// ApplicationConfiguration.ApplicationConfiguration

// ApplicationConfiguration_4Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {
		private OpenFileDialog openFileDialog_;
		private OpenFileItem openFileitem_;
		private OpenFileItem defaultOpenItem_;
		private OpenFileEntry openFileEntry_;
    @Test
    public void test() {
		new JTailMainModel().jTailMainFrame();
    }
        
        /**
     * Test {@link ApplicationConfiguration#chooseFileAction()} method(s).
     */
    public synchronized void testChooseFileAction() {	
			new JTailMainModel().jTailMainFrame();
			assertNotNull(openFileDialog_);
			closeAction_.run();
			assertNull(openFileDialog_);
    }
    
    // ApplicationConfig
    protected void setUp( ) throws Exception{
			new JTailMainModel().jTailMainFrame();
			openContentView();
			openFileDialog_ = new OpenFileDialog();
			
			// Set up the "choose a file" dialog
			openFileitem_ = new OpenFileItem();
			openFileItem_.setContentText("choose a file");
			openFileitem_.setResourceBundle(bundle);
    		openFileitem_ = new OpenFileItem();
			openFileItem_.setContentText("choose a new file");
			defaultOpenItem_ = new OpenFileItem();
			defaultOpenItem_.setContentText("choose a folder");
			defaultOpenItem_.setResourceBundle(bundle);
		}
		
    protected void tearDown( ) throws Exception{
			// De
}
}
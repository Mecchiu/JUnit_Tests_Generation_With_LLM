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
		
	/** 
     * Test of the "about" menu item getter method, of class fr.pingtimeout.jtail.configuration.ApplicationConfiguration_2Test.
     */
	@Test
    public void getFileMenuItem() {
		assertNotNull(ApplicationConfiguration.fileMenuAction());
	}
	
	
	/** 
     * Test of the "close" menu item getter method, of class fr.pingtimeout.jtail.configuration.ApplicationConfiguration_2Test.
     */
	@Test
    public void getCloseMenuItem() {
		assertNotNull(ApplicationConfiguration.closeMenuItem());
	}
	
	/** 
     * Test of the "reload" menu item getter method, of class fr.pingtimeout.jtail.configuration.ApplicationConfiguration_2Test.
     */
	@Test
    public void getReloadMenuItem() {
		assertNotNull(ApplicationConfiguration.reloadMenuItem());
	}
	
	/** 
     * Test of the "about" menu item getter method, of class fr.pingtimeout.jtail.configuration.ApplicationConfiguration_2Test.
     */
	@Test
    public void getAboutMenuItem() {
		assertNotNull(ApplicationConfiguration.aboutMenuItem());
	}
	
	/** 
     * Test of the "quit" menu item getter method, of class fr.pingtimeout.jtail.configuration.ApplicationConfiguration_2Test.
     */
	@Test
    public void getQuitMenuItem() {
}
}
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

	static JTailMainModel model;
    
	@BeforeAll
	public static void setUp() {
		model = new JTailMainModel();
		model.setShowIndexType(false);
	}
	
	@Test
	public void testInit() {
		BeanDefinition bd = new FileMenuActionBeanDefinition();
        fd = new OpenFileDialog(model)
        	.setUseIndexTypeEditor(true);
        
        fd.setSelectIndexTypeListener(new SelectIndexTypeListener(model));
        
        fd.setActiveFileModel(new OpenFileModel(ResourceBundle.getBundle("bundle")));
		
		assertTrue(model.isInitialised());
        
		assertTrue(fd.isDisplayed());
	}

	@Test
	public void testFileMenu() {
    	assertTrue(model.getOpenFileModel().isDisplayed());
	}

	@Test
	public void testInitAfterDispose() {
		model.closeFileMenu();
		assertTrue(model.isDisposed());
	}

    BeanDefinition fd;
    

    @Configuration
    public static class FileMenuActionBeanDefinition {
        
    	@Bean(name = "openFileModel")
    	public OpenFileModel openFileModel() {
    		return new OpenFileModel();
    	}
    }
    
    @Configuration
    public static class OpenFileMenuActionBeanDefinition extends OpenFileMenuActionBeanDefinition {
		
		@Bean(name = "fileMenu")
		public FileMenuAction openFileMenu() {
			return new FileMenuAction();
		}
    }
}

// ApplicationConfiguration_2TestWithScoping.java

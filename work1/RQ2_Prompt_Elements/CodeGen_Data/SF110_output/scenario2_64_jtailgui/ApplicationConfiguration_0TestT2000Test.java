// ApplicationConfiguration_0Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_0Test {

	@Test
	void jTailMainModel() {
	    
		// Check constructor in the bean definition
		assertNotNull(new ApplicationConfiguration<MyModel, MyModel>().jTailMainModel());
		
		// Check configuration in the bean definition
		NewJTailMainFrame testFrame = new NewJTailMainFrame("MyTest");
		assertNotNull(testFrame);
		assertNotNull(testFrame.getMainModel());
		assertTrue(testFrame.getMainModel() instanceof JTailMainModel);
	}
	
	@Test
	void jTailMainModelByFileDialogs() {
	    
		// Check constructor in the bean definition
		assertNotNull(new ApplicationConfiguration<MyModelByFiles, MyModelByFiles>().jTailMainModelByFileDialogs());
		
		// Check configuration in the bean definition
		NewJTailMainFrame testFrame = new NewJTailMainFrame("MyTest");
		assertNotNull(testFrame);
		SelectClass<MyModelByFiles, OpenFileModel<MyModelByFiles>> testMethod = testFrame;
		MyModelByFiles modelByFiles = testMethod.getMainModelByFileDialogs();
		assertNull(modelByFiles);
	}
	
	@Test
	void jTailMainModelByIndex() {
		
		// Check constructor in the bean definition
		assertNotNull(new ApplicationConfiguration<MyModelByIndex, MyModelByIndex>().jTailMainModelByIndex());
		
		// Check configuration in the bean definition
		NewJTailMainFrame testFrame = new NewJTailMainFrame("MyTest");
		SelectClass<MyModelByIndex, OpenFileModel<MyModelByIndex>> testMethod = testFrame;
		MyModelByIndex modelByIndex = testMethod.getMainModelByIndex();
		assertNotNull(modelByIndex.getIndexTypeListener());
		assertNotNull(modelByIndex.getIndexTypeListener().getIndex());
		{
			ResourceBundle rb = ResourceBundle.getBundle("MyBeanBundle");
			assertNotNull(rb.getString("index"));
		}
		assertNull(modelByIndex.getIndexTypeListener().getIndex());
	}
	
}

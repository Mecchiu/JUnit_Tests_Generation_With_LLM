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
    public void testApplicationModel(){
		
    	JTailMainModel model = ApplicationConfiguration.jTailMainModel();
    	assertNotNull(model);
	}
		
	@Test
    public void testApplicationModelLoadResource(){
	
		ResourceBundle bb = ResourceBundle.getBundle("resourcesBundle");
		
		assertEquals("testTitle", bb.getString("application.title"));
		assertEquals("0 test", bb.getString("application.entry1"));
		assertEquals("0 test", bb.getString("application.entry2"));
	}
	
	@Test
	public void testApplicationModelLoadResourceFail(){
		
		OpenFileModel model = new OpenFileModel();
		
		try {
			ApplicationConfiguration.jTailMainModel().loadEntity(model, "not found", OpenFileDialog.NEW_ENTRY);
		} catch (IllegalArgumentException e) {
			//exception expected
		}
	}
	
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public JTailMainModel jTailMainModel(){
		
		JTailMainModel model = new JTailMainModel();
		model.addController(new JTailJScrollController());
		model.addController(new SelectIndexTypeListener());
		model.addModel(new JTailMainModel.MutableListModel());
		model.getModel().addController(new ViewActionController());
		model.getModel().addListener(new SelectIndexTypeListener());
		return model;
	}
	
}

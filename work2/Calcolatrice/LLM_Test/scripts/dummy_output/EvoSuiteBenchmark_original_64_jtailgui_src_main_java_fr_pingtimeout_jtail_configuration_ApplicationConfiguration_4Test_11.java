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
		  

	@Test
	void selectIndexTypeListener() {
		  ApplicationConfiguration configuration = new ApplicationConfiguration();
		  configuration.jTailMainModel = new JTailMainModel();

		  SelectIndexTypeListener listener = config().indexTypeListener();

		  assertNotNull(listener);
		  assertEquals(configuration.jTailMainModel, configuration.indexTypeListener());
	}

	@Test
	void findIndexTypeByResource_id_file() {          
		BeanDefinition configuration = config();
		configuration.jTailMainModel = new JTailMainModel();

		configuration.jTailMainModel.setId("index");
		ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundle", Locale.getDefault());
		configuration.findIndexTypeByResource(bundle);
	}
	
	@Test
	void findIndexTypeByResource_id_classpath() {
		BeanDefinition configuration = config();
		configuration.jTailMainModel = new JTailMainModel();

		configuration.jTailMainModel.setId("index");
		configuration.jTailMainModel.setFile("index.txt");
		configuration.jTailMainModel.setType("classpath");
		configuration.findIndexTypeByResource(configuration.resourceBaseRef);
	}
	
	@Test
	void findIndexTypeByResource_id_jpa() {
		BeanDefinition configuration = config();
}
}
// ApplicationConfiguration_3Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {

	private static OpenFileDialog openFileDialog_ = OpenFileDialog.OPEN_NO;
	
	private static ResourceBundle BERNUN_BOUND = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

	/**
	 * Initialize the application.
	 * It contains two case for the constructor:
	*/
	
	@BeforeEach(value = "appName_3")
	public void init(){
		openFileDialog_.addExtension("dummy.xml");
//		openFileDialog_.setProperty("dialogTitle", "File");
		openFileDialog_.setTitle("File");
		
	}
	
	@Test
	public void test_toolsMenuAction() throws Exception {
		
		assertNotNull("toolsMenuAction should not be null.",toolsMenuAction_);
	}
	
	@Bean
	public SelectIndexTypeListener toolsMenuAction() {
		return new SelectIndexTypeListener(bundle.getString("selectIndexType"));
	}

}

// ApplicationConfiguration_7Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {
		
	public ApplicationConfiguration_7Test() {
	}

	@BeforeEach
	public void setup(BeanDefinition bean) {
	}
			
	@Test
	public void check_openAction_getIndexTypeModel() throws Exception {
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		jTailMainFrame.addOpenFileMenu().addOpenFileMenuItem(new OpenFileAction());
		OpenFileModel openFileModel = jTailMainFrame.getOpenFileModel();
		assertEquals("index is not an OpenFileType", JTailMainModel.OPEN_FILE_TYPE_INDEX, openFileModel.getIndexType().getValue());
	}
	
	@Test
	public void check_openAction_getOpenFileModel() throws Exception {
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		jTailMainFrame.addOpenFileMenu().addOpenFileMenuItem(new OpenFileAction());
		OpenFileModel openFileModel = jTailMainFrame.getOpenFileModel();
		assertEquals("openFile is not a JTailFileModel", JTailMainModel.FILE_MODEL, openFileModel);
	}

	@Test
	public void check_openAction_getOpenFileMenu() throws Exception {
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		jTailMainFrame.addOpenFileMenu().addOpenFileMenuItem(new OpenFileAction());
}
}
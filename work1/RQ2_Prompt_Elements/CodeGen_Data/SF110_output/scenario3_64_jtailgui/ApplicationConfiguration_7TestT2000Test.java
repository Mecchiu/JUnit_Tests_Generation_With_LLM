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
private FrameworkApplication frameworkApplication = new FrameworkApplication(new FrameworkConfiguration());
	private static final String APPLICATION_CONFIG = ".application.properties";
	private static final String PLUGINS_PACKAGE = ".plugins.json";
	private static final String RESOURCES_PACKAGE = ".resources.json";
	private static final String PROPERTIES_PACKAGE = ".properties.json";

	private final FrameworkConfiguration frameworkConfiguration = frameworkApplication.getConfiguration();
	private final FrameworkFramework framework = frameworkApplication.getFramework();
	private final JTailMainModel m = framework.getFrameHandler().getMainModel();
	private final OpenFileModel openFileModel = m.getOpenFileModel();

	@Test
	void testOpenAction() throws Exception {
		assertNotNull(openAction());
	}

	@Test
	void testOpenFile() throws Exception {
		final SelectIndexTypeListener listener = new SelectIndexTypeListener<OpenFileModel>();
		openFileModel.addListener(listener);
		ListSelectDialog dialog = new ListSelectDialog();
		dialog.setModel(listOpenFile());
		dialog.show();

		assertTrue(!listener.isSelected());
        assertEquals(2, openFileModel.getEntries().size());
        assertEquals(OpenFileType.SELECTION_TYPE_OPENFILE, openFileModel.getSelectedType());
        assertTrue(!listener.wasClicked());
	}

	@Test
	void testOpenFileDialog(){
		doTestOpenFile(frameworkConfiguration);
	}
	
	@Test
	void testOpenTempFile(){
		FrameworkConfiguration jtplConfig = new FrameworkConfiguration("jtpl-test");
		FrameworkMainMainModel jtplMainModel = framework.getFrameHandler().getMainModel(jtplConfig);
		OpenFileDialog dialog = newOpenTempFilePanel();
		dialog.setModel(jtplMainModel);
		dialog.show();
		return;
	}
	
	protected void doTestOpenFile(FrameworkConfiguration configuration){
		assertNotNull(openFileModel);
	}
	
	// TODO : the property that should be created by default the first entry of the file selection combo box if not exists -> need to edit this one.
	protected OpenFileDialog newOpenTempFilePanel(){
		String propertyFileContent1 = frameworkConfiguration.getFrameworkDefaultConfig().getPropertyProvider().loadResourceByKey("tests.properties.file.properties", PLUGINS_PACKAGE).getProperty("propertyFileContent");
		
		return new OpenFileDialog();
	}
}

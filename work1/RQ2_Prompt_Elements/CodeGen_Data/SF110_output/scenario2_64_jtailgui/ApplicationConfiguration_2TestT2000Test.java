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

    @Test
    public void shouldUseBundle() {
        assertTrue(bundle!= null);
    }
    
    @Test
    public void shouldDefineConfigurationForJTail() {
        jTailServiceConfiguration = new ApplicationConfiguration.ApplicationConfiguration();
    }
    
    @Test
    public void shouldUseConfigurationBundle() throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle(ConfigurationManager.class.getName() + ".config");
        assertNotNull(bundle);
    }
    
    /**
     * This test case is intended to create a fresh configuration at the beginning of the test.
     * It has to recreate all the model in case it is used in the beginning of the tests.
     */
    @Test
    @SuppressWarnings("static-method")
    public void shouldBeAbleToCreateNewConfiguration() throws Exception {
        FileController configuration = new JTailMainModel("New model").addDirectory(new Directory("MyTestModel")).getController();
        assertNotNull(configuration);
    }
    
    @Test
    @SuppressWarnings("static-method")
    public void shouldBeAbleToGetConfiguration() throws Exception {
        OpenFileDialog dialog = new OpenFileDialog();
        assertNotNull(dialog);
    }
    
    @Test
    @SuppressWarnings({
        "static-method",
        "static-field-beans-syntax"
    })
    public void shouldCreateNewJTailModel() throws Exception {
        JTailMainFrame jTailMainFrame = new JTailMainFrame("My new model");
        assertNotNull(jTailMainFrame.getModelManager());
        assertNotNull(jTailMainFrame.getController());
    }
    
    @Test
    @SuppressWarnings("static-method")
	public void shouldBeAbleToCreateJTailModelOnController() throws Exception {
        OpenFileDialog dialog = new OpenFileDialog();
        FileManager fileManager = new FileManager() {
            @Override
            public void addActionToCurrentTab(String fileName) {
            }
            @Override
            public boolean hasFileMenuToOpen(String fileName) {
                return false;
            }
        };
        jTailServiceConfiguration = new ApplicationConfiguration.ApplicationConfiguration(fileManager);
        TestController.createJTailFile = true;
        assertNotNull(jTailServiceConfiguration.getController());
        jTailServiceConfiguration.init(null);
    }

    @Test
	@SuppressWarnings("static-method")
	public void shouldBeAbleToClose() throws Exception {
        jTailServiceConfiguration.close(true);
        assertNotNull(jTailServiceConfiguration.getController());
    }
    
    @Test
    public void shouldBeAbleToReplaceModelOnFileMenu() throws Exception {
        OpenFileDialog originalDialog = new OpenFileDialog();
        assertNotNull(originalDialog);
        assertNotNull(originalDialog.isOpen());
        originalDialog.removeAllActionsFromMenu();
        assertTrue(originalDialog.isOpen());
        assertTrue(originalDialog.isOpen(false, null));
    }
    
    @Test
    public void shouldBeAbleToOpenAndReplaceFileMenu() throws Exception {
        OpenFileDialog dialog = new OpenFileDialog();

        assertNotNull(dialog);
        assertTrue(dialog.isOpen(false, null));
    }

    @Test
    @SuppressWarnings({ "static-field-beans-syntax" })
    public void shouldBeAbleToStartApplicationByController() throws Exception {
        
		FileManager fileManager = new FileManager();
		TestController controller = new TestController();
		
		ApplicationConfiguration.ApplicationConfiguration configuration = new ApplicationConfiguration.ApplicationConfiguration(fileManager);
		jTailServiceConfiguration = configuration;
		jTailServiceConfiguration.setController(controller);		
		
		controller.init(null);				
		int port = controller.bindPort();
		TestController newController = new TestController(port);
		
		assertNotNull(newController.getModelManager());
		assertNotNull(controller);
        assertTrue(controller.isAvailable() == true);
    }

    @Test
    @SuppressWarnings({ "static-field-beans-syntax" })
    public void shouldBeAbleToUpdateModel() throws Exception {
        
    }

    protected BeanDefinition beanDefinition(String name) {
        BeanDefinition bd = new BeanDefinition();
        bd.setBeanClass(MyModel.class);
        ResourceBundle resourceBundle = ResourceBundle.getBundle(ConfigurationManager.class.getName() + ".config");
        bd.setQualifier(resourceBundle);
        return bd;
    }
    
    final private ResourceBundle bundle;
    final private ApplicationConfiguration applicationConfiguration;
    final private JTailMainFrame jTailMainFrame;	

    public ApplicationConfiguration(FileManager fileManager) {

        bundle = new ResourceBundle(ConfigurationManager.class.getName() + ".config");
        bundle = new ResourceBundle(bundle);
        JTailMainModel model = new JTailMainModel(bundle);
        model.addDirectory(new Directory("FileManagement"));
        model.populateActionsForCurrentDirectory();
        model = new JTailMainModel(bundle);
        model.populateActionsForCurrentDirectory();
        model = new JTailMainModel(bundle);
        model.populateActionsForCurrentDirectory();

        jTailMainFrame = new JTailMainFrame("Test");
        jTailMainFrame.setModel(model);
        
        jTailMainFrame.addActionsToCurrentTab(bundle.getString("file.menu.action.list"));
        jTailMainFrame.addActionsToCurrentTab(bundle.getString("file.menu.
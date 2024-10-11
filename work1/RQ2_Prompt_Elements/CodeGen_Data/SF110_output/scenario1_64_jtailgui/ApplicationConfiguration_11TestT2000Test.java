// ApplicationConfiguration_11Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {

    private static JTailMainModel jTailMainModel;
    
    @Test
    void testConstructor() {
        assertNotNull(jTailMainModel);
    }
    
    @Test
    void testGetJTailMainModel() {
        assertNotNull(jTailMainModel.getFileModel());
        
        jTailMainModel.getJTailMainModel().setFileModel(new OpenFileModel());
        assertEquals(new OpenFileModel(),
                     jTailMainModel.getJTailMainModel().getFileModel());
    }
    
    @Test
    void testSetFileModel() {
        String path = "foo/bar/";
        OpenFileModel fileModel = new OpenFileModel(new ResourceBundle() {
          {
            put("key 0", "value0");
            put("key 1", "value1");
            put("key 2", "value2");
          }
        });

        jTailMainModel.getJTailMainModel().setFileModel(fileModel);
        assertEquals(fileModel, jTailMainModel.getJTailMainModel().getFileModel());
        
        OpenFileDialog openFileDialog = new OpenFileDialog();
        
        fileModel.setPath(openFileDialog.promptPath());
        assertEquals(path, fileModel.getPath());
        
        System.out.println("\tSet File Model -> " + fileModel);

        jTailMainModel.getJTailMainModel().setFileModel(new OpenFileModel());
        
        fileModel.setPath(null);
        assertNull(fileModel.getPath());

        System.out.println("\tDispose File Model -> " + fileModel);
    }
    
    @Test
    void testGetJTailMainFrameBean() {
        assertNotNull(jTailMainFrame);

        assertSame(jTailMainFrame,
                   jTailMainFrame.getBean(jTailMainFrame.class));
    }
    
    @Test
    void testGetModelBean() {
        assertNotNull(jTailMainModel);

        assertSame(jTailModel,
                   jTailModel.getBean(jTailModel.class));
    }
    
    @Test
    void testSetFileModelBean() {
        JTailMainModel mainModel = new JTailMainModel();

        mainModel.getFileModel().setPath("foo/bar/");
        assertEquals("Set: bar/",
                     mainModel.getFileModel().getPath());

        MainController mainController = new MainController();

        jTailMainModel.setMainController(mainController);
        assertSame(mainController,
                   new JTailMainModel(jTailMainModel).getMainController());
    }
	
	@Configuration
	@Repository("jTailFrameRepository")
	public static class GlobalRepositoryConfiguration<T extends JTailMainFrame> {

		@Bean(name = "jTailMainFrameRepository")
		public JTailMainFrameRepository<T> jTailMainFrameRepository() {
			return new JTailMainFrameRepository<T>(new JTailMainModel());
		}
		
	}
}

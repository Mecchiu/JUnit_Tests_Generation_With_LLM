// ApplicationConfiguration_8Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {

    @Bean(name = "closeAction")
    @Order(0)
    public CloseAction closeAction() {
        return new CloseAction(jTailMainModel());
    }
    
    @Test
    public void test_closeAction_default() {
        
		// A default open file model will be added to the application configuration
        Configuration configuration = new Configuration();
        
        assertNotNull(configuration.getJailMainModel());
        assertNotNull(configuration.getJailMainModel().getOpenFileController());
        assertNotNull(configuration.getGotoCurrentView());
        assertTrue(configuration.getGotoCurrentView().isOpenFileModelDefault());
        
		// A model should be added to the close action by calling the default open file model(s)
		
		assertNotNull(closeAction().getOpenFileController().getOpenFileModel());
	}
    
    @Test
    public void test_closeAction_byRefactorView() {
        
        ResourceBundle resourceBundle = ResourceBundle
           .getBundle("Bundle");
        String defaultJTailViewName = resourceBundle.getString("defaultView");
        
        final JTailMainFrame frame =
            new JTailMainFrame(
                jTailMainModel().getJTailMainFrameController()
            );
        frame.setGotoView(defaultJTailViewName);
        
        assertFalse(frame.isCloseable());
        
        final JTailMainFrame closeFrame =
            new JTailMainFrame(
                frame.getJTailMainModel().getJTailMainFrameController()
            );
        closeFrame.setGotoView(defaultJTailViewName);
        closeFrame.setCloseable(true);
        
        assertTrue(closeFrame.isCloseable());
        
        // Finally a view should be added to the close action
        Configuration configuration = new Configuration();
        
        assertNotNull(configuration.getJailMainModel());
        assertNotNull(configuration.getJailMainModel().getCloseAction());
        assertTrue(configuration.getJailMainModel().getCloseAction().isCloseable());
        // We get the default view in case of a configuration where it is not used.
        
        configuration.getJailMainModel().getCloseAction().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                // The default model should be added to close action
                assertNotNull(closeAction().getOpenFileController().getOpenFileModel());
            }
        });
        
        assertNotNull(closeAction().getCloseAction());
        assertNotNull(closeAction().getCloseAction().getView());
        assertEquals(defaultJTailViewName, closeAction().getCloseAction().getView());
        
        assertTrue(frame.isCloseable());
        
	}
}
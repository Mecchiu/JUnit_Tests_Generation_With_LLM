// ApplicationConfiguration_12Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {
		
    @Test
    public void testJTabbedPaneConfiguration() {
		JTailMainModel model = new JTailMainModel();
        JTabbedPane tabbedPane = new JTabbedPane(tabbedPaneManager);
        tabbedPane.add(new JTabbedPane.CustomComponent(bundle), "The first tab");
        tabbedPane.add(new JTabbedPane(tabbedPaneManager), "The second tab");
       
        assertTrue(model.isTabbedPane());
        assertEquals("The first tab", model.getJTailMainFrame());
        assertEquals("The second tab", model.getJTailMainFrame().getTabbedPane());
    }
    @Test
    public void testTableConfigurator() {
        JTailMainModel model = new JTailMainModel();
        model.setJTailMainFrame(new JTailMainFrame());
        model.getJTailMainFrame().setComponent(new JLabel("Component is visible"));
        model.getJTailMainFrame().setIconImage(new ImageIcon("").getImage());
        model.setJTailMainFrame(new JTailMainFrame());
        model.getJTailMainFrame().setComponent(new JLabel("Component is invisible"));
        model.setJTailMainFrame(new JTailMainFrame());

    	JLabel btnConfig = new JLabel("Configuring the model (should configure)");
}
}
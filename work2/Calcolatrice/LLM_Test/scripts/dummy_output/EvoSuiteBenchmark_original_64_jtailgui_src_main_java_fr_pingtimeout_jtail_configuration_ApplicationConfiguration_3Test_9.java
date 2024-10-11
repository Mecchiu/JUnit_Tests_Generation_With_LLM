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
		

    @Test
    void testsSimpleToolMenuAction() { //NON-NLS
        BeanDefinition bean = new BeanDefinition();
        bean.setBeanClass(MainMenuToolAction.class);
        bean.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        JTailMainFrame frame = new JTailMainFrame();
        bean.setFactoryMethodName("createJTailMainFrame");
        ApplicationConfiguration.toolsMenuAction().createToolMenuAction().bindToolMenu(
                new ToolMenuItem(frame, "index file", "index file", frame)
		);
}
}
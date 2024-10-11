// ApplicationConfiguration_6Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#indexFileAction()} method.
*/
class ApplicationConfiguration_6Test {
		private final JTailMainModel jTailMainModel = new JTailMainModel();
		private final JTailMainFrame jTailMainFrame = new JTailMainFrame();
		private final OpenFileDialog openFileDialog = new OpenFileDialog(jTailMainFrame);
		private final SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(jTailMainFrame);
	
    @Bean
    public JTailMainModel jTailMainModel() {
        return jTailMainModel;
    }
    
    @Bean
    public JTailMainFrame jTailMainFrame() {
        return jTailMainFrame;
    }
        
    @Bean
    public SelectIndexTypeListener selectIndexTypeListener() {
        return selectIndexTypeListener;
    }
	

    @Test
    @SuppressWarnings("unchecked")
    public void testInit() throws Exception {		
		
		BeanDefinition beanDefinition = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language").getBeanDefinition();
		BeanDefinition beanDefinition2[] = new BeanDefinition[1];

		String[] names = { "indexFileAction", "selectIndexTypeListener" };
		
		beanDefinition2[0] = beanDefinition.getChildNodes().get(0);
		beanDefinition2[0].setQualifier(names[0]);
		beanDefinition2[0].setScope(BeanDefinition.SCOPE_PROTOTYPE);
}
}
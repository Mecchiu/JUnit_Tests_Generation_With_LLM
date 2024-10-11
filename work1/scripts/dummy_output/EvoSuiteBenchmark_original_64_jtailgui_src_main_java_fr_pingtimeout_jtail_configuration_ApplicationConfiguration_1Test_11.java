// ApplicationConfiguration_1Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {
		/**
     * Create an application model containing at least the File menu and buttons for the JTailMainFrame bean.
     *
     * @return a new Application model
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public JTailMainModel jTailMainModel(){
	OpenFileDialog openFileDialog = new OpenFileDialog();
	return new JTailMainModel(new JTailMainModelBean(), new JTailFileWindow(),new SelectIndexTypeListener(new int[]{JTail.IndexType.FILE}, openFileDialog));
    }

    /**
     * Create the "file" menu action that will be used by menus and buttons.
     *
     * @return a new "file open" menu action
     */
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.MANDATORY)
    public MenuAction openFileMenuAction() {

        return new MenuAction(); 
    }
	
	/**
     * Create the "index file" action that will be used by menus and buttons.
     *
     * @return a new "index file open" menu action
     */
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.MANDATORY)
    public OpenFileAction indexFileMenuAction() {
        return new OpenFileAction();
    }

}
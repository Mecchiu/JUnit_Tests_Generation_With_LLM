// ApplicationConfiguration_4Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {

	/**
     * Create a new "Open" button action.
     */
    @Bean
    @Scope(value = BeanDefinition.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
	public OpenFileDialog openFileDialog()
	{
		return new OpenFileDialog(OpenFileDialog.SelectActionType.OPEN_FILE, null);
	}
    
	/**
     * Create a new "Open" button action.
     *
     * @return a new "Open" button action
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_MAPPING, proxyMode = ScopedProxyMode.INTERFACES)
	public ChooseFileAction chooseFileAction()
	{
		return new ChooseFileAction();
	}
    
	/**
     * Create a new "File" menu action.
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON, BeanDefinition.SCOPE_PROTOTYPE)
    public MenuAction chooseFileAction()
	{
		return new ChooseFileAction();
	}
    
	/**
     * Create a new "Tools" menu action that will be used by menus and buttons.
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON, BeanDefinition.SCOPE_PROTOTYPE)
    public MenuAction toolsMenuAction()
	{
		return new ToolsMenuAction();
	}
	
	/**
     *
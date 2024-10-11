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
		
	/**
	* Create a new "tools" menu action.
	*
	* @return a new "tools" menu action
	*/
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
	public MenuAction toolsMenuAction() {
		return new ToolsMenuAction();
	}
	
	/**
	* Create "File" menu action.
	*
	* @return a new "file" menu action
	*/
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
	public MenuAction fileMenuAction() {
		return new FileMenuAction();
	}
	
	/**
	* Create "choose a file" action.
	*
	* @return a new "choose a file" action
	*/
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
	public ChooseFileAction chooseFileAction() {
		return new ChooseFileAction();
	}
	
	/**
	* Create "index file" action.
	*
	* @return a new "index file" action
	*/
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
	public OpenFileAction openAction() {
		return new OpenFileAction();
	}
}
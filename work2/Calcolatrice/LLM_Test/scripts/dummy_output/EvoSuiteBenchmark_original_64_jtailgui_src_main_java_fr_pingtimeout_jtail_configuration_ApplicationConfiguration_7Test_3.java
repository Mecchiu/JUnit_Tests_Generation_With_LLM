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
		
	/**
	 * Create an application model.
	 *
	 * @return an application model.
	 */
	public static JTailMainModel getJTailMainModel(){
		JTailMainModel jTailMainModel = new JTailMainModel();
		
		jTailMainModel.setMenuAction(openAction());
        jTailMainModel.getSelectedFileAction().getChoosenFileAction().setChoosenFileFile(new OpenFileModel(GetResourceBundle));
		
		
		return jTailMainModel;
	}
	
	/**
	 * Create a "choose a file" action.
	 *
	 * @return a new "choose a file" action.
	 */
	@Bean(name="choose a file")
	public ChooseFileAction chooseFile(){
		return new ChooseFileAction();
	}
	
	//TODO test getIndexFileAction()
	//TODO test getFilePath()
	//TODO test getFileExtension()
	//TODO test getSaveAction()
	//TODO test the method of the getFileMenuAction()
	//TODO test the method of the getFileExtensionMenuAction()
	@Test
	public void test(){
		assertNotNull(ActionManager.getFileAction());
	}
}
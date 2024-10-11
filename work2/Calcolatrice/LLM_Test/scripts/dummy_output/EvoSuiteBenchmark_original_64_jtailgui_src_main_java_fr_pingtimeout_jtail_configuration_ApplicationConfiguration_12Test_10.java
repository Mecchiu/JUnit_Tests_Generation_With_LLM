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
		
	static ResourceBundle testBundle // NON-NLS
		= ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

	private OpenFileDialog openFileDialogTEST = new OpenFileDialog();

	@org.junit.jupiter.api.Test
	public void testNoAction() {
		

	}
	
	/**
	 * test a new action
	 *
	 * @throws Exception if thrown by the methods
	 */
	@Test
	public void testNewAction() throws Exception {
		
		/*
		 * Creating the model
		 */

		BeanDefinition bd = new BeanDefinition();

A: 		bd.setId("a");
B: 			bd.setFactoryBean(true);
  			beanDefinition(bd);

// B: 			bd.setFactoryBean(true);
// C: 			bd.setFactoryBean(true);
//		    	beanDefinition(bd);

// D: 				bd.setFactoryBean(true);
// E: 				bd.setFactoryBean(false);
// F: 				bd.setFactoryBean(false);
// 				beanDefinition(bd);

// G: 				bd.setFactoryBean(true);
// H: 				bd.setFactoryBean(true);
// I: 				bd.setFactoryBean(true);
// J: 				bd.setFactoryBean(true);
// 						beanDefinition(
}
}
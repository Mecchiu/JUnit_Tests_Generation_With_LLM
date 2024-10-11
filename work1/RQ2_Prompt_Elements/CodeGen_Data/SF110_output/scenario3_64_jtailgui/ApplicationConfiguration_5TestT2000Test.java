// ApplicationConfiguration_5Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {

	/**
	 * Create the "select index type" action that will be used by menus and buttons.
	 */	
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
	public SelectIndexTypeListener selectIndexTypeListener(){
		
		int indexType = 1;
		
		return new SelectIndexTypeListener("", indexType);

		
	}
	
	/** 
	 * Test the JTailMainFrame creation.
	 */	
	@Test
	public void testJTailMainFrame(){
		
		ApplicationConfiguration applicationConfiguration = this.getConfiguration();
		
		// get JTailMainFrame from config using bean id "jail-main-frame"
		ApplicationConfiguration.BeanDefinition beanDefinition = (ApplicationConfiguration.BeanDefinition) applicationConfiguration.getScope().getChildNodes()[0];
		JTailMainFrame mainFrame = (JTailMainFrame) beanDefinition.getBean();
		
		// assert JTailMainFrame created successfully
		assertNotNull(mainFrame);
	
	}
	
	/**
	 * Test the JTail main Model creating.
	 */	
	@Test
	public void testJTailMainModel(){

		ApplicationConfiguration applicationConfiguration = this.getConfiguration();
		
		// get JTailMainModel from config using bean id "jail-main-model"
		ApplicationConfiguration.BeanDefinition beanDefinition = (ApplicationConfiguration.BeanDefinition) applicationConfiguration.getScope().getChildNodes()[0];
		JTailMainModel mainModel = (JTailMainModel) beanDefinition.getBean();
				
		// assert JTailMainModel created successfully
		assertNotNull(mainModel);

	}
	
	/**
	 * Test the OpenFileDialog creation.
	 */	
	@Test
	public void testOpenFileDialog(){
		
		ApplicationConfiguration applicationConfiguration = this.getConfiguration();
		
		// get OpenFileDialog from config using bean id "OpenFileDialog"
		javax.swing.JFileChooser options = (javax.swing.JFileChooser) applicationConfiguration.getBeans().get( "openFileDialog" ).getBean();
		
		// assert OpenFileDialog created successfully
		assertNotNull(options);
		
	}
	
	/**
	 * Test the ResourceBundle creation.
	 */	
	@Test
	public void testResourceBundle(){
		
		ApplicationConfiguration applicationConfiguration = this.getConfiguration();
		
		String key = "fr.pingtimeout.jtail.configuration.ApplicationConfiguration.ApplicationConfiguration.jail-main-frame";
		String value = applicationConfiguration.getScope().getChildNodes()[0].getString("jail-main-frame");
		
		// check if key created successfully
		assertTrue(key.equals(value));
		
	}
	
	/**
	 * Test the Constructor.
	 */	
	@Test
	public void testClasses(){
		
		String className = ApplicationConfiguration.class.getCanonicalName();
		
		// get ResourceBundle
		ResourceBundle.clearCache();
		ResourceBundle.setDefaultEncoding("UTF-8");
		ResourceBundle.getBundle(className);
		
		// assert ResourceBundle was not cached
		assertNotNull(ResourceBundle.getBundle(className));
	
	}
	
	/**
	 * Get a configuration from the bean and return it.
	 */	
	private ApplicationConfiguration getConfiguration(){
		
		ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) ResourceBundle.getBundle(ApplicationConfiguration_5Test.class.getPackage().getName()).get("applicationConfiguration");
		
		return applicationConfiguration;	
		
	}
}
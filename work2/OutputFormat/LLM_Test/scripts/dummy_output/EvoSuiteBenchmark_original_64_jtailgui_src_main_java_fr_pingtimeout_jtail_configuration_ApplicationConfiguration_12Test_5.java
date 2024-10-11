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
		
	/**
	* Unit test for {@link ApplicationConfiguration#jTailMainFrame()}.
	*/
	@Test
	public void jTailMainFrame()
	{
		// Create a new JTailMainFrame object as default
		JTailMainFrame jTailMainFrame = new JTailMainFrame();
		
		// Try to make sure it does not exist yet
		assertNull(jTailMainFrame); //NOPM@2005
		
		// Construct a new JTailMainFrame with the specified bean definition
		jTailMainFrame = new JTailMainFrame(new ResourceBundle("fr.pingtimeout.jtail.gui.language"));
		
		// Check if a JTailMainFrame was instantiated
		assertNotNull("The JTailMainFrame wasn't created.", jTailMainFrame); //NOPM@2005
		
		// Assert if the constructor is not called yet with a default constructor
		assertNotNull("The JTailMainFrame wasn't created.", jTailMainFrame); //NOPM@2005
		
		// Check if the default constructor is not called
		assertFalse("The default constructor was not called.", ((JTailMainFrame)jTailMainFrame).isInit()); //NOPM@2005
		
		// Create a new JTailMainFrame object of the specified resource bundle
		JTailMainFrame jTailMainFrame2 = new JTailMainFrame(new ResourceBundle("FR"));
		
		// Try to make sure it
}
}
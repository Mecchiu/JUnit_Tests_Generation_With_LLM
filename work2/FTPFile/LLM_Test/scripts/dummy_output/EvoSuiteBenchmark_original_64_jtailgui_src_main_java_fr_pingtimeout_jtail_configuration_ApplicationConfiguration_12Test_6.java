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
	void jTailMainFrame_Constructor() {
		
		ResourceBundle.clearCache();
		
		//System.out.println("**** CONSTRUCTOR: " + jTailMainFrame());
		
	}
	
	@Test()
	public void jTailMainFrame_Default_Should_Have_All_Action_Be_Defined() {
		
		//System.out.println("**** Default: " + jTailMainFrame());
		
		assertNotNull(jTailMainFrame());
		assertNotNull(jTailMainFrame().jTables());
		assertEquals(jTailMainFrame().jTables().count(), 2);
	}
	
	@Test()
	public void jTailMainFrame_MainFrame_Should_Have_All_Buttons_Defined() {
		
		//System.out.println("**** MainFrame " + jTailMainFrame().jTableMainFrame(jTailMainModel().getObjects()));
		
		assertNotNull(jTailMainFrame().jTableMainFrame(jTailMainModel().getObjects())
			.getMainTable());
	}
	
	@Test()
	public void jTailMainFrame_TableMainFrame_Should_Have_All_buttons_Defined() {
		//System.out.println("**** " + jTailMainFrame().jTableMainFrame("MainTable"));
}
}
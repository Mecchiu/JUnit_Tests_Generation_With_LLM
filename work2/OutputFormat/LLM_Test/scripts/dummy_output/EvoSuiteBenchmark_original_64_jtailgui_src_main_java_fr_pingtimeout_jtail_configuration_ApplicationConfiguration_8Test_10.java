// ApplicationConfiguration_8Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
		
	/**
	 * Test of the closeAction method, of class ApplicationConfiguration.
	 */
	@Test
	public void testCloseAction() {
		System.out.println("closeAction");
		
		CloseAction instance = new CloseAction();
		assertEquals("closeAction should return an instance of CloseAction", instance.action(), instance.getClass().getName());
	}
	
	/**
	 * Test of the closeAll method, of class ApplicationConfiguration.
	 */
    @Test
	public void testCloseAll() {
		System.out.println("closeAll");
		
		String[] args = {"test"};

    	CloseAllAction instance = new CloseAllAction();
    	
    	assertEquals("closeAll should return an instance of CloseAllAction", instance.action(), instance.getClass().getName());
    	assertNotNull("closeAll return null for the args parameter of closeAll action", instance.action(args));
    }

    /**
     * Test of the indexFileAction method, of class ApplicationConfiguration.
     */
    @Test
    public void testIndexFileAction() {
    	System.out.println("indexFileAction");
       	String[] args = {"test"};


    	IndexFileAction instance = new IndexFileAction();
		
		assertEquals("indexFileAction should return an instance of IndexFileAction", instance.action(), instance.getClass().getName());
		assertNotNull("indexFileAction return null for the args parameter of indexFileAction action", instance.action(args));
}
}
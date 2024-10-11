// ApplicationConfiguration_10Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {

	/**
	* Initialize the class.
	*/
	@Test
	void initTest() ;

	/**
	* The constructor should throw exception if the resource bundle doesn't contain "ping".
	*/
	@Test
	void initTest1() ;

	/**
	* The constructor should throw exception if the resource bundle doesn't contain "ping"
	* or if the "quit" action doesn't exist.
	*/
	@Test
	void initTest2() ;

	/**
	* The constructor should throw exception if the index type from the application is "main".
	*/
	@Test
	void initTest3() ;

	/**
	* The constructor should throw exception if the index type from the application is "view".
	*/
	@Test
	void initTest4() ;
	
	/**
	* Test the close the view.
	*/
	@Test
	void testCloseView() ;

	/**
	* Test the close the main frame.
	*/
	@Test
	void testCloseMainFrame() ;

	/**
	* The close action should throw exception if the index type from the application is "main".
	*/
	@Test
	void testCloseMainAction1() ;
	
	/**
	* The close action should throw exception if the index type from the application is "view".
	*/
	@Test
	void testCloseMainAction2() ;

	/**
	* It starts the program and checks that the frame's title is "Application" and the window's title
	* is "Application" after initialization.
	*/
	@Test
	void testStartTest1() ;

	/**
	* It starts the program and checks that the frame's title is "Application" and the window's title
	* is "File".
	*/
	@Test
	void testStartTest2() ;
	
	/**
	* It starts the program and checks that the frame's title is "Application" and the window's title
	* is "Application".
	*/
	@Test
	void testStartTest3() ;
	
	/**
	* It starts and waits that the page is about to be activated.
	*/
	@Test
	void testStartTest4() ;

	/**
	* It stops the page and it checks that the page has already been activated and that the window's state
	* is "activated".
	*/
	@Test
	void testStopTest1() ;

	/**
	* It stops the page and it checks that the page has already been activated and that the window's state
	* is "deactivated".
	*/
	@Test
	void testStopTest2() ;

	/**
	* It stops and waits that the page is about to be activated.
	*/
	@Test
	void testStopTest3() ;
}

// ApplicationConfiguration_Test.java
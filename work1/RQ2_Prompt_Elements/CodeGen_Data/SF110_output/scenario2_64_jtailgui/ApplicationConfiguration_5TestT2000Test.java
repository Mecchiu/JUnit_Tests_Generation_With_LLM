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
	*
	* @return a new "select index type" action
	*/
	 public SelectIndexTypeListener selectIndexTypeListener() {
		 return new SelectIndexTypeListener(openFileModel());
	 }

	 /**
	 * Test constructor.
	 */
	//@Test
	public void constructorsWorks() {
		 assertTrue(ApplicationConfiguration_5Test.class.getDeclaringClass().equals(ApplicationConfiguration_1.class));

		 assertNotNull(new ApplicationConfiguration_5());
	}

	 /**
	 * Test of {@link ApplicationConfiguration#selectIndexTypeListener()} method, of class {@link ApplicationConfiguration_5}.
	 */
	 @Test
	public void testSelectIndexTypeListenerConstructor() {
		 assertNotNull(new ApplicationConfiguration_5().selectIndexTypeListener());
	}

	 /**
	 * Test to {@link ApplicationConfiguration#selectIndexTypeListener()} method, of class {@link ApplicationConfiguration_5}.
	 */
	@Test
	public void testSelectIndexTypeListener() {
		assertNotNull(selectIndexTypeListener());
	}
}

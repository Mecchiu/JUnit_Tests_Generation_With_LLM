// ApplicationConfiguration_0Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_0Test {

	/**
	* Defines the expected return of the {@link ApplicationConfiguration#jTailMainModel()} method.
	*/
	@Test
	void jTailMainModelEqualToModelEqual() throws Exception {
		assertNotNull("jTailMainModel() must return a non-null object.", jTailMainModel);
		assertEquals("jTailMainModel() must return a correct model.", JTailMainModel, jTailMainModel);
	}

	/**
	* Defines the expected return of the {@link ApplicationConfiguration#jTailMainMenu()} method.
	*
	* @return the expected return of the {@link ApplicationConfiguration#jTailMainMenu()} method.
	*/
	@Test
	void jTailMainMenuEqualToMenuEqual() throws Exception {
		assertNotNull("jTailMainMenu() must return a non-null object.", jTailMainMenu);
		assertEquals("jTailMainMenu() must return a correct menu.", OpenFileModel, jTailMainMenu);
	}

	/**
	* Defines the expected return of the {@link ApplicationConfiguration#openAction()} method.
	*
	* @return the expected return of the {@link ApplicationConfiguration#openAction()} method.
	*/
	@Test
	void openActionEqualToOpenActionEqual() throws Exception {
		assertNotNull("openAction() must return a non-null object.", openAction);
		assertEquals("openAction() must
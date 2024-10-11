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
		* Default constructor
		*/
		public ApplicationConfiguration_0Test() {
		}
		/**
		* Tests the default (empty) constructor
		*/
		@Test
		public void default_constructor() {
			ApplicationConfiguration applicationConfiguration = ApplicationConfiguration.create();
			assertNotNull(applicationConfiguration.getJTailMainModel());
			assertEquals(applicationConfiguration,applicationConfiguration.getJTailMainModel());
		}
		/**
		* Tests the constructor with a custom main model
		*/
		@Test
		public void constructor_with_custom_main_model() {
			JTailMainModel model = new JTailMainModel();
			assertNull(model);
			model = ApplicationConfiguration.create().withJTailMainModel(model);
			assertNotNull(model);
			assertEquals(ApplicationConfiguration.create().withJTailMainModel(model), model);
		}
		/**
		* Tests the setting of the default main model.
		*/
		@Test
		public void set_with_default_main_model_works() {
			JTailMainModel model = ApplicationConfiguration.create().getJTailMainModel();
			new JTailMainFrame();
			assertEquals(model, ApplicationConfiguration.create().getJTailMainModel());
		}
		/**
		* Tests the setting of the custom main model.
		*/
		@Test
		public void set_with_custom_main_model() {
			new JTailMainFrame();
}
}
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
		 * The test fixture.
		 */
		private ApplicationConfiguration applicationConfiguration;

		/**
		 * Create the test fixture.
		 */
		private ApplicationConfiguration.selectIndexTypeListener testFixture = 
			new SelectIndexTypeListener(SelectIndexTypeListener.DELIMITER, JTailMainModel.class);

		/**
		 * Set up.
		 */
		@BeforeAll
		public static void oneTearDownClass () {
			// Delete the main frame and its resources
			delete(JTailMainFrame.class);
		}

		/**
		 * Perform the test.
		 */
		@Test
		public void test1 () {
			// Initialize the test instance
				applicationConfiguration = new ApplicationConfiguration.selectIndexTypeListener();
				testFixture.initialize(applicationConfiguration);

				// Test a regular case
				assertNotNull("Null selector should not be returned", testFixture.getName());
				assertNotNull("Null selector should not be returned", testFixture.getIndexType());

				// Test case on "index of table" type select index type listener
				assertNotNull("Null selector should not be returned", testFixture.indexOfTableOfIndexTypeListener(SelectIndexTypeListener.DELIMITER));

				// Test case on "index of table index" type select index type listener
				assertNotNull("Null selector should not be returned", testFixture.indexOfTableIndexOfTypeListener());

}
}
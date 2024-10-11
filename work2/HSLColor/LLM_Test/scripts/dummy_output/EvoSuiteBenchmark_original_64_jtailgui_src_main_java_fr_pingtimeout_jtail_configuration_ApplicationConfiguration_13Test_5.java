// ApplicationConfiguration_13Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {
		public ApplicationConfiguration_13Test() {
			assertNotNull(JailConfiguration.get());
		}
		@Test
		void openFileDialog_success() {
			String title = bundle.getString("applicationConfiguration.OpenFileDialog.title");
			String message = bundle.getString("applicationConfiguration.OpenFileDialog.message");
			assertTrue(OpenFileDialog.show(new JTailMainFrame()));
			assertNull(OpenFileDialog.get());
			assertNotNull(SelectIndexTypeListener.get());
			assertNotNull(OpenFileAction.get());
			assertNull(OpenFileAction.get().getLabel());
		}
}
// ApplicationConfiguration_test.java
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
		* It initializes the application configuration.
		*/
		@Test
		void initTest() {
						assertNotNull(new ApplicationConfiguration());
						assertNotNull(new ApplicationConfiguration().selectIndexTypeListener());
						assertNotNull(new ApplicationConfiguration().toolsMenuAction());
						assertNotNull(new ApplicationConfiguration().chooseFileAction());
						assertNotNull(new ApplicationConfiguration().indexFileAction());
						assertNotNull(new ApplicationConfiguration().closeAction());
						assertNotNull(new ApplicationConfiguration().highlightAction());
						assertNotNull(new ApplicationConfiguration().openAction());
						assertNotNull(new ApplicationConfiguration().jTailMainFrame());
						assertNotNull(new ApplicationConfiguration().selectIndexTypeListener());
						assertNotNull(new ApplicationConfiguration().indexFileAction());
						assertNotNull(new ApplicationConfiguration().closeAllAction());
						assertNotNull(new ApplicationConfiguration().HighlightAction());
						assertNotNull(new ApplicationConfiguration().quitAction());
		}
}
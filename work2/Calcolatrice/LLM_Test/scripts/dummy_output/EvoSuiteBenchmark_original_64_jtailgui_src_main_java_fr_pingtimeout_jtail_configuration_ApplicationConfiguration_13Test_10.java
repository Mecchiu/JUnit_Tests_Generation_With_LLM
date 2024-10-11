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
		static final String TEST_CONFIG_BASE_PATH = "/file/test";
		static final String TEST_CONFIG_NAME = "myconfig";
		static final String TEST_CONFIG_NAME_MULTIPLE = "yourconfig1";
		static final String TEST_CONFIG_NAME_MULTIPLE_EX_DELIMITER = "yourconfig4";

	/**
	 * @see ApplicationConfiguration#openFileDialog()
	 */
	@Test
	void openFileDialog_return() {
		openFileDialog().loadConfigurationFile(bundle, "classpath:fr/pingtimeout/jtail/configuration/base_config_11/main_config.xml");
		openFileDialog().loadConfigurationFile(bundle, TestConfig.BASE_TOP_CONFIG_DIR + "./myconfig/myconfig1.xml");
		openFileDialog().loadConfigurationFile(bundle, TestConfig.BASE_TOP_CONFIG_DIR + "./yourconfig1/yourconfig1.xml");
		expectedException.expect(NoSuchFileException.class);
		openFileDialog().loadConfigurationFile(bundle, TestConfig.BASE_TOP_CONFIG_DIR + "./unittest_config_not_exists/yourconfig1/yourconfig1.xml");
	}				

	private OpenFileDialog openFileDialog() {
}
}
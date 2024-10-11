// ApplicationConfiguration_1Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {
/**
    * <p>test_applicationConfiguration_1Test</p>
    * This class runs {@link ApplicationConfiguration#openFileModel()} method with a
    * configuration that contains only the {@link javax.swing.JTailMainFrame},
    * {@link javax.swing.JTailMainFrame} and {@link 

    * SelectIndexTypeListener}.

    * <ul>
    * <li>with <b>{@link JTailMainFrame#SETTINGS_ID}</b> configuration value
    * to set the model to the <b>
    * JTailMainFrame#SETTINGS_ID</b> settings, which was loaded by one of the
    * {@link JTailMainFrame}s before this class.
    * </li>
    * <li>with <b>
    * {@link JTailMainFrame#PROPERTY_SETTINGS_ID}</b> configuration value to
    * set the <b>
    * JTailMainFrame#PROPERTY_SETTINGS_ID</b> to {@link
    * JTailMainFrame#SETTINGS_ID}, resulting from the combination of the two
    * two <b>
    * JTailMainFrame</b> configurations.</li>
    * </ul>
  A) with <b>{@link JTailMainFrame#SETTINGS_ID}</b> to <b>SETTINGS_ID</b> and
  <b>
{@link JTailMainFrame#PROPERTY_SETTINGS_ID}</b> to
{@link JTailMainFrame#PROPERTY_SETTINGS_ID}
  </li>
  </ul>

  A) with <b>{@link JTailMainFrame#PROPERTY_SETTINGS_ID}</b> to
  <b>SETTINGS_ID</b> and <b>
{@link JTailMainFrame#PROPERTY_SETTINGS_ID}</b> to
{@link JTailMainFrame#SETTINGS_ID</b>
  </ul>

  */
		@Test
		public void test_applicationConfiguration_1Test(OpenFileModel expected) {
		final JTailMainModel model = JTailMainFrame.getInstance().openFileModel();

			assertNotNull("Model must not be null", model);
			assertEquals("Model must contain settings", 1,
					model.settingCount());
			assertEquals("Model must contain settings for " + OpenFileDialog.ID,
					OpenFileDialog.ID,
					model.getSettingsID());
			}
		}

// ApplicationConfiguration_2Test.java
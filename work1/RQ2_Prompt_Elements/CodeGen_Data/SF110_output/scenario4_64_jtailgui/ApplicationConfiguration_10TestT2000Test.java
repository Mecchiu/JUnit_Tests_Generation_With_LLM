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
		 * The method that is supposed to test the application configiration.
		 *
		 * @throws Exception if an error occurs while executing the test
		*/
    @Test
    public void testConfiguration() throws Exception {
        assertNotNull(ApplicationConfiguration.BASE_PATH);
        assertNotNull(ApplicationConfiguration.BASE_PATH.getAbsolutePath());
        assertNotNull(ApplicationConfiguration.SELECT_FABRIC);
        assertNotNull(ApplicationConfiguration.SELECT_INDEX_PATH);
        assertNotNull(ApplicationConfiguration.SELECT_INDEX_PATH.getAbsolutePath());

    }

		/**
		 * Test method for open application configuration.
		 *
		 * @throws Exception if an error occurs
		*/
    @Test
    public void testOpenApplication() throws Exception {
        assertNotNull(ApplicationConfiguration.bundle);
		OpenFileModel fm = new OpenFileModel();
//        assertNotNull(fm);
//		assertNotNull(fm);
//		assertEquals(OpenFileDialog.DIALOG_TYPE, fm.getDlgType());
//		assertEquals(OpenFileDialog.DAL_OPEN_INPUT, fm.getOpenInput());
//
//		assertNotNull(fm.getDirFile());

    }


}
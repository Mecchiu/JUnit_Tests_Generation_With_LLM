// ApplicationConfiguration_4Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {
		
    /**
     * Check that the "choose a file" action created properly.
     */
    @Test
    void testChooseFileAction() {
        assertNull(ApplicationConfiguration.chooseFileAction());

        /**
         * Should raise the error if the parameter "indexType" is not a valid index type.
         */
        assertThrows(IllegalArgumentException.class, () -> ApplicationConfiguration.chooseFileAction("Index type is not valid."));
        assertThrows(IllegalArgumentException.class, 
                     () -> ApplicationConfiguration.chooseFileAction("Index type is not valid."));

        /**
         * Check the "apply" action created properly.
         */
        assertThrows(IllegalStateException.class, () -> ApplicationConfiguration.chooseFileAction("selectIndexTypeListener"));
    }

	/**
	 * Check that the "open" action created properly.
	 *
	 * This way, the "getOpenAction()" method will return the opened action.
	 */
	@Test
	void testOpenAction() {
		JTailMainModel model = new OpenFileModel("test");
		OpenFileDialog dialog = new OpenFileDialog();
		SelectIndexTypeListener listener = new SelectIndexTypeListener();
		model.addListener(listener);
		model.setOpenAction(dialog);

		assertThrows(IllegalStateException.class, () -> ApplicationConfiguration.getOpenAction());
	}
}
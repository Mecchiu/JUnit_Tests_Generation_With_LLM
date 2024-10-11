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
		
    private static ResourceBundle resourceBundle;
	private static String testId;

    static {
        try {
            resourceBundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

	/**
	 * Generate "index" action.
	 * @return {@link FindIndexAction}, "index" action
	 */
	@Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public FindIndexAction indexFindAction() {
		return new OpenFileModel().findIndexAction();
	}

	/**
	 * Generate "open" action.
	 * @return {@link OpenFileAction}, "open" action
	 */
	@Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public OpenFileAction openFileAction() {
		return new OpenFileModel().openAction();
	}

	@Test
    public void testSelectIndexTypeListener_not_selectAll() {
        // Create the index and open it.
        SelectIndexTypeListener listener = new SelectIndexTypeListener();
        listener.setIndexModel(new JTailMainModel());
        listener.start();

		// Invoked when the model state changes
		listener.setIndexModelChanged(null);

		// Invoked when the
}
}
// ApplicationConfiguration_11Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {
		
	/**
	 * Unit test case for {@link ApplicationConfiguration#highlightAction()}.
	 */
	@Test
	void testHighlightAction() {
		/* Create an application model. */
		ResourceBundle mockbundle = new ResourceBundle() {
			private final String[] messages = {"Welcome", "Hello"};
			@Override
		    public Object handleGetMessage(String key) {
					if ("Welcome".equals(key)) {
						return mockbundle.getString(key);
					} else {
						return mockbundle.getString(key);
					}
		    }
		};
		/* Create an application model. */
		ApplicationConfiguration config1 = new ApplicationConfiguration(null, mockbundle, mockbundle);
		/* Construct a model. */
		JTailMainModel jTailMainModel = new JTailMainModel("Hello", mockbundle, mockbundle);
		/* Construct a controller. */
		OpenFileModel openFileModel = new OpenFileModel(jTailMainModel, mockbundle, mockbundle);
		/* Execute the "highlight" method of an action. */
}
}
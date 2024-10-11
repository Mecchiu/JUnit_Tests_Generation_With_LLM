// ApplicationConfiguration_9Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		// TODO: describe how to fill test suite, and how to call the test class and methods after.

	private static final ResourceBundle bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

	private final SelectIndexTypeListener listener = new SelectIndexTypeListener();

    // Initialize the application model
	@Bean
	public JTailMainModel jTailMainModel() {
		return new JTailMainModel();
	}

    // Create the open file model.
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.PROXY)
	public OpenFileModel openFileModel() {
		return new OpenFileModel();
	}

	// Create the index file model.
	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.PROXY)
	public OpenFileModel openFileModel(OpenFileModel model) {
		return new OpenFileModel(model, bundle);
	}

	// The "open" action.
	@Bean
	public OpenFileAction openAction() {
		return new OpenFileAction();
	}

	// The "close all" action.
	@Bean
	public CloseAllAction closeAllAction() {
		return new CloseAllAction();
	}


	// The "highlight" action.
	@Bean
	public HighlightAction highlightAction() {
		return new HighlightAction();
}
}
// ApplicationConfiguration_6Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#indexFileAction()} method.
*/
class ApplicationConfiguration_6Test {
		public static final String PACKAGE_NAME = "indexFileAction";
		public static final String FILE_NAME = "indexFileAction.properties";

		private JTailMainFrame jTailMainFrame;
		private OpenFileDialog openFileDialog;
		private CloseAction closeAction = new CloseAction();
		private HighlightAction highlightAction = new HighlightAction();
		private OpenFileModel openFileModel;
		private JTailMainModel jTailMainModel;

		/**
		 * Creates a new {@link ApplicationConfiguration_6Test} instance.
		 */
		public ApplicationConfiguration_6Test() {
			jTailMainFrame = new JTailMainFrame();
			openFileModel = new OpenFileModel(PACKAGE_NAME, "OpenFileIndexTest.properties", FileNameUtils.getCanonicalFileName(FILE_NAME));
			jTailMainModel = new JTailMainModel(openFileModel);
			openFileDialog = new OpenFileDialog(jTailMainFrame, openFileModel);
			jTailMainFrame.getOpenFileDialog().addOpenSelectFileAction();
			// The open action does not require a parent,
			// therefore this test doesn't have to create a parent in any case.
			closeAction.setCloseButtonAction(new DefaultCloseAction());
			highlightAction.setHighlightFileAction(new DefaultHighlightFileAction());
		}
		
		/**
		 * Test case for {@link ApplicationConfiguration#indexFileAction()}.
		 */
}
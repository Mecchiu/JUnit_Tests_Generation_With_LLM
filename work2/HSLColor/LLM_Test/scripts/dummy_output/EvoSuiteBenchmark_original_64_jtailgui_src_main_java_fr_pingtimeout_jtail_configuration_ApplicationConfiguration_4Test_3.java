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
		@Test
		public void chooseFileAction() {
			try {
				assertTrue(chooseFileAction() instanceof ChooseFileAction);
			} finally {
				System.clearProperty("org.apache.commons.lang.SystemUtils");
				System.clearProperty("java.library.path");
			}
		}

		@Test
		public void selectIndexTypeListener() {
			try {
				assertTrue(selectIndexTypeListener() instanceof SelectIndexTypeListener);
			} finally {
				System.clearProperty("org.apache.commons.lang.SystemUtils");
				System.clearProperty("java.library.path");
			}
		}

		@Test
		public void indexFileAction() {
			assertTrue(indexFileAction() instanceof IndexFileAction);
		}

		@Test
		public void openAction() {
			assertTrue(openAction() instanceof OpenFileAction);
		}

		@Test
		public void closeAllAction() {
			assertTrue(closeAllAction()!= null);
		}

		@Test
		public void closeAllAction2() {
			assertTrue(closeAllAction().getCloseAction() instanceof CloseAllAction);
		}

		@Test
		public void openAction() {
			assertTrue(openAction() instanceof OpenAction);
		}

		@Test
		public void highlightAction() {
			assertTrue(highlightAction() instanceof HighlightAction);
		}

		@Test
		public void openAction() {
}
}
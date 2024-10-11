// ApplicationConfiguration_8Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
		/**
		 * @return unit test implementation of {@link ApplicationConfiguration#closeAction()}.
		 */
		@Bean
		public CloseAction closeAction() {
			return new CloseAction();
		}

		/**
		 * @return unit test implementation of {@link ApplicationConfiguration#getSelectedType()}.
		 */
		@Bean
		public SelectIndexTypeListener getSelectedType() {
			return new SelectIndexTypeListener();
		}

		/**
		 * @return unit test implementation of {@link ApplicationConfiguration#getSelectedType()}.
		 */
		@Bean
		public SelectIndexTypeListener getSelectedType() {
			return new SelectIndexTypeListener();
		}

		/**
		 * @return unit test implementation of {@link ApplicationConfiguration#getAllFileTypes()}.
		 */
		@Bean
		public SelectIndexTypeLoader getAllFileTypes() {
			return new SelectIndexTypeLoader();
		}

		/**
		 * @return unit test implementation of {@link ApplicationConfiguration#getAllFileTypes()}.
		 */
		@Bean
		public SelectIndexTypeLoader getAllFileTypes() {
			return new SelectIndexTypeLoader();
		}
	}
public class ApplicationConfiguration_8Test {

}
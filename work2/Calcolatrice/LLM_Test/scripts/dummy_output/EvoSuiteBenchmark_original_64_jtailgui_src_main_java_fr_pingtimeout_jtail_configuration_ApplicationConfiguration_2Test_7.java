// ApplicationConfiguration_2Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfiguration_2Test {
		
	private class TestController implements Controller {
		
		@Bean
		public OpenFileDialog openFileDialog() {
			OpenFileDialog openFileDialog = new OpenFileDialog(new JTailMainFrame(new JTailMainModel()));
			return openFileDialog;
		}
	}
	
	private class TestListener implements SelectIndexTypeListener {

		@Override
		public String selectIndexTypeLabel() {
			return bundle.getString("application.menu.text.choose_index_type");
		}
	}
	
	@Test
	public void testFileMenu() throws Exception {
		JTailMainFrame window = new JTailMainFrame();
		window.setModel(new JTailMainModel());
		window.setController(new TestController());
		window.setFileMenuAction(new TestAction());
		window.addOpenFileListener(new SelectIndexTypeListener());
		window.setWidth(400);
		window.setHeight(300);
		newOpenFileDialog();
		newTestClose();
	}
	
	private void newOpenFileDialog() {
		new OpenFileDialog(new JTailMainFrame(new JTailMainModel()));
	}
	
	private void newTestClose() {
		new TestAction();
	}
	
	private class TestAction implements FileMenuAction {

		@Override
		public boolean close() {
			System.out.println("close");
			return true;
		}
	}
	
}
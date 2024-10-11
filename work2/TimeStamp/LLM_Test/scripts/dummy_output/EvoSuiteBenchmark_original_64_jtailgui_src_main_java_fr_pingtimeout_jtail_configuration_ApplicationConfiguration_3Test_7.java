// ApplicationConfiguration_3Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {
		
	/**
	 * Test "tools menu" item.
	 * 
	 * @throws Exception
	 *             if the test fails
	 */
	@Test
	void testToolsMenu() throws Exception {
		
		System.out.println(bundle.getString("open"));
		assertFalse(bundle.getString("open").equals(
				OpenFileMenuAction.open.actionName()));

		assertTrue(bundle.getString("closeAll").equals(
				CloseAllAction.closeAll.actionName()));
		assertTrue(bundle.getString("close").equals(
				CloseAction.close.actionName()));
		assertTrue(bundle.getString("quit").equals(
				quitAction()));
	}
	
	// Bean definition used by the tests
	private static @Bean
	BeanDefinition toolbarDefinition() {
		
		BeanDefinition toolbarDef = new BeanDefinition();
		toolbarDef.setClazz(ToolbarAction.class);
		
		JTailMainModel mainModel = new JTailMainModel();
		
		mainModel.getActions().add(toolbarDef);
		
		ResourceBundle bundle = new ResourceBundle() {
			@Override
			public Object getObject(String key) {
				// TODO: remove
				return null;
			}
		};
		
		Bundle bundle1 = new Bundle();
}
}
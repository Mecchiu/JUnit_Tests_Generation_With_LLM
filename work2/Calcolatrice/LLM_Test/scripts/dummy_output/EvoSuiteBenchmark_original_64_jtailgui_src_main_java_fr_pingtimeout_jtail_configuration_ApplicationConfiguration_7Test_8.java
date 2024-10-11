// ApplicationConfiguration_7Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {
		
	/**
	 * @throws Exception if the test fails
	 */
	@Test
	public void openAction() throws Exception {
        BundleContext context = FrameworkUtil.getBundle(JTailMainFrame.class).getBundleContext();
        BeanDefinition[] dbs = context.getParentBeanDefinitions();

        assertEquals("Wrong number of loaded bundles", 1, dbs.length);

        BeanDefinition def = dbs[0].getBeanDefinition();
        assertNull(def.getScope());
		assertTrue(def.isActive());
		ContextActHandler actHandler = def.getQualifiedName().equals("jTail")?
				(ContextActHandler) def.getConstructorArgumentValues().getValue(0, Object.class) : def.getConstructorArgumentValues().getValue(1, ContextActHandler.class);
		fail("unexpected constructor arguments for open action: " + def.getConstructorArguments());
	}

	@Test
	public void getResources() throws Exception {
		assertNotNull("Open directory action expected",
				JTailMainFrame.class.getResource("/org/jtreeui/OpenDirectoryAction.xml"));
		assertNotNull("Open file action expected",
				JTailMainFrame.class.getResource("/org/jtreeui/OpenFileAction.xml"));
    }
	
}
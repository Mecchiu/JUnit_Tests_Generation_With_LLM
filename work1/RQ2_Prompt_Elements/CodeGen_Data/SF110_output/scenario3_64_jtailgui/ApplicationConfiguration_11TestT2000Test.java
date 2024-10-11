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
	    * Check the "Highlight" action configuration.
	    */
	    @Test
	    public void checkHighlightAction() {
	        BeanDefinition bd = (BeanDefinition) highlightAction().getBeanDefinition();
	        assertNotNull(bd);
	        int scope = 0;
	        assertNotNull(bd.getScope());
	        assertEquals(BeanDefinition.SCOPE_GLOBAL, bd.getScope());
	        ResourceBundle bundle = (ResourceBundle) bd.getValue("bundle");
	        assertNotNull(bundle);
	        ResourceBundle.Control control = bundle.getControl("jcatalog-catalog");
	        assertNotNull(control);
	        OpenFileDialog dialog = new OpenFileDialog();
	        dialog.setTitle("Jcatalog Catalog");
	        String path = dialog.show(null);
	        assertNotNull(path);
	    }
}
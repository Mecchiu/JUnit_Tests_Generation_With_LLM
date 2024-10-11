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
		
    @Test
    public void test1() {
        final SelectIndexTypeListener listener = new SelectIndexTypeListener();
        JTailMainFrame frame = new JTailMainFrame();
        assertNotNull(frame);
        JTailViewFrame viewFrame = (JTailViewFrame) frame.getViewFrame();
        assertNotNull(viewFrame);
        final JTailMainModel model = new JTailMainModel(ResourceBundle.getBundle("fr"), viewFrame.getViewFrame());
        assertNotNull(model);
        model.highlight(1);
        assertTrue(model.highlight(1));
        assertFalse(model.highlight(2));
        assertFalse(model.highlight(11));
        model.highlight(0);
        assertFalse(model.highlight(0));
        model.close();
        assertTrue(model.close());
        assertEquals(-1, listener.getSelectionIndexedByName("Foo"));
        assertFalse(listener.isSelectionChanged("Foo"));
        assertFalse(listener.isSelectionChanged("Foo", 9));
        assertFalse(listener.isSelectionChanged("Foo", 13));
        assertFalse(listener.clearSelection());
        assertFalse(listener.clearSelection(1));
    }
    
}
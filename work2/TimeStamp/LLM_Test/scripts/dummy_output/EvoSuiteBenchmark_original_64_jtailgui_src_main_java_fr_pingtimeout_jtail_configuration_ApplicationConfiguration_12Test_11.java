// ApplicationConfiguration_12Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {
		
    /**
     * Test of the "open file" menu item action.
     */
    @Test
    void openFileMenuItem_MenuAction01() {
        OpenFileModel model = new OpenFileModel();
        model.setFileName("src/test/resources/application/org/eclipse/jtp/org/pingtimeout/jtail/test/index/index_text.java");
        OpenFileDialog openFileDialog = new OpenFileDialog();
        openFileDialog.setResourceBundle(bundle);
        openFileDialog.setTitle(bundle.getString("menuItem.title"));
        openFileDialog.setModel(model);
        assertFalse(openFileDialog.isProcessing());
        model.setIsClosed(true);
        openFileDialog.setProcessing(true);
        String result = openFileDialog.open();
        assertEquals("Processing: false; Opening: true; Closing: false; Filename: src/test/resources/application/org/eclipse/jtp/org/pingtimeout/jtail/test/index/index_text.java", result);
        openFileDialog.setProcessing(false);
        result = openFileDialog.open();
        assertEquals("Processing: true; Opening: true; Closing: true; Filename: src/test/resources/application/org/eclipse/jtp/org/pingtimeout/jtail/test/index/index_text.java", result);
    }
    
 
   }
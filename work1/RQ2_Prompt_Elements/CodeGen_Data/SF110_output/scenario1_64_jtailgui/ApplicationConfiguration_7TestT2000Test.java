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
		* Unit test case for the {@link ApplicationConfiguration#openAction()} method.
		* @throws Exception exception thrown if some unexpected error occurs
		*/
		@Test
		public void testOpenAction() throws Exception {

                        JTailMainFrame frame = new JTailMainFrame();
                        OpenFileDialog fileDialog = new OpenFileDialog(frame);
                        assertNotNull(fileDialog);
			assertEquals(fileDialog.getFileType(), OpenFileModel.FILE_TYPE_SMB_SERVER);
                        assertNotNull(frame.getContent().getIndexType());

                        OpenFileAction action = new OpenFileAction(jTailMainModel(), openFileModel(), fileDialog);
		    assertTrue(action.isActionOnIndex(OpenFileModel.FILE_TYPE_SMB_SERVER));

                        // Default open: JTail mainframe.
                        JTailMainModel mainModel = new JTailMainModel();
                        
                       new SelectIndexTypeListener(event -> {
                           if (event.getAction() == OPEN_FILE_ACTION.OPEN_FILE) {
                               event.setIndexModel(OpenFileModel.FILE_TYPE_SMB_SERVER);
                           }
						}).setSelectedIndex(OpenFileModel.FILE_TYPE_SMB_SERVER);


                   }
		
}

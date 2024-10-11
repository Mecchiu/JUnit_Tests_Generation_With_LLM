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
private static ResourceBundle i18n = ResourceBundle.getBundle(applicationConfiguration.class.getCanonicalName());
	private static OpenFileDialog fileDialog = new OpenFileDialog(false, i18n.getString("open"));
	private static JTailMainFrame panel;
	@Test
	void should_add_the_tool_for_file_selection() {
		// Given:
		OpenFileModel file = new OpenFileModel(fileDialog.getFile());

		// And:
		panel = new JTailMainFrame("test");
		panel.setLocationRelativeTo(null);

		// When:
		OpenFileDialog openFileDialogBeforeAddingToolForFileSelection = fileDialog.getOpenFileDialog();
		assertEquals("open", openFileDialogBeforeAddingToolForFileSelection.getSelectedFile());
	}
	@Test
	void should_not_run() {
		// When:
		panel.run();
		
		// Then:
		assertNull("run() method is not called", panel.getRun());
	}
	
	@Test
	void should_change_the_tool_for_file_selection() {
		// Given:
		OpenFileModel file = new OpenFileModel(fileDialog.getFile());

		// And:
		panel = new JTailMainFrame("test");
		panel.setLocationRelativeTo(null);

		// When:
		OpenFileDialog openFileDialogBeforeChangingToolForFileSelection = fileDialog.getOpenFileDialog();
		assertEquals("open", openFileDialogBeforeChangingToolForFileSelection.getSelectedFile());
	}

	@Test
	void should_select_the_specified_index_type() {
		// Given:
		javax.swing.JTailMainModel.IndexType indexTypeBefore = JTailMainModel.IndexType.values()[0];
		JTailMainModel.IndexType indexTypeAfter = JTailMainModel.indexType(indexTypeBefore.getCamelCase(indexTypeBefore.getCamelCase(indexTypeBefore)));
		
		// And:
		ResourceBundle i18n = ResourceBundle.getBundle(applicationConfiguration.class.getCanonicalName());
		OpenFileModel file = new OpenFileModel(fileDialog.getFile());
		assertTrue("Should be a File", file.getType() == OpenFileModel.TYPE);
		
		// When:
		OpenFileDialog openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase = fileDialog.getOpenFileDialog();
		assertEquals("open", openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getSelectedFile());
		assertEquals("MyType", openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getIndexType());
		assertEquals(indexTypeAfter.getCamelCase(indexTypeAfter.getCamelCase(indexTypeAfter)), openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getIndexType().getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(openFileDialogAfterSelectingTheSpecifiedIndexTypeByCamelCase.getCamelCase(indexTypeAfter.getCamelCase(indexTypeAfter))))
)
	}
}
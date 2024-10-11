// ApplicationConfiguration_13Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {

	/**
	 * It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
	 * It contains one unit test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
	@Test
    void openFileView_0_shouldCallTheOpenFileSystemView() {
		String testDirName = "test";
		OpenFileModel openFileModel = new OpenFileModel("localhost", 8080, testDirName, "Test file to view", "TEST", "test.txt");
		String testTitle = "Test File to view";
		String testName = "test.exe";
		String testTitleName = "Test File to view";
        
		String testDirPath = "file://" + testDirName;
        String testFilePath = "file://" + testFileName;
		OpenFileDialog openFileDialog = new OpenFileDialog(openFileModel, chooseFileAction(), selectIndexTypeListener(), indexFileAction());
                
        assertNotNull(selectIndexTypeListener());
		assertNotNull(selectIndexTypeListener().getSelectedType());
		assertEquals(openFileModel, openFileDialog.openFile());
	}
	
	@Test
    void openFileSystemView_shouldInvokeCreateAndSetResourceBundle() throws Exception {
        String testDirName = "test";
		OpenFileModel openFileModel = new OpenFileModel("localhost", 8080, testDirName, "Test file to view", "TEST", "test.txt");
		String testTitle = "Test File to view";
		String testName = "test.exe";
		String testTitleName = "Test File to view";
        
		String testDirPath = "file://" + testDirName;
        String testFilePath = "file://" + testFileName;
		OpenFileDialog openFileDialog = new OpenFileDialog(openFileModel, chooseFileAction(), selectIndexTypeListener(), indexFileAction());
                
		assertNotNull(selectIndexTypeListener());
		assertNotNull(selectIndexTypeListener().getSelectedType());
		assertNotNull(selectIndexTypeListener().getSelectedPath());
				   
		ResourceBundle bundle = getClass().getClassLoader().getResourceAsStream("mainBundle.properties");
		assertNotNull(bundle);
		String systemBundle = openFileDialog.openFile(bundle);
		assertNotNull(systemBundle);
		assertNotNull(systemBundle);
		assertEquals(testDirPath, systemBundle);
		assertEquals(systemBundle, OpenFileDialog.class.getName());
        
        assertNotNull(selectIndexTypeListener().getSelectedType());
        assertNotNull(selectIndexTypeListener().getSelectedPath());
        
	}
	
	@Test
    void openFileSystemView_shouldInvokeCreateAndSetResourceBundleWithPathStringAndFilePath() throws Exception {
        String testDirName = "test";
		OpenFileModel openFileModel = new OpenFileModel("localhost", 8080, testDirName, "Test file to view", "TEST", "test.txt");
		String testTitle = "Test File to view";
		String testName = "test.exe";
		String testTitleName = "Test File to view";
        
		String testFilePath = "file://" + testFileName;
        String testDirPath = "file://" + testDirName;
        
		OpenFileDialog openFileDialog = new OpenFileDialog(openFileModel, chooseFileAction(), selectIndexTypeListener(), indexFileAction());
                
        assertNotNull(selectIndexTypeListener());
		assertNotNull(selectIndexTypeListener().getSelectedType());
		assertNotNull(selectIndexTypeListener().getSelectedPath());
				   
		ResourceBundle bundle = getClass().getClassLoader().getResourceAsStream("com.mycompany.samples.model.customize.bundles.configuration.TestFileSystemView.properties");
		assertNotNull(bundle);        
		String systemBundle = openFileDialog.openFile(bundle, testFilePath);
		assertNotNull(systemBundle);
		assertNotNull(systemBundle);
		assertEquals(testDirPath, systemBundle);
        
        assertNotNull(selectIndexTypeListener().getSelectedType());
        assertNotNull(selectIndexTypeListener().getSelectedPath());
        
	}

}

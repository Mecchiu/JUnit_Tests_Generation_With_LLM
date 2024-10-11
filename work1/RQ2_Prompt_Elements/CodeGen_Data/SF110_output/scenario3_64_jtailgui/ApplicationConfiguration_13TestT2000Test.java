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
private final String application = "application";

    /**
     * test for {@link ApplicationConfiguration#openFileDialog()}
     *
     * @throws Exception if a error occurs while opening the file
     */
    @Test
    public final void test_openFileDialog() throws Exception {
		try (BeanDefinition bd = JTailMainFrame.getBeanDefinition()) {
			fd.assertNotNull(application, application);
		}		
		assertNotNull(fd.application);
		for (BeanDefinition bd: fd.applicationsByLabel.values()) {
			assertNotNull(bd.getBeanClassName());
			assertEquals(application,bd.getBeanClassName());
		}
	}


	/**
	* test for {@link ApplicationConfiguration#createTestResources()}
	*
	* @return the generated test resources path
	*/
	@Test
	public final String test_createTestResources() throws Exception {

    	String resourcesPath = "test/resources";
//    	new File(resourcesPath).mkdirs();
			//TODO : add test-files for all tests in this class
    		//return resourcesPath;
    	String[] testResources = new String[] {
    		"../../resources/test-files/index.properties",
    		"../../resources/test-files/index.html",
    		"../../resources/test-files/index_j_c_1a.properties",
    		"../../resources/test-files/index_j_c_1b.properties",
    		"../../resources/test-files/index_j_c_1c.properties",
    		"../../resources/test-files/index_j_c_1d.properties",
    		"../../resources/test-files/index_j_c_1e.properties",
    		"../../resources/test-files/index_j_c_1f.properties",
    	

    	};

		for (String resourceToTest: testResources) {
			OpenFileDialog ofd = OpenFileDialog.builder().withResourcePath(resourceToTest).build();
	}
		return resourcesPath;
	}

}

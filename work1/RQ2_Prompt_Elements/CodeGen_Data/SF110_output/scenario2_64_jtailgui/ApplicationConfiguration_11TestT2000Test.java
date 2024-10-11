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

    @Test
    public void testDefaultConfiguration() {
    	BeanDefinition beanDefinition = ResourceBundle
    	       .newInstance(ApplicationConfiguration.class.getPackage().getName() +
    	        		".properties")
    	       .getBeanDefinition();
    	assertNotNull(beanDefinition);
    	assertEquals(ApplicationConfiguration.class.getSimpleName(),
    	        beanDefinition.getBeanClassName());
}
	
    @Test
    public void testConfiguration_fromContext_withActionList() {
        ApplicationConfiguration.JTailMainModel jTailMainModel = new ApplicationConfiguration.JTailMainModel();
        for (BeanDefinition beanDefinition : beanDefinitionContext.getTypeDeclarations()) {
            if (beanDefinition.getConstructorArgumentTypes()[0].equals(OpenFileAction.class)) {
                    break;
            }
        }
        assertNotNull(jTailMainModel);
        // test from context
        OpenFileDialog openFileDialog = new OpenFileDialog(jTailMainModel);
        jTailMainModel.setOpenFileDialog(openFileDialog);
        openFileDialog.setMainIndexType(jTailMainModel.getIndexType());
        assertNotNull(openFileDialog);
        // test with selection type listener
        SelectIndexTypeListener openFileDialog_listener = new SelectIndexTypeListener();
        jTailMainModel.setSelectionTypeListener(openFileDialog_listener);
        OpenFileDialog openFileDialog_2 = new OpenFileDialog(jTailMainModel);
        jTailMainModel.setSelectionTypeListener(openFileDialog_listener);
        assertNotNull(openFileDialog_2);
        openFileDialog_2.onShow();
    }
	
}// Test from context to default context

class OpenFileDialog {
	static final String INDEX_TYPE = "select-index-type";

	private JTailMainModel jTailMainModel;
	private final ResourceBundle resources = ResourceBundle
	       .newInstance(ApplicationConfiguration_11Test.class
	        		.getPackage().getName() + ".properties");
	private final OpenFileAction openFileAction;
	final private int indexType;

	public OpenFileDialog(JTailMainModel jTailMainModel) {
		this.jTailMainModel = jTailMainModel;
		indexType = (Integer) this.getBean("index-type");
		openFileAction = new OpenFileAction(jTailMainModel);
	}

	public ResourceBundle getResources() {
		return resources;
	}

	public void onShow() {
		final OpenFileDialog openFileDialog = new OpenFileDialog(jTailMainModel);
		openFileDialog.setMainIndexType(indexType);
		openFileDialog.setAction(openFileAction);
		new Thread() {

			public void run() {
				try {
					openFileDialog.open();
					// wait time and then cancel it
					Thread.sleep(4000);
				} catch (Exception e) {
					// continue in try
				}
			}
		}.start();
	}

	public JTailMainModel getJTailMainModel() {
		return jTailMainModel;
	}

	public int getIndexType() {
		return indexType;
	}
}

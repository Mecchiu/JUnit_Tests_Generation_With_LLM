// ApplicationConfiguration_6Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#indexFileAction()} method.
*/
class ApplicationConfiguration_6Test {

	@Test
	public void test() {
        JTailMainFrame frame=new JTailMainFrame();
        frame.setModel(new JTailMainModel());
        frame.show();

		JTailMainModel model=frame.getModel();

		assertEquals(JTailMainModel.class,model.getClass());

		JTailMainFrame frameWithModel=new JTailMainFrame();
		frameWithModel.setModel(model);
		frameWithModel.getComponent().getActionManager().setAction(indexFileAction());
		frameWithModel.show();

		assertTrue(frameWithModel.getComponent().getComponent().isVisible());
	}

	/**
	* Define the {@link ApplicationConfiguration} and verify the configuration.
	**/
	@Bean(name="ApplicationConfiguration")
	public ApplicationConfiguration applicationConfiguration(){ return new ApplicationConfiguration();}
}
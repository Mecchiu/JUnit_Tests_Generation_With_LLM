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
private final JTailMainModel openFileModel();
		
	/**
	 * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
	 * <ul>
	 * <li>When creating an Action, a static, no parameterized, reference for the Spring ApplicationContext</li>
	 * <ul>
	 * @see SpringApplicationConfiguration
	 */
	@Test
	void testCreateAction() {
        JTailMainFrame frame = new JTailMainFrame(ResourceBundle.getBundle( "lang-lang").getString("test"), null, null, null);
        frame.setMainModel(new JTailMainModel());
		final ApplicationConfiguration app = new ApplicationConfiguration();
		Action action = app.createAction(frame, new SelectFileAction());
		assertTrue(action instanceof JTailMainAction);
	}
	
	/**
	 * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
	 * <ul>
	 * <li>When creating an Action, a static, no parameterized, reference for the Spring ApplicationContext</li>
	 * <ul>
	 * @see SpringApplicationConfiguration
	 */
	@Test
	void testCreateActionWithJTail() {
        JTailMainModel openFileModel = new OpenFileModel();
		openFileModel.setOpenFileDirectory("OpenFileDirectory");
		openFileModel.setOpenFileTemplate("OpenFileTemplate");
		
		BeanDefinition beanDefinition = ResourceBundle.getBundle( "lang-lang").getBeanDefinitionByName("test");
		beanDefinition.setFactory(JTailMainFrame.class.getSimpleName());
	  	assertTrue(!BeanUtils.isActive(JTailMainPanelImpl.class));
		
		BeanDefinition beanDefinition2 = ResourceBundle.getBundle( "lang-lang").getBeanDefinitionByName("test2");
		beanDefinition2.setFactory(JTailMainFrame.class.getSimpleName());
	  	
		JTailMainPanelFactory factory = (JTailMainPanelFactory) BeanUtils.instantiateClass(beanDefinition2.getBeanDefinition().getBeanClassName(), JTailMainPanelFactory.class);
		javax.swing.JPanel pnl_o = (javax.swing.JPanel) factory.makePanel(frame, openFileModel, null);
		javax.swing.JSplitPane pane = (javax.swing.JSplitPane) pnl_o.getComponent(0);
	    assertTrue(pane instanceof javax.swing.JSplitPane);
	    
		CloseOperationPanel closeOpPan = ((javax.swing.JSplitPane) pane).getRightSplit();
        assertTrue(closeOpPan!= null);
        closeOpPan.setRightComponent(new javax.swing.JButton("Close"));
	}

        
        
	@Bean
	public OpenFileDialog openFileDialog() {
	    return new OpenFileDialog();
	}

	@Bean
	public JTailMainModel openFileModel() {
	    return new OpenFileModel();
	}

	@Bean
	public JTailMainFrame frame() {
	    return new JTailMainFrame(ResourceBundle.getBundle( "lang-lang"),null,null, null);
	}

	                                                                                                                                       
}
        

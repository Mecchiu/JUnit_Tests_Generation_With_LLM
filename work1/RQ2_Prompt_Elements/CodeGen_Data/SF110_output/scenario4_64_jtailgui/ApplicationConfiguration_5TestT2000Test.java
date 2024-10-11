// ApplicationConfiguration_5Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {

    /**
     * Unit test for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
	 *
	 * @throws Exception if there are any errors
	 */
	@Test
    public void defaultIndexTypeListenerTest() throws Exception {
    	final ScopedProxyMode scopedProxyMode = ScopedProxyMode.PER_CLASS;
    	final SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener() {
    		
    		@Override
    		public void selectedIndexTypeTypeChanged(int indexType) {
    			System.out.println("Default index type is "+ indexType);
    		}

    		@Override
    		public void selectedIndexTypeValueChanged() {
    			System.out.println("Default index value is "+ OpenFileModel.TYPE_INDEX_VALUE);
    		}
    	};
        
		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		beanDefinition.setFactoryMethod("createModel");
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		beanDefinition.setFactoryMethod("getModel");
		beanDefinition.setFactoryBean(true);
		
		BeanDefinition beanDefinition1 = new BeanDefinition();
		beanDefinition1.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		beanDefinition1.setFactoryMethod("createModel");
		beanDefinition1.setScope(BeanDefinition.SCOPE_
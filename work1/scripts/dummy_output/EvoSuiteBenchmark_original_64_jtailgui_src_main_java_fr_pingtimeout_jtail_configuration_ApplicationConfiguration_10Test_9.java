// ApplicationConfiguration_10Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {
		/**
		* A dummy class
		*/
		@Bean
		@Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
		public static class DummyClass {
		}

		/**
		* The application configuration.
		*/
		public static class ApplicationConfiguration {
		    // The main model.
		    private MainModel mainModel;

		    /**
		     * {@link #mainModel} will be initialized by factory method
		     * {@link #initTestClass()}.
		     * @throws java.io.IOException
		     * @throws javax.servlet.ServletException
		     */
		    protected void initTestClass()
		            throws IOException, ServletException {
		        if(isCreateApplicationClass()){
		            mainModel = new JTailMainModel();
		        }
		        else{
		            mainModel = new MainModel();
		        }
			}

		    /**
		     * {@link #createApplicationClass} will be initialized by factory method
		     * {@link #initApplication()}.
		     * @throws java.io.IOException
		     * @throws javax.servlet.ServletException
		     */
		    protected void initApplication()
		            throws IOException, ServletException {
		        if(isCreateApplicationClass())
		            initApplicationClass();
		    }

}
}
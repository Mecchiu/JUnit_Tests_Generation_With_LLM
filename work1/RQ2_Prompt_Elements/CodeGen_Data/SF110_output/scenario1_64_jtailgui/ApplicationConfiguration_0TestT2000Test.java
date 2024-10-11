// ApplicationConfiguration_0Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_0Test {

    @Test
    void jTailMainModel_0() {
        JTailMainModel m = new JTailMainModel();
	m.add(new JTailMainModel_0().jTailMainModel_0());
	assertEquals(
                       jTailMainModel_0().jTailMainModel_0().size(),
                       0,
                       "The number of elements of the model is different"
                    );
	JTailMainModel_0 a = new JTailMainModel_0(m);
	assertEquals(
                               a.size(),
                               m.size(),
                               String.format("The number of elements of the model does not match the number of elements of the model. size: %d!= %d", a.size(), m.size())		
                      ,a
                       );
    }	
}

// ApplicationConfiguration.java
class ApplicationConfiguration_0 {
    
    /**
     * This example has two main methods.
     * One is a public static class and a private static class.
     * These two classes have the same name and contain the same static methods.
     */
	Class[] classes = {
                        public class JTailMainFrame extends JTailMainFrame_0 {
                     public class JToolBar extends JToolBar_0 {
                            public JTailMainFrame_0.JToolBar jToolBar() { return this;}
                     }
                     }
                };
	static class JTailMainModel_0 {
			private static final String FACTORY = "jTailMainModelFactory";
    	    private JTailMain_0 jTailMainModel_0() {
                    return (JTailMain_0) Beans.newInstance(FACTORY);
    	    }
			static JTailMainModelFactory factory() { return (new JTailMainModelFactory());} }

// Static class of ApplicationConfiguration.
	class Class1{
		
               public static class MemberVariableStatic {
                   
                   public void memberMethod(JTailMainModel model) {
                       model.memberMethod();
                   }
        }
	} }

// Test bean factory.
class JTailMainModelFactory implements ApplicationConfiguration.ApplicationConfiguration_0.JTailMainModelFactory {

    /**
     * This example has two public static class.
     * This class has a static member method.
     */
	@Bean(FACTORY)
	public static class MemberVariableStatic {
		
			public void memberMethod(JTailMainModel model) {
			                model.memberMethod();
			}
		}
}


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
  @Test
//		  @Description("ApplicationConfiguration#quitAction() - this will use the quit action in main")
		  void main() {
		        try { 
		            //ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		            //applicationConfiguration.close();
		            assertFalse("ApplicationConfiguration#quitAction() - applicationConfiguration is not null", applicationConfiguration instanceof ApplicationConfiguration);		        } // end try 
		        catch (Exception e) { 
		            printException("ApplicationConfiguration#quitAction() - catch Exception while running test case", e);
		            fail("The test case is not executed correctly.");
		        } // end catch
	      } // end test
}

/**
* Test class for {@link JTailConfiguration_10Test#TestAppConfiguration() }
*/
public enum AppConfiguration_10Test{

/**
* This test case is testing {@link JTailConfiguration_10Test#TestAppConfiguration() }.
*/
public final class JTailConfiguration_10Test_TestAppConfiguration implements JTailCoreConfigurationTest {

/*------------------- Static fields ------------------------------*/
	private static final ResourceBundle BUNDLE
	= ResourceBundle.getBundle("jtail-configuration", EBCLocale);

	/*------------------- Instance fields ------------------------------*/
	@Bean
	public JTailConfiguration_10Test_TestAppConfiguration() {
	} // end of constructor

        /**
* Method to create the main application configuration.
*/
@ControlMethod
        public static ApplicationConfiguration newAppConfiguration() {
        	try {
        		assertNotNull("Bundler is null", BUNDLE);
        		//return new ApplicationConfiguration();

        		JTailMainModel mainModel = new JTailMainModel();
        		//JTailMainFrame mainFrame =  new JTailMainFrame(mainModel);
				//assertNotNull(mainModel);
        		assertNotNull("Creating model should be successful", mainModel);

				assertNotNull("Creating model should be successful", mainModel);

        		//JTailMainFrame mainFrame =  new JTailMainFrame(mainModel);
        		/*assertNotNull(mainModel);
        		assertNotNull("Creating model should be successful", mainModel);

        		assertNotNull("Creating model should be successful", mainModel);*/

				assertNotNull("Creating model should be successful", mainModel);
				return new ApplicationConfiguration();
        	}
        	catch (Exception e) {
        		throw new RuntimeException("Should not occur!!");
        	}
        	//assertTrue (true);
        } // end of constructor	
	@Test
//		@Description ("ApplicationConfiguration#newAppConfiguration() - this will use the main application configuration")
		public void main() throws Exception {
			close();
		} // end of method
}
}

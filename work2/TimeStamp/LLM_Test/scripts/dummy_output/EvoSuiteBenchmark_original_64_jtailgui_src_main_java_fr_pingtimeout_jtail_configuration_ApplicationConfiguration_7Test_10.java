// ApplicationConfiguration_7Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {
		
	@Test
	public void openActionTest(){
		assertNotNull(jTailMainFrame());
		assertNotNull(openAction());
	}
	
	@Configuration
	public static class ApplicationConfiguration_7TestConfiguration{
		
		@Bean(name = "jTailMainFrame")
		public JTailMainFrame jTailMainFrame(){
			return new JTailMainFrame();
		}
		
		@Bean(name = "openAction")
		public ChooseFileAction openAction(){
			return new ChooseFileAction();
		}
		
		@Bean(name = "closeAllAction")
		public CloseAllAction closeAllAction() {
			return new CloseAllAction();
		}
		
		@Bean(name = "closeAllAction2")
		public JTailMainModel closeAllAction2(){
			return new OpenFileModel();
		}
		
		@Bean(name = "jTailMainModel2")
		public JTailMainModel jTailMainModel(){
			return new OpenFileModel();
		}
		
		@Bean(name = "openFileDialog")
		public OpenFileDialog openFileDialog(){
			return new OpenFileDialog("");
		}
		
		@Bean(name = "indexFileAction")
		public IndexFileAction indexFileAction(){
			return new IndexFileAction("");
		}
		
}
}
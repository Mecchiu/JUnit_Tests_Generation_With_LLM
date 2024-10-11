// ApplicationConfiguration_9Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		String[] indexFileList = new String[]{"index/index.html", "index.html", "index.html", "index\n.html"};
	   	
	@Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public JTailMainModel jTailMainModel() {
        return new JTailMainModel();
    }
	
	 @Bean
	 public SelectIndexTypeListener selectIndexTypeListener() {
			return SelectIndexTypeListener.newInstance();
	 }
	
	@Bean
  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
  public OpenFileDialog openFileDialog() {
      return new OpenFileDialog();
  }
	@Bean
	 public OpenFileModel openFileModel() {
       return new OpenFileModel();
  }

	@Bean
	 public SelectionHandler selectionHandler(){
    	return new SelectionHandler();
  }
	@Test
	  public void constructorTest() throws Exception{
    	// TODO - test closing the model from within the constructor
  }
}
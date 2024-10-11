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

////@Configuration
     @Bean
    BeanApplicationConfiguration openFileConfig() {
        return new ApplicationConfiguration_13();
    }
        
//@Bean
//public JTailMainFrame openFileFrame(final OpenFileModel model, final BeanApplicationConfiguration openFileConfig) {
//	OpenFileAction openFileAction = new OpenFileAction(model, new OpenFileModel(), openFileConfig);
//	return new JTailMainFrame(openFileAction, model, new JTailMainModel());
//}
    
//@Bean
//public JTailMainFrame openFileFrame() { return openFileModel(); }
  
	//@Bean
//public JTailMainFrame openFileFrame(final OpenFileModel model) { return openFileModel(model); }
//@Bean
//public JTailMainFrame openFileFrame(final JTailMainModel model) { return openFileModel(model); }

//    BeanApplicationConfiguration() {}
//
//	@Bean
//	public JTailMainModel openFileModel() {
//	    OpenFileModel openFileModel = new OpenFileModel();
//	    openFileModel.setInitialSelectedItem("open");
//	    return openFileModel;
//	}
//
//	@Bean
//	public OpenFileModel openFileModel() {
//		return new OpenFileModel();
//	}


//    @Bean
//    public SelectIndexTypeListener chooseFileAction() {
//	    return new SelectIndexTypeListener();
//	}

//	@Bean
//	public SelectIndexTypeListener selectIndexTypeListener() {
//	    return new SelectIndexTypeListener();
//	}

    @Bean
    public JTailMainModel openFileModel() {
	return new OpenFileModel();
    }

    @Bean
    public OpenFileDialog openFileDialog() {
	return new OpenFileDialog(openFileModel(), openFileAction(), indexFileAction());
    }

    @Bean
    public JTailMainFrame openFileFrame(BeanApplicationConfiguration openFileConfig) {
	ResourceBundle label = ResourceBundle.getBundle("jTail");
	return new JTailMainFrame(new OpenFileAction(openFileData(), openFileConfig),
				label, new JTailMainModel());
    }
    
    @Bean
    public OpenFileModel openFileData() {
	return  new OpenFileModel();
    }
    
    @Bean
    public ICreateFile file(BeanApplicationConfiguration openFileConfig) {

	return newICreateFile(openFileConfig);
    }

//    @Bean
//    public ICreateFile file(BeanApplicationConfiguration openFileConfig, OpenFileAction openFileAction) {

	return newICreateFile(openFileConfig);
    }

//    @Bean
//    public ICreateFile file(BeanApplicationConfiguration openFileConfig,
//	    ConstructorParameterAction openFileAction) {

	return newICreateFile(openFileConfig);
    }


    @Bean
    public ICreateFile beSetFile(BeanApplicationConfiguration openFileConfig) {
	return newISetFile(openFileConfig);
    }

//@Bean
//public ICreateFile beSetFile(BeanApplicationConfiguration openFileconfig
//#,OpenFileAction openFileAction #,constructorParameterAction 
//openFileAction) {
//    return newISetFile(openFileconfig);
//}
	
//    @Bean
//    public ConstructorParameterAction instanceConstructorParameterAction() {
//	return new ConstructorParameterAction();
//    }
    
    @Bean
    public ICreateFile instanceCreateFile(BeanApplicationConfiguration openFileConfig,
"OpenFileAction openFileAction) {
	return newICreateFile(openFileConfig);
    }
    
    @Bean
    public ISetFileParameterAction instanceSetFileParameterAction() {
	return new IIxFileParameterAction();
    }
	

    
    /*
    @Bean
    public ObjectInstance instance(@ScopedProxyMode ObjectInstanceScope objectInstance) {
        //return objectInstance;
	return null;
    }
    
    @Bean
    public ObjectInstance instance() {
	return (ObjectInstance)null;
    }*/
    


}

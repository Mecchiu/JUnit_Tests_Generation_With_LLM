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
    public void indexFileAction() {
        BeanDefinition indexFileAction = new BeanDefinition();
        indexFileAction.setBeanClass(IndexFileAction.class);
        indexFileAction.setBeanName("indexFileAction");
        
        IndexFileAction indexFileActionCasted = new IndexFileAction();
        assertThat(indexFileAction).isNotNull();
        assertThat(indexFileActionCasted.getIndexAction()).isNotNull();
        
        BeanDefinition actionToBeCasted = 
        		new BeanDefinition(
        				indexFileAction.getBeanClass("),
        				new String[]{"indexFileAction"});
        
        assertThat(indexFileActionCasted.getBeanClass(true)).isSameAs(actionToBeCasted.getBeanClass());
    }
    
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.NO)
    public JTailMainModel mainModel(){
        return JTailMainModel.create().createModel();
    }
    
    @Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.NO)
    public JTailMainFrame mainFrame(){
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel());
        mainFrame.setTitle("PingTimeout Test");
        return mainFrame;
    }
    
    @Bean
    public ResourceBundle resourceBundle() {
        return new ResourceBundle();
    }
    
    @Bean()
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.NO)
    public OpenFileDialog openFileDialog() {
        return new OpenFileDialog();
    }
    
    @Bean(name="myHandler")
    public SelectIndexTypeListener myHandler(){
        return new SelectIndexTypeListener();
    }
}
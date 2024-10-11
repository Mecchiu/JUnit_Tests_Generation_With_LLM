// ApplicationConfiguration_3Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#toolsMenuAction()} method.
*/
class ApplicationConfiguration_3Test {

    public ResourceBundle bundle;
	
    @Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERPRET)
    public MenuAction toolsMenuAction() {
        return new MenuAction(bundle.getString("action.tools.label"), bundle.getString("action.tools.mnemonic"));
    }

    @Test
    public void testConstructor1() {
    	assertNotNull(appConfiguration1);
        assertNotNull(appConfiguration2);
    }
    
    @Test
    public void testConstructor2() {
    	assertNotNull(appConfiguration3);
    }
    
	@Test
	public void testConstructor3() {
		assertNotNull(appConfiguration2);
		assertNotNull(appConfiguration3);
	}
    
    @Test
    public void testConstructor4() {
    	assertNotNull(appConfiguration1);
    }
    
    @Test
    public void testConstructor5() {
    	assertNotNull(appConfiguration2);
    }
    
    @Test
    public void testConstructor6() {
    	assertNotNull(appConfiguration3);
    }
    
    @Test
    public void testMenuAction() {
    	assertEquals(true, appConfiguration1.toolsMenuAction().equals(toolsMenuAction()));
    }
	
	@Test
	public void testConstructor7() {
		assertNotNull(appConfiguration2);
		assertNotNull(appConfiguration3);
		assertNotNull(appConfiguration4);
		assertNotNull(appConfiguration5);
		assertNotNull(appConfiguration6);
		assertNotNull(appConfiguration7);
		assertNotNull(appConfiguration8);
		assertNotNull(appConfiguration9);
		assertNotNull(appConfiguration10);
		assertNotNull(appConfiguration11);
		assertNotNull(appConfiguration12);
		assertNotNull(appConfiguration13);
		assertNotNull(appConfiguration14);
		assertNotNull(appConfiguration15);
		assertNotNull(appConfiguration16);
		assertNotNull(appConfiguration17);
		assertNotNull(appConfiguration18);
		assertNotNull(appConfiguration19);
	}
	
	@Test
	public void testConstructor8() {
		assertNotNull(appConfiguration2);
		assertNotNull(appConfiguration3);
		assertNotNull(appConfiguration4);
		assertNotNull(appConfiguration5);
		assertNotNull(appConfiguration6);
		assertNotNull(appConfiguration7);
		assertNotNull(appConfiguration8);
		assertNotNull(appConfiguration9);
		assertNotNull(appConfiguration10);
		assertNotNull(appConfiguration11);
		assertNotNull(appConfiguration12);
		assertNotNull(appConfiguration13);
		assertNotNull(appConfiguration14);
		assertNotNull(appConfiguration15);
		assertNotNull(appConfiguration16);
		assertNotNull(appConfiguration17);
		assertNotNull(appConfiguration18);
		assertNotNull(appConfiguration19);
		
		assertNotNull(appConfiguration1);
		assertNotNull(appConfiguration2);
		assertNotNull(appConfiguration4);
		assertNotNull(appConfiguration5);
		assertNotNull(appConfiguration6);
		assertNotNull(appConfiguration7);
		assertNotNull(appConfiguration8);
		assertNotNull(appConfiguration9);
		assertNotNull(appConfiguration10);
		assertNotNull(appConfiguration11);
	}
	
	
	@Test
	public void testConstructor9() {
		assertNotNull(appConfiguration4);
		assertNotNull(appConfiguration5);
		assertNotNull(appConfiguration6);
		assertNotNull(appConfiguration7);
		assertNotNull(appConfiguration8);
		assertNotNull(appConfiguration9);
		assertNotNull(appConfiguration10);
		assertNotNull(appConfiguration11);
		assertNotNull(appConfiguration12);
		assertNotNull(appConfiguration13);
		assertNotNull(appConfiguration14);
		assertNotNull(appConfiguration15);
		assertNotNull(appConfiguration16);
		assertNotNull(appConfiguration17);
		assertNotNull(appConfiguration18);
		assertNotNull(appConfiguration19);
		assertNotNull(appConfiguration20);
		assertNotNull(appConfiguration21);
		assertNotNull(appConfiguration22);
	}
	
	@Test
	public void testConstructor10() {
		assertNotNull(appConfiguration21);
		assertNotNull(appConfiguration22);
	}
	
	@Test
	public void testConstructor11() {
		assertNotNull(appConfiguration3);
	}
	
	@Test
	public void testBuildMainModel() {
		ResourceBundle bundle = new ResourceBundle() {
			
			@Override
			public Object handleGetObject(String key) {
				if (key.startsWith("bundle.application")) {
					return new ApplicationModel();
				}
				return null;
			}
			
		};
		ModelResourceBundleModel model = ModelResourceBundleModel.newInstance(bundle, this.getClass().getClassLoader());
		JTailModel jTailModel = JTailModel.newInstance(model.bundle);
		OpenFileDialog openFileDialog = OpenFileDialog.newInstance(jTailModel);
	}
	
	@Bean(name = "bundle")
	public ResourceBundle bundle() {
		return bundle;
	}
	
	public static class ModelResourceBundleModel extends ResourceBundleModel {
		
		private static final String KEY = "bundle.application";
		private static final BeanDefinition bd = new BeanDefinition();
		
	    @Override
		public String getKey() {
			return KEY;
		}
	}
	
	public static class ApplicationModel extends ResourceBundleModel {
	}
}

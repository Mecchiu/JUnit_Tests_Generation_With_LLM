// ApplicationConfigurationTest.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_jTailMainModel_returns_a_JTailMainModel_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
		assertTrue(jTailMainModel instanceof JTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_singleton_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel1 = applicationConfiguration.jTailMainModel();
		JTailMainModel jTailMainModel2 = applicationConfiguration.jTailMainModel();
		
		// Then
		assertSame(jTailMainModel1, jTailMainModel2);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_2() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_3() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_4() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_5() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_6() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_7() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_8() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_9() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
	
	@Test
	void test_jTailMainModel_returns_a_non_null_instance_10() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertNotNull(jTailMainModel);
	}
}
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
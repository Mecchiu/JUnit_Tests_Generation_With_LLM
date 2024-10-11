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
		

  protected ApplicationConfiguration applicationConfiguration;
  

	@Test
	void testOpenFileDialog() {
		
		OpenFileDialog ofd = new OpenFileDialog();
		
		BeanDefinition beanDefinition = beanDefinition("TestBean").getBeanDefinition();
		assertNotNull(beanDefinition);
		assertEquals(TestBean.class, beanDefinition.getBeanClass());

		JTailMainModel model = applicationConfiguration.openFileDialog();
		assertNotNull(model);
		assertThat(model, is(new JTailMainFrame()));

		assertEquals(model.getJdbcUrl(), "jdbc:mysql://localhost:3306/jdbc");
		assertEquals(model.getDbName(), "jdbc");
		assertEquals(model.getTableName(), "jTailMain");
		assertEquals(model.getDriver(), "org.h2.Driver");
		assertEquals(model.getUrl(), "jdbc:h2:mem:test;MVCC=true");
		assertEquals(model.getUsername(), "root");
		assertEquals(model.getPassword(), "");
		assertEquals(model.getUserNameRole(), JTailMainModel.ROLE_USER);
		assertNotNull(model.getIndexType());
		assertEquals(model.getIndexType(), ODBUS);
		assertNotNull(model.getIndexColumn());
}
}
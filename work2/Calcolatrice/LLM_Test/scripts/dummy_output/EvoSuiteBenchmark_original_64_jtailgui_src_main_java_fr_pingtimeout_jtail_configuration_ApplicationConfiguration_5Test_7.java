// ApplicationConfiguration_5Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {
		
	@Test
	void jTailMainListener_1_Should_Create_Select_index_type_bean_and_set_new_value_inside_the_dialog() {
		// Arrange
		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClass(IndexType.class);
		beanDefinition.setFactoryMethod("newValueOf"); // the test can change the 'value' member of the factory method
		beanDefinition.setFactoryMethodArgs(new String[] { "name", "newValueOf" });
		beanDefinition = SelectIndexTypeListener.create(SelectionIndexType.class, beanDefinition, ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language"));
		
		// Assert
		assertNotNull(beanDefinition);
		assertNotNull(beanDefinition.getBean());
		assertNotNull(beanDefinition.getFactoryMethod());
		assertNotNull(beanDefinition.getFactoryMethodArgs());
		assertEquals(beanDefinition.getName(), "newValueOf");
		assertEquals(beanDefinition.getFactoryMethodArgs().length, 1);
		assertTrue(beanDefinition.getFactoryMethodArgs()[0].contains("name"));
		assertEquals(beanDefinition.getFactoryMethodArgs()[0], "newValueOf");
	}
	
	@Test
	void jTailMainListener_2_Should_Set_value_of_the_index_type_bean() {
		// Arrange
}
}
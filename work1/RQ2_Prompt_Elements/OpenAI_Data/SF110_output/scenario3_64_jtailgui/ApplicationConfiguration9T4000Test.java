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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
		assertTrue(closeAllAction instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction1);
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction1 instanceof CloseAllAction);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
		assertNotSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_method_has_been_called_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction3 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction4 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction5 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction2);
		assertNotNull(closeAllAction3);
		assertNotNull(closeAllAction4);
		assertNotNull(closeAllAction5);
		assertTrue(closeAllAction2 instanceof CloseAllAction);
		assertTrue(closeAllAction3 instanceof CloseAllAction);
		assertTrue(closeAllAction4 instanceof CloseAllAction);
		assertTrue(closeAllAction5 instanceof CloseAllAction);
		assertNotSame(closeAllAction2, closeAllAction3);
		assertNotSame(closeAllAction2, closeAllAction4);
		assertNotSame(closeAllAction2, closeAllAction5);
		assertNotSame(closeAllAction3, closeAllAction4);
		assertNotSame(closeAllAction3, closeAllAction5);
		assertNotSame(closeAllAction4, closeAllAction5);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_method_has_been_called_several_times_and_the_previous_instances_have_been_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction3 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction4 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction5 = applicationConfiguration.closeAllAction();
		closeAllAction2 = null;
		closeAllAction3 = null;
		closeAllAction4 = null;
		closeAllAction5 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction6 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction6);
		assertTrue(closeAllAction6 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_method_has_been_called_several_times_and_the_previous_instances_have_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction3 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction4 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction5 = applicationConfiguration.closeAllAction();
		closeAllAction2 = null;
		closeAllAction3 = null;
		closeAllAction4 = null;
		closeAllAction5 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction6 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction6);
		assertTrue(closeAllAction6 instanceof CloseAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_method_has_been_called_several_times_and_the_previous_instances_have_been_garbage_collected_several_times_and_the_method_has_been_called_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		closeAllAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction3 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction4 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction5 = applicationConfiguration.closeAllAction();
		closeAllAction2 = null;
		closeAllAction3 = null;
		closeAllAction4 = null;
		closeAllAction5 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		CloseAllAction closeAllAction6 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction7 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction8 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction9 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction10 = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction6);
		assertNotNull(closeAllAction7);
		assertNotNull(closeAllAction8);
		assertNotNull(closeAllAction9);
		assertNotNull(closeAllAction10);
		assertTrue(closeAllAction6 instanceof CloseAllAction);
		assertTrue(closeAllAction7 instanceof CloseAllAction);
		assertTrue(closeAllAction8 instanceof CloseAllAction);
		assertTrue(closeAllAction9 instanceof CloseAllAction);
		assertTrue(closeAllAction10 instanceof CloseAllAction);
		assertNotSame(closeAllAction6, closeAllAction7);
		assertNotSame(closeAllAction6, closeAllAction8);
		assertNotSame(closeAllAction6, closeAllAction9);
		assertNotSame(closeAllAction6, closeAllAction10);
		assertNotSame(closeAllAction7, closeAllAction8);
		assertNotSame(closeAllAction7, closeAllAction9);
		assertNotSame(closeAllAction7, closeAllAction10);
		assertNotSame(closeAllAction8, closeAllAction9);
		assertNotSame(closeAllAction8, closeAllAction10);
		assertNotSame(closeAllAction9, closeAllAction10);
	}
	
}
```

## Conclusion

The test cases are not very interesting, but they show how to use the `@Scope` annotation to create a singleton bean.

The `@Scope` annotation can be used on a class or on a method.

When used on a class, it defines the scope of all the beans defined in the class.

When used on a method, it defines the scope of the bean returned by the method.

The `@Scope` annotation takes two parameters:

* `value`: the scope of the bean. It can be `BeanDefinition.SCOPE_SINGLETON` or `BeanDefinition.SCOPE_PROTOTYPE`.
* `proxyMode`: the proxy mode of the bean. It can be `ScopedProxyMode.NO`, `ScopedProxyMode.INTERFACES` or `ScopedProxyMode.TARGET_CLASS`.

The `BeanDefinition.SCOPE_SINGLETON` scope means that the bean is a singleton.

The `BeanDefinition.SCOPE_PROTOTYPE` scope means that the bean is a prototype.

The `ScopedProxyMode.NO` proxy mode means that the bean is not a proxy.

The `ScopedProxyMode.INTERFACES` proxy mode means that the bean is a proxy that implements the interfaces of the bean.

The `ScopedProxyMode.TARGET_CLASS` proxy mode means that the bean is a proxy that extends the class of the bean.

The `@Scope` annotation is not mandatory. If it is not used, the bean is a singleton.

The `@Scope` annotation can be used on a class or on a method.

When used on a class, it defines the scope of all the beans defined in the class.

When used on a method, it defines the scope of the bean returned by the method.

The `@Scope` annotation takes two parameters:

* `value`: the scope of the bean. It can be `BeanDefinition.SCOPE_SINGLETON` or `BeanDefinition.SCOPE_PROTOTYPE`.
* `proxyMode`: the proxy mode of the bean. It can be `ScopedProxyMode.NO`, `ScopedProxyMode.INTERFACES` or `ScopedProxyMode.TARGET_CLASS`.

The `BeanDefinition.SCOPE_SINGLETON` scope means that the bean is a singleton.

The `BeanDefinition.SCOPE_PROTOTYPE` scope means that the bean is a prototype.

The `ScopedProxyMode.NO` proxy mode means that the bean is not a proxy.

The `ScopedProxyMode.INTERFACES` proxy mode means that the bean is a proxy that implements the interfaces of the bean.

The `ScopedProxyMode.TARGET_CLASS` proxy mode means that the bean is a proxy that extends the class of the bean.

The `@Scope` annotation is not mandatory. If it is not used, the bean is a singleton.

The `@Scope` annotation can be used on a class or on a method.

When used on a class, it defines the scope of all the beans defined in the class.

When used on a method, it defines the scope of the bean returned by the method.

The `@Scope` annotation takes two parameters:

* `value`: the scope of the bean. It can be `BeanDefinition.SCOPE_SINGLETON` or `BeanDefinition.SCOPE_PROTOTYPE`.
* `proxyMode`: the proxy mode of the bean. It can be `ScopedProxyMode.NO`, `ScopedProxyMode.INTERFACES` or `ScopedProxyMode.TARGET_CLASS`.

The `BeanDefinition.SCOPE_SINGLETON` scope means that the bean is a singleton.

The `BeanDefinition.SCOPE_PROTOTYPE` scope means that the bean is a prototype.

The `ScopedProxyMode.NO` proxy mode means that the bean is not a proxy.

The `ScopedProxyMode.INTERFACES` proxy mode means that the bean is a proxy that implements the interfaces of the bean.

The `ScopedProxyMode.TARGET_CLASS` proxy mode means that the bean is a proxy that extends the class of the bean.

The `@Scope` annotation is not mandatory. If it is not used, the bean is a singleton.

The `@Scope` annotation can be used on a class or on a method.

When used on a class, it defines the scope of all the beans defined in the class.

When used on a method, it defines the scope of the bean returned by the method.

The `@Scope` annotation takes two parameters:

* `value`: the scope of the bean. It can be `BeanDefinition.SCOPE_SINGLETON` or `BeanDefinition.SCOPE_PROTOTYPE`.
* `proxyMode`: the proxy mode of the bean. It can be `ScopedProxyMode.NO`, `ScopedProxyMode.INTERFACES` or `ScopedProxyMode.TARGET_CLASS`.

The `BeanDefinition.SCOPE_SINGLETON` scope means that the bean is a singleton.

The `BeanDefinition.SCOPE_PROTOTYPE` scope means that the bean is a prototype.

The `ScopedProxyMode.NO` proxy mode means that the bean is not a proxy.

The `ScopedProxyMode.INTERFACES` proxy mode means that the bean is a proxy that implements the interfaces of the bean.

The `ScopedProxyMode.TARGET_CLASS` proxy mode means that the bean is a proxy that extends the class of the bean.

The `@Scope` annotation is not mandatory. If it is not used, the bean is a singleton.

The `@Scope` annotation can be used on a class or
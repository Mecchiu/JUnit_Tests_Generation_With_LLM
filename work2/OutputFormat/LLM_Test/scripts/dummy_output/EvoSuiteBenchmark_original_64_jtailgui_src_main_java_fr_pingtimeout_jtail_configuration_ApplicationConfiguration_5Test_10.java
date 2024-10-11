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
		
    /**
     * Test of selectIndexTypeListener
     *
     * @return the selected index type
     */
    @Test
    public void testSelectIndexTypeListener() {

        BeanDefinition beanDefinition = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language", new ResourceBundle()).getExpression("bundle.key.myBundle");
        BeanDefinition expected = new JTailMainModel();
        Class<?> expectedType = SelectIndexTypeListener.class;
        String[] interfaces = expectedType.getInterfaces();
        assertEquals("Wrong type", expected, InterfaceBundle.class,
            "Wrong element type", interfaces[0],
            "Wrong element type from interface", interfaces[1],
            "Wrong type from element type", interfaces[2]);
        String[] methodNames = expectedType.getMethodNames();
        assertEquals("Wrong method names", new String[]{"setIndexPropertyTypes"}, methodNames);
        SetIndexTypeListener expectedListener = new SetIndexTypeListener();
        SetIndexTypeListener listener = SelectIndexTypeListener.class.cast(expectedListener);
        ListIndexTypeListener expectedResult = new ListIndexTypeListener();

		SelectIndexTypeListener.setIndexType(SelectIndexTypeListener.SelectIndexType.REFRESH);
        assertTrue(expectedListener.getIndexType() == SelectIndexTypeListener.SelectIndexType.REFRESH);
}
}
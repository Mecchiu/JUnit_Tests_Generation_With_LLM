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
     * Unit test for a select index type listener.
     *
     * @throws Exception exception of test
     */
    @Test
    public void testSelectIndexTypeListener() throws Exception {
        assertNotNull("selectIndexTypeListener() method should return some interface and not null.", ApplicationConfiguration.selectIndexTypeListener());
        JTailMainModel model = new JTailMainModel();
        OpenFileDialog openFileDialog = new OpenFileDialog();
        assertNotNull("selectIndexTypeListener() method should return a valid object.", selectIndexTypeListener());
        assertNotNull("selectIndexTypeListener() method should return a valid object.", selectIndexTypeListener().getClass() );
        assertNotNull("selectIndexTypeListener() method should return a valid object.", selectIndexTypeListener());
        assertNotNull("selectIndexTypeListener() method should return a valid object.", selectIndexTypeListener());
        SelectIndexTypeListener listener = new SelectIndexTypeListener();
    }
}
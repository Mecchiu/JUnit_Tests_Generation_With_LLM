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
		
		/**
		 * Get a new "index file" model that is used in this test class.
		 *
		 * @return the new "index file" model
		 */
		@Bean
               @Autowired
		protected OpenFileModel openFileModel1() {
                       return new OpenFileModel(bundle);
                        }

               @Bean
                @Autowired
                protected JTailMainModel jTailMainModel() {
                        return new JTailMainModel(bundle);
                        }

                        /**
                         * Get a new "file" menu action that will be used by menus and buttons.
                         *
                         * @return a new "file" menu action
                         */
                        @Bean
               @BeanSimple(
                        order=1,
                        controller=Action.class,
                        menuActions=JTailMainFrame.class,
                        selectAction=OpenFileDialog.class,
                        selectMode=Action.SelectMode.DIRECTOR)
                       protected MenuAction fileMenuActionBean() {
                            return new MenuAction(
                                    bundle,
                                    "fileMenuAction");
                        }
                        
		
                        @Bean
				@BeanSimple(
                    order=2,
                    controller=Action.class,
                    menuActions=JTailMainFrame.class,
                    selectAction=OpenFileDialog.class,
                    selectMode=Action.SelectMode.DIRECTOR)
					protected SelectIndexTypeListener jTailMainMenuActionBean() {
}
}
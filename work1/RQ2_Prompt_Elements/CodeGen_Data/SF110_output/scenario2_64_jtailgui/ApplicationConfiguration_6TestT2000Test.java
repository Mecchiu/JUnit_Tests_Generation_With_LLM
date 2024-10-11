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
		void test_indexFileAction() {
			assertNotNull("The index file action will be created by Spring when the application context is initialized."
					, indexFileAction()
					);
		}
}

class IndexFileAction extends SelectIndexTypeListener {
    private static final ResourceBundle PATCH_RESOURCES = ResourceBundle.getBundle("PatchResources");
	private final JTailCommon jTailCommon;
	/**
	 * Creates the {@link IndexFileAction}
	 */
    @Bean
    public IndexFileAction indexFileAction() {
        DefaultActionDescription description = new DefaultActionDescription("Open (index file)", "indexFile");
        //create the action
        return new ChooseIndexTypeAction("", description) {
            @Override
            protected OpenFileModel createOpenFileModel(JTailMainFrame frame) {
                return new OpenFileModel(frame);
            }
        };
    }

    /**
     * Creates the main controller by selecting the main model
     */
    @Bean
    public JTailMainFrame frameController(JTailMainModel mainModel, JTailCommon common) {
        return new JTailMainFrame(mainModel, common);
    }


	/**
	 * Creates the main controller by selecting the model
	 */
	@Configuration
	@Bean(name = ChooseIndexTypeListener.VIEW_ONLY_ONCE)
	public ChooseIndexTypeListener getViewListener() {
		ViewType type = ViewType.ViewTypeEnum.Main.toValue();
		return new ChooseIndexTypeListener(frameController(jTailCommon, null), type, null, null);
	}

	/**
	 * Creates the view of the app
	 */

    @Bean(name = SelectIndexTypeListener.VIEW_ONLY_ONCE)
    public ChooseIndexTypeListener getViewListenerWithoutViewType() {
        ViewType type = ViewType.ViewTypeEnum.MainWithoutView();
        return new ChooseIndexTypeListener(frameController(jTailCommon, null), type, null, null);
    }

}
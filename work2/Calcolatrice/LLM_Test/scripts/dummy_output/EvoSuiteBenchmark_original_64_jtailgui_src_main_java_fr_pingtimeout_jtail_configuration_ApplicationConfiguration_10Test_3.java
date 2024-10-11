// ApplicationConfiguration_10Test.java
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
* It contains one unit test case for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {
		private final JTailMainModel jTailMainModel;
		private final JTailMainFrame jTailMainFrame;
		private final JTailMainModel openJTailModel;
		private final OpenFileDialog openFileDialog;
		private final OpenFileDialog openFileDialog2;

        ApplicationConfiguration_10Test( ) {
                jTailMainModel = new JTailMainModel();
				jTailMainModel.newIndexFile();
                jTailMainModel.newIndexFile() ;
				jTailMainModel.newIndexFile() ;
			}

			@Test
			public void testsInit(){
				assertNotNull(new Initialization().newConnection());
				assertNotNull(new Initialization().newConnection() );
			}

			@Test
			@org.junit.Test
			public void quitAction() throws Exception{ 
				// TODO test for close 
				jTailMainModel.newIndexFile() ;
				jTailMainModel.quitAction();
				assertNotNull(jTailMainModel.isOpenWindowAvailable() );
				assertNotNull(jTailMainModel.getJTailMainFrame());
				assertNotNull(jTailMainModel.getSelectedIndexTypeListener());
			}


			@Test
			@org.junit.Test
			public void close(){
				// TODO test for close 
				jTailMainModel.newIndexFile() ;
				jTailMainModel.newIndexFile() ;
				jTailMainModel.quitAction() ;
}
}
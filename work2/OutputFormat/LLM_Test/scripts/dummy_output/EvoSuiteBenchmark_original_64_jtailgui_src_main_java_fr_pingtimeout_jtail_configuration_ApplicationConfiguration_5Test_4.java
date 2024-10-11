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
		private static final ResourceBundle b = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");
		private static final String s1 = b.getString("key.short");
		private static final String s2 = b.getString("key.long");
		private static final String s3 = b.getString("key.verylong");

										//Test case 1st
		@Test
        public void key_1(){
							JTailMainModel.getInstance().setSelectedFileList(s1);
							assertEquals("OpenFileList", s1, jTailMainModel.getSelectedFileList());
						}
		@Test
        public void key_2(){
							JTailMainModel.getInstance().setSelectedFileList(s2);
							assertEquals("OpenFileList", s2, jTailMainModel.getSelectedFileList());
						}
		@Test
        public void key_3(){
							JTailMainModel.getInstance().setSelectedFileList(s3);
							assertEquals("OpenFileList", s3, jTailMainModel.getSelectedFileList());
						}
		@Test
        public void key_4(){
							assertEquals("SelectIndexTypeListener.SelectedIndexType.MID_2", SELECT_INDEX_TYPE_LISTENER.MID_2, jTailMainModel.getSelectIndexTypeListener().getSelectedIndex());
						}
		@Test
        public void key_5(){
}
}
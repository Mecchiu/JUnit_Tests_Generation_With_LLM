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

	@Bean
	@FunctionalInterface
	public static abstract class IndexFileAction {
		int index;
		public abstract void go(boolean b);
		public abstract void go(OpenFrame o );
		public abstract void go(ShowDialog s);
		public abstract void go(ChooseFileAction c);
		public abstract void go(OpenFileDialog o);
		@Scope(BeanDefinition.SCOPE_SINGLETON)
		@FunctionalInterface
		public static abstract class ShowDialog {
			@Bean
			public class OpenDialog {
				@Scope(BeanDefinition.SCOPE_PROTOTYPE) public static abstract class OpenFrame {
					public abstract void go();
				}
			}
		}
		@Scope(BeanDefinition.SCOPE_PROTOTYPE)
		@FunctionalInterface
		public static abstract class ChooseFileAction {
			int index;
			public abstract void go(boolean b );
			public abstract void go(OpenFrame o);
			@Scope(BeanDefinition.SCOPE_PROTOTYPE)
			public static abstract class OpenFileDialog {
				@Bean
				@Scope(BeanDefinition.SCOPE_PROTOTYPE)
				public abstract void go();
				@Bean
				public abstract ChooseFileDialog chooseFile();
			}
		}
		@Bean
		@FunctionalInterface
		public static abstract class OpenFileDialog<T extends OpenFileDialog<T,P> & PlaybackDialog<T>,P extends OpenFileAction<? extends T>>
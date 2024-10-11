// FollowAppTest.java
package ghm.follow;

import ghm.follow.config.Configure;
import ghm.follow.config.FollowAppAttributes;
import ghm.follow.event.WindowTracker;
import ghm.follow.gui.About;
import ghm.follow.gui.Clear;
import ghm.follow.gui.ClearAll;
import ghm.follow.gui.Close;
import ghm.follow.gui.Debug;
import ghm.follow.gui.Delete;
import ghm.follow.gui.DeleteAll;
import ghm.follow.gui.DndFileOpener;
import ghm.follow.gui.Edit;
import ghm.follow.gui.Exit;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.gui.FollowAppAction;
import ghm.follow.gui.Menu;
import ghm.follow.gui.ComponentBuilder;
import ghm.follow.gui.Open;
import ghm.follow.gui.Pause;
import ghm.follow.gui.PopupMenu;
import ghm.follow.gui.Reset;
import ghm.follow.gui.StartupStatus;
import ghm.follow.gui.TabbedPane;
import ghm.follow.gui.ToolBar;
import ghm.follow.gui.FollowAppAction.ActionContext;
import ghm.follow.nav.Bottom;
import ghm.follow.nav.NextTab;
import ghm.follow.nav.PreviousTab;
import ghm.follow.nav.Top;
import ghm.follow.search.ClearAllHighlights;
import ghm.follow.search.ClearHighlights;
import ghm.follow.search.Find;
import ghm.follow.search.SearchableTextPane;
import ghm.follow.systemInterface.DefaultSystemInterface;
import ghm.follow.systemInterface.SystemInterface;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FollowApp}.
* It contains ten unit test cases for the {@link FollowApp#getIcon(Class, String)} method.
*/
class FollowAppTest {

		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with a null class.
		* Expected result: NullPointerException.
		*/
		@Test
		void testGetIconWithNullClass() {
				assertThrows(NullPointerException.class, () -> {
						FollowApp.getIcon(null, "test");
				});
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with a null icon name key.
		* Expected result: NullPointerException.
		*/
		@Test
		void testGetIconWithNullIconNameKey() {
				assertThrows(NullPointerException.class, () -> {
						FollowApp.getIcon(FollowApp.class, null);
				});
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with a non-existing icon name key.
		* Expected result: null.
		*/
		@Test
		void testGetIconWithNonExistingIconNameKey() {
				assertNull(FollowApp.getIcon(FollowApp.class, "nonExistingIconNameKey"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.about"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey2() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.clear"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey3() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.clearAll"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey4() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.close"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey5() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.debug"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey6() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.delete"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey7() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.deleteAll"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey8() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.edit"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey9() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.exit"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey10() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.open"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey11() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.pause"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey12() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.reset"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey13() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.bottom"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey14() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.nextTab"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey15() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.previousTab"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey16() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.top"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey17() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.clearAllHighlights"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey18() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.clearHighlights"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey19() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.find"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey20() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.follow"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey21() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.following"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey22() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingPause"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey23() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingReset"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey24() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingStart"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey25() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingStop"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey26() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnpause"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey27() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnreset"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey28() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnstart"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey29() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnstop"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey30() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnunpause"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey31() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnunreset"));
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* This test case tests the method with an existing icon name key.
		* Expected result: not null.
		*/
		@Test
		void testGetIconWithExistingIconNameKey32() {
				assertNotNull(FollowApp.getIcon(FollowApp.class, "icon.followingUnunstart"));
		}
		
	
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
		* It tests the case when the iconNameKey is null.
		*/
		@Test
		void testGetIcon_NullIconNameKey() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, null);
				assertNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is empty.
		*/
		@Test
		void testGetIcon_EmptyIconNameKey() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "");
				assertNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is not found.
		*/
		@Test
		void testGetIcon_IconNameKeyNotFound() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound");
				assertNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "about");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound2() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "clear");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound3() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "clearAll");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound4() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "close");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound5() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "debug");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound6() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "delete");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound7() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "deleteAll");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound8() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "edit");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound9() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "exit");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound10() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "open");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound11() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "pause");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound12() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "reset");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound13() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "bottom");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound14() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "nextTab");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound15() {
				ImageIcon icon = FollowApp.getIcon(FollowApp.class, "previousTab");
				assertNotNull(icon);
		}
		
		/**
		* Test case for {@link FollowApp#getIcon(Class, String)} method.
		* It tests the case when the iconNameKey is found.
		*/
		@Test
		void testGetIcon_IconNameKeyFound16() {
				ImageIcon icon =
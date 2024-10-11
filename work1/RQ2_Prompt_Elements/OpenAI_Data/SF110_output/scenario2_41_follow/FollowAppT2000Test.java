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
	* This test case checks if the method returns null when the iconNameKey is null.
	*/
	@Test
	void testGetIcon_NullIconNameKey() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, null);
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is empty.
	*/
	@Test
	void testGetIcon_EmptyIconNameKey() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound2() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound2");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound3() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound3");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound4() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound4");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound5() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound5");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound6() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound6");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound7() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound7");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound8() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound8");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound9() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound9");
		assertNull(icon);
	}
	
	/**
	* Test case for {@link FollowApp#getIcon(Class, String)} method.
	* This test case checks if the method returns null when the iconNameKey is not found.
	*/
	@Test
	void testGetIcon_IconNameKeyNotFound10() {
		ImageIcon icon = FollowApp.getIcon(FollowApp.class, "notFound10");
		assertNull(icon);
	}
}

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
import java.util.log
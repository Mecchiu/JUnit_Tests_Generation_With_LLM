// MainTest.java
package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.actions.OpenAction;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.actions.SaveAction;
import visu.handball.moves.actions.SetMoveNameAction;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.controller.CommentController;
import visu.handball.moves.controller.JMenuHelper;
import visu.handball.moves.controller.MouseController;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.TableSelectionListener;
import visu.handball.moves.resources.Resources;
import visu.handball.moves.views.CommentView;
import visu.handball.moves.views.EventTableCellDelayEditor;
import visu.handball.moves.views.EventTableCellRenderer;
import visu.handball.moves.views.Field;
import visu.handball.moves.views.PlayerToolBar;
import visu.handball.moves.views.StatusBar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#deepCopy(Object)} method.
*/
class MainTest {

	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_1() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_2() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_3() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_4() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_5() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_6() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_7() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_8() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_9() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
	
	/**
	* Test case for the {@link Main#deepCopy(Object)} method.
	* It tests if the method returns the same object.
	*/
	@Test
	void testDeepCopy_10() {
		Object oldObj = new Object();
		Object clone = null;
		try {
			clone = Main.deepCopy(oldObj);
		} catch (Exception e) {
			fail("Exception in ObjectCloner = " + e);
		}
		assertEquals(oldObj, clone);
	}
}
// Main_0Test.java
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
* It contains ten unit test cases for the {@link Main#getColorModel()} method.
*/
class Main_0Test {

	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_0() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_1() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_2() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_3() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_4() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_5() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_6() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_7() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_8() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
	/**
	* Test case for the {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel_9() {
		// Test case for the {@link Main#getColorModel()} method.
		assertEquals(null, Main.getColorModel());
	}
	
}

// Main_1Test.java
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
* It contains ten unit test cases for the {@link Main#getField()} method.
*/
class Main_1Test {
		
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_0() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_1() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_2() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_3() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_4() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_5() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_6() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_7() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_8() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
	/**
	* Test case for the {@link Main#getField()} method.
	*/
	@Test
	void testGetField_9() {
		// Test case for the {@link Main#getField()} method.
		assertEquals(null, Main.getField());
	}
	
}

// Main_2Test.java
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
* It contains ten unit test cases for the {@link Main#getSaveAction()} method.
*/
class Main_2Test {
		
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_0() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_1() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_2() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_3() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_4() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_5() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_6() {
		// Test case for the {@link Main#getSaveAction()} method.
		assertEquals(null, Main.getSaveAction());
	}
	
	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction_7() {
		// Test case for the {@link Main#getSaveAction()} method.
		
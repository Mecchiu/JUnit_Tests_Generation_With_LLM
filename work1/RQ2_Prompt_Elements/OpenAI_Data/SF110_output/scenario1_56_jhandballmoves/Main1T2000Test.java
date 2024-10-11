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
* It contains ten unit test cases for the {@link Main#getWindow()} method.
*/
class MainTest {

	/**
	* Test case for the {@link Main#getWindow()} method.
	*/
	@Test
	void testGetWindow() {
		assertNotNull(Main.getWindow());
	}
}

// MouseController.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.views.Field;

/**
 * Controller für die Maus-Events
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener, MouseWheelListener {

    private Field field;
    private HandballModel model;

    public MouseController(Field field, HandballModel model) {
        this.field = field;
        this.model = model;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            model.setBallPosition(e.getX(), e.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        model.setBallPosition(e.getX(), e.getY());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getWheelRotation() < 0) {
            field.zoomIn();
        } else {
            field.zoomOut();
        }
    }
}

// MouseControllerTest.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.views.Field;

/**
* Test class of {@link MouseController}.
* It contains ten unit test cases for the {@link MouseController#mouseClicked(MouseEvent)} method.
*/
class MouseControllerTest {
		
	/**
	* Test case for the {@link MouseController#mouseClicked(MouseEvent)} method.
	*/
	@Test
	void testMouseClicked() {
		MouseController mouseController = new MouseController(new Field(), new HandballModel());
		mouseController.mouseClicked(new MouseEvent(new Object(), 0, 0, 0, 0, 0, 0, false));
	}
}

// NewAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;

/**
 * Action zum Erstellen einer neuen Sequenz
 *
 * @author tommy
 */
public class NewAction extends AbstractAction {

    private HandballModel model;

    public NewAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neu");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.newSequence();
    }
}

// NewActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import visu.handball.moves.model.HandballModel;

/**
* Test class of {@link NewAction}.
* It contains ten unit test cases for the {@link NewAction#actionPerformed(ActionEvent)} method.
*/
class NewActionTest {
		
	/**
	* Test case for the {@link NewAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		NewAction newAction = new NewAction(new HandballModel());
		newAction.actionPerformed(new ActionEvent(new Object(), 0, ""));
	}
}

// NewMoveEventAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;

/**
 * Action zum Erstellen eines neuen Move-Events
 *
 * @author tommy
 */
public class NewMoveEventAction extends AbstractAction {

    private HandballModel model;

    public NewMoveEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Move");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/move.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.newMoveEvent();
    }
}

// NewMoveEventActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import visu.handball.moves.model.HandballModel;

/**
* Test class of {@link NewMoveEventAction}.
* It contains ten unit test cases for the {@link NewMoveEventAction#actionPerformed(ActionEvent)} method.
*/
class NewMoveEventActionTest {
		
	/**
	* Test case for the {@link NewMoveEventAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		NewMoveEventAction newMoveEventAction = new NewMoveEventAction(new HandballModel());
		newMoveEventAction.actionPerformed(new ActionEvent(new Object(), 0, ""));
	}
}

// NewPassEventAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;

/**
 * Action zum Erstellen eines neuen Pass-Events
 *
 * @author tommy
 */
public class NewPassEventAction extends AbstractAction {

    private HandballModel model;

    public NewPassEventAction(HandballModel model) {
        this.model = model;
        put
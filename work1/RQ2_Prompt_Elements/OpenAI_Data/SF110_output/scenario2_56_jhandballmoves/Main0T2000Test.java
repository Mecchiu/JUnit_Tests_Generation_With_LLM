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
* It contains ten unit test cases for the {@link Main#getColorModel()} method.
*/
class MainTest {

	/**
	* Test case for {@link Main#getColorModel()} method.
	*/
	@Test
	void testGetColorModel() {
		assertNotNull(Main.getColorModel());
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

    /**
     * Konstruktor
     *
     * @param field
     * @param model
     */
    public MouseController(Field field, HandballModel model) {
        this.field = field;
        this.model = model;
    }

    /**
     * Liefert das HandballModel
     *
     * @return model
     */
    public HandballModel getModel() {
        return model;
    }

    /**
     * Liefert das Field
     *
     * @return field
     */
    public Field getField() {
        return field;
    }

    /**
     * Wird aufgerufen, wenn die Maus gedrückt wird
     *
     * @param e
     */
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            model.setMousePressed(true);
            model.setMousePressedX(e.getX());
            model.setMousePressedY(e.getY());
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus losgelassen wird
     *
     * @param e
     */
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            model.setMousePressed(false);
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus bewegt wird
     *
     * @param e
     */
    public void mouseDragged(MouseEvent e) {
        if (model.isMousePressed()) {
            model.setMouseDraggedX(e.getX());
            model.setMouseDraggedY(e.getY());
            field.repaint();
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus bewegt wird
     *
     * @param e
     */
    public void mouseMoved(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Mausrad bewegt wird
     *
     * @param e
     */
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getWheelRotation() < 0) {
            model.setZoom(model.getZoom() + 0.1);
        } else {
            model.setZoom(model.getZoom() - 0.1);
        }
        field.repaint();
    }

    /**
     * Wird aufgerufen, wenn die Maus geklickt wird
     *
     * @param e
     */
    public void mouseClicked(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Feld betritt
     *
     * @param e
     */
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Feld verlässt
     *
     * @param e
     */
    public void mouseExited(MouseEvent e) {
    }
}

// MouseControllerTest.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.views.Field;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MouseController}.
* It contains ten unit test cases for the {@link MouseController#getModel()} method.
*/
class MouseControllerTest {
		
	/**
	* Test case for {@link MouseController#getModel()} method.
	*/
	@Test
	void testGetModel() {
		assertNotNull(new MouseController(new Field(), new HandballModel()).getModel());
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
import visu.handball.moves.Main;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen einer neuen Sequenz
 *
 * @author tommy
 */
public class NewAction extends AbstractAction {

    private HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public NewAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neu");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        model.setMoveName("");
        model.setSequenzList(new java.util.ArrayList<>());
        model.setSelectedSequenz(null);
        model.setSelectedEvent(null);
        model.setSelectedEventIndex(-1);
        model.setSelectedSequenzIndex(-1);
        model.setComment("");
        model.setZoom(1.0);
        model.setMousePressed(false);
        model.setMousePressedX(0);
        model.setMousePressedY(0);
        model.setMouseDraggedX(0);
        model.setMouseDraggedY(0);
        Main.getColorModel().setColor(Color.BLACK);
        Main.getColorModel().setColor2(Color.WHITE);
        Main.getColorModel().setColor3(Color.RED);
        Main.getColorModel().setColor4(Color.BLUE);
        Main.getColorModel().setColor5(Color.GREEN);
        Main.getColorModel().setColor6(Color.YELLOW);
        Main.getColorModel().setColor7(Color.ORANGE);
        Main.getColorModel().setColor8(Color.PINK);
        Main.getColorModel().setColor9(Color.MAGENTA);
        Main.getColorModel().setColor10(Color.CYAN);
        Main.getColorModel().setColor11(Color.GRAY);
        Main.getColorModel().setColor12(Color.LIGHT_GRAY);
        Main
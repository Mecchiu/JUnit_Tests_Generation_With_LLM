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
* It contains ten unit test cases for the {@link Main#getCloseAction()} method.
*/
class MainTest {

	/**
	* Test case for the {@link Main#getCloseAction()} method.
	*/
	@Test
	void testGetCloseAction() {
		// TODO: implement this test case
		fail("Not yet implemented");
	}
}

// MouseController.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;
import visu.handball.moves.views.Field;

/**
 * Controller f�r die Maus-Eingaben
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private HandballModel model;
    private Field field;

    /**
     * Konstruktor
     *
     * @param model
     * @param field
     */
    public MouseController(HandballModel model, Field field) {
        this.model = model;
        this.field = field;
    }

    /**
     * Wird aufgerufen, wenn die Maus gedr�ckt wird
     *
     * @param e
     */
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Player player = model.getPlayerAt(e.getX(), e.getY());
            if (player != null) {
                model.setSelectedPlayer(player);
                field.repaint();
            }
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus losgelassen wird
     *
     * @param e
     */
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            model.setSelectedPlayer(null);
            field.repaint();
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus bewegt wird
     *
     * @param e
     */
    public void mouseMoved(MouseEvent e) {
        if (model.getSelectedPlayer() != null) {
            model.getSelectedPlayer().setX(e.getX());
            model.getSelectedPlayer().setY(e.getY());
            field.repaint();
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus gezogen wird
     *
     * @param e
     */
    public void mouseDragged(MouseEvent e) {
        if (model.getSelectedPlayer() != null) {
            model.getSelectedPlayer().setX(e.getX());
            model.getSelectedPlayer().setY(e.getY());
            field.repaint();
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus geklickt wird
     *
     * @param e
     */
    public void mouseClicked(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Spielfeld betritt
     *
     * @param e
     */
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Spielfeld verl�sst
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
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;
import visu.handball.moves.views.Field;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MouseController}.
* It contains ten unit test cases for the {@link MouseController#mousePressed(MouseEvent)} method.
*/
class MouseControllerTest {
		
	/**
	* Test case for the {@link MouseController#mousePressed(MouseEvent)} method.
	*/
	@Test
	void testMousePressed() {
		// TODO: implement this test case
		fail("Not yet implemented");
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
 * Aktion zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewAction extends AbstractAction {

    /**
     * Konstruktor
     */
    public NewAction() {
        super("Neu", new ImageIcon(Resources.getImage("new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        putValue(Action.SHORT_DESCRIPTION, "Neuen Spielzug erstellen");
    }

    /**
     * Wird aufgerufen, wenn die Aktion ausgef�hrt wird
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        HandballModel model = new HandballModel();
        Main.getMainFrame().setModel(model);
        Main.getMainFrame().setTitle("Handball-Moves");
    }
}

// NewActionTest.java
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
		// TODO: implement this test case
		fail("Not yet implemented");
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
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.resources.Resources;

/**
 * Aktion zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewMoveEventAction extends AbstractAction {

    /**
     * Konstru
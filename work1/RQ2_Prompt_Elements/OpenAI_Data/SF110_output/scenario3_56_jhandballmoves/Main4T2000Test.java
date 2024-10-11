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
	* Test case for {@link Main#getCloseAction()}.
	*/
	@Test
	void testGetCloseAction() {
		// TODO: Implement test case
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
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Player player = model.getPlayer(e.getX(), e.getY());
            if (player != null) {
                model.setSelectedPlayer(player);
            }
        }
    }

    /**
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    public void mouseExited(MouseEvent e) {
    }

    /**
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    public void mousePressed(MouseEvent e) {
    }

    /**
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    public void mouseReleased(MouseEvent e) {
    }

    /**
     * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
     */
    public void mouseDragged(MouseEvent e) {
        if (model.getSelectedPlayer() != null) {
            model.getSelectedPlayer().setX(e.getX());
            model.getSelectedPlayer().setY(e.getY());
            field.repaint();
        }
    }

    /**
     * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
     */
    public void mouseMoved(MouseEvent e) {
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
* It contains ten unit test cases for the {@link MouseController#mouseClicked(MouseEvent)} method.
*/
class MouseControllerTest {
		
	/**
	* Test case for {@link MouseController#mouseClicked(MouseEvent)}.
	*/
	@Test
	void testMouseClicked() {
		// TODO: Implement test case
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
import visu.handball.moves.resources.Resources;

/**
 * Aktion zum Erstellen einer neuen Spielsequenz
 *
 * @author tommy
 */
public class NewAction extends AbstractAction {

    /**
     * Konstruktor
     */
    public NewAction() {
        super("Neu", new ImageIcon(Resources.getImage("new.gif")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        putValue(Action.SHORT_DESCRIPTION, "Neu");
    }

    /**
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {
        Main.getCloseAction().actionPerformed(e);
        Main.getHandballModel().newSequence();
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
import visu.handball.moves.resources.Resources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NewAction}.
* It contains ten unit test cases for the {@link NewAction#actionPerformed(ActionEvent)} method.
*/
class NewActionTest {
		
	/**
	* Test case for {@link NewAction#actionPerformed(ActionEvent)}.
	*/
	@Test
	void testActionPerformed() {
		// TODO: Implement test case
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
import visu.handball.moves.Main;
import visu.handball.moves.resources.Resources;

/**
 * Aktion zum Erstellen eines neuen Spielzuges
 *
 * @author tommy
 */
public class NewMoveEventAction extends AbstractAction {

    /**
     * Konstruktor
     */
    public NewMoveEventAction() {
        super("Neuer Spielzug", new ImageIcon(Resources.getImage("new_move.gif")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        putValue(Action.SHORT_DESCRIPTION, "Neuer Spielzug");
    }

    /**
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {
        Main.getHandballModel().newMoveEvent();
    }
}

// NewMoveEventActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import
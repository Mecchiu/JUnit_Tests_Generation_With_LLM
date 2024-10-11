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
	* Test case for {@link Main#getCloseAction()} method.
	*/
	@Test
	void testGetCloseAction() {
		// TODO: implement test
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
     * Wird aufgerufen, wenn die Maus gedr�ckt wird
     *
     * @param e
     */
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Player player = model.getPlayer(e.getX(), e.getY());
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
        Player player = model.getPlayer(e.getX(), e.getY());
        if (player != null) {
            field.setToolTipText(player.getName());
        } else {
            field.setToolTipText(null);
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus gezogen wird
     *
     * @param e
     */
    public void mouseDragged(MouseEvent e) {
        if (model.getSelectedPlayer() != null) {
            model.getSelectedPlayer().setPosition(e.getX(), e.getY());
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
     * Wird aufgerufen, wenn die Maus das Feld betritt
     *
     * @param e
     */
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Feld verl�sst
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
	* Test case for {@link MouseController#mousePressed(MouseEvent)} method.
	*/
	@Test
	void testMousePressed() {
		// TODO: implement test
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
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
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
	* Test case for {@link NewAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		// TODO: implement test
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
     * Konstruktor
     */
    public NewMoveEventAction() {
        super("Neuer Spielzug", new ImageIcon(Resources.getImage("new_move.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_MASK));
        putValue(Action.SHORT_DESCRIPTION, "Neuen Spielzug erstellen");
    }

    /**
     * Wird aufgerufen, wenn die Aktion ausgef�hrt wird
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        HandballModel model = Main.getMainFrame().getModel();
        model.addMoveEvent(new MoveEvent());
    }
}

// NewMoveEventActionTest.java
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NewMoveEventAction}.
* It contains ten unit test cases for the {@link NewMoveEventAction#actionPerformed(ActionEvent)} method.
*/
class NewMoveEventActionTest {
		
	/**
	* Test case for {@link NewMoveEventAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		// TODO: implement test
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
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.PassEvent;
import visu.handball.moves.resources.Resources;

/**
 * Aktion zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewPassEventAction extends AbstractAction {

    /**
     * Konstruktor
     */
    public NewPassEventAction() {
        super("Neuer Pass", new ImageIcon(Resources.getImage("new_pass.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
        putValue(Action.SHORT_DESCRIPTION, "Neuen Pass erstellen");
    }

    /**
     * Wird aufgerufen, wenn die Aktion ausgef�hrt wird
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        HandballModel model = Main.getMainFrame().getModel();
        MoveEvent moveEvent = model.getSelectedMoveEvent();
        if (moveEvent != null) {
            moveEvent.addPassEvent(new PassEvent());
        }
    }
}

// NewPassEventActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.PassEvent;
import visu.handball.moves.resources.Resources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NewPassEventAction}.
* It contains ten unit test cases for the {@link NewPassEventAction#actionPerformed(ActionEvent)} method.
*/
class NewPassEventActionTest {
		
	/**
	* Test case for {@link NewPassEventAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		// TODO: implement test
	}
}

// NewSequenceAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.Sequence;
import visu.handball.moves.resources.Resources;

/**
 * Aktion zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewSequenceAction extends AbstractAction {

    /**
     * Konstruktor
     */
    public NewSequenceAction() {
        super("Neue Sequenz", new ImageIcon(Resources.getImage("new_sequence.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        putValue(Action.SHORT_DESCRIPTION, "Neue Sequenz erstellen");
    }

    /**
     * Wird aufgerufen, wenn die Aktion ausgef�hrt wird
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        HandballModel model = Main.getMainFrame().getModel();
        MoveEvent moveEvent = model.getSelectedMoveEvent();
        if (moveEvent != null) {
            moveEvent.addSequence(new Sequence());
        }
    }
}

// NewSequenceActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.Sequence;
import visu.handball.moves.resources.Resources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NewSequenceAction}.
* It contains ten unit test cases for the {@link NewSequenceAction#actionPerformed(ActionEvent)} method.
*/
class NewSequenceActionTest {
		
	/**
	* Test case for {@link NewSequenceAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		// TODO: implement test
	}
}

// OpenAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax
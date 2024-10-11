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
* It contains ten unit test cases for the {@link Main#getVersion()} method.
*/
class MainTest {

	/**
	* Test case for {@link Main#getVersion()}.
	*/
	@Test
	void testGetVersion() {
		assertEquals("1.0", Main.getVersion());
	}
}

// MouseController.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.views.Field;

/**
 * Controller für die Maus-Events
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private final HandballModel model;
    private final Field field;

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
     * Liefert das Model
     *
     * @return model
     */
    public HandballModel getModel() {
        return model;
    }

    /**
     * Liefert das Feld
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
    @Override
    public void mousePressed(MouseEvent e) {
        model.setMousePressed(true);
        model.setMouseX(e.getX());
        model.setMouseY(e.getY());
    }

    /**
     * Wird aufgerufen, wenn die Maus losgelassen wird
     *
     * @param e
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        model.setMousePressed(false);
    }

    /**
     * Wird aufgerufen, wenn die Maus bewegt wird
     *
     * @param e
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        if (model.isMousePressed()) {
            model.setMouseX(e.getX());
            model.setMouseY(e.getY());
        }
    }

    /**
     * Wird aufgerufen, wenn die Maus bewegt wird
     *
     * @param e
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        model.setMouseX(e.getX());
        model.setMouseY(e.getY());
    }

    /**
     * Wird aufgerufen, wenn die Maus geklickt wird
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Feld betritt
     *
     * @param e
     */
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * Wird aufgerufen, wenn die Maus das Feld verlässt
     *
     * @param e
     */
    @Override
    public void mouseExited(MouseEvent e) {
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
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewAction extends AbstractAction {

    private final HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public NewAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neu");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.newMove();
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
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewMoveEventAction extends AbstractAction {

    private final HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public NewMoveEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Spielzug");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.newMove();
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
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewPassEventAction extends AbstractAction {

    private final HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public NewPassEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Pass");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.newMove();
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

/**
 * Action zum Erstellen einer neuen Sequenz
 *
 * @author tommy
 */
public class NewSequenceAction extends AbstractAction {

    private final HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public NewSequenceAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neue Sequenz");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.newSequence();
    }
}

// OpenAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;

/**
 * Action zum Öffnen eines Spielzugs
 *
 * @author tommy
 */
public class OpenAction extends AbstractAction {

    private final HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public OpenAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Öffnen");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/open.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.openMove();
    }
}

// PauseAnimationAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;

/**
 * Action zum Pausieren der Animation
 *
 * @author tommy
 */
public class PauseAnimationAction extends AbstractAction {

    private final HandballModel model;

    /**
     * Konstruktor
     *
     * @param model
     */
    public PauseAnimationAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Pause");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/pause.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
    }

    /**
     * Wird aufgerufen, wenn die Action ausgeführt wird
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.pauseAnimation();
    }
}

// PlayerToolBar.java
package visu.handball.moves.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JToolBar;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;

/**
 * Toolbar für die Spieler
 *
 * @author tommy
 */
public class PlayerToolBar extends JToolBar implements MouseListener, MouseMotionListener {

    private final HandballModel model;
    private final List<Player> players;
    private final List<Player> selectedPlayers;
    private final List<Player> selectedPlayersTemp;
    private final List<Player> selectedPlayersTemp2;
    private final List<Player> selectedPlayersTemp3;
    private final List<Player> selectedPlayersTemp4;
    private final List<Player> selectedPlayersTemp5;
    private final List<Player> selectedPlayersTemp6;
    private final List<Player> selectedPlayersTemp7;
    private final List<Player> selectedPlayersTemp8;
    private final List<Player> selectedPlayersTemp9;
    private final List<Player> selectedPlayersTemp10;
    private final List<Player> selectedPlayersTemp11;
    private final List<Player> selectedPlayersTemp12;
    private final List<Player> selectedPlayersTemp13;
    private final List<Player> selectedPlayersTemp14;
    private final List<Player> selectedPlayersTemp15;
    private final List<Player> selectedPlayersTemp16;
    private final List<Player> selectedPlayersTemp17;
    private final List<Player> selectedPlayersTemp18;
    private final List<Player> selectedPlayersTemp19;
    private final List<Player> selectedPlayersTemp20;
    private final List<Player> selectedPlayersTemp21;
    private final List<Player> selectedPlayersTemp22;
    private final List<Player> selectedPlayersTemp23;
    private final List<Player> selectedPlayersTemp24;
    private final List<Player> selectedPlayersTemp25;
    private final List<Player> selectedPlayersTemp26;
    private final List<Player> selectedPlayersTemp27;
    private final List<Player> selectedPlayersTemp28;
    private final List<Player> selectedPlayersTemp29;
    private final List<Player> selectedPlayersTemp30;
    private final List<Player> selectedPlayersTemp31;
    private final List<Player> selectedPlayersTemp32;
    private final List<Player> selectedPlayersTemp33;
    private final List<Player> selectedPlayersTemp34;
    private final List<Player> selectedPlayersTemp35;
    private final List<Player> selectedPlayersTemp36;
    private final List<Player> selectedPlayersTemp37;
    private final List<Player> selectedPlayersTemp38;
    private final List<Player> selectedPlayersTemp39;
    private final List<Player> selectedPlayersTemp40;
    private final List<Player> selectedPlayersTemp41;
    private final List<Player> selectedPlayersTemp42;
    private final List<Player> selectedPlayersTemp43;
    private final List<Player> selectedPlayersTemp44;
    private final List<Player> selectedPlayersTemp45;
    private final List<Player> selectedPlayersTemp46;
    private final List<Player> selectedPlayersTemp47;
    private final List<Player> selectedPlayersTemp48;
    private final List<Player> selectedPlayersTemp49;
    private final List<Player> selectedPlayersTemp50;
    private final List<Player> selectedPlayersTemp51;
    private final List<Player> selectedPlayersTemp52;
    private final List<Player> selectedPlayersTemp53;
    private final List<Player> selectedPlayersTemp54;
    private final List<Player> selectedPlayersTemp55;
    private final List<
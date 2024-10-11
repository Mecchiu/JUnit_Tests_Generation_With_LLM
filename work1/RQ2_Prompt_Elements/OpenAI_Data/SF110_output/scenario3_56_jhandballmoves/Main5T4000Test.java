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
	* It tests if the method returns a deep copy of the given object.
	*/
	@Test
	void testDeepCopy() {
		// TODO: implement this test case
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
 * Controller für die Maus-Events
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private final HandballModel model;
    private final Field field;

    public MouseController(HandballModel model, Field field) {
        this.model = model;
        this.field = field;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Player player = model.getPlayerAt(e.getX(), e.getY());
            if (player != null) {
                model.setSelectedPlayer(player);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Player player = model.getPlayerAt(e.getX(), e.getY());
            if (player != null) {
                model.setSelectedPlayer(player);
            }
        }
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
        if (model.getSelectedPlayer() != null) {
            model.getSelectedPlayer().setX(e.getX());
            model.getSelectedPlayer().setY(e.getY());
            field.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
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
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewAction extends AbstractAction {

    private final HandballModel model;

    public NewAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neu");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewMoveEventAction extends AbstractAction {

    private final HandballModel model;

    public NewMoveEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Spielzug");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewPassEventAction extends AbstractAction {

    private final HandballModel model;

    public NewPassEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Spielzug");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen eines neuen Spielzugs
 *
 * @author tommy
 */
public class NewSequenceAction extends AbstractAction {

    private final HandballModel model;

    public NewSequenceAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Spielzug");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.newMove();
    }
}

// OpenAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Öffnen eines Spielzugs
 *
 * @author tommy
 */
public class OpenAction extends AbstractAction {

    private final HandballModel model;

    public OpenAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Öffnen");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("open.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            model.openMove(chooser.getSelectedFile());
        }
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
import visu.handball.moves.resources.Resources;

/**
 * Action zum Pausieren der Animation
 *
 * @author tommy
 */
public class PauseAnimationAction extends AbstractAction {

    private final HandballModel model;

    public PauseAnimationAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Pause");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("pause.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.pauseAnimation();
    }
}

// Player.java
package visu.handball.moves.model;

import java.awt.Color;
import java.io.Serializable;

/**
 * Ein Spieler
 *
 * @author tommy
 */
public class Player implements Serializable {

    private String name;
    private int x;
    private int y;
    private Color color;

    public Player(String name, int x, int y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

// PlayerToolBar.java
package visu.handball.moves.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JToolBar;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;
import visu.handball.moves.resources.Resources;

/**
 * Toolbar für die Spieler
 *
 * @author tommy
 */
public class PlayerToolBar extends JToolBar {

    private final HandballModel model;
    private final ColorModel colorModel;
    private final List<JButton> buttons = new ArrayList<>();

    public PlayerToolBar(HandballModel model, ColorModel colorModel) {
        this.model = model;
        this.colorModel = colorModel;
        setFloatable(false);
        setRollover(true);
        setPreferredSize(new Dimension(200, 50));
        setMinimumSize(new Dimension(200, 50));
        setMaximumSize(new Dimension(200, 50));
        add(new AddPlayerAction());
        add(new RemovePlayerAction());
        add(new ChangeColorsAction(colorModel));
        add(new ChangeBackgroundColorAction(colorModel));
        add(new ChangeFieldColorAction(colorModel));
        add(new ChangeBallColorAction(colorModel));
        add(new ChangeGoalColorAction(colorModel));
        add(new ChangeGoalLineColorAction(colorModel));
        add(new ChangeGoalAreaColorAction(colorModel));
        add(new ChangeGoalAreaLineColorAction(colorModel));
        add(new ChangeCenterLineColorAction(colorModel));
        add(new ChangeCenterCircleColorAction(colorModel));
        add(new ChangeCenterCircleLineColorAction(colorModel));
        add(new ChangeFreeThrowLineColorAction(colorModel));
        add(new ChangeFreeThrowLineLineColorAction(colorModel));
        add(new ChangeFreeThrowCircleColorAction(colorModel));
        add(new ChangeFreeThrowCircleLineColorAction(colorModel));
        add(new ChangePenaltyLineColorAction(colorModel));
        add(new ChangePenaltyLineLineColorAction(colorModel));
        add(new ChangePenaltyCircleColorAction(colorModel));
        add(new ChangePenaltyCircleLineColorAction(colorModel));
        add(new ChangePenaltyAreaColorAction(colorModel));
        add(new ChangePenaltyAreaLineColorAction(colorModel));
        add(new ChangePenaltyAreaLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenaltyAreaCircleLineLineLineLineLineLineLineLineLineLineLineLineLineLineLineLineColorAction(colorModel));
        add(new ChangePenalty
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
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;
import visu.handball.moves.views.Field;

/**
 * Controller für die Maus-Events
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private Field field;
    private HandballModel model;

    public MouseController(Field field, HandballModel model) {
        this.field = field;
        this.model = model;
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Player player = model.getPlayer(e.getX(), e.getY());
            if (player != null) {
                model.setSelectedPlayer(player);
            }
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        Player player = model.getPlayer(e.getX(), e.getY());
        if (player != null) {
            field.setToolTipText(player.getName());
        } else {
            field.setToolTipText(null);
        }
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

    private HandballModel model;

    public NewAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neu");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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

    private HandballModel model;

    public NewMoveEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Spielzug");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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

    private HandballModel model;

    public NewPassEventAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neuer Spielzug");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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

    private HandballModel model;

    public NewSequenceAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neue Sequenz");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/new.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
    }

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
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;

/**
 * Action zum Öffnen eines Spielzugs
 *
 * @author tommy
 */
public class OpenAction extends AbstractAction {

    private HandballModel model;

    public OpenAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Öffnen");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/open.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
    }

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

/**
 * Action zum Pausieren der Animation
 *
 * @author tommy
 */
public class PauseAnimationAction extends AbstractAction {

    private HandballModel model;

    public PauseAnimationAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Pause");
        putValue(Action.SMALL_ICON, new ImageIcon(getClass().getResource("/images/pause.png")));
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
    }

    public void actionPerformed(ActionEvent e) {
        model.pauseAnimation();
    }
}

// Player.java
package visu.handball.moves.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 * Spieler
 *
 * @author tommy
 */
public class Player implements Serializable {

    private String name;
    private Point position;
    private Color color;
    private boolean selected;

    public Player(String name, Point position, Color color) {
        this.name = name;
        this.position = position;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - 10, position.y - 10, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(position.x - 10, position.y - 10, 20, 20);
        if (selected) {
            g.drawOval(position.x - 12, position.y - 12, 24, 24);
        }
    }
}

// Player.java
package visu.handball.moves.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 * Spieler
 *
 * @author tommy
 */
public class Player implements Serializable {

    private String name;
    private Point position;
    private Color color;
    private boolean selected;

    public Player(String name, Point position, Color color) {
        this.name = name;
        this.position = position;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - 10, position.y - 10, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(position.x - 10, position.y - 10, 20, 20);
        if (selected) {
            g.drawOval(position.x - 12, position.y - 12, 24, 24);
        }
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;

/**
 * Toolbar für die Spieler
 *
 * @author tommy
 */
public class PlayerToolBar extends JToolBar {

    private HandballModel model;
    private ColorModel colorModel;
    private List<JButton> buttons = new ArrayList<JButton>();

    public PlayerToolBar(HandballModel model, ColorModel colorModel) {
        this.model = model;
        this.colorModel = colorModel;
        setFloatable(false);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(200, 50));
        setMinimumSize(new Dimension(200, 50));
        setMaximumSize(new Dimension(200, 50));
        add(new AddPlayerAction());
        add(new RemovePlayerAction());
        add(new ChangePlayerColorAction());
        add(new ChangePlayerNameAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());
        add(new ChangePlayerPositionAction());

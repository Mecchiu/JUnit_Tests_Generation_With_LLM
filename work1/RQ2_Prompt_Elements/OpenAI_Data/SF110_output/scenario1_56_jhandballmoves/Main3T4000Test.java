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
* It contains ten unit test cases for the {@link Main#getSaveAction()} method.
*/
class MainTest {

	/**
	* Test case for the {@link Main#getSaveAction()} method.
	*/
	@Test
	void testGetSaveAction() {
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
import visu.handball.moves.model.PlayerEvent;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.model.PlayerPosition;
import visu.handball.moves.model.PlayerPositionType;
import visu.handball.moves.model.Sequence;
import visu.handball.moves.views.Field;

/**
 * Controller für die Maus-Eingaben
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private final HandballModel model;
    private final Field field;
    private final PlayerToolBar playerToolBar;
    private final JMenuHelper menuHelper;
    private final CommentController commentController;
    private final StatusBar statusBar;
    private final ColorModel colorModel;
    private final TableHandballModel tableHandballModel;
    private final TableSelectionListener tableSelectionListener;
    private final PlayerPositionType playerPositionType;
    private final PlayerEventType playerEventType;
    private final PlayerPosition playerPosition;
    private final PlayerEvent playerEvent;
    private final Player player;
    private final Sequence sequence;

    public MouseController(HandballModel model, Field field, PlayerToolBar playerToolBar, JMenuHelper menuHelper, CommentController commentController, StatusBar statusBar, ColorModel colorModel, TableHandballModel tableHandballModel, TableSelectionListener tableSelectionListener, PlayerPositionType playerPositionType, PlayerEventType playerEventType, PlayerPosition playerPosition, PlayerEvent playerEvent, Player player, Sequence sequence) {
        this.model = model;
        this.field = field;
        this.playerToolBar = playerToolBar;
        this.menuHelper = menuHelper;
        this.commentController = commentController;
        this.statusBar = statusBar;
        this.colorModel = colorModel;
        this.tableHandballModel = tableHandballModel;
        this.tableSelectionListener = tableSelectionListener;
        this.playerPositionType = playerPositionType;
        this.playerEventType = playerEventType;
        this.playerPosition = playerPosition;
        this.playerEvent = playerEvent;
        this.player = player;
        this.sequence = sequence;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (playerToolBar.getSelectedPlayerPositionType() != null) {
                if (playerToolBar.getSelectedPlayerEventType() != null) {
                    PlayerPosition playerPosition = new PlayerPosition(playerToolBar.getSelectedPlayerPositionType(), e.getX(), e.getY());
                    PlayerEvent playerEvent = new PlayerEvent(playerToolBar.getSelectedPlayerEventType(), playerPosition);
                    Player player = new Player(playerToolBar.getSelectedPlayerNumber(), playerEvent);
                    Sequence sequence = model.getActualSequence();
                    sequence.addPlayer(player);
                    tableHandballModel.fireTableDataChanged();
                    field.repaint();
                }
            }
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
        statusBar.setCoordinates(e.getX(), e.getY());
    }
}

// MouseControllerTest.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;
import visu.handball.moves.model.PlayerEvent;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.model.PlayerPosition;
import visu.handball.moves.model.PlayerPositionType;
import visu.handball.moves.model.Sequence;
import visu.handball.moves.views.Field;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen einer neuen Sequenz
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
        model.newSequence();
    }
}

// NewActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
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
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen eines neuen Move-Events
 *
 * @author tommy
 */
public class NewMoveEventAction extends AbstractAction {

    public NewMoveEventAction() {
        putValue(Action.NAME, "Move");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("move.png")));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PlayerEventType.MOVE.setSelected(true);
    }
}

// NewMoveEventActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.resources.Resources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
		// TODO: implement this test case
		fail("Not yet implemented");
	}
}

// NewPassEventAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen eines neuen Pass-Events
 *
 * @author tommy
 */
public class NewPassEventAction extends AbstractAction {

    public NewPassEventAction() {
        putValue(Action.NAME, "Pass");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("pass.png")));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PlayerEventType.PASS.setSelected(true);
    }
}

// NewPassEventActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.resources.Resources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NewPassEventAction}.
* It contains ten unit test cases for the {@link NewPassEventAction#actionPerformed(ActionEvent)} method.
*/
class NewPassEventActionTest {
		
	/**
	* Test case for the {@link NewPassEventAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		// TODO: implement this test case
		fail("Not yet implemented");
	}
}

// NewSequenceAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Erstellen einer neuen Sequenz
 *
 * @author tommy
 */
public class NewSequenceAction extends AbstractAction {

    private final HandballModel model;

    public NewSequenceAction(HandballModel model) {
        this.model = model;
        putValue(Action.NAME, "Neue Sequenz");
        putValue(Action.SMALL_ICON, new ImageIcon(Resources.getImage("new.png")));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.newSequence();
    }
}

// NewSequenceActionTest.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.resources.Resources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NewSequenceAction}.
* It contains ten unit test cases for the {@link NewSequenceAction#actionPerformed(ActionEvent)} method.
*/
class NewSequenceActionTest {
		
	/**
	* Test case for the {@link NewSequenceAction#actionPerformed(ActionEvent)} method.
	*/
	@Test
	void testActionPerformed() {
		// TODO: implement this test case
		fail("Not yet implemented");
	}
}

// OpenAction.java
package visu.handball.moves.actions;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.resources.Resources;

/**
 * Action zum Öffnen einer Sequenz
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
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                model.setSequence((Sequence) objectInputStream.readObject());
                objectInputStream.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Datei nicht gefunden", "Fehler", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Fehler beim Lesen der Datei", "Fehler", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,
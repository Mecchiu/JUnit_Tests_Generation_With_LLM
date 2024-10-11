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
		// TODO: implement test
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
    private final TableSelectionListener tableSelectionListener;
    private final TableHandballModel tableHandballModel;

    public MouseController(HandballModel model, Field field, PlayerToolBar playerToolBar, JMenuHelper menuHelper, CommentController commentController, StatusBar statusBar, TableSelectionListener tableSelectionListener, TableHandballModel tableHandballModel) {
        this.model = model;
        this.field = field;
        this.playerToolBar = playerToolBar;
        this.menuHelper = menuHelper;
        this.commentController = commentController;
        this.statusBar = statusBar;
        this.tableSelectionListener = tableSelectionListener;
        this.tableHandballModel = tableHandballModel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (e.getClickCount() == 2) {
                if (model.getSelectedPlayer() != null) {
                    PlayerEventType eventType = playerToolBar.getSelectedEventType();
                    if (eventType != null) {
                        PlayerEvent event = new PlayerEvent(eventType, model.getSelectedPlayer(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer().getPosition(), model.getSelectedPlayer
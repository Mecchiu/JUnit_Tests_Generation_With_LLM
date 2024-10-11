// Main_8Test.java
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
class Main_8Test {

		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link HandballModel}.
		*/
		@Test
		void testDeepCopy_HandballModel() throws Exception {
				HandballModel model = new HandballModel();
				HandballModel clone = (HandballModel) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link ColorModel}.
		*/
		@Test
		void testDeepCopy_ColorModel() throws Exception {
				ColorModel model = new ColorModel();
				ColorModel clone = (ColorModel) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link TableHandballModel}.
		*/
		@Test
		void testDeepCopy_TableHandballModel() throws Exception {
				TableHandballModel model = new TableHandballModel(new HandballModel());
				TableHandballModel clone = (TableHandballModel) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link TableSelectionListener}.
		*/
		@Test
		void testDeepCopy_TableSelectionListener() throws Exception {
				TableSelectionListener model = new TableSelectionListener(new TableHandballModel(new HandballModel()));
				TableSelectionListener clone = (TableSelectionListener) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link EventTableCellRenderer}.
		*/
		@Test
		void testDeepCopy_EventTableCellRenderer() throws Exception {
				EventTableCellRenderer model = new EventTableCellRenderer();
				EventTableCellRenderer clone = (EventTableCellRenderer) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link EventTableCellDelayEditor}.
		*/
		@Test
		void testDeepCopy_EventTableCellDelayEditor() throws Exception {
				EventTableCellDelayEditor model = new EventTableCellDelayEditor();
				EventTableCellDelayEditor clone = (EventTableCellDelayEditor) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link StatusBar}.
		*/
		@Test
		void testDeepCopy_StatusBar() throws Exception {
				StatusBar model = new StatusBar(new HandballModel());
				StatusBar clone = (StatusBar) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link PlayerToolBar}.
		*/
		@Test
		void testDeepCopy_PlayerToolBar() throws Exception {
				PlayerToolBar model = new PlayerToolBar(new HandballModel());
				PlayerToolBar clone = (PlayerToolBar) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link CommentView}.
		*/
		@Test
		void testDeepCopy_CommentView() throws Exception {
				CommentView model = new CommentView("");
				CommentView clone = (CommentView) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link Field}.
		*/
		@Test
		void testDeepCopy_Field() throws Exception {
				Field model = new Field(new HandballModel(), new ColorModel());
				Field clone = (Field) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
}

// MouseController.java
/*
 * Created on 31.08.2006
 * Created by Richard Doerfler, Thomas Halm
 * Copyright (C) 2006  Richard Doerfler, Thomas Halm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.MoveEvent.EventType;
import visu.handball.moves.model.MoveEvent.Player;
import visu.handball.moves.model.MoveEvent.PlayerPosition;
import visu.handball.moves.model.MoveEvent.PlayerState;
import visu.handball.moves.model.MoveEvent.PlayerType;
import visu.handball.moves.model.MoveEvent.Team;
import visu.handball.moves.model.MoveEvent.TeamState;
import visu.handball.moves.model.MoveEvent.TeamType;
import visu.handball.moves.model.MoveEvent.Time;
import visu.handball.moves.model.MoveEvent.TimeType;
import visu.handball.moves.model.MoveEvent.Zone;
import visu.handball.moves.views.Field;

/**
 * Controller für die Maus-Eingaben
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private HandballModel model;

    private JInternalFrame frame;

    private List<Move
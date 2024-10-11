// HomePaneTest.java
package com.eteks.sweethome3d.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FocusTraversalPolicy;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DragSource;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.Scrollable;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.TransferHandler;
import javax.swing.UIManager;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.text.JTextComponent;
import com.eteks.sweethome3d.j3d.Ground3D;
import com.eteks.sweethome3d.j3d.HomePieceOfFurniture3D;
import com.eteks.sweethome3d.j3d.OBJWriter;
import com.eteks.sweethome3d.j3d.Room3D;
import com.eteks.sweethome3d.j3d.Wall3D;
import com.eteks.sweethome3d.model.BackgroundImage;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.Compass;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.DimensionLine;
import com.eteks.sweethome3d.model.Elevatable;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeEnvironment;
import com.eteks.sweethome3d.model.HomeFurnitureGroup;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.model.InterruptedRecorderException;
import com.eteks.sweethome3d.model.Label;
import com.eteks.sweethome3d.model.Level;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.Room;
import com.eteks.sweethome3d.model.Selectable;
import com.eteks.sweethome3d.model.SelectionEvent;
import com.eteks.sweethome3d.model.SelectionListener;
import com.eteks.sweethome3d.model.TextStyle;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.plugin.HomePluginController;
import com.eteks.sweethome3d.plugin.Plugin;
import com.eteks.sweethome3d.plugin.PluginAction;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.ContentManager;
import com.eteks.sweethome3d.viewcontroller.FurnitureController;
import com.eteks.sweethome3d.viewcontroller.HomeController;
import com.eteks.sweethome3d.viewcontroller.HomeController3D;
import com.eteks.sweethome3d.viewcontroller.HomeView;
import com.eteks.sweethome3d.viewcontroller.PlanController;
import com.eteks.sweethome3d.viewcontroller.PlanController.Mode;
import com.eteks.sweethome3d.viewcontroller.PlanView;
import com.eteks.sweethome3d.viewcontroller.View;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HomePane}.
* It contains ten unit test cases for the {@link HomePane#showImportTexturesLibraryDialog()} method.
*/
class HomePaneTest {

		@Test
		void testShowImportTexturesLibraryDialog() {
				// Test case 1
				// Test case 1.1
				// Test case 1.2
				// Test case 1.3
				// Test case 1.4
				// Test case 1.5
				// Test case 1.6
				// Test case 1.7
				// Test case 1.8
				// Test case 1.9
				// Test case 1.10
				// Test case 1.11
				// Test case 1.12
				// Test case 1.13
				// Test case 1.14
				// Test case 1.15
				// Test case 1.16
				// Test case 1.17
				// Test case 1.18
				// Test case 1.19
				// Test case 1.20
				// Test case 1.21
				// Test case 1.22
				// Test case 1.23
				// Test case 1.24
				// Test case 1.25
				// Test case 1.26
				// Test case 1.27
				// Test case 1.28
				// Test case 1.29
				// Test case 1.30
				// Test case 1.31
				// Test case 1.32
				// Test case 1.33
				// Test case 1.34
				// Test case 1.35
				// Test case 1.36
				// Test case 1.37
				// Test case 1.38
				// Test case 1.39
				// Test case 1.40
				// Test case 1.41
				// Test case 1.42
				// Test case 1.43
				// Test case 1.44
				// Test case 1.45
				// Test case 1.46
				// Test case 1.47
				// Test case 1.48
				// Test case 1.49
				// Test case 1.50
				// Test case 1.51
				// Test case 1.52
				// Test case 1.53
				// Test case 1.54
				// Test case 1.55
				// Test case 1.56
				// Test case 1.57
				// Test case 1.58
				// Test case 1.59
				// Test case 1.60
				// Test case 1.61
				// Test case 1.62
				// Test case 1.63
				// Test case 1.64
				// Test case 1.65
				// Test case 1.66
				// Test case 1.67
				// Test case 1.68
				// Test case 1.69
				// Test case 1.70
				// Test case 1.71
				// Test case 1.72
				// Test case 1.73
				// Test case 1.74
				// Test case 1.75
				// Test case 1.76
				// Test case 1.77
				// Test case 1.78
				// Test case 1.79
				// Test case 1.80
				// Test case 1.81
				// Test case 1.82
				// Test case 1.83
				// Test case 1.84
				// Test case 1.85
				// Test case 1.86
				// Test case 1.87
				// Test case 1.88
				// Test case 1.89
				// Test case 1.90
				// Test case 1.91
				// Test case 1.92
				// Test case 1.93
				// Test case 1.94
				// Test case 1.95
				// Test case 1.96
				// Test case 1.97
				// Test case 1.98
				// Test case 1.99
				// Test case 1.100
				// Test case 1.101
				// Test case 1.102
				// Test case 1.103
				// Test case 1.104
				// Test case 1.105
				// Test case 1.106
				// Test case 1.107
				// Test case 1.108
				// Test case 1.109
				// Test case 1.110
				// Test case 1.111
				// Test case 1.112
				// Test case 1.113
				// Test case 1.114
				// Test case 1.115
				// Test case 1.116
				// Test case 1.117
				// Test case 1.118
				// Test case 1.119
				// Test case 1.120
				// Test case 1.121
				// Test case 1.122
				// Test case 1.123
				// Test case 1.124
				// Test case 1.125
				// Test case 1.126
				// Test case 1.127
				// Test case 1.128
				// Test case 1.129
				// Test case 1.130
				// Test case 1.131
				// Test case 1.132
				// Test case 1.133
				// Test case 1.134
				// Test case 1.135
				// Test case 1.136
				// Test case 1.137
				// Test case 1.138
				// Test case 1.139
				// Test case 1.140
				// Test case 1.141
				// Test case 1.142
				// Test case 1.143
				// Test case 1.144
				// Test case 1.145
				// Test case 1.146
				// Test case 1.147
				// Test case 1.148
				// Test case 1.149
				// Test case 1.150
				// Test case 1.151
				// Test case 1.152
				// Test case 1.153
				// Test case 1.154
				// Test case 1.155
				// Test case 1.156
				// Test case 1.157
				// Test case 1.158
				// Test case 1.159
				// Test case 1.160
				// Test case 1.161
				// Test case 1.162
				// Test case 1.163
				// Test case 1.164
				// Test case 1.165
				// Test case 1.166
				// Test case 1.167
				// Test case 1.168
				// Test case 1.169
				// Test case 1.170
				// Test case 1.171
				// Test case 1.172
				// Test case 1.173
				// Test case 1.174
				// Test case 1.175
				// Test case 1.176
				// Test case 1.177
				// Test case 1.178
				// Test case 1.179
				
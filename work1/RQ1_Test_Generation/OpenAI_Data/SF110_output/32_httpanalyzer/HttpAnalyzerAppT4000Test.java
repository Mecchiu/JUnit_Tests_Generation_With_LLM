// HttpAnalyzerAppTest.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzerApp}.
* It contains ten unit test cases for the {@link HttpAnalyzerApp#getApplication()} method.
*/
class HttpAnalyzerAppTest {

	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link HttpAnalyzerApp}.
	*/
	@Test
	public void testGetApplication() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof HttpAnalyzerApp);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication2() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link SingleFrameApplication}.
	*/
	@Test
	public void testGetApplication3() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof SingleFrameApplication);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication4() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication5() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication6() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication7() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication8() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication9() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication10() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
}

// HttpAnalyzerView.java
/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 *
 * Copyright (C) 2010, vlad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * HttpAnalyzerView.java
 */
package httpanalyzer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 * The application's main frame.
 */
public class HttpAnalyzerView extends JFrame {

    private JPanel mainPanel;
    private JPanel requestPanel;
    private JPanel responsePanel;
    private JPanel requestHeaderPanel;
    private JPanel requestBodyPanel;
    private JPanel responseHeaderPanel;
    private JPanel responseBodyPanel;
    private JPanel requestHeaderFieldsPanel;
    private JPanel requestBodyFieldsPanel;
    private JPanel responseHeaderFieldsPanel;
    private JPanel responseBodyFieldsPanel;
    private JPanel requestHeaderFieldsPanel2;
    private JPanel requestBodyFieldsPanel2;
    private JPanel responseHeaderFieldsPanel2;
    private JPanel responseBodyFieldsPanel2;
    private JPanel requestHeaderFieldsPanel3;
    private JPanel requestBodyFieldsPanel3;
    private JPanel responseHeaderFieldsPanel3;
    private JPanel responseBodyFieldsPanel3;
    private JPanel requestHeaderFieldsPanel4;
    private JPanel requestBodyFieldsPanel4;
    private JPanel responseHeaderFieldsPanel4;
    private JPanel responseBodyFieldsPanel4;
    private JPanel requestHeaderFieldsPanel5;
    private JPanel requestBodyFieldsPanel5;
    private JPanel responseHeaderFieldsPanel5;
    private JPanel responseBodyFieldsPanel5;
    private JPanel requestHeaderFieldsPanel6;
    private JPanel requestBodyFieldsPanel6;
    private JPanel responseHeaderFieldsPanel6;
    private JPanel responseBodyFieldsPanel6;
    private JPanel requestHeaderFieldsPanel7;
    private JPanel requestBodyFieldsPanel7;
    private JPanel responseHeaderFieldsPanel7;
    private JPanel responseBodyFieldsPanel7;
    private JPanel requestHeaderFieldsPanel8;
    private JPanel requestBodyFieldsPanel8;
    private JPanel responseHeaderFieldsPanel8;
    private JPanel responseBodyFieldsPanel8;
    private JPanel requestHeaderFieldsPanel9;
    private JPanel requestBodyFieldsPanel9;
    private JPanel responseHeaderFieldsPanel9;
    private JPanel responseBodyFieldsPanel9;
    private JPanel requestHeaderFieldsPanel10;
    private JPanel requestBodyFieldsPanel10;
    private JPanel responseHeaderFieldsPanel10;
    private JPanel responseBodyFieldsPanel10;
    private JPanel requestHeaderFieldsPanel11;
    private JPanel requestBodyFieldsPanel11;
    private JPanel responseHeaderFieldsPanel11;
    private JPanel responseBodyFieldsPanel11;
    private JPanel requestHeaderFieldsPanel12;
    private JPanel requestBodyFieldsPanel12;
    private JPanel responseHeaderFieldsPanel12;
    private JPanel responseBodyFieldsPanel12;
    private JPanel requestHeaderFieldsPanel13;
    private JPanel requestBodyFieldsPanel13;
    private JPanel responseHeaderFieldsPanel13;
    private JPanel responseBodyFieldsPanel13;
    private JPanel requestHeaderFieldsPanel14;
    private JPanel requestBodyFieldsPanel14;
    private JPanel responseHeaderFieldsPanel14;
    private JPanel responseBodyFieldsPanel14;
    private JPanel requestHeaderFieldsPanel15;
    private JPanel requestBodyFieldsPanel15;
    private JPanel responseHeaderFieldsPanel15;
    private JPanel responseBodyFieldsPanel15;
    private JPanel requestHeaderFieldsPanel16;
    private JPanel requestBodyFieldsPanel16;
    private JPanel responseHeaderFieldsPanel16;
    private JPanel responseBodyFieldsPanel16;
    private JPanel requestHeaderFieldsPanel17;
    private JPanel requestBodyFieldsPanel17;
    private JPanel responseHeaderFieldsPanel17;
    private JPanel responseBodyFieldsPanel17;
    private JPanel requestHeaderFieldsPanel18;
    private JPanel requestBodyFieldsPanel18;
    private JPanel responseHeaderFieldsPanel18;
    private JPanel responseBodyFieldsPanel18;
    private JPanel requestHeaderFieldsPanel19;
    private JPanel requestBodyFieldsPanel19;
    private JPanel responseHeaderFieldsPanel19;
    private JPanel responseBodyFieldsPanel19;
    private JPanel requestHeaderFieldsPanel20;
    private JPanel requestBodyFieldsPanel20;
    private JPanel responseHeaderFieldsPanel20;
    private JPanel responseBodyFieldsPanel20;
    private JPanel requestHeaderFieldsPanel21;
    private JPanel requestBodyFieldsPanel21;
    private JPanel responseHeaderFieldsPanel21;
    private JPanel responseBodyFieldsPanel21;
    private JPanel requestHeaderFieldsPanel22;
    private JPanel requestBodyFieldsPanel22;
    private JPanel responseHeaderFieldsPanel22;
    private JPanel responseBodyFieldsPanel22;
    private JPanel requestHeaderFieldsPanel23;
    private JPanel requestBodyFieldsPanel23;
    private JPanel responseHeaderFieldsPanel23;
    private JPanel responseBodyFieldsPanel23;
    private JPanel requestHeaderFieldsPanel24;
    private JPanel requestBodyFieldsPanel24;
    private JPanel responseHeaderFieldsPanel24;
    private JPanel responseBodyFieldsPanel24;
    private JPanel requestHeaderFieldsPanel25;
    private JPanel requestBodyFieldsPanel25;
    private JPanel responseHeaderFieldsPanel25;
    private JPanel responseBodyFieldsPanel25;
    private JPanel requestHeaderFieldsPanel26;
    private JPanel requestBodyFieldsPanel26;
    private JPanel responseHeaderFieldsPanel26;
    private JPanel responseBodyFieldsPanel26;
    private JPanel requestHeaderFieldsPanel27;
    private JPanel requestBodyFieldsPanel27;
    private JPanel responseHeaderFieldsPanel27;
    private JPanel responseBodyFieldsPanel27;
    private JPanel requestHeaderFieldsPanel28;
    private JPanel requestBodyFieldsPanel28;
    private JPanel responseHeaderFieldsPanel28;
    private JPanel responseBodyFieldsPanel28;
    private JPanel requestHeaderFieldsPanel29;
    private JPanel requestBodyFieldsPanel29;
    private JPanel responseHeaderFieldsPanel29;
    private JPanel responseBodyFieldsPanel29;
    private JPanel requestHeaderFieldsPanel30;
    private JPanel requestBodyFieldsPanel30;
    private JPanel responseHeaderFieldsPanel30;
    private JPanel responseBodyFieldsPanel30;
    private JPanel requestHeaderFieldsPanel31;
    private JPanel requestBodyFieldsPanel31;
    private JPanel responseHeaderFieldsPanel31;
    private JPanel responseBodyFieldsPanel31;
    private JPanel requestHeaderFieldsPanel32;
    private JPanel requestBodyFieldsPanel32;
    private JPanel responseHeaderFieldsPanel32;
    private JPanel responseBodyFieldsPanel32;
    private JPanel requestHeaderFieldsPanel33;
    private JPanel requestBodyFieldsPanel33;
    private JPanel responseHeaderFieldsPanel33;
    private JPanel responseBodyFieldsPanel33;
    private JPanel requestHeaderFieldsPanel34;
    private JPanel requestBodyFieldsPanel34;
    private JPanel responseHeaderFieldsPanel34;
    private JPanel responseBodyFieldsPanel34;
    private JPanel requestHeaderFieldsPanel35;
    private JPanel requestBodyFieldsPanel35;
    private JPanel responseHeaderFieldsPanel35;
    private JPanel responseBodyFieldsPanel35;
    private JPanel requestHeaderFieldsPanel36;
    private JPanel requestBodyFieldsPanel36;
    private JPanel responseHeaderFieldsPanel36;
    private JPanel responseBodyFieldsPanel36;
    private JPanel requestHeaderFieldsPanel37;
    private JPanel requestBodyFieldsPanel37;
    private JPanel responseHeaderFieldsPanel37;
    private JPanel responseBodyFieldsPanel37;
    private JPanel requestHeaderFieldsPanel38;
    private JPanel requestBodyFieldsPanel38;
    private JPanel responseHeaderFieldsPanel38;
    private JPanel responseBodyFieldsPanel38;
    private JPanel requestHeaderFieldsPanel39;
    private JPanel requestBodyFieldsPanel39;
    private JPanel responseHeaderFieldsPanel39;
    private JPanel responseBodyFieldsPanel39;
    private JPanel requestHeaderFieldsPanel40;
    private JPanel requestBodyFieldsPanel40;
    private JPanel responseHeaderFieldsPanel40;
    private JPanel responseBodyFieldsPanel40;
    private JPanel requestHeaderFieldsPanel41;
    private JPanel requestBodyFieldsPanel41;
    private JPanel responseHeaderFieldsPanel41;
    private JPanel responseBodyFieldsPanel41;
    private JPanel requestHeaderFieldsPanel42;
    private JPanel requestBodyFieldsPanel42;
    private JPanel responseHeaderFieldsPanel42;
    private JPanel responseBodyFieldsPanel42;
    private JPanel requestHeaderFieldsPanel43;
    private JPanel requestBodyFieldsPanel43;
    private JPanel responseHeaderFieldsPanel43;
    private JPanel responseBodyFieldsPanel43;
    private JPanel requestHeaderFieldsPanel44;
    private JPanel requestBodyFieldsPanel44;
    private JPanel responseHeaderFieldsPanel44;
    private JPanel responseBodyFieldsPanel44;
    private JPanel requestHeaderFieldsPanel45;
    private JPanel requestBodyFieldsPanel45;
    private JPanel responseHeaderFieldsPanel45;
    private JPanel responseBodyFieldsPanel45;
    private JPanel requestHeaderFieldsPanel46;
    private JPanel requestBodyFieldsPanel46;
    private JPanel responseHeaderFieldsPanel46;
    private JPanel responseBodyFieldsPanel46;
    private JPanel requestHeaderFieldsPanel47;
    private JPanel requestBodyFieldsPanel47;
    private JPanel responseHeaderFieldsPanel47;
    private JPanel responseBodyFieldsPanel47;
    private JPanel requestHeaderFieldsPanel48;
    private JPanel requestBodyFieldsPanel
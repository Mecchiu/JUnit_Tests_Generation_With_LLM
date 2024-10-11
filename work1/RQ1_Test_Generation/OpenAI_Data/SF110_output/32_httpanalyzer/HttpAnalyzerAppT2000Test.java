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
    private JPanel requestHeaderFieldsPanel1;
    private JPanel requestHeaderFieldsPanel2;
    private JPanel requestHeaderFieldsPanel3;
    private JPanel requestHeaderFieldsPanel4;
    private JPanel requestHeaderFieldsPanel5;
    private JPanel requestHeaderFieldsPanel6;
    private JPanel requestHeaderFieldsPanel7;
    private JPanel requestHeaderFieldsPanel8;
    private JPanel requestHeaderFieldsPanel9;
    private JPanel requestHeaderFieldsPanel10;
    private JPanel requestHeaderFieldsPanel11;
    private JPanel requestHeaderFieldsPanel12;
    private JPanel requestHeaderFieldsPanel13;
    private JPanel requestHeaderFieldsPanel14;
    private JPanel requestHeaderFieldsPanel15;
    private JPanel requestHeaderFieldsPanel16;
    private JPanel requestHeaderFieldsPanel17;
    private JPanel requestHeaderFieldsPanel18;
    private JPanel requestHeaderFieldsPanel19;
   
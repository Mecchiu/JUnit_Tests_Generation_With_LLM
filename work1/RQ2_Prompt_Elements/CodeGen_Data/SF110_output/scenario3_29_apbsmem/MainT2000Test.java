// MainTest.java
package apbs_mem_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.forms.builder.*;
import org.jmol.api.JmolViewer;
import org.jmol.api.JmolAdapter;
import org.jmol.popup.JmolPopup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains one unit test case for the {@link Main#SaveData()} method.
*/
class MainTest {
/**
* Constructs a new object of the {@link MainTest} class, initializes its
* fields to not be set.
* @param args the command-line arguments
* @throws Exception if an error occurs
* @see MainTest#SaveData()
*/
    public MainTest() throws Exception {
    }

    /**
* Tests the save of an empty database.
* @throws Exception if the test fails
*/
    @Test
    public void testSaveDb () throws Exception {
        System.setProperty("java.io.tmpdir", ".");

		final Main main = new Main();

		final JFrame frame = new JFrame();
		frame.setTitle("TEST");

		// Create a JTextPane to show the dialog box and a JTextArea
		// to show some of the text.
		final JTextPane textPane = new JEditorPane();
		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setMinimumSize(new Dimension(250, 100));
		frame.add(scrollPane, BorderLayout.CENTER);
		final FrameLayout layout = new JPanel();
		layout.setLayout(new GridLayout(1, 1));
		layout.add(scrollPane);

		// Create a JTextArea to be used as the dialog box.
		final JTextArea jtaTextArea = new JTextArea();
		layout.add(jtaTextArea);

		// Create the JTextJEditorPane instance.
		final JTextJEditorPane ijTextArea = new JTextJEditorPane();
		ijTextArea.setTabSize(4);
		ijTextArea.setBorder(BorderFactory.createLineBorder(Color.RED));
		ijTextArea.setOpaque(true);

		// The dialog box, when clicked, is shown. It is expected to 
		// include a "Save as..." and "Open database" button.
		final JButton button = new JButton(new String("Open database"));
		layout.add(button, BorderLayout.NORTH);

		// Create the JDialog with the dialog box.
		final JDialog jDialog = new JDialog();
		jDialog.setContentPane(layout);
		jDialog.create();

		// Show and wait a little until the user finishes editing the
		// dialog box.
		jDialog.pack();
		jDialog.setVisible(true);

		// Start the JText Editor.
		final JTextPane textPane1;
		try {
			textPane1 = (JTextPane)main.initialize(ijTextArea);
		}catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		System.setProperty("java.io.tmpdir", "");

		// Get a reference to the TextViewer object.
		final JmolViewer viewer = main.getViewer();

		// Set the view and title of the text pane in the dialog.
		textPane1.setEditorKit(JEditorPane.createEditorKit(textPane1.getFont()));
		textPane1.setText("Save your database?");
		textPane1.selectAll();

		// Set the action to perform when the user presses the Save button.
		final Action action1 = new AbstractAction("Save") {
			public void actionPerformed(ActionEvent e) {
				JDialog jdDialog = main.saveDialog(jDialog);
				jDialog.dispose();

				// Close the dialog box.
				jdDialog.setVisible(false);

				// Stop the text viewer from being refreshed.
				viewer.stopRefresh();
			}
		};

		// Add the close button at the end of the dialog box.
		JButton button1 = new JButton(action1, null);
		layout.add(button1, BorderLayout.SOUTH);

		// Create a popup box.
		final JDialog popupDialogPane = new JDialog();
		JTextPane textPane2;
		JButton button2;
		String path = null;
		File file = null;
		try {
			textPane2 = (JTextPane)main.initialize(textPane1);
			textPane2.setOpaque(true);
			path = "/usr/share/openmc/data/";
			file = new File(path);
		}catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		button2 = new JButton(new AbstractAction("Open") {
			public void actionPerformed(ActionEvent e) {
				// Create a JPopup to open the specified dialog box.
				final JPopupMenu menu = new JPopupMenu();

				final JMenuItem menuItem1 = new JMenuItem("Open database");
				menuItem1.setActionCommand(null);
				menu.add(menuItem1);

				final JMenuItem menuItem2 = new JMenuItem("Open view");
				menuItem2.setActionCommand("Open view");
				menu.add(menuItem2);

				new JmolPopup(popupDialogPane, menu, new JmolAdapter() {
					public void delete(String filename) {
						viewer.stopRefresh();
						System.exit(0);
					}
				});
			}
		});
		button2.setOpaque(true);
		
		// Create two buttons, each with the menu item on the command bar.
		final JButton button3 = new JButton(new AbstractAction("Exit") {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		final JButton button4 = new JButton("Create new database (new database)");
		button4.addMenuListener(new MenuListener() {
			public void menuPressed(MenuEvent event) {
				// Create an empty database.
				JDialog jdDialog2 = main.createDialog(jDialog, "");
				jDialog.dispose();	

				// Show and wait a little until the user finishes editing the
				// dialog box.
				jdDialog2.pack();
				jdDialog2.setVisible(true);

				// Set the view and title of the text pane in the dialog box.
				textPane1.setEditorKit(JEditorPane.createEditorKit(textPane1.getFont()));
				textPane1.setText("Save your database?");
				textPane1.selectAll();

				// Set the action to perform when the user presses the Save button.
				final Action action3 = new AbstractAction("Save database") {
					public void actionPerformed(ActionEvent e) {
						// Create a new database.
						JDialog jdDialog4 = main.createDialog(jdDialog, "");
						jDialog.dispose();

						// Start the text viewer for the new database.
						viewer.stopRefresh();
						final JTextPane textPane = (JTextPane)main
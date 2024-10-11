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
		public void checkValues(boolean expectedExceltation, int expectedNumber) {
			boolean result = expectedExceltation && saveData();
			assertEquals(1, result);
			System.out.println(getDescription());
			assertEquals(expectedNumber, saveData());
			
			result = expectedExceltation && readFile();
			assertEquals(expectedNumber, readFile().length());
			System.out.println(getDescription());
		}
		
		private JLabel newLabel = new JLabel("This isn't really long because" +
				"it is the final label - please don't change any of the labels" +
				"below.", JLabel.LEFT);
		
		@Test
		public void testSaveData() {
			final MainTest test = this;
			MainTest.checkValues(true, 1);
			System.out.println("This is the test main data field - just" +
					          "saving data");
			JFrame frame = new JFrame();
			final JTextArea textArea = new JTextArea();
			JLabel label = new Label("Enter a text here", JLabel.LEFT);
			textArea.setText(label.getText());
			JPanel mainPanel = new Panel();
			Pane leftSection = new Pane();
			leftSection.add(new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED));
			leftSection.add(new JScrollPane(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
			leftSection.add(textArea);
			mainPanel.add(label);
//			rightSection.add(new JScrollPane(viewerPanel));
//			rightSection.add(new JScrollPane(mainPanel));
			frame.add(textArea);
			frame.add(leftSection);
			frame.setSize(600, 800);
			frame.setVisible(true);
			System.out.println("Checking for errors...");
			textArea.setText(label.getText());
			for (boolean error = true; error; error = false) {
				System.out.println("Enter text here");
				try {
					textArea.setText(label.getText());
					assertTrue(error);
					return;
				} catch (Error er) {
					System.out.println(er);
					error = true;
				}
			}
		};
		
		@Test  // this makes the test run twice
		public void testReadFile() throws IOException {
			final MainTest test = this;
			MainTest.checkValues(false, 1);
			System.out.println("Read the file");
			JFrame f = new JFrame();
			JPanel mainPanel = new JPanel();
			mainPanel
					.add(newJPanelLabel(new Label("Here you will see the contents of this file")));
			f.add(mainPanel);
			f.setSize(550, 600);
			f.setVisible(true);
			// checkForJmolException tries to get everything it might see from the file, using reflection
			// to get a reference to the JmolViewer.
			final JmolViewer jmolViewer = new JmolViewer();
			f.add(newImagePanel(jmolViewer));
		}
		
		private JPanel newJPanelLabel(JPanel newPanel) {
			JPanel p = new JPanel();
			p.add(newPanel);
			return p;
		}
		
		private JPanel newJPanel() {
			JPanel panel = new JPanel();
			int i = 0;
			for (; i < 5; i++) {
				panel.add(newLabel, new GridBagConstraints(i, i, 1, 0, 0, 0,
						GridBagConstraints.WEST, GridBagConstraints.NONE,
						new Insets(0, 5, 0, 0), 0, 0));
			}
			return panel;
		}
		
		private JPanel newImagePanel(JmolViewer viewer) {
			JPanel imagePanel = new JPanel();
			int i = 0;
			for (; i < 5; i++) {
				imagePanel.add(newLabel, new GridBagConstraints(i, i, 1, 0, 0, 0,
						GridBagConstraints.WEST, GridBagConstraints.NONE,
						new Insets(5, 5, 5, 0), 0, 0));
			}
			return imagePanel;
		}
}
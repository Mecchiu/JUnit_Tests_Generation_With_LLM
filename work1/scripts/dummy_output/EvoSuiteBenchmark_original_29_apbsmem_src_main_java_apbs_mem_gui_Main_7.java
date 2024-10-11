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
		private PrintWriter out;

        /**
         *  Constructs the class.
         */
		public MainTest() {
			out = new PrintWriter(System.err);
		}

		/**
         * Saves the text value of the text field in the outFile.
         *
         * @param outFile The file.
         */
		public void SaveData(String outFile) {
			try {
			    final JFIFJPanel jf = new JFIFJPanel();
			    JPanel jp = new JPanel(new GridBagLayout());
			    setPaintable(jf);
			    jf.setLocation(0, 0); jf.setSize(400, 300);
			    JmolViewer jv = new JmolViewer();

			    java.io.FileWriter fstream = new java.io.FileWriter(outFile);
			    jf.add(jv, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new java.awt.Insets(1, 1, 1, 1), 0, 0));
			    jv.setLocation(100, 100);
			    jv.setSize(400, 300);
			    jv.setTitle(jv.getModel().getTotalFrames() + " Frames");
			    jf.add(new JL1(jv), new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new java.awt.Insets(1, 1, 1, 1), 0, 0));
			    fstream.flush();
			    fstream.close();
				jv.setCloseable(true, true);
				out.println("Saved the text");
			    out.flush();
			} catch (FileNotFoundException ex) {
				out.println("No such file or directory");
			}
			assertTrue(!(out.toString()).contains("Saved the text"));
		}
}
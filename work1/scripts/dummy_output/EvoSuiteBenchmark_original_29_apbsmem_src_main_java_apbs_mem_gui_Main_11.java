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
		private JmolViewer viewer;
		private JmolPopup popup;
		private JmolAdapter adapter;
		private void runAppTest(String p1, String p2, String p3) {
			/* We're going to create a new JmolViewer */
			//TODO: Make the following fields final
            JmolViewer viewer1 = new JmolViewer();
            final String view1 = p1;
            final String proj1 = p2;

            /* We create a new JmolPopup */
            JmolPopup popup1 = new JmolPopup(viewer1, 0);
            final String pop1 = "";
            boolean running = true;

			while (running) {
				running = popup1.show();
				check(running);
				JButton btn = (JButton) popup1.getContentPane().getComponent(0);
                Component[] comps = btn.getAccessibleContext().getComponents();

			        for (int i = 0; i < comps.length; i++) {
					if (compos[i] instanceof JButton) {
					Component tmp = (Component) comps[i];
					if (tmp instanceof JButton) {
						if (((JButton) tmp).getText().endsWith("OK")) {
							tmp.doClick();
						} else {
							tmp.doClick();
						}
						break;
					}
				}
			}

			}

            viewer = null;
            popup = null;
            adapter = null;
                try {
	            viewer = viewer1;
                } catch (Exception e) {
                }

                    if (p1.contains("jmol") &&
                        p2.contains("viz")) {
                        runAppTest("viewer1", view1, "proj1=viz;proj2=viewer1;");
                    }
		}

			protected void check (boolean result) {
}
}
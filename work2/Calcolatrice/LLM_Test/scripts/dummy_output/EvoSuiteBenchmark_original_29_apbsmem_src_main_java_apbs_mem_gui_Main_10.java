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
		List<List<String>> inFileList = new ArrayList<List<String>>();
		public MainTest (JmolAdapter jmolAdapter) {
			JmolViewer.getInstance();
			// Create a popup menu and a list box with the model
				createPopupMenuAndListBox(jmolAdapter);
		}

 		JmolPopup createPopupMenuAndListBox (JmolAdapter jmolAdapter) {

				JPopupMenu menu;
			
				menu = new JPopupMenu();
				JList<String> list = new JList<String>();
				JTextPane txt = new JTextPane();
				
				JAction load1 = new JAction("load model", "Load Jmol model");
				JMenuItem load = new JMenuItem("load");
				load.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						loadModel();
					}
				});

				load1.addActionListener(jmolAdapter);

 				JMenuItem load2 = new JMenuItem("Save model");
				load2.addActionListener(jmolAdapter);

				JAction save1 = new JAction("Save data to", "Save Jmol data to default location");
				JMenuItem save = new JMenuItem("save");
 				save.addActionListener(jmolAdapter);

				JMenuItem exit = new JMenuItem("Exit");
				exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						jmolAdapter.closeDataView();
					}
				});

				menu.add(load);
				menu.add(load1);
				menu.add(save);
				menu.add(exit);

				JMenuItem reload1 = new JMenuItem("reload model", "Reload Jmol model");
				menu.add(reload1);

				JMenuItem reload2 = new JMenuItem("reload data");
				menu.add(reload2);

                menu.add(list);
                menu.add(txt);

                menu.addSeparator();

		    
 				list.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						String file = "JmolDataViewerTestData.xml";
						String path = System.getProperty("test.data.path");
					    try {
						JmolViewer.getInstance();
						//Create a popup menu and a list box with the model
						createPopupMenuAndListBox(jmolAdapter);
						inFileList.add(new ArrayList<String>());
						assertTrue("File path not created correctly", path.equals(file.substring(0, file.lastIndexOf('/'))));
						assertTrue("InFileList list size not equal to inFileList.size()", inFileList.size() > 0);
						File testFile = new File(path + File.separator + file);
						inFileList.get(0).add(testFile.getName());
					} catch (Exception e) {
						e.printStackTrace();
						assertTrue("InFileList list size not equal to inFileList.size()", inFileList.size() > 0);
					}
					
					}
                });
      
                txt.requestFocus();
                txt.setFocusable(false);
                txt.setOpaque(false);
   	}

		JList<String> createPopupMenuAndListBox (JmolAdapter jmolAdapter) {

				JList<String> list = new JList<String>(inFileList);
				JPopupMenu menu;
				JPanel box = new JPanel();
				
				menu = new JPopupMenu();

		    	menu.setEnabled(true);
		    	
		    	menu.add(load1);
		    	menu.add(load2);
		    	menu.add(list);
		    	
		    	menu.add(list);
				menu.add(txt);
		
		  		box.add(new JScrollPane(list));
		  		box.setOpaque(false);
		  		box.setFocusable(false);
		    
		    	list.setOpaque(false);
		    	list.setFocusable(false);
		    
		    	list.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						saveData();
					}
				});
		
		  		txt.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						saveData();
					}
			});
   	}

  	void saveData () {
  		String str = null;
		try {
			str = inFileList.get(0).get(0);
		} catch (Exception e) {
			printStackTrace(e);
		}

}
}
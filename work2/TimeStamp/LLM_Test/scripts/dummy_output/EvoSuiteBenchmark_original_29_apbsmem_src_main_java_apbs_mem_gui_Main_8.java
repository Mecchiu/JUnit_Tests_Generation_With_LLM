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
		public static void main(String[] args) {
			JUnitForm form = new JUnitForm();
			form.setVisible(true);
		}
}

// Class Methods
class JUnitForm extends JPanel {
	private JTextField inFile = new JTextField();
	private JButton saveButton = new JButton("Save", new ActionListener(){ 
	      public void actionPerformed (ActionEvent evnt){
	      	saveData();
	      }
	    }
	);
	private Box left = new Box(BoxLayout.X_AXIS);
    private JScrollPane scroll = new JScrollPane(inFile);
	private final Test test = new Test();

	/**
	 * Get the component instance of {@link JUnitForm}.
	 */
	public Java2DForm getJUnitForm() { 
	        return test;
            }

	/**
	 * Get the component instance of the JTextField.
	 */
	public JTextField getInFile() { 
	        return inFile;
            }
	
	/**
	 * Get the component instance of the Button.
	 */
	public JButton getSaveButton() { 
	    return saveButton;
            }
	
	/**
	 * Get the component instance of the right box-panel.
	 */
	public Box getLeft() { 
	        return left;
            }

	/**
	 * Add the components to the main form.
	 */
	public void add(Component comp){ 
	        add(comp, BorderLayout.SOUTH);
            }
	
	/**
	 * Add the components to the main form.
	 */
	public void add(Component comp, int x){ 
	        add(comp, BorderLayout.CENTER);
            }
	
	/**
	 * Add the components to the main form.
	 */
	public void add(Component comp, int y){ 
	        add(comp, BorderLayout.EAST);
            }
	
	/**
	 * Get the number of components.
	 */
	public int getComponentCount(){ 
	        return 2;
            }
	
	/**
	 * Add a new component containing the inFile text field.
	 */
	public void addInFile(Component comp){ 
	        add(comp, BorderLayout.CENTER);
            }
	
	/**
	 * Set the text data to the inFile TextField.
	 */
	public void setInFile(String value){
	        inFile.setText(value);
            }
	/**
	 * Clear the inFile text field.
	 */
	public void clearInFile() {
	        inFile.setText("");
        }

	/**
	 * Add a {@link Jpopup} for an existing JmolPopup.
	 */
	public JmolPopup getPopupForJmolPopup() { 
	        String[] argv = { "-show", "-showModel", getInFile().getText() };
	        JmolPopup popup = new JmolPopup("popup", true, argv);
	        JPopupMenu popupMenu =
	            JPopupMenu.createDefaultMenu(popup,
	                                      "Add Input File",
	                                      argv);
	        this.inFile.setMenu(popupMenu);
	        return popup;
        }

	/**
	 * Add a {@link Jpopup} which displays the current state to the JmolPopup and pop the
	 * JmolPopup to the main application form.
	 */
	public JmolPopup getPopupForJmolPopup_State(){ 
	        String[] argv = {
	                "-show", "-showModel", getInFile().getText(),
	                getSaveButton().isEnabled()? "Save" : "Don't Save"
	        };
	    JmolPopup popup = new JmolPopup("popup", true, argv);
	    JPopupMenu popupMenu =
	            JPopupMenu.createDefaultMenu(popup,
	                                      "State Of Jmol Popup");
	    this.inFile.setMenu(popupMenu);
	    this.saveButton.setEnabled(!getInFile().getText().equals(""));
	    return popup;
        }

	/**
	 * Return true if the save button is enabled.
	 */
	public boolean isSaveButtonEnabled() { 
	        return getSaveButton().isEnabled();
            }

	/**
	 * Create an {@link ActionListener} which does nothing.
	 */
	public ActionListener ignoreSaveActionListener(){ 
	        return new ActionListener() { 
	        		public void actionPerformed (ActionEvent evt){
	        			ignoreSaveAction();
	        		}
	        };
            }

	/**
	 * Save or discard the current state of the JmolPopup, as defined by the 
	 * saveButton enablement.
	 */
	public void ignoreSaveAction(){ 
        JPopupMenu popupMenu =
			(this.isSaveButtonEnabled()? this.getPopupForJmolPopup_State() : this.getPopupForJmolPopup());	
        this.getJmolForm().getPopupForJmolPopup().setPopupEnabled(popupMenu, false);
	}
}
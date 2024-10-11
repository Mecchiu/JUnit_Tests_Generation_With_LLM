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
private Main main;
		private JmolViewer jmol;
    	
    	
    	/**
    	 * Constructor for unit test.
    	 * @param a parent test parent for this test
    	 */
    	public MainTest(Junit parent) {
    		if (parent == null) {
                jmol = new JmolPopup("","","");
    		}
    		
    		
    		this.jmol = new JmolPopup("","","","");
    		new JmolAdapter(jmol, new String("test"), false);
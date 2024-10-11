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
		
	@Test
    public void test() throws IOException, ClassNotFoundException {
        
        JmolViewer viewer = JmolAdapter.newJmolAdapter();
        JmolPopup popup = new JmolPopup(viewer, "About apbs-mem.com", "Apbs-Mem", "Apbs-Mem", 350, 300, 350, 300);
        
        int button = popup.show();
        
        assertEquals((int) button, 0);
		
		}
		
	@Test
    public void test2() throws IOException, ClassNotFoundException {
        
        JmolViewer viewer = JmolAdapter.newJmolAdapter();
        JmolPopup popup = new JmolPopup(viewer, "About apbs-mem.com", "Apbs-Mem", "Apbs-Mem2", 350, 300, 350, 300);
        
        int button = popup.show();
        
        assertEquals((int) button, 1);
		
		}
		
	@Test
    public void test3() throws IOException, ClassNotFoundException {
        
        JmolViewer viewer = JmolAdapter.newJmolAdapter();
		JmolAdapter adapt = new JmolAdapter();
		adapt.setColor(Color.green);
        adapt.setSize(300, 300);
		JmolPopup popup2 = new JmolPopup(viewer, "About apbs-mem.com", "Apbs-Mem", "Apbs-MemColor", 300, 300, 300, 300);
    
        int button = popup2.show();
		assertEquals((int)button, 15);
		
		}
		
	public static Test suite(){
		return new TestSuite(new MainTest());
		
	}
	
}
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
		
    public boolean SaveData() {
        JmolPopup popup = JmolPopup.getJmolPopup();
                
        popup.setCaption("Saving...");

        JmolViewer viewer = mainPanel.getTopLevelJmolViewer();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(0, 0));

        JPasswordField tf = createFieldInput("Password", "", viewer);

        JPanel panelText = new JPanel();

        panelText.setLayout(new FormLayout(
            "left:6px, alignx #100%, fill: pref:grow, width:300px",
            "fill:left, fill:pref, fill:pref, fit:100%"
        ));

        Font boldFont = new Font("Arial", Font.BOLD, 18);
        Font boldFontBold = new Font("Arial", Font.BOLD, 11);

        panelText.setFont(boldFont);
    
        buttonPressed(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(null);
            }
        });

        // Populate the text field with the text in the viewer.
        // (This only needs to be run once, when creating a new
        // JmolPopup instance.)
        viewer.setViewerField("TXT", tf);
        
        // Create the field input box and set its text to the password field.
        // See JmolPopup.
        tf = createFieldInput("Password", "", viewer);
        
        panelText.add(createTopLevelJLabel("Type the password", 
            new Painter() {
                public String getIconName() {
                    return null;
                }
                public Icon getIcon() {
                    Font font = tf.getFont();
                    Font boldFont = boldFontBold.deriveFont(font.deriveFont(font.getSize()-1));
                    new Font(font.getFamily(), font.getStyle(), 14);
                    return super.getIcon();
                }
            }), tf.getBounds().width);
        tf.setBounds(10, 2, tf.getBounds().width, 5);
                
        return mainPanel.mainPanel()==0; 
    }
    
}
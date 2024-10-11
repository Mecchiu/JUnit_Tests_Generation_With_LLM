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
     * This is our test runner: it just runs
     * {@link Main#SaveData()} in the default JUnit test directory
     * and closes the output window.
     */
    public static final String SAVEDATA = "_test_data.txt";

    /**
     * Constructor
     */
    public MainTest() {
    }

    /**
     * Main
     * 
     * @param args
     */
    public static void main ( String [] args ) {
        if (args.length > 0) main ( args[0], args[1] ); 
    }

    /**
     * Main
     * 
     * @param inFileName
     * @param outDir
     */
    public static void main( String inFileName, String outDir ) {
        JFrame frame = new
            JFrame(
          "MEM_GUI_SAVE_DATA: "       +
          inFileName +
          " |" +
          " Output directory: " +
          outDir +
          "")

           .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

           .setLayout(new BorderLayout())

           .add(
              new JLabel(
                "Save data here as a.txt file?\n\n" +
                "  OK | Cancel"
                  +
                " Example:  " +
                " jstest.txt  <=  " +
                SAVEDATA ),
              BorderLayout.NORTH)

           .add(
              new JTextField(SAVEDATA),
              BorderLayout.NORTH)

           .add(
              new JCheckBox(
                "Test for the SAVEDATA.",
                true
                  +
                " If the SAVEDATA is not found for your current working directory," +
                " test will be failed."),
              BorderLayout.CENTER)

         .setSize(300, 60);
    }

    public void init(Main main) {
        JPopupMenu menu ;

        // Set a help screen.
        menu = new JPopupMenu();

          main.setTitle("MEM GUI - Save Data");
          menu.add(
            new JLabel(
              "Save data here as a.txt file?"
                  +
              " Use this button to test the memory program, using SAVEDATA as input.",
              JLabel.CENTER)
          ).setLayout(LayoutFactory.getDefaultLayout());

          // Make the save button.
          JButton save =
            new JButton("Save data here: "+SAVEDATA);

          menu.add(
            save);

          System.out.println ("JUnit test");

          final JDialog dialog =
            new JDialog(
              null,
              "Save data here as a.txt file?",
              true);

          dialog.setLayout(new BorderLayout());

          JButton cancel =
            new JButton("Cancel");

          menu.add(
            cancel);

          cancel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                      dialog.setVisible(false);
                    }
    
          });
          
          menu.add(new JLabel(
            "Press \"OK\" to start the JUnit test suite", JLabel.CENTER));

        JTextField tf = new JTextField();
        tf.setText("Test"); 

        menu.add(tf);

          dialog.add(menu);

        JPopupMenu subMenu = new JPopupMenu();
        menu.addSeparator();
        JMenuItem itm = new JMenuItem(
                      "Select files from selected directory");
        itm.setActionCommand(
            "MEM_GUI_SAVE_DATA");
        itm.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent ev) {
                               String testFiles[] = tf.getText().split(",");
                               saveFiles(subMenu, testFiles);
                               subMenu.show(
                                  tf,
                                  tf.getX(),
                                  tf.getY() + tf.getHeight());
                             }
                             }
                       );
                  }

       SubJComboBox<String> tmb =  new SubJComboBox<>(
        new JComboBox<>(
      new Vector<>(
        // New data for testing
        new String[] {
          "Test1",
          "Test2",
          "Test3"
        }
      ),
      MainTest.class,
      1));
        

}
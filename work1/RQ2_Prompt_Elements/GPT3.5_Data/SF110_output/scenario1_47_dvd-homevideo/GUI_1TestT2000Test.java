// Here's an updated version of the code with the test cases for the MessageBox method:

// GUI.java
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * This class provides the GUI for dvd-homevideo.
 */
public class GUI extends javax.swing.JFrame {

    public int MessageBox(String message) {
        return JOptionPane.showConfirmDialog(null, message, "dvd-homevideo", JOptionPane.YES_NO_OPTION);
    }
}

// GUI_1Test.java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class of {@link GUI}.
 * It contains ten unit test cases for the {@link GUI#MessageBox(String)} method.
 */
class GUI_1Test {

    @Test
    void testMessageBoxYes() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Do you want to continue?");
        assertEquals(JOptionPane.YES_OPTION, result);
    }

    @Test
    void testMessageBoxNo() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Do you want to cancel?");
        assertEquals(JOptionPane.NO_OPTION, result);
    }

    @Test
    void testMessageBoxCancel() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Do you want to cancel?");
        assertEquals(JOptionPane.CANCEL_OPTION, result);
    }

    @Test
    void testMessageBoxOk() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Operation completed successfully.");
        assertEquals(JOptionPane.OK_OPTION, result);
    }

    @Test
    void testMessageBoxError() {
        GUI gui = new GUI();
        int result = gui.MessageBox("An error occurred.");
        assertEquals(JOptionPane.ERROR_OPTION, result);
    }

    @Test
    void testMessageBoxWarning() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Are you sure you want to proceed?");
        assertEquals(JOptionPane.WARNING_OPTION, result);
    }

    @Test
    void testMessageBoxInfo() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Please enter your name.");
        assertEquals(JOptionPane.INFORMATION_MESSAGE, result);
    }

    @Test
    void testMessageBoxPlain() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Please enter your name.");
        assertEquals(JOptionPane.PLAIN_MESSAGE, result);
    }

    @Test
    void testMessageBoxTitle() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Please enter your name.");
        assertEquals("dvd-homevideo", JOptionPane.getRootFrame().getTitle());
    }

    @Test
    void testMessageBoxMessage() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Please enter your name.");
        assertEquals("Please enter your name.", JOptionPane.getRootFrame().getComponent(0).getName());
    }
}
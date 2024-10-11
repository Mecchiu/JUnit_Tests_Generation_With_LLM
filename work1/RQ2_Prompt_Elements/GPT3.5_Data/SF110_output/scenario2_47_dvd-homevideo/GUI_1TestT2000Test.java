// Here's an updated version of the code with ten unit test cases for the MessageBox method:

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

    /**
     * Displays a message box with the supplied text and yes/no options
     *
     * @param message The message to display in the box
     */
    public int MessageBox(String message) {
        return JOptionPane.showConfirmDialog(null, message, "dvd-homevideo", JOptionPane.YES_NO_OPTION);
    }
}

// GUI_1Test.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        int result = gui.MessageBox("Do you want to continue?");
        assertEquals(JOptionPane.NO_OPTION, result);
    }

    @Test
    void testMessageBoxCancel() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Do you want to continue?");
        assertEquals(JOptionPane.CANCEL_OPTION, result);
    }

    @Test
    void testMessageBoxError() {
        GUI gui = new GUI();
        int result = gui.MessageBox("An error occurred. Do you want to continue?");
        assertEquals(JOptionPane.YES_OPTION, result);
    }

    @Test
    void testMessageBoxWarning() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Warning: This action cannot be undone. Do you want to continue?");
        assertEquals(JOptionPane.NO_OPTION, result);
    }

    @Test
    void testMessageBoxInfo() {
        GUI gui = new GUI();
        int result = gui.MessageBox("Information: The operation was successful. Do you want to continue?");
        assertEquals(JOptionPane.YES_OPTION, result);
    }

    @Test
    void testMessageBoxLongMessage() {
        GUI gui = new GUI();
        String message = "This is a very long message that should be displayed in the message box. "
                + "It contains multiple lines and is intended to test the message box's ability to handle long messages.";
        int result = gui.MessageBox(message);
        assertEquals(JOptionPane.YES_OPTION, result);
    }

    @Test
    void testMessageBoxEmptyMessage() {
        GUI gui = new GUI();
        int result = gui.MessageBox("");
        assertEquals(JOptionPane.YES_OPTION, result);
    }

    @Test
    void testMessageBoxNullMessage() {
        GUI gui = new GUI();
        int result = gui.MessageBox(null);
        assertEquals(JOptionPane.YES_OPTION, result);
    }

    @Test
    void testMessageBoxCustomTitle() {
        GUI gui = new GUI();
        int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Custom Title", JOptionPane.YES_NO_OPTION);
        assertEquals(JOptionPane.YES_OPTION, result);
    }
}
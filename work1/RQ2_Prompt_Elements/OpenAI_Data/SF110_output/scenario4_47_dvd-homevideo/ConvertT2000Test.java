// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains ten unit test cases for the {@link Convert#init()} method.
*/
class ConvertTest {

	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit2() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit3() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit4() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit5() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit6() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit7() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit8() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit9() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit10() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
}

// GUI.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Shane Santner
 * This class is used to create the GUI for the DVD
 * authoring application.  It is also used to handle
 * the events that occur when the user interacts with
 * the GUI.
 */
public class GUI extends JFrame implements ActionListener {

    /**
     * Creates a new instance of GUI
     */
    public GUI() {
    }

    /**
     * GUI Member Variables
     */
    private JPanel m_Panel;

    private JLabel m_Label1;

    private JLabel m_Label2;

    private JLabel m_Label3;

    private JLabel m_Label4;

    private JLabel m_Label5;

    private JLabel m_Label6;

    private JLabel m_Label7;

    private JLabel m_Label8;

    private JLabel m_Label9;

    private JLabel m_Label10;

    private JLabel m_Label11;

    private JLabel m_Label12;

    private JLabel m_Label13;

    private JLabel m_Label14;

    private JLabel m_Label15;

    private JLabel m_Label16;

    private JLabel m_Label17;

    private JLabel m_Label18;

    private JLabel m_Label19;

    private JLabel m_Label20;

    private JLabel m_Label21;

    private JLabel m_Label22;

    private JLabel m_Label23;

    private JLabel m_Label24;

    private JLabel m_Label25;

    private JLabel m_Label26;

    private JLabel m_Label27;

    private JLabel m_Label28;

    private JLabel m_Label29;

    private JLabel m_Label30;

    private JLabel m_Label31;

    private JLabel m_Label32;

    private JLabel m_Label33;

    private JLabel m_Label34;

    private JLabel m_Label35;

    private JLabel m_Label36;

    private JLabel m_Label37;

    private JLabel m_Label38;

    private JLabel m_Label39;

    private JLabel m_Label40;

    private JLabel m_Label41;

    private JLabel m_Label42;

    private JLabel m_Label43;

    private JLabel m_Label44;

    private JLabel m_Label45;

    private JLabel m_Label46;

    private JLabel m_Label47;

    private JLabel m_Label48;

    private JLabel m_Label49;

    private JLabel m_Label50;

    private JLabel m_Label51;

    private JLabel m_Label52;

    private JLabel m_Label53;

    private JLabel m_Label54;

    private JLabel m_Label55;

    private JLabel m_Label56;

    private JLabel m_Label57;

    private JLabel m_Label58;

    private JLabel m_Label59;

    private JLabel m_Label60;

    private JLabel m_Label61;

    private JLabel m_Label62;

    private JLabel m_Label63;

    private JLabel m_Label64;

    private JLabel m_Label65;

    private JLabel m_Label66;

    private JLabel m_Label67;

    private JLabel m_Label68;

    private JLabel m_Label69;

    private JLabel m_Label70;

    private JLabel m_Label71;

    private JLabel m_Label72;

    private JLabel m_Label73;

    private JLabel m_Label74;

    private JLabel m_Label75;

    private JLabel m_Label76;

    private JLabel m_Label77;

    private JLabel m_Label78;

    private JLabel m_Label79;

    private JLabel m_Label80;

    private JLabel m_Label81;

    private JLabel m_Label82;

    private JLabel m_Label83;

    private JLabel m_Label84;

    private JLabel m_Label85
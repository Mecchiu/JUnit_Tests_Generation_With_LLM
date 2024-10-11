// FenetrePrincipaleTest.java
package fr.unice.gfarce.interGraph;

/**
 * classe qui dessine toute l interphace graphique
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.RespFormation;
import fr.unice.gfarce.main.Controler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FenetrePrincipale}.
* It contains ten unit test cases for the {@link FenetrePrincipale#dateDeNaiss()} method.
*/
class FenetrePrincipaleTest {

	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "1"</li>
	* 	<li>comboBoxMoisDDNEtu = "1"</li>
	* 	<li>comboBoxAnneeDDNEtu = "1"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "11/1/1"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_1() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "1";
		String comboBoxMoisDDNEtu = "1";
		String comboBoxAnneeDDNEtu = "1";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "11/1/1";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "2"</li>
	* 	<li>comboBoxMoisDDNEtu = "2"</li>
	* 	<li>comboBoxAnneeDDNEtu = "2"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "22/2/2"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_2() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "2";
		String comboBoxMoisDDNEtu = "2";
		String comboBoxAnneeDDNEtu = "2";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "22/2/2";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "3"</li>
	* 	<li>comboBoxMoisDDNEtu = "3"</li>
	* 	<li>comboBoxAnneeDDNEtu = "3"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "33/3/3"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_3() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "3";
		String comboBoxMoisDDNEtu = "3";
		String comboBoxAnneeDDNEtu = "3";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "33/3/3";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "4"</li>
	* 	<li>comboBoxMoisDDNEtu = "4"</li>
	* 	<li>comboBoxAnneeDDNEtu = "4"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "44/4/4"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_4() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "4";
		String comboBoxMoisDDNEtu = "4";
		String comboBoxAnneeDDNEtu = "4";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "44/4/4";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "5"</li>
	* 	<li>comboBoxMoisDDNEtu = "5"</li>
	* 	<li>comboBoxAnneeDDNEtu = "5"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "55/5/5"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_5() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "5";
		String comboBoxMoisDDNEtu = "5";
		String comboBoxAnneeDDNEtu = "5";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "55/5/5";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "6"</li>
	* 	<li>comboBoxMoisDDNEtu = "6"</li>
	* 	<li>comboBoxAnneeDDNEtu = "6"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "66/6/6"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_6() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "6";
		String comboBoxMoisDDNEtu = "6";
		String comboBoxAnneeDDNEtu = "6";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "66/6/6";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "7"</li>
	* 	<li>comboBoxMoisDDNEtu = "7"</li>
	* 	<li>comboBoxAnneeDDNEtu = "7"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "77/7/7"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_7() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "7";
		String comboBoxMoisDDNEtu = "7";
		String comboBoxAnneeDDNEtu = "7";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "77/7/7";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "8"</li>
	* 	<li>comboBoxMoisDDNEtu = "8"</li>
	* 	<li>comboBoxAnneeDDNEtu = "8"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "88/8/8"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_8() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "8";
		String comboBoxMoisDDNEtu = "8";
		String comboBoxAnneeDDNEtu = "8";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "88/8/8";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "9"</li>
	* 	<li>comboBoxMoisDDNEtu = "9"</li>
	* 	<li>comboBoxAnneeDDNEtu = "9"</li>
	* </ul>
	* and the following expected output value :
	* <ul>
	* 	<li>expected = "99/9/9"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss_9() {
		// Initialize the input values
		String comboBoxJourDDNEtu = "9";
		String comboBoxMoisDDNEtu = "9";
		String comboBoxAnneeDDNEtu = "9";
		
		// Set the input values
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDDNEtu = comboBoxJourDDNEtu;
		fenetrePrincipale.comboBoxMoisDDNEtu = comboBoxMoisDDNEtu;
		fenetrePrincipale.comboBoxAnneeDDNEtu = comboBoxAnneeDDNEtu;
		
		// Call the method under test
		String actual = fenetrePrincipale.dateDeNaiss();
		
		// Verify the result
		String expected = "99/9/9";
		assertEquals(expected, actual);
		// TODO : add other tests
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input values :
	* <ul>
	* 	<li>comboBoxJourDDNEtu = "10"</li>
	* 	<
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
* It contains ten unit test cases for the {@link FenetrePrincipale#dateLimForm()} method.
*/
class FenetrePrincipaleTest {

	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "01/01/2000"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "01/01/2000"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm1() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("01");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("01");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2000");
		assertEquals("01/01/2000", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "02/02/2001"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "02/02/2001"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm2() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("02");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("02");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2001");
		assertEquals("02/02/2001", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "03/03/2002"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "03/03/2002"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm3() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("03");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("03");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2002");
		assertEquals("03/03/2002", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "04/04/2003"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "04/04/2003"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm4() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("04");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("04");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2003");
		assertEquals("04/04/2003", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "05/05/2004"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "05/05/2004"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm5() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("05");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("05");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2004");
		assertEquals("05/05/2004", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "06/06/2005"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "06/06/2005"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm6() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("06");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("06");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2005");
		assertEquals("06/06/2005", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "07/07/2006"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "07/07/2006"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm7() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("07");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("07");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2006");
		assertEquals("07/07/2006", fenetrePrincipale.dateLimForm());
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>dateLimForm = "08/08/2007"</li>
	* </ul>
	* and the expected output is:
	* <ul>
	* <li>dateLimForm = "08/08/2007"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm8() {
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.
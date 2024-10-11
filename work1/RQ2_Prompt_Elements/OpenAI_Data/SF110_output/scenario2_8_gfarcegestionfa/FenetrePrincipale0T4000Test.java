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
	* <li>date = "01/01/2000"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "01/01/2000"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm1() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("01");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("01");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2000");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("01/01/2000", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "02/02/2001"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "02/02/2001"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm2() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("02");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("02");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2001");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("02/02/2001", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "03/03/2002"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "03/03/2002"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm3() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("03");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("03");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2002");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("03/03/2002", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "04/04/2003"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "04/04/2003"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm4() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("04");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("04");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2003");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("04/04/2003", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "05/05/2004"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "05/05/2004"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm5() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("05");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("05");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2004");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("05/05/2004", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "06/06/2005"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "06/06/2005"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm6() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("06");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("06");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2005");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("06/06/2005", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "07/07/2006"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "07/07/2006"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm7() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("07");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("07");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2006");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("07/07/2006", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "08/08/2007"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "08/08/2007"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm8() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("08");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("08");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2007");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("08/08/2007", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "09/09/2008"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "09/09/2008"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm9() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("09");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("09");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2008");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("09/09/2008", date);
	}
		
	/**
	* Test case for the {@link FenetrePrincipale#dateLimForm()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "10/10/2009"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "10/10/2009"</li>
	* </ul>
	*/
	@Test
	public void testDateLimForm10() {
		// Given
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.comboBoxJourDLM.setSelectedItem("10");
		fenetrePrincipale.comboBoxMoisDLM.setSelectedItem("10");
		fenetrePrincipale.comboBoxAnneeDLM.setSelectedItem("2009");
		// When
		String date = fenetrePrincipale.dateLimForm();
		// Then
		assertEquals("10/10/2009", date);
	}
		
}
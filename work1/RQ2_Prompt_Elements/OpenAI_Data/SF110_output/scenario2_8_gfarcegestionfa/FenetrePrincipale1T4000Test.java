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
	public void testDateDeNaiss1() {
		// initialize the input values for the method under test
		String date = "01/01/2000";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "02/02/2002"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "02/02/2002"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss2() {
		// initialize the input values for the method under test
		String date = "02/02/2002";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "03/03/2003"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "03/03/2003"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss3() {
		// initialize the input values for the method under test
		String date = "03/03/2003";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "04/04/2004"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "04/04/2004"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss4() {
		// initialize the input values for the method under test
		String date = "04/04/2004";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "05/05/2005"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "05/05/2005"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss5() {
		// initialize the input values for the method under test
		String date = "05/05/2005";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "06/06/2006"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "06/06/2006"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss6() {
		// initialize the input values for the method under test
		String date = "06/06/2006";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "07/07/2007"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "07/07/2007"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss7() {
		// initialize the input values for the method under test
		String date = "07/07/2007";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "08/08/2008"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "08/08/2008"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss8() {
		// initialize the input values for the method under test
		String date = "08/08/2008";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "09/09/2009"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "09/09/2009"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss9() {
		// initialize the input values for the method under test
		String date = "09/09/2009";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
	/**
	* Test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
	* It tests the method with the following input:
	* <ul>
	* <li>date = "10/10/2010"</li>
	* </ul>
	* and the expected output:
	* <ul>
	* <li>date = "10/10/2010"</li>
	* </ul>
	*/
	@Test
	public void testDateDeNaiss10() {
		// initialize the input values for the method under test
		String date = "10/10/2010";
		// initialize the class to test
		FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();
		// invoke the method under test
		String result = fenetrePrincipale.dateDeNaiss();
		// assert the return value
		assertEquals(date, result);
	}
	
}
// FenetrePrincipale_1Test.java
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
* It contains one unit test case for the {@link FenetrePrincipale#dateDeNaiss()} method.
*/
class FenetrePrincipale_1Test {
		
	/**
	* Test method for {@link fr.unice.gfarce.main.Controler#controleSuplancer()}.
	*/
	@Test
	public void testControleSuplancer() {
		
		// Instantiate

		Controler.instantiate(false);
		
		// Check
		Controler.controleSuplancer();
		
		// Assert
		assertTrue(Controler.controleSuplancer() instanceof Controler.SimpleSuplancer); //$NON-NLS-1$
	}
	
	/**
	* Test method for {@link fr.unice.gfarce.main.Controler#dateDeNaiss()}.
	*/
	@Test
	public void testDateDeNaiss() {
			
		// Instantiate
		
		Controler.instantiate(false);
		
		// Check
		java.util.Calendar l10nCal = java.util.Calendar.getInstance();
		l10nCal.set(Calendar.YEAR, Calendar.APRIL, Calendar.MAY);
		Formation f1 = new Formation(l10nCal.getTime(), ""); //$NON-NLS-1$
		assertNotNull(f1);
		assertNotNull(f1.getId());
		assertEquals(""+l10nCal.getTime(), f1.getId());

		
		Controler.dateDeNaiss("");
		
		// Assert
		
		assertNull(Controler.dateDeNaiss());
	}
	
}
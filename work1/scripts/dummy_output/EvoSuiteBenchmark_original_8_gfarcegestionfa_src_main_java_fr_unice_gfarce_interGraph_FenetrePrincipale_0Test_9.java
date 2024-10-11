// FenetrePrincipale_0Test.java
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
* It contains one unit test case for the {@link FenetrePrincipale#dateLimForm()} method.
*/
class FenetrePrincipale_0Test {
		
	final FenetrePrincipale f = new FenetrePrincipale();
	
	
	/**
	 * Test of setFormation method, of class FenetrePrincipale.
	 */
	@Test
	public void testSetFormation() {
		f.setFormation(null);
		assertEquals(null, f.getFormation());
	}

	/**
	 * Test of setFormation, of class FenetrePrincipale.
	 */
	@Test
	public void testSetFormation() {
		Formation form = new Formation(
				"01", 
				"Nom de famille",
				"Nom de famille",
				"NDP",
				"Date d'envoi de famille",
				"Valeur",
				"GID",
				"Valeur",
				"GID",
				"Percipient",
				"GID",
			"NDP",
			"Percipient",
			"GID",
			"Percipient"
			);
		f.setFormation(form);
		Formation form2 = (Formation) f.getFormation().clone();
		assertEquals(form, form2);
	}
	
	/**
	 * Test of getDateFormation method, of class FenetrePrincipale.
	 */
	@Test
	public void testGetDateFormation() {
		DateFormation formated = f.getDateFormation();
		DateFormation form2 = (DateFormation) formated.clone();
		assertEquals(formated, form2);
	}
	
	/**
	 * Test of getFormation method, of class FenetrePrincipale.
	 */
	@Test
	public void testGetFormation() {
		FenetrePrincipale.Formation[] formations = f.getFormation().getFormations();
		FenetrePrincipale.Formation formation = formations[0];
		assertEquals(formations[0], formation);
	}
	
	/**
	 * Test of setListeFormation method, of class FenetrePrincipale.
	 */
	@Test
	public void testSetListeFormation() {
		ListSelectionModel liste = new ListSelectionModel();
		FenetrePrincipale.Formation[] formations = f.getFormation().getFormations();
		FenetrePrincipale.Formation formation = null;
		int index = 0;
		for (FenetrePrincipale.Formation currentform : formations) {
			if (currentform.getDate() == formations[index].getDate()) {
				index++;
				formation = currentform;
				liste.setSelectionInterval(index, index);
				break;
			}
		}
		int index2 = index - 1;
		for (FenetrePrincipale.Formation currentform : formations) {
			if (currentform.getDate() == formations[index2].getDate()) {
				index2++;
				formation = currentform;
			}
		}
		assertEquals(formations[index], formation);
	}
	
	/**
	 * Test of getListeFormality method, of class FenetrePrincipale.
	 */
	@Test
	public void testGetListeFormality() {
		ListSelectionModel liste = new ListSelectionModel();
		FenetrePrincipale.Formity[] formities = f.getFormation().getFormalities();
		FenetrePrincipale.Formity formity = null;
		int index = 0;
		for (FenetrePrincipale.Formity currentformity : formities) {
			if (currentformity.getIdentite().getIdentiteID() == formities[index].getIdentite().getIdentiteID()) {
				index++;
				formity = currentformity;
			}
		}
		assertEquals(formities[index], formity);
	}
	
	/**
	 * Test of createPane method, of class FenetrePrincipale.
	 */
	@Test
	public void testCreatePane() {
		String icono = "PNG000";
		String text = "NDP";
}
}
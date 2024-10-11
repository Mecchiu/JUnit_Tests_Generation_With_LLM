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
		 * Dénault la case d'exécution de l'exécution de l'application.
		 * Cette case est un contexte par un dossier avec un objet de type {@link Controler}.
		 */
		private final Controler c = Controler.create();
				      
		/**
		 * Test que la date de naissance est de long pour une instance de {@link FenetrePrincipale_1Test}
		 */
	@Test
	public void dateDeNaiss(){
		assertEquals("Le label est incorrect",
		        "Date de naissance: " + c.getDateIso(), 
		    c.getValidateFormation(Formation.dateDeNaiss));
		assertEquals("Le label est incorrect",
		        "Date de naissance: " + c.getDateIso(), 
		    c.getValidateFormation(null));
	}
	
	/**
	 * Test du contexte et de la modification du bouton modifié 
	 */
	@Test
	public void modificationBouton() {
		final JFrame frame = c.getFrame();
		final JButton bouton = c.getBouton();
		assertNotNull("Le bouton est vide: ", bouton);
		frame.add(bouton, frame.getTabbedPane());
		assertTrue("Le bouton est détruite.", bouton.isEnabled());
		frame.setSelectedIndex(0);
		c.nextBouton();
		assertFalse("Le bouton est détruite.", bouton.isEnabled());
		frame.setSelectedIndex(0);
		frame.remove(bouton);
		frame.validate();
		//frame.repaint();
	}

	/**
	 * Test du processus du bouton modifié
	 */
	@Test
	public void boutonModif() {
		final JFrame frame = c.getFrame();
		c.nextBouton();
		c.validate();
		
		c.removeBouton();
		frame.setSelectedIndex(0);
		c.validate();

		c.nextBouton();
		frame.validate();
	}

	/**
	 * Test du processus de la modification de la liste de liste de formations
	 * qui sont également différents (même de chaque champ)
	 */
	@Test
	public void listeModesDetermination() {
		final JFrame frame = c.getFrame();
	    ListSelectionModel liste = frame.getListSelectionModel();
	    for (int i = 0; i < liste.getModel().getSize(); i++) {
	    	final Object object = liste.getSelectedValue();
	    	assertTrue("La liste est une seule liste.", liste.isSelectedIndex(i));
	    	assertEquals("La liste est une seule liste.", Formation.nom(object), liste.getSelectedIndex());
	    }
	    c.nextBouton();
	    c.validate();
	    
	    c.removeBouton();
	    frame.setSelectedIndex(0);
	    c.validate();
	}

	/**
	 * Test que de ce objet on trouve dans une liste du bouton modifié il
	 * est correctement réservoir la liste de liste de formations qui sont
	 * également différents (même de chaque champ)
	 */
	@Test
	public void listeModif() {
		final JFrame frame = c.getFrame();
		final ListSelectionModel liste = frame.getListSelectionModel();
	    for (int i = 0; i < liste.getModel().getSize(); i++) {
	    	final Object object = liste.getSelectedValue();
	    	assertTrue("La liste est une seule liste.", liste.isSelectedIndex(i));
	    	assertEquals("La liste est une seule liste.", Formation.nom(object), liste.getSelectedIndex());
	    }
	    c.nextBouton();
	    c.validate();
}
}
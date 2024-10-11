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
	 * Test pour la lecture de la liste des identites de participation au forme pour les entours
	 */
	@Test
	public void lectureIdEntours_listeIdentitesEntours() {
		FenetrePrincipale f = new FenetrePrincipale();
		
		final ArrayList<Entours> en = new ArrayList<>();
		
		f.entrees = en;
		f.identites = new HashMap<>();
		
		// initilise la liste des identites de participation au forme pour les entours
		Identite[] in = new Identite[3];
		in[0] = new Identite("ident2");
		in[1] = new Identite("ident1");
		in[2] = new Identite("ident3");
		
		Candidat[] in_liste = new Candidat[3];
		in_liste[0] = in[0];
		in_liste[1] = in[1];
		in_liste[2] = in[2];
		
		Candidat c = new Candidat("ident1");
		in_liste[0].add_identite(c);
		in_liste[1].add_identite(c);
		in_liste[2].add_identite(c);
		
		for(int i = 0; i < in.length; i++) {
			c = in[i];

			// id1
			if (i == 0) {
				in_liste[0] = c;
			}
			else {
				assertNotSame(c, in_liste[0], in[i-1]);
				assertEquals("ident1", in_liste[0].get_identifier());
			}
			// id2
			if (i == 1) {
				in_liste[1] = c;
			}
			else {
				assertNotSame(c, in_liste[1], in[i-1]);
				assertEquals("ident2", in_liste[1].get_identifier());
			}
			// id3
			if (i == 2) {
				in_liste[2] = c;
			}
			else {
				assertNotSame(c, in_liste[2], in[i-1]);
				assertEquals("ident3", in_liste[2].get_identifier());
			}
			
			en.add(c);
			
			// ident3
			if (i == 0) {
				in_liste[0] = c;
			}
			else if (i == 1) {
				in_liste[2] = c;
			}
			else {
				assertNotSame(c, in_liste[1], in[i-1]);
				assertEquals("ident3", in_liste[1].get_identifier());
			}
			
		}

		f.identites = in_liste;
		f.niveau = Controler.getSessionController().getNiveau().get_id();
		
		Candidat p = new Candidat("ident3");
		
		assertTrue(f.checkNiveau("de", p));
		assertFalse(f.checkNiveau("un ", p));	
	}

	/**
	 * Test pour la lecture des identites des identites pour l'identite de
	 * cet identitio
	 */
	@Test
	public void leNiveau() {
		try {
			JFrame window = new FenetrePrincipale_1Test();
			window.setSize(500, 500);
			window.setVisible(true);
			window.setVisible(false);
			window.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Candidat p = new Candidat("ident3");
		assertTrue(window.isNiveau("de"));
		
		ListSelectionModel lsm = window.getListSelectionModel();
		lsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		assertNotSame(p, window.getIdAt(1), window.getIdAt(2));
}
}
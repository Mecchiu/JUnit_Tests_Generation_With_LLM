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
		final static String testDate = "08-04-2009";
		
		FenetrePrincipale_0Test() {
				TestConfiguration();
		}
		
		@Test public void dateLimForm_F(){
			dateLimForm();
		}
		
		@Test public void dateLimForm_I(){
			Identite identite = new Identite();
			identite.setNom("test");
			Controler.getInstance().identitSetup(identite);
			Controler.getInstance().doNotSave(identite);

			ListSelectionModel listeSelectionModel = listeListe.getSelectionModel();
			listeSelectionModel.setValue(new int[0]);
			listeSelectionModel.addListSelectionListener(this);
			listeListe.setListSelectionModel(listeSelectionModel);
			listeListe.setSelectedIndex(0);
			
			Identite identiteSelected = listeListe.getSelectionModel().getSelectedItem();
			assertNotNull(identiteSelected);
			Identite identiteSelected2 = Controler.getInstance().identitSelection.get(identiteSelected.getIdentite()).getIdentite();
			assertNull(identiteSelected2);
		}

		@Test public void setName() {
			String[] noms = new String[0];
			Controler.getInstance().identitSetup(new Identite());

}
}
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
		 * test d'une test de date de naissance
		 */
		void testDateDeNaiss() {
			final DateNomFormation deNomFormation = new DateNomFormation();

					ListSelectionModel listSelectionModel = deNomFormation.listSelectionModel();
					listSelectionModel.addListSelectionListener(deNomFormation);
					deNomFormation.listSelectionModelChanged();
			final JTextArea textArea = deNomFormation.getTextArea();
			deNomFormation.textAreaChanged();
		}

		/**
		 * test au constructeur d'une liste des choix des formationes sélectionnable
		 *
		 * @throws IndexOutOfBoundsException le choix de formation n'est pas où il est le précédent
		 */
		void testListChoix() {
			final ListSelectionModel listSelectionModel = FenetrePrincipale.this.listSelectionModel();
			final JTable table;

			/**
             * On ajoute le premier choix du formulaire
             */
			final JButton btPrevious = FenetrePrincipale.this.btnPrevious.getButton();

			final JButton btnAddFormation = FenetrePrincipale.this.btnAddFormation.getButton();
			final JPanel panelAjoutement = FenetrePrincipale.this.panelAjoutement.getPanel();

			btsetListChoixChoixFormsSelective();
			table = FenetrePrincipale.this.listFormations.table();

			listSelectionModel.addListSelectionListener(new Formation(table));

			/**
             * On modifie le button
             */
}
}
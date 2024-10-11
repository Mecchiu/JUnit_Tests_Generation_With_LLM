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
/**
		* test method for {@link FenetrePrincipale#compteDistantesDeFormation(int)}.
		* Tests {@link FenetrePrincipale#compteDistantesDeFormation(int)</code> method in
		* {@link FenetrePrincipale} class
		*/
		@Test
		public void testFnCompteDistantesDeFormation4() {
				// Arrange
				ListSelectionModel ssm = listJourJour.getSelectionModel();
				ListSelectionModel ssm2 = listMois.getSelectionModel();
				ListSelectionModel ssm3 = listAnnee.getSelectionModel();
				ListSelectionModel ssm4 = listFormation.getSelectionModel();
				int nbDeFormations = 2;
				ListSelectionModel ssm11 = listFormation.getSelectionModel();
				int nbDeFormations2 = 2;

				// Act
				FenetrePrincipale_0.compteDistantesDeFormation(nbDeFormations);
				FenetrePrincipale_0.compteDistantesDeFormation(nbDeFormations2);

				// Assert
				assertEquals("wrong selection count", 3, ssm.getSelectedIndex());
				assertEquals("wrong selection count", 3, ssm2.getSelectedIndex());
				assertEquals("wrong selection count", 3, ssm3.getSelectedIndex());
				assertEquals("wrong selection count", 4, ssm4.getSelectedIndex());
				assertEquals("wrong selection count", nbDeFormations, listJourJour.getSelectedIndex());
				assertEquals("wrong selection count", nbDeFormations2, listMois.getSelectedIndex());
				assertEquals("wrong selection count", nbDeFormations, listAnnee.getSelectedIndex());
				assertEquals("wrong selection count", nbDeFormations2, listFormation.getSelectedIndex());
		}

		/**
		*  unit tests for {@link FenetrePrincipale_0#compteDistantesDeFormation(int)}{@code 
		*  @}
		*/
				@Test
				public void testCalculToutesSosFormationNonAjout() {
						// Arrange
						Calendar firstCalender = Calendar.getInstance();
						firstCalender.set(2000, Calendar.JANUARY, 1);
						Calendar secondCalender = Calendar.getInstance();
						secondCalender.set(1980, Calendar.JANUARY, 1);
						// Act
						FenetrePrincipale_0.compteDistantesDeFormation(2);

						// Assert
						// Le calcul seul n'est pas fait
						assertEquals("wrong selection count", 5, listFormation.getSelectedIndex());
				}

		/**
		* unit tests for {@link FenetrePrincipale_0#compteDistantesDeFormation(int)}{@code > 
		* @}
		*/
				@Test
				public void testCalculToutesSosFormationAjout() {
					// Arrange
					ListSelectionModel ls = listJour.getSelectionModel();
					int index = ls.getSelectedIndex();
					calculToutesForm(Calendar.getInstance().getTime(), nbFormation, 5 - index);
					assertEquals(calculNbFormations(nbFormation), 0);
				}

		/**
		* unit tests for {@link FenetrePrincipale_0#compteDistantesDeFormation(int)}{@code > 
		* 
		* @}
		*/
				@Test
				public void testCalculToutesSosFormationAjout2() {
					Calendar firstCalender = Calendar.getInstance();
					firstCalender.set(2015, Calendar.JANUARY, 1);
					Calendar secondCalender = Calendar.getInstance();
					secondCal
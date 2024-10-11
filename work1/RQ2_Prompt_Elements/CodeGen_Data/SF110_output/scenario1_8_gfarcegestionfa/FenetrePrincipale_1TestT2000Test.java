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

  @SuppressWarnings("static-method")
  @Test
  void test() {
	  // creation de la requete
	  new Controler();
		
	  // recherche des données légales
	  Candidat c = Controler.test().get();
		
	  // recherche des données légales en fait
	  Identite[] p = Controler.test().getIdentite();
					
		
	  /************************** DANNE DU PARTICULIER ************************/
		
//		{
//			String valeur = "<html><head/><body><p>CASTE DE LA POURMEMENT</p><p><strong>1</strong><br>DANNE DU PARTICULIER</p></body></html>".replaceAll("<", "").replaceAll(">", "");
//			ValeurFormation.formation(valeur);
//		}
//
//		{
//			String valeur = "<html><head/><body><p>POURMEMENT UN CONSEQUANTE</p><p><strong>1</strong><br>DANNE DU PARTICULIER</p></body></html>".replaceAll("<", "").replaceAll(">", "");
//			ValeurFormation.formation(valeur);
//		}
//
//		{
//			String valeur  = "<html><head/><body><p>POURMEMENT UN CONSEQUANTE</p><p><strong>1</strong><br>PAS DE DANNE DU PARTICULIER</p></body></html>".replaceAll("<", "").replaceAll(">", "");
//			ValeurFormation.formation(valeur);
//                        
//		}
//
//		{
//			String valeur  = "<html><head/><body><p>POURMEMENT UN CONSEQUANTE</p><p><strong>1</strong><br>PAS DE DANNE DU PARTICULIER</p></body></html>".replaceAll("<", "").replaceAll(">", "");
//            String vaule  = "<html><head/><body><p>POURMEMENT UN CONSEQUANTE</p><p><strong>1</strong><br>PAS DE DANNE DU PARTICULIER</p></body></html>".replaceAll("<", "").replaceAll(">", "");
//            assertNotNull(vaule);		
//        }
		
		System.out.println("test()");
	  
	  /************************** PARTICULIER ************************/
		
//		{
//			Date d = Controler.test().get().getDataset();
//            String s = Controler.test().get().getFormationP().getFormation().get(d.getDayOfWeek()).getFormationNo();
//			assertEquals(Voucher.TYPE_VOUS_FENOTRESPONSE, new ResponseFormation().formation(s)   );
//		}
//
//		{
//			Date d = Controler.test().get().getDataset();
//            String s = Controler.test().get().getAnneeD();
//			assertEquals(Voucher.TYPE_GALLON_FENOTRESPONSE, new Formation().formation(s));
//			assertTrue("formationNombre() = " + Formation.formationNombre() + ", not " + new Formation().formationNombre(), Formation.formationNombre().equals(s));
//		}
	  
	  {
	    Date d = Controler.test().get().getDataset();
	    Date d1;
	    try {
	      d1 = d.getDayOfWeek() == Calendar.MONDAY? d : Controler.test().get().getAnneeD();
	    } catch (Exception p) {
		  fail("Aucun jour d'année nécessaire");	    
	    }
		{
			String valeur = "<
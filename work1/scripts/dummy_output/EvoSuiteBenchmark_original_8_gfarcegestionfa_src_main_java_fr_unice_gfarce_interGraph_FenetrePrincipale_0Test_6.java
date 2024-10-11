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
     * Définition des variables de la fenetre principale
     */
     public FenetrePrincipale_0Test() {
    	  Controler.setImageIconInPane("FenettrePrincipale");
         this.setTitle("FenetrePrincipale Test");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(100, 100, 450, 300);
         this.setLocationRelativeTo(null);
         JMenuBar mb = new JMenuBar();
         JMenu mnuFenetreFiltrer = new JMenu("Filtrer");
         
         JMenu mnuCentre = new JMenu("Centre");
         JMenuItem mnuCentreAide = new JMenuItem("Aide");
         mnuCentre.add(mnuCentreAide);
         mnuCentre.setIcon(new ImageIcon("FenetrePrincipale_0.png"));
         mnuCentreAide.addActionListener(new ActionAdapter()
         {
             public void actionPerformed(ActionEvent ignored) 
             {
                try {
                       String data = controler.creDeChampPourAide()
                                     .genererFormationDepuisAnnee(Identite.getCurrent().getId());
                       controleur.ajouterFormation(data, null, formateurId);
                       
                       JTextArea textAreaCentre = new JTextArea(Formation.getFormationCentre(data));
                       textAreaCentre.setMargin(new Insets(0,5,0,5));
                       textAreaCentre.setVisible(true);
                       mbr.add(textAreaCentre);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            
            }
         });
         mnuCentreAide.setEnabled(false);
         mnuCentre.add(mnuCentreAide);
         mnuCentreAide.setIcon(new ImageIcon("FenetrePrincipale_0Centre.png"));
         mnuCentreAide.addActionListener(new ActionAdapter()
         {
             public void actionPerformed(ActionEvent e) 
             {
                String data = controler.creDeChampPourAide()
                                     .genererFormationDepuisAnnee(Formation.getFenetreCentro());
                FenetrePrincipale_0.creerFormation(data, identite, controler.getIdAnnee(),
                        identite.getIdPersonnalite(), formulerId);
             }
         });
         
         mnuFenetreFiltrer.add(mnuCentre).add(mnuFenetreFiltrer);
         mnuFenetreFiltrer.setVerticalAlignment(JComponent.CENTER);
         mnuFenetreFiltrer.pack();
         mnuFenetreFiltrer.setAlignmentX(0.00333333333);
         mnuFenetreFiltrer.setAlignmentY(0.0066666667);
         mnuFenetreFiltrer.setOpaque(false);
         mnuFenetreFiltrer.setBounds(280, 350, 450, 300);
         mnuFenetreFiltrer.setLocationRelativeTo(null);  //to not be displayed yet
         mbr.add(mnuFenetreFiltrer);
         this.add(mbr);
     }
    
	 
  /**
     * Test of createFenetreJeu method, of class FenetrePrincipale.
     */
    @Test
		public void testCreateFenetreJeuEmpty()
		{
			JFrame frame;
			Identite identite;
			String data;
			FenetrePrincipale instance1;
			FenetrePrincipale instance2;
			
			//test
			instance1 = new FenetrePrincipale();
			instance2 = new FenetrePrincipale(new JTextField(""));
			//test if the instance are not equal.
			assertTrue("Not equal.", instance1!= instance2);
			
			//test
}
}
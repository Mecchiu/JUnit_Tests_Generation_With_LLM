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

	public FenetrePrincipale_0Test() {
		//Initialisation
        java.awt.EventQueue.invokeLater( () -> {
            //Create and set up frame
            JFrame frame = new FenetrePrincipale();
            frame.setVisible(true);
        });   
    }
	/**
	 * Test of function setDateLimForm
	 * @throws Exception
	*/
	@Test
    void testDataMoyenne() throws Exception {
        FenetrePrincipale_0Test testObj = this;
        FenetrePrincipale.setDateLimForm(calqueJour, calqueMois, calqueAnnee, testObj);
    }

    /**
	 * Test of function setDateLimForm
	 * @throws Exception
	*/
	@Test
    void test01() throws Exception {
	    Controler.getCurrentController().run(new Runnable(){
	        public void run() {
	            JFrame frame = new FenetrePrincipale(calqueJour, calqueMois, calqueAnnee);
	            frame.setVisible(true);
	        }
	    });
    }
	/**
	 * Test of function setDateLimForm
	 * @throws Exception
	*/
	@Test
    void test02() throws Exception {
	    Controler.getCurrentController().run(new Runnable(){
	        public void run() {
	            JFrame frame = new FenetrePrincipale(calqueJour, calqueMois, calqueAnnee);
	            frame.setVisible(true);
	        }
	    });
    }
	/**
	 * Test of function setDateLimForm
	 * @throws Exception
	*/
	@Test
    void test03() throws Exception {
	    Controler.getCurrentController().run(new Runnable(){
	        public void run() {
	            JFrame frame = new FenetrePrincipale(calqueJour, calqueMois, calqueAnnee);
	            frame.setVisible(true);
	        }
	    });
    }

    /**
	 * Test of function setDateLimForm
	 * @throws Exception
	*/
	@Test
    void test04() throws Exception {
	    Controler.getCurrentController().run(new Runnable(){
	        public void run() {
	            double result = 0.0;

	            //Calcul du calcul : par rapport à le calque déjà calculée
	            double calcul = (calqueJour * calqueMois) + calqueAnnee;
	            if(calcul > 0.0)
	            {
	                result = calcul;
	            }
	            else
	            {
	                result = calcul;
	            }
	            //Calcul du déjà calculé
	            double resultTemp = 0.0;
	            //Calcul du déjà calculé : par rapport à l'annee déjà calculée
                calqueAnnee = (Long)Calendar.getInstance().clone();
                calqueAnnee.add(Calendar.MONTH, -1);

                calqueMois = (Long)Calendar.getInstance().clone();
                calqueMois.add(Calendar.MONTH, -1);
                calqueAnnee.set(Calendar.YEAR, calqueAnnee.get(Calendar.YEAR));
                calqueMois.set(Calendar.MONTH, calqueMois.get(Calendar.MONTH));
                calqueMois.set(Calendar.DATE, calqueMois.get(Calendar.DATE));
                calqueMois.add(Calendar.DATE, 1);        

                resultTemp = resultTemp;
                calqueMois.set(Calendar.YEAR, calqueMois.get(Calendar.YEAR));
                resultTemp = resultTemp;
                calqueMois.set(Calendar.YEAR, calqueMois.get(Calendar.YEAR));
                resultTemp = resultTemp;
                calqueMois.set(Calendar.YEAR, calqueMois.get(Calendar
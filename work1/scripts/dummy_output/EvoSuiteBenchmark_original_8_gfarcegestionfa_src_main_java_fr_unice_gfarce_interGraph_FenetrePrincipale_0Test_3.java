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
		 * create a FenetrePrincipale object with a default date lim form
		 */
		private FenetrePrincipale instance;
		/**
		 * create a FenetrePrincipale object with a set date lim form
		 */
		public FenetrePrincipale_0Test() throws Exception {
			super();
			instance = new FenetrePrincipale();
		}
        /**
        * Constructor
        */
        @Test
		public void constructeurDeTester(){
			//constructeur
			instance.constructeurFormation();
		}
	/**
    * Methode de classe Controler.
	* @return  Void
	*/
	@Test
	public void classeControleur(){
		//case init
				final Controler controleur = new Controler();
				//execution
				controleur.init();
				//fertig
				controleur.validation();
		}

	/**
	* Methode de classe controler.
	*/
	@Test
	public void classeControleur(){
		//execution
		final Controler controler = new Controler();
		//fertig
		controleur.validation();
	}
	/**
	* Methode de classe controler.
	*/
	@Test
    public void classeControleur(){
		//execution
		final Controler controleur = new Controler();
		controleur.init();
		controleur.validation();
    }

}
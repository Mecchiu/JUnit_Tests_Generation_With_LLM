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
	 * Définition de la fonctiones classe principale dans le cas ou sinon.
	 */
    static class ActionListenerTest extends ActionListener {
	/**
	 * Classe principale de l'appel de l'action de la fonction.
	 */
	ActionListener a;
        /**
         * Construit un nouveau {@link ActionListenerTest} avec un {@link ActionListener} à partir de
         * {@link ActionListener#actionPerformed(ActionEvent)}.
         */
        static FenetrePrincipale_1Test ac(ActionListener a) {
	    // TODO Auto-generated constructor stub
      FenetrePrincipale_1Test obj;
      obj = new FenetrePrincipale_1Test(a);
      obj.addActionListener(a);
      return obj;
	}
  public FenetrePrincipale_1Test(ActionListener a) {
      this.a = a;
  }
	/**
	 * Définition de la fonction de dateDeNaiss() sans paramètre.
	 */
    public void actionPerformed(ActionEvent e) {
		a.actionPerformed(e);
	}
	/**
	 * Définition de la fonction de l'identité de l'interphace graphique.
	 */
    public void run() {
		a.run();
	}
	}
}
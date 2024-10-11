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
         * Test Method
         * @param args JUnit argument list
         */
        public static void main(String args[]) {
            JFrame frame = new FenetrePrincipale_1Test();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setSize(600, 400);
        }

		public FenetrePrincipal_1Test() {
			super("testFenérePrincipal_1::dateDeNaiss()");
		}

		/**
         * Test
         * {@link FenetrePrincipale#dateDeNaiss()}
         */
        @Test
        public void testDateDeNaiss () {
            DateDeNaiss dnd = new DateDeNaiss();
            if (!dnd.estaDateDeNaiss()) {
                System.out.println("Date de naissance incorrect");
                fail("Date De Naissance incorrect");
                return;
            }
            boolean b = new DateDeNaiss().estaDateDeNaiss();
            if (!b) {
                System.out.println("Date de naissance incorrect");
                fail("Date de naissance incorrect");
                return;
            }
		}




		/**
         * Test
         * {@link FenetrePrincipale#equals()}
         */
        @Test
        public void testEquals () {
            String s;
            s = "\3*\1*\5*\3*\6*\4\3*\2\11\4\6\5";
            boolean b = FenetrePrincipale_1Test.equals(s, "1");
            boolean b2 = FenetrePrincipale_1Test.equals(s, "1*");
            b = FenetrePrincipale_1Test.equals(s, "2");
            b2 = FenetrePrincipale_1Test.equals(s, "2*");
            b = FenetrePrincipale_1Test.equals(s, "3");
            b2 = FenetrePrincipale_1Test.equals(s, "3*");
            b = FenetrePrincipale_1Test.equals(s, "5");
            b2 = FenetrePrincipale_1Test.equals(s, "5*");
            b = FenetrePrincipale_1Test.equals(s, "NON");
            b2 = FenetrePrincipale_1Test.equals(s, "NON*");
            b = FenetrePrincipale_1Test.equals(s, "Ou");
            b2 = FenetrePrincipale_1Test.equals(s, "Ou*");
            b = FenetrePrincipale_1Test.equals(s, "Ie");
            b2 = FenetrePrincipale_1Test.equals(s, "Ie*");
            b = FenetrePrincipale_1Test.equals(s, "Ie*");
            b2 = FenetrePrincipale_1Test.equals(s, "Ie*");
        }

		/**
         * Test
         * {@link FenetrePrincipale#comparable()}
         */
        @Test
        public void testComparable () {
            String s;
            s = "\3*\1*\5*\3*\6*\4\3*\2\11\7\0\1\7\7\7\7\7\7\5\7\5\7\5\5\6\6\5\6";
            boolean b = FenetrePrincipale_1Test.comparable(s);
            System.out.println("b");
            System.out.println(b);
        }



}

class DateDeNaiss {	// class FenetrePrincipale_1Test 

	/**
     * Returns the date de naissance.
     */
	public static String dateDeNaiss() {
}
}
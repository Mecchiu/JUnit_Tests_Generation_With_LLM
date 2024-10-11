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
		* @return a new FenetrePrincipale object, with a JFrame on it.
		* If you want to start the program, construct a FenetrePrincipale object using the constructor.
		*/
	public static FenetrePrincipale frame() {
		final FenetrePrincipale FenetrePrincipale = new FenetrePrincipale();
		FenetrePrincipale.addButtons(FenetrePrincipale.addChoice("Add a selection"), FenetrePrincipale.addChoice("Add an other selection"));
        	FenetrePrincipale.addButton("Cancel");
        	FenetrePrincipale.addButton("Cancel");
        	return FenetrePrincipale;
		}
		/**
		 * Test method for {@link fr.unice.gfarce.interGraph.FenetrePrincipale#FenetrePrincipale(java.awt.Container)}.
		 */
	@Test
	public void testFenetrePrincipale() {
		FenetrePrincipale.testFenetrePrincipale(null);
	}
	
	@Test
    public void testDateDeNaiss() {
		assertEquals("No des évaluation dépenses ou l’impulsion", 0, frame().dateDeNaiss());
	}
	
}

class FenetrePrincipale_2Test {
	/**
	 * This method calls the {@link FenetrePrincipale_1Test#testDateDeNaiss()} method.
	 */
    @Test
    public void testDateDeNaiss() {
    	FenetrePrincipale_1Test.testDateDeNaiss();
    }

	/**
	 * This method calls the {@link FenetrePrincipale_1Test#addButton(java.lang.String)} method.
	 */
    public void addButton(String name) {
		FenetrePrincipale_1Test F = new FenetrePrincipale_1Test();
		F.addButton(name);
	}

	/**
	 * This method calls the {@link FenetrePrincipale_1Test#addCheckBox(String)} method.
	 */
    public void addCheckBox(String name) {
		FenetrePrincipale_1Test F = new FenetrePrincipale_1Test();
		F.addCheckBox(name);
	}
	
	/**
	 * This method calls the {@link FenetrePrincipale_1Test#addChoice(fr.unice.gfarce.Identite, java.lang.String)} method.
	 */
    public void addChoice(Identite name, String option) {
		FenetrePrincipale_1Test F = new FenetrePrincipale_1Test();
		F.addChoice(name, option);
	}
	
	/**
	 * This method calls the {@link FenetrePrincipale_1Test#addChoice(Identite, fr.unice.gfarce.Formation)} method.
	 */
    public void addChoice(Formation name, Formation type) {
		FenetrePrincipale_1Test F = new FenetrePrincipale_1Test();
		F.addChoice(name, type);
	}
	
	/**
	 * This method calls the {@link FenetrePrincipale_1Test#addButton("Add new selection")} method.
	 */
    public void addButton() {
		FenetrePrincipale_1Test F = new FenetrePrincipale_1Test();
		F.addButton("Add new selection");
	}

	/**
	 * This method calls the {@link FenetrePrincipale_1Test#addChoice((fr.unice.gfarce.formation.Formation, java.lang.String))} method.
	 */
	
	@Test 
	public void addChoice_2() {
		FenetrePrincipale_1Test F = new FenetrePrincipale_1Test();
//		assertEquals("Add selected formation", "Formation", F.addChoice(new Formation("Formation", 0)));
	}	

}
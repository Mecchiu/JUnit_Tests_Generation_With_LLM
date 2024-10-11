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
	 * Test method for {@link FenetrePrincipale#dateLimForm()}.
	 * <br>Test method of {@link FenetrePrincipale#FenetrePrincipale(JFrame)}</br>
	 * for constructor having JFrame parent.
	 */

    @Test
    public void testSaisirFormation() {
        final FenetrePrincipale panelPrincipale = new FenetrePrincipale();
        final DateLimFormation form = panelPrincipale.getDateLimForm();

        // Test de la construction de la classe
        assertTrue(panelPrincipale instanceof FenetrePrincipale);
        panelPrincipale.setDateLimForm();
        assertEquals(form.getFormation().getDateLimForm(), form.getFormation());
    }

    @Test
    public void testComClickOnTabPropriétaire() {
        final FenetrePrincipale panelMaster = new FenetrePrincipale();

        // Afficher la forme courante sur le panneau
        panelMaster.setVisible(true);
        panelMaster.displayAll();

        // Assure que tous les boutons a été créés
        assertNotNull(panelMaster.getJButtonPropriete().getActionListeners());
    }

    /**
     * Crée un composant depuis une liste de variables de l'application de la forme.
     * <br>Test method of {@link FenetrePrincipale#FenetrePrincipale()}</br>
     * for creation of element.
     */

    @Test
    public void testCreerComposant() {

        // Afficher la forme courante sur le panneau
        final FenetrePrincipale panelMaster = new FenetrePrincipale();
        final JTabbedPane paneMaster = panelMaster.getJTabbedPane();

        // Afficher l'element à afficher qui sera creat
        final JComponent compMonForm = panelMaster.getJTabbedPane();

        // Créer le composant à partir de la balise de couleur
        final JPanel panelResult = new FenetrePrincipale_0_1().creerComposant(compMonForm);

        // Assure que la liste de variables est récupéré
        assertNotNull(panelMaster.getVariables().getListTable());
        assertNotNull(panelResult.getComponents());

        // Assure que la balise écrite
        assertNotNull(panelMaster.getVariables().getColorTreeTable());
        assertNotNull(panelMaster.getVariables().getColorTreeTable().getComponents());
    }

    @Test
    public void testDersObjet() {
        final FenetrePrincipale panelMaster = new FenetrePrincipale();
        final JTabbedPane paneMaster = panelMaster.getJTabbedPane();

        // Afficher l'element à afficher qui sera déserté à se déplacer
        final JComboBox comboBoxMaster = panelMaster.getJComboBoxAfficherObjet();
        assertEquals(2, comboBoxMaster.getItemCount());

    }

    @Test
    public void testVetNonFicher() {
        final FenetrePrincipale panelMaster = new FenetrePrincipale();

       // Afficher la forme courante sur le panneau
        panelMaster.setVisible(false);
        assertFalse(panelMaster.isVisible());

        // Assure que le nouveau forme est retourné
        final Formation formMaster = panelMaster.getFormation();
        assertFalse(formMaster.isAffichereTable());
    }

    /**
     * Détruit un bouton sur le panneau et donne un table au titre et
     * l'affichement dans le tableau.
     */

    @Test
    public void testDettourBoutonArmed() {
        final FenetrePrincipale panelMaster = new FenetrePrincipale();

        // Assure qu'un bouton sur le panneau sera détruit avec une échéance d'affichage
}
}
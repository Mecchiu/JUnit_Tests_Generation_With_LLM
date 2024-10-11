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
     * Test of getSelectedFormation method, of class FenetrePrincipale.
     */
    @Test
    public void testGetSelectedFormation_01() {
        JFrame frame_1 = new FenetrePrincipale();
        JFrame frame_2 = new FenetrePrincipale_1Test();
        String testName;
        int testNumber;

        Identite applicant;
        RespFormation formation;

        candidat_c.prepare();
        Formation forma = candidat_c.getSelectedFormation();
        forma_c.prepare();

        Formation forma2 = candidat_c.getSelectedFormation();
        forma_c2.prepare();

        //Test cases
        testNumber = 0;
        testName = "test1";
        candidat_c.setIdentite(applicant);
        forma = candidat_c.getSelectedFormation();
        candidat_c.setFormation(forma);
        forma2 = candidat_c.getSelectedFormation();
        candidat_c2.setIdentite(applicant);

        //set
        candidat_c.reset();
        candidat_c2.reset();
        forma = candidat_c.getSelectedFormation();
        forma_c.setFormation(forma);
        forma2 = candidat_c.getSelectedFormation();
        candidat_c2.setFormation(forma_c);

        //get
        candidat_c.reset();
        candidat_c2.reset();
        forma = candidat_c.getSelectedFormation();
        forma_c.setFormation(forma);
        forma2 = candidat_c.getSelectedFormation();
        candidat_c2.setFormation(forma_c);

        //retour
        assertEquals(candidat_c_s, applicant);
        assertEquals(candidat_c2_s, applicant);
        assertEquals(forma2_s, applicant);

        candidat_c2.reset();
        forma2_s = forma;
        forma2.reset();
        forma.reset();

        frame_1.dispose();
        frame_2.dispose();
    }

            @Test
    public void testGetSelectedFormation_02() {
        JFrame frame_1 = new FenetrePrincipale();
        JFrame frame_2 = new FenetrePrincipale_1Test();

        Identite applicant;

        Candidat candidat = candidat_c;
        int testNumber;

        respFormation forma;

        candidat.prepare();

        Candidat candidat2;

        forma = candidat.getFormation();
        candidat2 = candidat_c2;

        candidat2.prepare();

        String testName = "test1";

        candidat_c.setIdentite(applicant);

        forma = candidat_c.getSelectedFormation();

        candidat_c.setIdentite(applicant);

        String testName2 = "test1";

        candidat_c2.reset();
        forma_c.reset();
        candidat_c2.setFormation(forma_c);

        candidat_c2.prepare();

        candidat_c2.setIdentite(applicant);
        forma_c2.reset();
        forma_c2.prepare();

        candidat_c2.setIdentite(applicant);

        candidat_c.setFormation(forma_c2);
        forma_c2.setFormation(forma_c);

        candidat_c2.setFormation(forma_c);

        frame_2.setVisible(true);
        candidat_c2.setIdentite(applic
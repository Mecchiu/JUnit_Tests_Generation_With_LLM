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
     * Test of initialisation method.
     */
    @Test
    void testerInitialisation() {
        System.out.println("testerInitialisation");
        FenetrePrincipale _frame = new FenetrePrincipale();
        JTable table = (JTable)_frame.getJToolBar().getJComponentAt(0);
        assertNotNull("Actualiser le tableau", table);
    }
    
    /**
     * Test of initialisation Method with Formation.
     * This method shall throw an AssertionError.
     */
    @Test(expected = AssertionError.class)
    void testerInitialisationWithFormation() throws AssertionError {
        System.err.println("testerInitialisiation");
        FenetrePrincipale _frame = new FenetrePrincipale();
        Formation _formation = new Formation();
        try {
            assertNotNull("Actualiser le formulaire", _formation);
            _frame.getJToolBar().getJComponentAt(0).setFormation(_formation);
        } catch (Exception e) {
            // Expected
        }
    }

    /**
     * Test of initialisation and finalisation Method.
     */
    @Test
    void testerAndFinalisiationMethod() throws Exception {
        System.out.println("testerAndFinalisiationMethod");
        JFrame _frame = new JFrame();
        FenetrePrincipale _objeto = new FenetrePrincipale();
        _frame.add(_objeto);
        assertNotNull("Actualiser le frame", _frame);
        final boolean _sans = false;

        String _s = "jLabel";
        JLabel _lbl = new JLabel(_s);
        _lbl.setPreferredSize(new Dimension(40,30));
        _lbl.setIcon(_s);
        _lbl.setToolTipText("Tous les chemins doivent être utilisées par les lignes");
        JCheckBox _cb = new JCheckBox(true);
        _cb.setToolTipText("Finchier");
        _cb.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                _lbl.setEnabled(!_cb.isSelected());
            }
            
        });

        JPanel panel = new JPanel();
        ButtonTabController _tc = new ButtonTabController();
        JButton _b;
        _b = new JButton("Effacer");
        _b.addActionListener(_tc);
        _b.setEnabled(_sans);
        _b.setToolTipText("Saut de l'affichage");
        _b.setFocusPainted(false);
        JButton _a;
        _a = new JButton("Afficher");
        _a.addActionListener(_tc);
        _a.setEnabled(_sans);
        _a.setToolTipText("Au flottier");
        _a.setFocusPainted(false);
        _a.setEnabled(false);
        panel.setLayout(_b);
        panel.add(_lbl);
        panel.add(_cb);
        panel.add(_a);

        panel.setAlignmentX(0.5f);
        panel.validate();
    }

    public static class ButtonTabController implements ItemListener {

        final private FenetrePrincipale _fenetre;
        private int _i;

        public ButtonTabController(FenetrePrincipale _fenetre) {
            this._fenetre = _fenetre;
            _i = 0;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if ((e.getStateChange() == ItemEvent.SELECTED)) {
                assertTrue("Une case de selectionnée à être remplie", _fenetre.getJToolBar().getJComponentAt(e.getIndex()).isEnabled());
                _i = e.getIndex();
            }
        }

        public void setTabFrenet(_int n) {
            _i = n;
        }

        public int getTabFrenet() {
            return _i;
        }
    }

}
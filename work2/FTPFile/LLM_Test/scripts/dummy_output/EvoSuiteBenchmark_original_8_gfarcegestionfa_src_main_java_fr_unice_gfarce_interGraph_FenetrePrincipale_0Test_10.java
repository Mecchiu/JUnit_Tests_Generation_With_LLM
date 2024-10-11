
package fr.unice.gfarce.interGraph;
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
class FenetrePrincipale_0Test {
   @Test
    public void dateLimForm() {
         final DateFormatDate dateLim = new DateFormatDate(DateFormatType.DATE,null,Calendar.getInstance());
         Integer ld1 = new Integer(10);
         Integer ld2 = new Integer(11);
         Integer ed1 = new Integer(8);
         Integer ed2 = new Integer(8);
         Integer ed3 = new Integer(11);
         String name = "name";
         String date1 = dateLim.format(Calendar.getInstance());
         String date2 = dateLim.format(Calendar.getInstance());
         String date3 = dateLim.format(Calendar.getInstance());
         String date4 = dateLim.format(Calendar.getInstance());
         String date5 = dateLim.format(Calendar.getInstance());
         String date6 = dateLim.format(Calendar.getInstance());
         String date7 = dateLim.format(Calendar.getInstance());
         String date8 = dateLim.format(Calendar.getInstance());
         String date9 = dateLim.format(Calendar.getInstance());
         String form1 = new Formation(ld1, ed1, ed2, ed3, name, date1);
         String form2 = new Formation(ld2, ed1, ed2, ed3, name, date2);
         String form3 = new Formation(ld2, ed1, ed2, ed3, name, date2);
         String form4 = new Formation(ld2, ed1, ed2, ed3, name, date3);
         String form5 = new Formation(ld2, ed1, ed2, ed3, name, date4);
         String form6 = new Formation(ld2, ed1, ed2, ed3, name, date5);
         String form7 = new Formation(ld2, ed1, ed2, ed3, name, date6);
         String form8 = new Formation(ld2, ed1, ed2, ed3, name, date7);
         String form9 = new Formation(ld2, ed1, ed2, ed3, name, date8);
         FenetrePrincipale_0Test.FenetrePrincipaleTest tester = new FenetrePrincipale_0Test();
         tester.setTitle("TEST");
         tester.test();
         tester.pass();
    }
}
class FenetrePrincipale extends JFrame {
    private static final long serialVersionUID = -Long.parseLong("1828689764894489099");
    @Test
    public void onPbClickTest() {
       ListSelectionModel lsm = Formation.getListSelectionModel(this);
       ListSelectionModel lsm2 = Formation.getListSelectionModel(this);
       JButton bt = (JButton) this.getTopComponent();
     Box oo = this.getOoo();
     assertEquals(true,bt.isPressed() );
    }
}
class FenetrePrincipale_1Test {
   @Test
    public void test() {
      final JCheckBox b = new JCheckBox();
      b.setText( "TEST" );
      b.setActionCommand( "C" );
}
}
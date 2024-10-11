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
		/** Instance of {@link FenetrePrincipale#dateDeNaiss()} */
		private FenetrePrincipale fp;
		/**
		 * JMenu instance of FenetrePrincipale_1Test
		*/
		private FenetrePrincipale fpgp;

		/**
		 * Instantiate FenetrePrincipale_1Test with some data.
		*/
		public FenetrePrincipale_1Test() {
			fp = new FenetrePrincipale("Fence_0", "", dateDeNaiss());
			gp = new FenetrePrincipale("GP_0", "", "");
		}

		/**
		 * Test method for {@link fr.unice.gfarce.interGraph.FenetrePrincipale#fenceGPA()}.
		*/
		@Test
		public void testFenceGPA() {
			assertFalse(fp.fenceGPA().isVisible());
			assertFalse(gp.fenceGPA().isVisible());
		}

		/**
		 * Test method for {@link fr.unice.gfarce.interGraph.FenetrePrincipale#fenceGPA(java.lang.String)}.
		*/
		@Test
		public void testFenceGPA_String() {
			String text = "";
			assertEquals(fp.fenceGPA(text), fp);
			assertEquals(gp.fenceGPA(text), gp);
		}

		/**
		 * Test method for {@link fr.unice.gfarce.interGraph.FenetrePrincipale#fenceGPA(java.awt.Component)}.
		*/
		@Test
		public void testFenceGPA_Component() {
			JButton button = new JButton("Fence_0");
			button.addActionListener(this);
			assertEquals(button, fpgp.fenceGPA(button));
		}

		/**
		 * Test method for {@link fr.unice.gfarce.interGraph.FenetrePrincipale#actionPerformed()}.
		*/
		@Test
		public void testActionPerformed() {
			ActionListener la = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					assertEquals("button", ae.getActionCommand());
				}}}
		{
			ActionListener la = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					assertEquals("button", ae.getActionCommand());
				}};
			fp.setSelectedButton(button);
			gp.setSelectedButton(button);
			fp.actionPerformed(null);
			gp.actionPerformed(null);
		}

		/**
		 * Test method for {@link fr.unice.gfarce.interGraph.FenetrePrincipale#add(javax.swing.JPanel)}.
		*/
		@Test
		public void test_add() {
			JPanel panel = new JPanel();
			fp.add(panel);
			gp.add(panel);
			fp.setSelectedButton(button);
			gp.setSelectedButton(button);
			fp.actionPerformed(null);
			gp.actionPerformed(null);
			assertNotNull(panel);
			assertNotNull(fp);
			JTabbedPane tb = fpgp.getTabbedPane();
			assertNotNull(tb);
		}
}
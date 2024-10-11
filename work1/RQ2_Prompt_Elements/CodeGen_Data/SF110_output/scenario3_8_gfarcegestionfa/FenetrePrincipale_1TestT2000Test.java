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
public FenetrePrincipale_1Test () {
			super ("FenetrePrincipale_1Test");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(250, 200, 726, 652);
			getContentPane().setLayout(new BorderLayout());
			JPanel panel1 = new JPanel();
			getContentPane().add(panel1, BorderLayout.NORTH);
			JLabel lable = new JLabel("Date de naissance");
			lable.setForeground(Color.GREEN);
			panel1.add(lable);
			JTextField txt = new JTextField();
			txt.setText("01/01/2016");
			panel1.add(txt);
                        
                        
                        
			JPanel panel2 = new  JPanel();
			getContentPane().add(panel2, BorderLayout.CENTER);
			JTextArea txta = new  JTextArea();
			txta.setLineWrap(true);
			txta.setWrapStyleWord(true);
			txta.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
			txta.setLineWrap(true);
			txta.setWrapStyleWord(true);
                        
			JScrollPane listPane  = new  JScrollPane();
                        listPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                        listPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

			JTable table = new  JTable();
			listPane.setViewportView(table);

			panel2.add(listPane);
                        
			txt.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
                         JLabel lbl = new JLabel("");
			lbl.setForeground(Color.BLUE);
			lbl.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
			panel2.add(lbl);
                        
                        
			JButton backButton = new JButton("");
//			backButton.setFont(new Font("DejaVu Sans", Font.BOLD, 17));

			{
			backButton.addActionListener(new ActionListener()
			{
					
				public void actionPerformed(ActionEvent e)
				{
					Controler.setFocus();
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			});
			}
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			grid = new GridLayout(1, 1, 5, 5);
                        
			panel.add(panel1);
                        
			panel.add(txt);
                        
			panel.add(backButton);
			panel.add(panel2);
			JPanel panel4 = new JPanel();
                        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
                        {
                                    panel4.add(panelScrollPane);
                        }
                        JPanel panel5 = new JPanel();
                        grid = new GridLayout(1, 1,5, 5);
                        panel5.setLayout(grid);
			JPanel panel6 = new JPanel();
                        panel5.add(panel6);
                        {
                            panel6.setFocusable(false);
                        }
                        panel5.add(panelScrollPane4);
                        backButton.setEnabled(false);
                        panelContainer.add(panel);
                        panelContainer.add(panel4);
                        panelContainer.add(panel5);
                        panelContainer.add(panel6);
                        panel6.add(panelScrollPane4);
			{      
                        }
			
                        panelScrollPane.setViewportView(panelContainer);
                        panelContainer.add(panelScrollPane2);
						
                        panel6.add(panelScrollPane2);
                        panel6.add(panel6);

			panelContainer.add(panel6);
			
			{
                    final JPanel panel7 = new JPanel();
                    final JPanel panel8 = new JPanel();
                        panel7
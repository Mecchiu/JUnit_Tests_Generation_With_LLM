// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockage_0Test {
		
	@Test
	void modificationDictionnaireLigne() {
		// We define a TableStockage ajouter du TableStockage aux paramètres
		// (1) Ligne
		JTableStockage tableStockage = new JTableStockage(new String[][]{{"Vérification Vélole", "4:30 - 21"},
				{"Modification", "9:01 - 08"},
				{"Fin de la Ligne de la production","8:27 - 10"},
				{null},
				{"fin de la production.html", "8:27 - 20"},
				{null}});
		
		// We set the modifier
		TableStockage modif = new TableStockage();
		modif.setModification(new String[][]{{"Modification"}, {null}});
		
		// We assign the list of the new ListeLigne
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 1));
		
		// The list of elements are change in the table (1) and the list of elements are change in the panel
		panel.add(new ModifTableStockage.ModifTableStockageRow(0, modif));
		assertEquals("Nécess to change the modifier", modif, panel.getContentPane().getContentPane().getComponents()[0]);
		
		// We remove one of the elements (1)
		JOptionPane.showMessageDialog(null, panel);
		assertEquals("Nécess to remove", 1, tableStockage.getElementCount() - 1);
		// We insert a new ListeLigne
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 1));
		
		// We add the element in the JTable
		JPanel panel3 = new JPanel();
		panel3.add(new ModifTableStockage.ModifTableStockageRow(2, modif));
		panel3.add(new ModifTableStockage.ModifTableStockageRow(3, modif));
		panel3.add(new ModifTableStockage.ModifTableStockageRow(4, modif));
		panel3.add(new ModifTableStockage.ModifTableStockageRow(5, modif));
		panel3.add(new ModifTableStockage.ModifTableStockageRow(6, modif));
		
		// We move all elements from panel2, we add a panel to the panel3
		JPanel panel4 = new JPanel();
		panel4.add(panel3);
		panel4.add(panel2);
		
		// We assign the list of the new ListeLigne into panel
		panel4.add(new ModifTableStockage.ModifTableStockageRow(0, modif));
		assertEquals("Nécess to add element in the list", modif, panel4.getContentPane().getComponent (5));
		
		// We remove the element from the panel
		JPane pane = new JPanel();
		pane.add(panel4);
		pane.add(panel2);
		
		// We remove element in panel2 by its old position
		Component component2 = pane.getContentPane().getComponent (5);
		assertTrue("The element should have the position 1", component2.isAncestor(panel2.getContentPane().getComponent (1)));
		assertFalse("All elements, at the same position, must be removed", component2.isAncestor(panel2.getContentPane().getComponent (2)) || component2.isAncestor(panel2.getContentPane().getComponent (7)));
		pane.remove(component2);
		
		// We remove all elements and the panel in the panel2
		panel2.removeAll();
		pane.removeAll();
		panel4.removeAll();
		panel3.removeAll();
		
		// We remove all elements and panel2 by its old position
		Component component2 = pane.getContentPane().getComponent (5);
		assertTrue("The component should have the position 1", component2.isAncestor(panel2.getContentPane().getComponent (1)));
		assertFalse("All elements, at the same position, must be removed", component2.isAncestor(panel2.getContentPane().getComponent (2)) || component2.isAncestor(panel2.getContentPane().getComponent (7)));
		pane.removeAll();
		panel4.removeAll();
		pane.removeAll();
		panel3.removeAll();
		
		// This is the end
		
		// And we can check the table stockage
		JTableStockage tableStockage2 = new JTableStockage(new String[][]{{"a : 1", "0:02"}}, 1);
		assertEquals("table Stockage incorrect", 0, tableStockage2.getElementCount());
		
		// And a table Stockage ajouter
		tableStockage2.addElement("1");
		assertEquals("table Stockage incorrect", 1, tableStockage2.getElementCount());
		
		// And we set the modified
		tableStockage2.setModification(new String[][]{{"0:01 - 03"}});
		assertEquals("table Stockage incorrect", 1, tableStockage2.getElementCount());
				
		// Then we remove some element
		panel2.removeAll();
		assertEquals("table Stockage incorrect", 0, tableStockage2.getElementCount());
		
		// And we set the modified again
		tableStockage2.setModification(new String[][]{{"03:01 - 03"}});
		assertEquals("table Stockage incorrect", 1, tableStockage2.getElementCount());
				
		// And in the next test, we add some element
		tableStockage2.addElement("1");
		assertEquals("table Stockage incorrect", 1, tableStockage2.getElementCount());
		
		// And an element is inserted in the table
		assertNotNull("The table Stockage must not have a content pane!", tableStockage.getContentPane());
		
		// The content of the jpanel is created
		JPanel panel2 = new JPanel();
		panel2.add(new ModifTableStockage.ModifTableStockageRow(0, modif));
		assertEquals("Nécess to insert a new element", modif, panel2.getContentPane().getComponent(0).getUserObject());
		
		// And the content of the jpanel is replaced
		JPanel panel2_1 = new JPanel();
		panel2_1.add(new ModifTableStockage.ModifTableStockageRow(1, modif));
		assertEquals("Nécess to insert a new element", modif, panel2_1.getContentPane().getComponent(1).getUserObject());
		
		// And the content of the jpanel is removed
		JPanel panel2_2 = new JPanel();
		panel2_2.add(new ModifTableStockage.ModifTableStockageRow(2, modif));
		panel2_2.add(new ModifTableStockage.ModifTableStockageRow(3, modif));
		panel2_2.add(new ModifTableStockage.ModifTableStockageRow(4, modif));
}
}
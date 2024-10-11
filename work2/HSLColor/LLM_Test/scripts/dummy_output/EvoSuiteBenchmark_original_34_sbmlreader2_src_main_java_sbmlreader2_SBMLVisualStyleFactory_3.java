// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

import cytoscape.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLVisualStyleFactory}.
* It contains one unit test case for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {
		SBMLVisualStyleFactoryTest(){}


	/**
	 * Test of constructVisualStyle method, of class sbmlVisualStyleFactoryFactory.
	 */
	@Test
	public void testConstructVisualStyle(){
				/*
				 * Test of constructor VisualStyle.
				 */
		assertNotNull(createVisualStyle(""));

		/*
		 * Test of newVisualStyle getVisualStyles.
		 */
		String title = "Test Title 0";
		CyNode testNode = new Node(1, TITLE_NODE_DEF);
		CyNode testNode2 = new Node(2, TITLE_NODE_DEF);
		CyNode testNode3 = new Node(3, TITLE_NODE_DEF);
		Color testColor = new Color(0.5f, 0.8f, 0.0f);
		Node testLabel = new Node(
				0,
				new Double(0.8),
				title,
				new Double(0.0),
				NULL_COLOR_NODE_DEF,
				NULL_COLOR_NODE_DEF,
				Color.TRANSPARENT,
				new Double(0.5),
				new Double(1.0)
		);

		CyNode testLabel2 = new Node(
				1, 
				new Double(0.8),
				title,
				new Double(1.0),
				NULL_COLOR_NODE_DEF,
				NULL_COLOR_NODE_DEF,
				Color.TRANSPARENT,
		String.class,
				new Double(0.5),
				new Double(1.0)
		);

		CyNode testGroup = new Node(
				1, 
				new Double(0.8),
				title,
				new Double(0.0),
				NULL_COLOR_NODE_DEF,
				NULL_COLOR_NODE_DEF,
				Color.BLACK,
				new Double(0.5),
				new Double(1.0)
		);

		CyLayer testLayer = new Layer(
				1, 
				new Double(0.8),
				NULL_COLOR_NODE_DEF,
				new Double(0.5),
				"layer",
				"layer_1"
		);

		CyStylestyleTestStyle testStyle = new CyStylestyleTestStyle(testGroup, testLabel, testLayer);

		StylestyleManager sbmlManager = new CyStylestyleManager(testStyle);

		int i = 0;
		int i2;
		sbmlManager.addVisualStyle(sbmlReaderVisualStyle1);

		// add a new styles
		sbmlManager.addVisualStyle(sbmlReaderVisualStyle2);

		// add a new style using the same class  
		sbmlManager.addVisualStyle(sbmlReaderVisualStyle3);

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();

		for (i = 0; i < 3; i = i + 1) {
			i2 = i;
			list1.add(new Node(i + 1, title, "title", new Double(0.3), NULL_COLOR_NODE_DEF, NULL_COLOR_NODE_DEF, Color.BLACK, new Double(0.5), new Double(1.1), NULL_COLOR_NODE_DEF, NULL_COLOR_NODE_DEF));
			list2.add(new Node(i2 + 1, title, "title", new Double(0.4), NULL_COLOR_NODE_DEF, NULL_COLOR_NODE_DEF, Color.BLACK, new Double(0.5), new Double(1.2), NULL_COLOR_NODE_DEF, NULL_COLOR_NODE_DEF));

			// add a new label
			list1.add(new Node(i + 1, new Double(0.5), title, new Double(0.1), NULL_COLOR_NODE_DEF, NULL_COLOR_NODE_DEF, Color.BLACK, new Double(0.5), new Double(1.1), new Double(1.0), NULL_COLOR_NODE_DEF, new Double(0.5)));
			list1.add(new Node(i + 1, new Double(0.5), title, new Double(0.2), NULL_COLOR_NODE_DEF, NULL_COLOR_NODE_DEF, Color.BLACK, new Double(0.5), new Double(1.0), new Double(1.0), NULL_COLOR_NODE_DEF, new Double(0.5)));
			list2.add(new Node(i + 1, new Double(0.5), title, new Double(0.5), Color.BLACK, new Double(0.5), Color.BLACK, Color.BLACK, Color.TRANSPARENT, new Double(0.5), new Double(1.0)));
		}

		// add a new node
		int idx = list1.size();
		int i3;
		list1.add(new Node(list1.size(), "new_node", "new_node_1", new Double(0.8), Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		for (; i3 = i; i3 = i3 + 1)
		{
			// test is_child_of
			boolean test = sbmlManager.is_child_of(testNode, idx, i3);

			if (test)
			{
				fail("This node should not have been added - " + i3 + " is a child of " + idx); 
			}
		}
		for (; i3 = i; i3 = i3 + 1)
		{
			boolean test = sbmlManager.is_child_of(testNode2, idx, i3);

			if (test)
			{
				fail("This node should not have been added - " + i3 + " is a child of " + idx); 
			}
		}
		for (; i3 = i; i3 = i3 + 1)
		{
			boolean test = sbmlManager.is_child_of(testNode3, idx, i3);

			if (test)
			{
				fail("This node should not have been added - " + i3 + " is a child of " + idx); 
			}
		}
		for (; i3 = i; i3 = i3 + 1)
		{
			boolean test = sbmlManager.is_child_of(testNode, idx, i3);

			if (test)
			{
				fail("This node should not have been added - " + i3 + " is a child of " + idx); 
			}
		}

		/*
		 * Test of newVisualStyle getVisualStyles.
		 */
		// test if it really works with this class
		//smlManager.addNewVisualStyle
}
}
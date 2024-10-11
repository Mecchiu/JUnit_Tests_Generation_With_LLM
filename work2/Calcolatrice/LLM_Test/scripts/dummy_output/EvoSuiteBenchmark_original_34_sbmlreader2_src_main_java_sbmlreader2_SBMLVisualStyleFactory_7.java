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
		
	/**
    * Test {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)}.
    */
    @Test
    public void testCreateVisualStyle() {
        VisualStyle vs = null;
        VisualStyle vs1 = null;

        ////
        //	Testing sbml type
        ////
        {
            CyModel model = null;

            CyElement element = null;
            CyElement parent = null;

            // make a new group and create a model
            model = new CyGroup();

            parent = model.getRootNode();
            System.out.println("root element is " + parent);
        }

        ////
        //	Testing interaction
        ////
        {
            CyModel model = null;

            CyNode parent = null, parent1 = null;
            CyNode sbml = null, sbml1 = null;

            CyNode sbmlAttr1 = null, sbmlAttr2 = null, sbmlAttr3 = null;
            CyNode attr = null, attr1 = null, attr2 = null, attr3 = null;

            // make a new group and create a model
            model = new CyGroup();
            // create a new CyAttribute and create another model
            parent = model.getRootNode();
            System.out.println("parent is " + parent);

            // create nodes to add
            CyAttribute a1 = null;
            CyAttribute a2 = null;

            // create some SBML attributes
            List<CyAttribute> alist = new LinkedList<>();
            alist.add(a1);
            alist.add(a2);
            alist.add(a3);
            alist.add(a4);
            alist.add(a5);

            // create the node
            parent1 = parent.addNode();
            System.out.println("parent1 is " + parent1);

            // create the elements
            CyAttribute a = null;
            parent1.addNode(a);

            // create some nodes to add
            CyNodeNodeList list = new CyNodeNodeList();
            CyNode a2 = null, a3 = null, a4 = null;
            CyNode a5 = null;
            a2 = parent1.addNode(a5);
            system1.addToList(list, a2);
            a3 = list.getAtIndex(0);
            System.out.println("a3");
            System.out.println(a3);
            a4 = list.getAtIndex(1);
            System.out.println("a4");
            System.out.println(a4);
            if (alist.contains(a5)) {
                attrib1 = a5;
                attrib2 = a6;
                attrib3 = a5;
            }
            System.out.println();
            attrib1 = null;

            // create the edges
            // parent1 -> sbml -> parent2 -> parent3
            parent1.addEdge(a1);
            parent1.addEdge(a2);

            // create some nodes and nodes to add
            List<CyNode> list2 = new LinkedList<>();
            list2.add(parent1);
            list2.add(a2);
            list2.add(a3);
            list2.add(a4);
            list2.add(a5);

            // create the edges
            // parent1 -> sbml -> sbml1 -> parent2 -> parent3
            parent1.addEdge(sbmlAttr1);
            parent1.addEdge(sbmlAttr2);

            // create some nodes and nodes to add
            list2.add(parent1);
            list2.add(sbmlAttr1);
            list2.add(sbmlAttr2);
            list2.add(sbmlAttr3);

    //		System.out.println("list2 has size of " + list2.size());
            for (int i = 0; i < list2.size(); i++) {
                // make a new CyElement and add it
                CyElement ele = new CyElement(list2.get(i).getID(), null);

				// add a new CyAttribute to the element
                attrib = new CyAttribute(ele, sbmlAttr1, null, null);

                // attach a new CyNode object to a new CyElement and add it
                a = new CyNode("" + (i + 1), ele);
                attrib1 = new CyAttribute(a,sbmlAttr2, null, null);

                // attach a new CyNode object to a new CyElement and add it
                a1 = new CyNode("" + (i + 2), ele);
                attrib2 = new CyAttribute(a1,sbmlAttr3, null, null);
            }

		
    }

    /**
     * DOCUMENT ME!
     *
     * @param network DOCUMENT ME!
     * @param sbml_def DOCUMENT ME!
     * @param sbml_sub DOCUMENT ME!
     * @param attribs DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
}
}
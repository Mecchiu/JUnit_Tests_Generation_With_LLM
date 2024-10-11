// GroupLayoutEngineerTest.java
package glengineer;

import glengineer.agents.*;
import glengineer.agents.setters.*;
import glengineer.agents.settings.*;
import glengineer.blocks.*;
import java.util.*;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GroupLayoutEngineer}.
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
*/
class GroupLayoutEngineerTest {

		/**
		* Test case 1.
		* <p>
		* The scheme:
		* <pre>
		* "FINDLABEL  TEXTFIELD      FINDBUTTON  ",
		* "          --------------+             ",
		* "           CB11   CB12  | CANSELBUTTON",
		* "                        |             ",
		* "           CB21   CB22  |             ");
		* </pre>
		* <p>
		* The expected result:
		* <pre>
		* "FINDLABEL  TEXTFIELD      FINDBUTTON  ",
		* "          --------------+             ",
		* "           CB11   CB12  | CANSELBUTTON",
		* "                        |             ",
		* "           CB21   CB22  |             ");
		* </pre>
		*/
		@Test
		void testCase1() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ",
						"          --------------+             ",
						"           CB11   CB12  | CANSELBUTTON",
						"                        |             ",
						"           CB21   CB22  |             ");
				gle.associate("FINDLABEL", new JLabel("Find What:"));
				gle.associate("TEXTFIELD", new JTextField());
				gle.associate("FINDBUTTON", new JButton("Find"));
				gle.associate("CB11", new JCheckBox("Match Case"));
				gle.associate("CB12", new JCheckBox("Wrap Around"));
				gle.associate("CB21", new JCheckBox("Whole Words"));
				gle.associate("CB22", new JCheckBox("Search Backwards"));
				gle.associate("CANSELBUTTON", new JButton("Cancel"));
				gle.engineer();
				
				FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "FINDLABEL", "FINDBUTTON");
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.getComponent("FINDBUTTON"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponentCount(), 3);
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(0), gle.getComponent("FINDLABEL"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(1), gle.getComponent("TEXTFIELD"));
				assertEquals(fosg.getGroup("FINDLABEL", "FINDBUTTON").getComponent(2), gle.get
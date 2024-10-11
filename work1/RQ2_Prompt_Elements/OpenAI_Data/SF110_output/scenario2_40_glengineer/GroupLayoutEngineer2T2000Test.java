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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getParallelGroup(Axis, String, String)} method.
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
				
				FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "FINDLABEL", "FINDBUTTON");
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("FINDLABEL").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("FINDLABEL").getAlignment(), Alignment.TRAILING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("FINDLABEL").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("TEXTFIELD").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("TEXTFIELD").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("TEXTFIELD").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("FINDBUTTON").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("FINDBUTTON").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGroup("FINDBUTTON").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CB11").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CB11").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CB11").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CB12").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CB12").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CB12").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CANSELBUTTON").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CANSELBUTTON").getAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("CB11", "CANSELBUTTON").getGroup("CANSELBUTTON").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				
				fopg = gle.getParallelGroup(Axis.VERTICAL, "FINDLABEL", "CB21");
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getAlignment(), Alignment.BASELINE);
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getGroup("FINDLABEL").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getGroup("FINDLABEL").getAlignment(), Alignment.BASELINE);
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getGroup("FINDLABEL").getResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "CB21").getGroup("CB11").getSize(), GroupLayout.DEFAULT_SIZE);
				assertEqu
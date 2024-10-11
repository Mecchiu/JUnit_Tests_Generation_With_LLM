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
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapResizeBehavior(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapContentAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapGap(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapGapType(), ComponentPlacement.RELATED);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapGapSize(), GroupLayout.DEFAULT_SIZE);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapGapAlignment(), Alignment.LEADING);
				assertEquals(fopg.getGroup("FINDLABEL", "FINDBUTTON").getGapGapGapGapGapGapGapGapGapGapGapRes
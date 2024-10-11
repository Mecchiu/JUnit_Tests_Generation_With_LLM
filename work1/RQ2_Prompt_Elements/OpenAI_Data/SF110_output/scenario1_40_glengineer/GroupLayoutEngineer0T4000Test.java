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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getComponent(Axis, String)} method.
*/
class GroupLayoutEngineerTest {

		@Test
		void testGetComponent() {
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
				
				FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "FINDLABEL").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "TEXTFIELD").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "FINDBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB11").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB12").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB21");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB21").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB22");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB22").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CANSELBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CANSELBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "FINDLABEL");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "FINDLABEL").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "TEXTFIELD");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "TEXTFIELD").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "FINDBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "FINDBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB11");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB11").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB12");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB12").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB21");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB21").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB22");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB22").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CANSELBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CANSELBUTTON").getComponent());
		}
}

// GroupLayoutEngineerTest2.java
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getComponent(Axis, String)} method.
*/
class GroupLayoutEngineerTest2 {
		
		@Test
		void testGetComponent() {
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
				
				FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "FINDLABEL").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "TEXTFIELD").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "FINDBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB11").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB12").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB21");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB21").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB22");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB22").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CANSELBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CANSELBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "FINDLABEL");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "FINDLABEL").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "TEXTFIELD");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "TEXTFIELD").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "FINDBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "FINDBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB11");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB11").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB12");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB12").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB21");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB21").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CB22");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CB22").getComponent());
				
				foc = gle.getComponent(Axis.VERTICAL, "CANSELBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.VERTICAL, "CANSELBUTTON").getComponent());
		}
}

// GroupLayoutEngineerTest3.java
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getComponent(Axis, String)} method.
*/
class GroupLayoutEngineerTest3 {
		
		@Test
		void testGetComponent() {
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
				
				FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "FINDLABEL").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "TEXTFIELD").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "FINDBUTTON").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB11").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB12").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL, "CB21");
				assertEquals(foc.getComponent(), gle.getAgent(Axis.HORIZONTAL, "CB21").getComponent());
				
				foc = gle.getComponent(Axis.HORIZONTAL
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
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
						getContentPane(),
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
				assertEquals(gle.getTopSequentialGroup(Axis.HORIZONTAL).toString(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ");
				assertEquals(gle.getTopSequentialGroup(Axis.VERTICAL).toString(),
						"          --------------+             " +
						"           CB11   CB12  | CANSELBUTTON" +
						"                        |             " +
						"           CB21   CB22  |             ");
		}
		
		/**
		* Test case 2.
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
		void testCase2() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						getContentPane(),
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
				assertEquals(gle.getTopSequentialGroup(Axis.HORIZONTAL).toString(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ");
				assertEquals(gle.getTopSequentialGroup(Axis.VERTICAL).toString(),
						"          --------------+             " +
						"           CB11   CB12  | CANSELBUTTON" +
						"                        |             " +
						"           CB21   CB22  |             ");
		}
		
		/**
		* Test case 3.
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
		void testCase3() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						getContentPane(),
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
				assertEquals(gle.getTopSequentialGroup(Axis.HORIZONTAL).toString(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ");
				assertEquals(gle.getTopSequentialGroup(Axis.VERTICAL).toString(),
						"          --------------+             " +
						"           CB11   CB12  | CANSELBUTTON" +
						"                        |             " +
						"           CB21   CB22  |             ");
		}
		
		/**
		* Test case 4.
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
		void testCase4() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						getContentPane(),
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
				assertEquals(gle.getTopSequentialGroup(Axis.HORIZONTAL).toString(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ");
				assertEquals(gle.getTopSequentialGroup(Axis.VERTICAL).toString(),
						"          --------------+             " +
						"           CB11   CB12  | CANSELBUTTON" +
						"                        |             " +
						"           CB21   CB22  |             ");
		}
		
		/**
		* Test case 5.
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
		void testCase5() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						getContentPane(),
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
				assertEquals(gle.getTopSequentialGroup(Axis.HORIZONTAL).toString(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ");
				assertEquals(gle.getTopSequentialGroup(Axis.VERTICAL).toString(),
						"          --------------+             " +
						"           CB11   CB12  | CANSELBUTTON" +
						"                        |             " +
						"           CB21   CB22  |             ");
		}
		
		/**
		* Test case 6.
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
		void testCase6() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						getContentPane(),
						"FINDLABEL  TEXTFIELD      FINDBUTTON  ",
						"          --------------+             ",
						"           CB11   CB12  | CANSELBUTTON",
						"                        |             ",
						"           CB21   CB22  |             ");
				gle.associate("FINDLABEL", new JLabel("Find What:"));
				gle.associate("TEXTFIELD", new JTextField());
				
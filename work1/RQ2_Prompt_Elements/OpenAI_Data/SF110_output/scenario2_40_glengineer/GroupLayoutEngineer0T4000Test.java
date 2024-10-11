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

		/**
		* Test case 1.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is not associated with any component.
		* <p>
		* The expected result is an exception of the type
		* {@link IllegalArgumentException}.
		*/
		@Test
		void testGetComponent1() {
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
				assertThrows(IllegalArgumentException.class, () -> {
						gle.getComponent(Axis.HORIZONTAL, "FINDLABEL1");
				});
		}
		
		/**
		* Test case 2.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, but the specified layout direction
		* is not the same as the layout direction of that component.
		* <p>
		* The expected result is an exception of the type
		* {@link IllegalArgumentException}.
		*/
		@Test
		void testGetComponent2() {
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
				assertThrows(IllegalArgumentException.class, () -> {
						gle.getComponent(Axis.VERTICAL, "FINDLABEL");
				});
		}
		
		/**
		* Test case 3.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, and the specified layout direction
		* is the same as the layout direction of that component.
		* <p>
		* The expected result is an interface {@link FunctionsOnComponent}
		* for adjusting the component.
		*/
		@Test
		void testGetComponent3() {
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
				assertTrue(gle.getComponent(Axis.HORIZONTAL, "FINDLABEL") instanceof FunctionsOnComponent);
		}
		
		/**
		* Test case 4.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, and the specified layout direction
		* is the same as the layout direction of that component.
		* <p>
		* The expected result is an interface {@link FunctionsOnComponent}
		* for adjusting the component.
		*/
		@Test
		void testGetComponent4() {
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
				assertTrue(gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD") instanceof FunctionsOnComponent);
		}
		
		/**
		* Test case 5.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, and the specified layout direction
		* is the same as the layout direction of that component.
		* <p>
		* The expected result is an interface {@link FunctionsOnComponent}
		* for adjusting the component.
		*/
		@Test
		void testGetComponent5() {
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
				assertTrue(gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON") instanceof FunctionsOnComponent);
		}
		
		/**
		* Test case 6.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, and the specified layout direction
		* is the same as the layout direction of that component.
		* <p>
		* The expected result is an interface {@link FunctionsOnComponent}
		* for adjusting the component.
		*/
		@Test
		void testGetComponent6() {
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
				assertTrue(gle.getComponent(Axis.HORIZONTAL, "CB11") instanceof FunctionsOnComponent);
		}
		
		/**
		* Test case 7.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, and the specified layout direction
		* is the same as the layout direction of that component.
		* <p>
		* The expected result is an interface {@link FunctionsOnComponent}
		* for adjusting the component.
		*/
		@Test
		void testGetComponent7() {
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
				assertTrue(gle.getComponent(Axis.HORIZONTAL, "CB12") instanceof FunctionsOnComponent);
		}
		
		/**
		* Test case 8.
		* <p>
		* The method {@link GroupLayoutEngineer#getComponent(Axis, String)}
		* is tested for the case when the specified component name
		* is associated with a component, and the specified layout direction
		* is the same as the layout direction of that component.
		* <p>
		* The expected result is an interface {@link FunctionsOnComponent}
		* for adjusting the component.
		*/
		@Test
		void testGetComponent8() {
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
				assertTrue(gle.getComponent(Axis.HORIZONTAL, "CB21") instanceof FunctionsOnComponent);
		}
		
		/**
	
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
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JLabel("Find What:"));
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JTextField());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JButton("Find"));
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JCheckBox("Match Case"));
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JCheckBox("Wrap Around"));
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "CB21");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JCheckBox("Whole Words"));
	}
	
	/**
	 * Test case 7.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "CB22");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JCheckBox("Search Backwards"));
	}
	
	/**
	 * Test case 8.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
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
		
		FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "CANSELBUTTON");
		assertTrue(foc instanceof ComponentAgent);
		assertEquals(((ComponentAgent)foc).getComponent(), new JButton("Cancel"));
	}
	
	/**
	 * Test case 9.
	 * <p>
	 * The test case checks that the method
	 * {@link GroupLayoutEngineer#getComponent(Axis, String)}
	 * returns the correct agent of the component
	 * with the specified name.
	 * <p>
	 * The test case is passed if the method returns
	 * the correct agent of the component.
	 */
	@Test
	void testGetComponent9() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"FINDLABEL  TEXTFIELD      FINDBUTTON  ",
			"          --------------+             ",
			"           CB11   CB12  | CANSELBUTTON",
			"                        |             ",
			"           CB21   CB22  |             ");
		
		gle.associate("FINDLABEL", new JLabel("Find What:"));
		gle.associate("TEXTFIELD", new JTextField());
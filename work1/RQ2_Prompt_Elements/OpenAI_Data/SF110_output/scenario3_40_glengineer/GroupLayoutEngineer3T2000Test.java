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
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup1() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "C");
		assertEquals(fosg.getFirstName(), "A");
		assertEquals(fosg.getLastName(), "C");
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup2() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "B", "B");
		assertEquals(fosg.getFirstName(), "B");
		assertEquals(fosg.getLastName(), "B");
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup3() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "C", "A");
		assertEquals(fosg.getFirstName(), "A");
		assertEquals(fosg.getLastName(), "C");
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup4() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "B");
		assertEquals(fosg.getFirstName(), "A");
		assertEquals(fosg.getLastName(), "B");
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup5() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "B", "C");
		assertEquals(fosg.getFirstName(), "B");
		assertEquals(fosg.getLastName(), "C");
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup6() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "A");
		assertEquals(fosg.getFirstName(), "A");
		assertEquals(fosg.getLastName(), "A");
	}
	
	/**
	 * Test case 7.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup7() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "C", "C");
		assertEquals(fosg.getFirstName(), "C");
		assertEquals(fosg.getLastName(), "C");
	}
	
	/**
	 * Test case 8.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void testGetSequentialGroup8() {
		GroupLayoutEngine
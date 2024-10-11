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
	 * 	"A B C"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C"
	 * </pre>
	 */
	@Test
	void test1() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "A", "C");
		assertEquals(fopg.getGroup().getElements().size(), 3);
		assertEquals(fopg.getGroup().getElements().get(0).getComponent().getName(), "A");
		assertEquals(fopg.getGroup().getElements().get(1).getComponent().getName(), "B");
		assertEquals(fopg.getGroup().getElements().get(2).getComponent().getName(), "C");
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
	void test2() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "B", "B");
		assertEquals(fopg.getGroup().getElements().size(), 1);
		assertEquals(fopg.getGroup().getElements().get(0).getComponent().getName(), "B");
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
	void test3() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "A", "B");
		assertEquals(fopg.getGroup().getElements().size(), 2);
		assertEquals(fopg.getGroup().getElements().get(0).getComponent().getName(), "A");
		assertEquals(fopg.getGroup().getElements().get(1).getComponent().getName(), "B");
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
	void test4() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "B", "C");
		assertEquals(fopg.getGroup().getElements().size(), 2);
		assertEquals(fopg.getGroup().getElements().get(0).getComponent().getName(), "B");
		assertEquals(fopg.getGroup().getElements().get(1).getComponent().getName(), "C");
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
	void test5() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "C", "A");
		assertEquals(fopg.getGroup().getElements().size(), 3);
		assertEquals(fopg.getGroup().getElements().get(0).getComponent().getName(), "A");
		assertEquals(fopg.getGroup().getElements().get(1).getComponent().getName(), "B");
		assertEquals(fopg.getGroup().getElements().get(2).getComponent().getName(), "C");
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
	void test6() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnParallelGroup fopg = gle.getParallelGroup(Axis.HORIZONTAL, "B", "A");
		assertEquals(fopg.getGroup().getElements().size(), 2);
		assertEquals(fopg.getGroup().getElements().get(0).getComponent().getName(), "A");
		assertEquals(fopg.getGroup().getElements().get(1).getComponent().getName(), "B");
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
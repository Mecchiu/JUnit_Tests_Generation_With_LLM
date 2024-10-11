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
		 * The scheme is:
		 * <pre>
		 * "A"
		 * </pre>
		 * <p>
		 * The expected result is:
		 * <pre>
		 * "A"
		 * </pre>
		 */
		@Test
		void test1() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A");
				gle.associate("A", new JLabel("A"));
				gle.engineer();
				
				FunctionsOnTopSequentialGroup fotg = gle.getTopSequentialGroup(Axis.HORIZONTAL);
				assertEquals(1, fotg.getSize());
				assertEquals("A", fotg.getElement(0).getName());
		}
		
		/**
		 * Test case 2.
		 * <p>
		 * The scheme is:
		 * <pre>
		 * "A"
		 * "B"
		 * </pre>
		 * <p>
		 * The expected result is:
		 * <pre>
		 * "A"
		 * "B"
		 * </pre>
		 */
		@Test
		void test2() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A",
						"B");
				gle.associate("A", new JLabel("A"));
				gle.associate("B", new JLabel("B"));
				gle.engineer();
				
				FunctionsOnTopSequentialGroup fotg = gle.getTopSequentialGroup(Axis.HORIZONTAL);
				assertEquals(2, fotg.getSize());
				assertEquals("A", fotg.getElement(0).getName());
				assertEquals("B", fotg.getElement(1).getName());
		}
		
		/**
		 * Test case 3.
		 * <p>
		 * The scheme is:
		 * <pre>
		 * "A"
		 * "B"
		 * "C"
		 * </pre>
		 * <p>
		 * The expected result is:
		 * <pre>
		 * "A"
		 * "B"
		 * "C"
		 * </pre>
		 */
		@Test
		void test3() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A",
						"B",
						"C");
				gle.associate("A", new JLabel("A"));
				gle.associate("B", new JLabel("B"));
				gle.associate("C", new JLabel("C"));
				gle.engineer();
				
				FunctionsOnTopSequentialGroup fotg = gle.getTopSequentialGroup(Axis.HORIZONTAL);
				assertEquals(3, fotg.getSize());
				assertEquals("A", fotg.getElement(0).getName());
				assertEquals("B", fotg.getElement(1).getName());
				assertEquals("C", fotg.getElement(2).getName());
		}
		
		/**
		 * Test case 4.
		 * <p>
		 * The scheme is:
		 * <pre>
		 * "A"
		 * "B"
		 * "C"
		 * "D"
		 * </pre>
		 * <p>
		 * The expected result is:
		 * <pre>
		 * "A"
		 * "B"
		 * "C"
		 * "D"
		 * </pre>
		 */
		@Test
		void test4() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A",
						"B",
						"C",
						"D");
				gle.associate("A", new JLabel("A"));
				gle.associate("B", new JLabel("B"));
				gle.associate("C", new JLabel("C"));
				gle.associate("D", new JLabel("D"));
				gle.engineer();
				
				FunctionsOnTopSequentialGroup fotg = gle.getTopSequentialGroup(Axis.HORIZONTAL);
				assertEquals(4, fotg.getSize());
				assertEquals("A", fotg.getElement(0).getName());
				assertEquals("B", fotg.getElement(1).getName());
				assertEquals("C", fotg.getElement(2).getName());
				assertEquals("D", fotg.getElement(3).getName());
		}
		
		/**
		 * Test case 5.
		 * <p>
		 * The scheme is:
		 * <pre>
		 * "A"
		 * "B"
		 * "C"
		 * "D"
		 * "E"
		 * </pre>
		 * <p>
		 * The expected result is:
		 * <pre>
		 * "A"
		 * "B"
		 * "C"
		 * "D"
		 * "E"
		 * </pre>
		 */
		@Test
		void test5() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A",
						"B",
						"C",
						"D",
						"E");
				gle.associate("A", new JLabel("A"));
				gle.associate("B", new JLabel("B"));
				gle.associate("C", new JLabel("C"));
				gle.associate("D", new JLabel("D"));
				gle.associate("E", new JLabel("E"));
				gle.engineer();
				
				FunctionsOnTopSequentialGroup fotg = gle.getTopSequentialGroup(Axis.HORIZONTAL);
				assertEquals(5, fotg.getSize());
				assertEquals("A", fotg.getElement(0).getName());
				assertEquals("B", fotg.getElement(1).getName());
				assertEquals("C", fotg.getElement(2).getName());
				assertEquals("D", fotg.getElement(3).getName());
				assertEquals("E", fotg.getElement(4).getName());
		}
		
		/**
		 * Test case 6.
		 * <p>
		 * The scheme is:
		 * <pre>
		 * "A"
		 *
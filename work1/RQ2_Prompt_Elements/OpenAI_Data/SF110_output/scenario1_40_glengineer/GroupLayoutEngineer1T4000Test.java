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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
*/
class GroupLayoutEngineerTest {

		/**
		* Test case 1.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are not in the same group.
		* <p>
		* The expected result is {@code null}.
		*/
		@Test
		void testGetGroup1() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNull(gle.getGroup(Axis.HORIZONTAL, "A", "C"));
		}
		
		/**
		* Test case 2.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup2() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.HORIZONTAL, "A", "B"));
		}
		
		/**
		* Test case 3.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a parallel group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup3() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.VERTICAL, "D", "F"));
		}
		
		/**
		* Test case 4.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a sequential group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup4() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.HORIZONTAL, "A", "C"));
		}
		
		/**
		* Test case 5.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a sequential group,
		* and the group is a subgroup of another group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup5() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.HORIZONTAL, "A", "B"));
		}
		
		/**
		* Test case 6.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a parallel group,
		* and the group is a subgroup of another group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup6() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.VERTICAL, "D", "E"));
		}
		
		/**
		* Test case 7.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a sequential group,
		* and the group is a subgroup of another group,
		* and the group is a subgroup of another group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup7() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.HORIZONTAL, "A", "B"));
		}
		
		/**
		* Test case 8.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a parallel group,
		* and the group is a subgroup of another group,
		* and the group is a subgroup of another group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup8() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.VERTICAL, "D", "E"));
		}
		
		/**
		* Test case 9.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a sequential group,
		* and the group is a subgroup of another group,
		* and the group is a subgroup of another group,
		* and the group is a subgroup of another group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup9() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.HORIZONTAL, "A", "B"));
		}
		
		/**
		* Test case 10.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are in the same group,
		* and the group is a parallel group,
		* and the group is a subgroup of another group,
		* and the group is a subgroup of another group,
		* and the group is a subgroup of another group.
		* <p>
		* The expected result is not {@code null}.
		*/
		@Test
		void testGetGroup10() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
						"D E F");
				gle.associate("A", new JButton("A"));
				gle.associate("B", new JButton("B"));
				gle.associate("C", new JButton("C"));
				gle.associate("D", new JButton("D"));
				gle.associate("E", new JButton("E"));
				gle.associate("F", new JButton("F"));
				gle.engineer();
				assertNotNull(gle.getGroup(Axis.VERTICAL, "D", "E"));
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
*/
class GroupLayoutEngineerTest2 {
		
		/**
		* Test case 1.
		* <p>
		* The method {@link GroupLayoutEngineer#getGroup(Axis, String, String)}
		* is tested for the case when the first and the last names
		* are the names of the components which are not in the same group.
		* <p>
		* The expected result is {@code null}.
		*/
		@Test
		void testGetGroup1() {
				GroupLayoutEngineer gle = new GroupLayoutEngineer(
						new JPanel(),
						"A B C",
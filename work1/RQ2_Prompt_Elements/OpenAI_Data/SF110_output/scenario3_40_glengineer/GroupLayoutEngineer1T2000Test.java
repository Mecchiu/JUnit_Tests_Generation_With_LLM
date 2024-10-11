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
	 * The scheme:
	 * <pre>
	 * 	"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
	 * </pre>
	 */
	@Test
	void test1() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.associate("D", new JLabel("D"));
		gle.associate("E", new JLabel("E"));
		gle.associate("F", new JLabel("F"));
		gle.associate("G", new JLabel("G"));
		gle.associate("H", new JLabel("H"));
		gle.associate("I", new JLabel("I"));
		gle.associate("J", new JLabel("J"));
		gle.associate("K", new JLabel("K"));
		gle.associate("L", new JLabel("L"));
		gle.associate("M", new JLabel("M"));
		gle.associate("N", new JLabel("N"));
		gle.associate("O", new JLabel("O"));
		gle.associate("P", new JLabel("P"));
		gle.associate("Q", new JLabel("Q"));
		gle.associate("R", new JLabel("R"));
		gle.associate("S", new JLabel("S"));
		gle.associate("T", new JLabel("T"));
		gle.associate("U", new JLabel("U"));
		gle.associate("V", new JLabel("V"));
		gle.associate("W", new JLabel("W"));
		gle.associate("X", new JLabel("X"));
		gle.associate("Y", new JLabel("Y"));
		gle.associate("Z", new JLabel("Z"));
		gle.engineer();
		
		FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "A", "Z");
		assertEquals(fog.getFirstName(), "A");
		assertEquals(fog.getLastName(), "Z");
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
	 * </pre>
	 */
	@Test
	void test2() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.associate("D", new JLabel("D"));
		gle.associate("E", new JLabel("E"));
		gle.associate("F", new JLabel("F"));
		gle.associate("G", new JLabel("G"));
		gle.associate("H", new JLabel("H"));
		gle.associate("I", new JLabel("I"));
		gle.associate("J", new JLabel("J"));
		gle.associate("K", new JLabel("K"));
		gle.associate("L", new JLabel("L"));
		gle.associate("M", new JLabel("M"));
		gle.associate("N", new JLabel("N"));
		gle.associate("O", new JLabel("O"));
		gle.associate("P", new JLabel("P"));
		gle.associate("Q", new JLabel("Q"));
		gle.associate("R", new JLabel("R"));
		gle.associate("S", new JLabel("S"));
		gle.associate("T", new JLabel("T"));
		gle.associate("U", new JLabel("U"));
		gle.associate("V", new JLabel("V"));
		gle.associate("W", new JLabel("W"));
		gle.associate("X", new JLabel("X"));
		gle.associate("Y", new JLabel("Y"));
		gle.associate("Z", new JLabel("Z"));
		gle.engineer();
		
		FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "A", "Z");
		assertEquals(fog.getFirstName(), "A");
		assertEquals(fog.getLastName(), "Z");
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The scheme:
	 * <pre>
	 * 	"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
	 * </pre>
	 * <p>
	 * The expected result:
	 * <pre>
	 * 	"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
	 * </pre>
	 */
	@Test
	void test3() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.associate("D", new JLabel("D"));
		gle.associate("E", new JLabel("E"));
		gle.associate("F", new JLabel("F"));
		gle.associate("G", new JLabel("G"));
		gle.associate("H", new JLabel("H"));
		gle.associate("I", new JLabel("I"));
		gle.associate("J", new JLabel("J"));
		gle.associate("K", new JLabel("K"));
		gle.associate("L", new JLabel("L"));
		gle.associate("M", new JLabel("M"));
		gle.associate("N", new JLabel("N"));
		gle.associate("O", new JLabel("O"));
		gle.associate("P", new JLabel("P"));
		gle.associate("Q", new JLabel("Q"));
		gle.associate("R", new JLabel("R
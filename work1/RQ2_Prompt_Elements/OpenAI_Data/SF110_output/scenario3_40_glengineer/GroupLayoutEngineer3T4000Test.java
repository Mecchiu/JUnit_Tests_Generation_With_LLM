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
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "C", "B");
		
		assertEquals(fosg.getFirstName(), "B");
		assertEquals(fosg.getLastName(), "C");
	}
	
	/**
	 * Test case 9.
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
	void testGetSequentialGroup9() {
		GroupLayoutEngineer gle = new GroupLayoutEngineer(
			new JPanel(),
			"A B C");
		gle.associate("A", new JLabel("A"));
		gle.associate("B", new JLabel("B"));
		gle.associate("C", new JLabel("C"));
		gle.engineer();
		
		FunctionsOnSequentialGroup fosg = gle.getSequentialGroup(Axis.HORIZONTAL, "B", "A");
		
		assertEquals(fosg.getFirstName(), "A");
		assertEquals(fosg.getLastName(), "B");
	}
	
	/**
	 * Test case 10.
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
	void testGetSequentialGroup10() {
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
}

// FunctionsOnSequentialGroup.java
package glengineer.agents;

import glengineer.agents.setters.*;
import glengineer.agents.settings.*;
import glengineer.blocks.*;
import java.util.*;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * {@code FunctionsOnSequentialGroup} is an interface for adjusting
 * a sequential group and adding gaps into it.
 *
 * @author Yevgen Ivakhno
 * @version 1.1, 18/05/2009
 */
public interface FunctionsOnSequentialGroup {

    /**
     * Returns the name of the first component in the group.
     *
     * @return the name of the first component in the group
     */
    String getFirstName();

    /**
     * Returns the name of the last component in the group.
     *
     * @return the name of the last component in the group
     */
    String getLastName();

    /**
     * Adds a gap of the specified type and length
     * before the first component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addPrecedingGap(ComponentPlacement type, int length);

    /**
     * Adds a gap of the specified type and length
     * after the last component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addTrailingGap(ComponentPlacement type, int length);

    /**
     * Adds a gap of the specified type and length
     * before the first component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addPrecedingUnrelatedGap(int length, int maxLength);

    /**
     * Adds a gap of the specified type and length
     * after the last component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addTrailingUnrelatedGap(int length, int maxLength);

    /**
     * Adds a gap of the specified type and length
     * before the first component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addPrecedingRelatedGap(int length, int maxLength);

    /**
     * Adds a gap of the specified type and length
     * after the last component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addTrailingRelatedGap(int length, int maxLength);

    /**
     * Adds a gap of the specified type and length
     * before the first component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addPrecedingGap(int length, int maxLength);

    /**
     * Adds a gap of the specified type and length
     * after the last component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addTrailingGap(int length, int maxLength);

    /**
     * Adds a gap of the specified type and length
     * before the first component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addPrecedingGap(int length);

    /**
     * Adds a gap of the specified type and length
     * after the last component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addTrailingGap(int length);

    /**
     * Adds a gap of the specified type and length
     * before the first component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addPrecedingUnrelatedGap(int length);

    /**
     * Adds a gap of the specified type and length
     * after the last component in the group.
     *
     * @param type the type of the gap
     * @param length the length of the gap
     * @return this interface
     */
    FunctionsOnSequentialGroup addTrailingUnrelatedGap(int length);

    /**
     * Adds a gap of the specified type and length
     * before the
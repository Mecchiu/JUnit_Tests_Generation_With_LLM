// SequentialGroupAgentTest.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialGroupAgent}.
* It contains ten unit test cases for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class SequentialGroupAgentTest {

	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has no children.
	 */
	@Test
	void testGroupContent_NoChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(0, result.getComponents().length);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has one child.
	 */
	@Test
	void testGroupContent_OneChild() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(1, result.getComponents().length);
		assertEquals("component", result.getComponents()[0].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has two children.
	 */
	@Test
	void testGroupContent_TwoChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component1"));
		group.addComponent(new ComponentAgent("component2"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(2, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has three children.
	 */
	@Test
	void testGroupContent_ThreeChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component1"));
		group.addComponent(new ComponentAgent("component2"));
		group.addComponent(new ComponentAgent("component3"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(3, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
		assertEquals("component3", result.getComponents()[2].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has one child and one preferred gap.
	 */
	@Test
	void testGroupContent_OneChildAndOnePreferredGap() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component"));
		group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE), group.getComponent("component"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(2, result.getComponents().length);
		assertEquals("component", result.getComponents()[0].getName());
		assertEquals("preferred gap", result.getComponents()[1].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has two children and one preferred gap.
	 */
	@Test
	void testGroupContent_TwoChildrenAndOnePreferredGap() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component1"));
		group.addComponent(new ComponentAgent("component2"));
		group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE), group.getComponent("component1"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(3, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("preferred gap", result.getComponents()[1].getName());
		assertEquals("component2", result.getComponents()[2].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has three children and one preferred gap.
	 */
	@Test
	void testGroupContent_ThreeChildrenAndOnePreferredGap() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component1"));
		group.addComponent(new ComponentAgent("component2"));
		group.addComponent(new ComponentAgent("component3"));
		group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE), group.getComponent("component1"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(4, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("preferred gap", result.getComponents()[1].getName());
		assertEquals("component2", result.getComponents()[2].getName());
		assertEquals("component3", result.getComponents()[3].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has one child and two preferred gaps.
	 */
	@Test
	void testGroupContent_OneChildAndTwoPreferredGaps() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent("component"));
		group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE), group.getComponent("component"));
		group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE), group.getComponent("component"));
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(3, result.getComponents().length);
		assertEquals("component", result.getComponents()[0].getName());
		assertEquals("preferred gap", result.getComponents()[1].getName());
		assertEquals("preferred gap", result.getComponents()[2].getName());
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has two children and two preferred gaps.
	 */
	@Test
	void testGroupContent_TwoChildrenAndTwoPreferredGaps() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		group.addComponent(new ComponentAgent
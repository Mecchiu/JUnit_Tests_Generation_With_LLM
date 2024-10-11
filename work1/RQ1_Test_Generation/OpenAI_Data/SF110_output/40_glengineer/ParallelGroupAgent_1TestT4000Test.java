// ParallelGroupAgent_1Test.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParallelGroupAgent}.
* It contains ten unit test cases for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class ParallelGroupAgent_1Test {

	/**
	 * Test case #1.
	 * <p>
	 * The parallel group contains a single gap.
	 * <p>
	 * The gap is added to the parallel group.
	 */
	@Test
	void testGroupContent_1() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals(10, parallelGroup.getChild(0).getPreferredSize());
	}
	
	/**
	 * Test case #2.
	 * <p>
	 * The parallel group contains a single component.
	 * <p>
	 * The component is added to the parallel group.
	 */
	@Test
	void testGroupContent_2() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addComponent("component");
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("component", parallelGroup.getChild(0).getComponent().getName());
	}
	
	/**
	 * Test case #3.
	 * <p>
	 * The parallel group contains a single group.
	 * <p>
	 * The group is added to the parallel group.
	 */
	@Test
	void testGroupContent_3() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGroup("group");
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				group.addGroup(groupAgent.groupContent(this));
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("group", parallelGroup.getChild(0).getName());
	}
	
	/**
	 * Test case #4.
	 * <p>
	 * The parallel group contains a single gap.
	 * <p>
	 * The gap is added to the parallel group.
	 * <p>
	 * The gap is resizable.
	 */
	@Test
	void testGroupContent_4() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.getGapsType().setResizable(true);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals(10, parallelGroup.getChild(0).getPreferredSize());
		assertEquals(10, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(10, parallelGroup.getChild(0).getMaximumSize());
	}
	
	/**
	 * Test case #5.
	 * <p>
	 * The parallel group contains a single gap.
	 * <p>
	 * The gap is added to the parallel group.
	 * <p>
	 * The gap is not resizable.
	 */
	@Test
	void testGroupContent_5() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.getGapsType().setResizable(false);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals(10, parallelGroup.getChild(0).getPreferredSize());
		assertEquals(10, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(10, parallelGroup.getChild(0).getMaximumSize());
	}
	
	/**
	 * Test case #6.
	 * <p>
	 * The parallel group contains a single component.
	 * <p>
	 * The component is added to the parallel group.
	 * <p>
	 * The component is resizable.
	 */
	@Test
	void testGroupContent_6() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addComponent("component");
		parallelGroupAgent.getComponent("component").setResizable(true);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("component", parallelGroup.getChild(0).getComponent().getName());
		assertEquals(0, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(0, parallelGroup.getChild(0).getMaximumSize());
	}
	
	/**
	 * Test case #7.
	 * <p>
	 * The parallel group contains a single component.
	 * <p>
	 * The component is added to the parallel group.
	 * <p>
	 * The component is not resizable.
	 */
	@Test
	void testGroupContent_7() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addComponent("component");
		parallelGroupAgent.getComponent("component").setResizable(false);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("component", parallelGroup.getChild(0).getComponent().getName());
		assertEquals(0, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(0, parallelGroup.getChild(0).getMaximumSize());
	}
	
	/**
	 * Test case #8.
	 * <p>
	 * The parallel group contains a single group.
	 * <p>
	 * The group is added to the parallel group.
	 * <p>
	 * The group is resizable.
	 */
	@Test
	void testGroupContent_8() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGroup("group");
		parallelGroupAgent.getGroup("group").setResizable(true);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				group.addGroup(groupAgent.groupContent(this));
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("group", parallelGroup.getChild(0).getName());
		assertEquals(0, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(0, parallelGroup.getChild(0).getMaximumSize());
	}
	
	/**
	 * Test case #9.
	 * <p>
	 * The parallel group contains a single group.
	 * <p>
	 * The group is added to the parallel group.
	 * <p>
	 * The group is not resizable.
	 */
	@Test
	void testGroupContent_9() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGroup("group");
		parallelGroupAgent.getGroup("group").setResizable(false);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				group.addGroup(groupAgent.groupContent(this));
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("group", parallelGroup.getChild(0).getName());
		assertEquals(0, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(0, parallelGroup.getChild(0).getMaximumSize());
	}
	
	/**
	 * Test case #10.
	 * <p>
	 * The parallel group contains a single gap.
	 * <p>
	 * The gap is added to the parallel group.
	 * <p>
	 * The gap is resizable.
	 * <p>
	 * The gap is aligned with respect to the parallel group.
	 */
	@Test
	void testGroupContent_10() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.getGapsType().setResizable(true);
		parallelGroupAgent.getGapsType().setAlignmentWithinParent(Alignment.TRAILING);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals(10, parallelGroup.getChild(0).getPreferredSize());
		assertEquals(10, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(10, parallelGroup.getChild(0).getMaximumSize());
		assertEquals(Alignment.TRAILING, parallelGroup.getChild(0).getAlignment());
	}
	
	/**
	 * Test case #11.
	 * <p>
	 * The parallel group contains a single component.
	 * <p>
	 * The component is added to the parallel group.
	 * <p>
	 * The component is resizable.
	 * <p>
	 * The component is aligned with respect to the parallel group.
	 */
	@Test
	void testGroupContent_11() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addComponent("component");
		parallelGroupAgent.getComponent("component").setResizable(true);
		parallelGroupAgent.getComponent("component").setAlignmentWithinParent(Alignment.TRAILING);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getSize());
		assertEquals("component", parallelGroup.getChild(0).getComponent().getName());
		assertEquals(0, parallelGroup.getChild(0).getMinimumSize());
		assertEquals(0, parallelGroup.getChild(
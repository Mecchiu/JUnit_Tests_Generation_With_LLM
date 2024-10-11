// TopSequentialGroupAgentTest.java
package glengineer.agents;

import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TopSequentialGroupAgent}.
* It contains ten unit test cases for the {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class TopSequentialGroupAgentTest {

	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the first element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the first element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsFirstElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(1, result.getComponents().length);
		assertTrue(result.getComponents()[0] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the second element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the second element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsSecondElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(2, result.getComponents().length);
		assertTrue(result.getComponents()[1] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the third element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the third element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsThirdElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(3, result.getComponents().length);
		assertTrue(result.getComponents()[2] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the fourth element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the fourth element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsFourthElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(4, result.getComponents().length);
		assertTrue(result.getComponents()[3] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the fifth element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the fifth element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsFifthElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(5, result.getComponents().length);
		assertTrue(result.getComponents()[4] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the sixth element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the sixth element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsSixthElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(6, result.getComponents().length);
		assertTrue(result.getComponents()[5] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the seventh element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the seventh element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsSeventhElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(7, result.getComponents().length);
		assertTrue(result.getComponents()[6] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the eighth element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the eighth element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsEighthElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(8, result.getComponents().length);
		assertTrue(result.getComponents()[7] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the ninth element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the ninth element.
	 */
	@Test
	void testGroupContent_SequentialGroupAsNinthElement() {
		SequentialGroupAgent agent = new TopSequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new SequentialGroup();
			}
			@Override
			public SequentialGroup addGroup(SequentialGroup group) {
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				group.addComponent(new Object());
				return group.addGroup(new SequentialGroup());
			}
		};
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(9, result.getComponents().length);
		assertTrue(result.getComponents()[8] instanceof SequentialGroup);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code TopSequentialGroupAgent}
	 * is created with the {@code GroupCreatorAndElementAdder}
	 * that creates and adds the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the tenth element.
	 * <p>
	 * The {@code TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * method should return the {@code SequentialGroup}
	 * with the {@code SequentialGroup} as the tenth element.
	 */
// ParallelGroupAgentTest.java
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
class ParallelGroupAgentTest {

	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It checks the case when the agent has no children.
	 */
	@Test
	void testGroupContent_noChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addElementToGroup(ParallelGroup group, Agent agent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(0, result.getSize());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It checks the case when the agent has one child.
	 */
	@Test
	void testGroupContent_oneChild() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(ParallelGroup group, GroupCreatorAndElementAdder creatorAndAdder) {
				group.addGroup(new ParallelGroup(Alignment.TRAILING));
			}
		});
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addElementToGroup(ParallelGroup group, Agent agent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(1, result.getSize());
		Iterator<ParallelGroup> iterator = result.iterator();
		assertTrue(iterator.hasNext());
		ParallelGroup child = iterator.next();
		assertEquals(Alignment.TRAILING, child.getAlignment());
		assertEquals(0, child.getSize());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It checks the case when the agent has two children.
	 */
	@Test
	void testGroupContent_twoChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(ParallelGroup group, GroupCreatorAndElementAdder creatorAndAdder) {
				group.addGroup(new ParallelGroup(Alignment.TRAILING));
			}
		});
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(ParallelGroup group, GroupCreatorAndElementAdder creatorAndAdder) {
				group.addGroup(new ParallelGroup(Alignment.CENTER));
			}
		});
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addElementToGroup(ParallelGroup group, Agent agent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(2, result.getSize());
		Iterator<ParallelGroup> iterator = result.iterator();
		assertTrue(iterator.hasNext());
		ParallelGroup child = iterator.next();
		assertEquals(Alignment.TRAILING, child.getAlignment());
		assertEquals(0, child.getSize());
		assertTrue(iterator.hasNext());
		child = iterator.next();
		assertEquals(Alignment.CENTER, child.getAlignment());
		assertEquals(0, child.getSize());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It checks the case when the agent has three children.
	 */
	@Test
	void testGroupContent_threeChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(ParallelGroup group, GroupCreatorAndElementAdder creatorAndAdder) {
				group.addGroup(new ParallelGroup(Alignment.TRAILING));
			}
		});
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(ParallelGroup group, GroupCreatorAndElementAdder creatorAndAdder) {
				group.addGroup(new ParallelGroup(Alignment.CENTER));
			}
		});
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(ParallelGroup group, GroupCreatorAndElementAdder creatorAndAdder) {
				group.addGroup(new ParallelGroup(Alignment.BASELINE));
			}
		});
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addElementToGroup(ParallelGroup group, Agent agent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(3, result.getSize());
		Iterator<ParallelGroup> iterator = result.iterator();
		assertTrue(iterator.hasNext());
		ParallelGroup child = iterator.next();
		assertEquals(Alignment.TRAILING, child.getAlignment());
		assertEquals(0, child.getSize());
		assertTrue(iterator.hasNext());
		child = iterator.next();
		assertEquals(Alignment.CENTER, child.getAlignment());
		assertEquals(0, child.getSize());
		assertTrue(iterator.hasNext());
		child = iterator.next();
		assertEquals(Alignment.BASELINE, child.getAlignment());
		assertEquals(0, child.getSize());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It checks the case when the agent has four children.
	 */
	@Test
	void testGroupContent_fourChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new GroupAgent() {
			@Override
			public void addContentToGroup(
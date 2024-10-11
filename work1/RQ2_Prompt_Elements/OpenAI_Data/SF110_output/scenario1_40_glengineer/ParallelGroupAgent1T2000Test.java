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
	* It tests the case when the agent has no children.
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
			public void addComponentToGroup(ParallelGroup group, Agent agent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(0, result.getSize());
	}
	
	/**
	* Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has one child.
	*/
	@Test
	void testGroupContent_oneChild() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new ComponentAgent());
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addComponentToGroup(ParallelGroup group, Agent agent) {
				group.addComponent(agent.getComponent());
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(1, result.getSize());
		Iterator<FunctionsOnParallelGroupAndElement> iterator = result.iterator();
		FunctionsOnParallelGroupAndElement element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(0).getComponent(), element.getElement());
	}
	
	/**
	* Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has two children.
	*/
	@Test
	void testGroupContent_twoChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addComponentToGroup(ParallelGroup group, Agent agent) {
				group.addComponent(agent.getComponent());
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(2, result.getSize());
		Iterator<FunctionsOnParallelGroupAndElement> iterator = result.iterator();
		FunctionsOnParallelGroupAndElement element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(0).getComponent(), element.getElement());
		element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(1).getComponent(), element.getElement());
	}
	
	/**
	* Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has three children.
	*/
	@Test
	void testGroupContent_threeChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addComponentToGroup(ParallelGroup group, Agent agent) {
				group.addComponent(agent.getComponent());
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(3, result.getSize());
		Iterator<FunctionsOnParallelGroupAndElement> iterator = result.iterator();
		FunctionsOnParallelGroupAndElement element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(0).getComponent(), element.getElement());
		element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(1).getComponent(), element.getElement());
		element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(2).getComponent(), element.getElement());
	}
	
	/**
	* Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has four children.
	*/
	@Test
	void testGroupContent_fourChildren() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings(Alignment.LEADING));
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		ParallelGroup result = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(settings.getAlignment());
			}
			@Override
			public void addComponentToGroup(ParallelGroup group, Agent agent) {
				group.addComponent(agent.getComponent());
			}
		});
		assertEquals(Alignment.LEADING, result.getAlignment());
		assertEquals(4, result.getSize());
		Iterator<FunctionsOnParallelGroupAndElement> iterator = result.iterator();
		FunctionsOnParallelGroupAndElement element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(0).getComponent(), element.getElement());
		element = iterator.next();
		assertEquals(FunctionsOnParallelGroup.ADD_COMPONENT, element.getFunction());
		assertEquals(agent.getChildrenAgents().get(1).getComponent(), element.getElement());
		element = iterator.next();
		assert
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
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has no children.
	*/
	@Test
	void testGroupContent_NoChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(0, result.getComponents().length);
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has one child.
	*/
	@Test
	void testGroupContent_OneChild() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(1, result.getComponents().length);
		assertEquals("component", result.getComponents()[0].getName());
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has two children.
	*/
	@Test
	void testGroupContent_TwoChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(2, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has three children.
	*/
	@Test
	void testGroupContent_ThreeChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		agent.addChild(new ComponentAgent("component3"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(3, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
		assertEquals("component3", result.getComponents()[2].getName());
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has four children.
	*/
	@Test
	void testGroupContent_FourChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		agent.addChild(new ComponentAgent("component3"));
		agent.addChild(new ComponentAgent("component4"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(4, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
		assertEquals("component3", result.getComponents()[2].getName());
		assertEquals("component4", result.getComponents()[3].getName());
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has five children.
	*/
	@Test
	void testGroupContent_FiveChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		agent.addChild(new ComponentAgent("component3"));
		agent.addChild(new ComponentAgent("component4"));
		agent.addChild(new ComponentAgent("component5"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(5, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
		assertEquals("component3", result.getComponents()[2].getName());
		assertEquals("component4", result.getComponents()[3].getName());
		assertEquals("component5", result.getComponents()[4].getName());
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has six children.
	*/
	@Test
	void testGroupContent_SixChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		agent.addChild(new ComponentAgent("component3"));
		agent.addChild(new ComponentAgent("component4"));
		agent.addChild(new ComponentAgent("component5"));
		agent.addChild(new ComponentAgent("component6"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(6, result.getComponents().length);
		assertEquals("component1", result.getComponents()[0].getName());
		assertEquals("component2", result.getComponents()[1].getName());
		assertEquals("component3", result.getComponents()[2].getName());
		assertEquals("component4", result.getComponents()[3].getName());
		assertEquals("component5", result.getComponents()[4].getName());
		assertEquals("component6", result.getComponents()[5].getName());
	}
	
	/**
	* Test case for {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the agent has seven children.
	*/
	@Test
	void testGroupContent_SevenChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ComponentAgent("component1"));
		agent.addChild(new ComponentAgent("component2"));
		agent.addChild(new ComponentAgent("component3"));
		agent.addChild(new ComponentAgent("component4"));
		agent.addChild(new ComponentAgent("component5"));
		agent.addChild(new ComponentAgent("component6"));
		agent.addChild(new ComponentAgent("component7"));
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		Sequ
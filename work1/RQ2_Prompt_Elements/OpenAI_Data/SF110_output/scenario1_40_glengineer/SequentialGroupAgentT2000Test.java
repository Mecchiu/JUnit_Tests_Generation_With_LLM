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

	@Test
	void testGroupContent_empty() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(0, result.getChildCount());
	}
	
	@Test
	void testGroupContent_oneChild() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(1, result.getChildCount());
	}
	
	@Test
	void testGroupContent_twoChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(2, result.getChildCount());
	}
	
	@Test
	void testGroupContent_threeChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(3, result.getChildCount());
	}
	
	@Test
	void testGroupContent_fourChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(4, result.getChildCount());
	}
	
	@Test
	void testGroupContent_fiveChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(5, result.getChildCount());
	}
	
	@Test
	void testGroupContent_sixChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(6, result.getChildCount());
	}
	
	@Test
	void testGroupContent_sevenChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(7, result.getChildCount());
	}
	
	@Test
	void testGroupContent_eightChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(8, result.getChildCount());
	}
	
	@Test
	void testGroupContent_nineChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(9, result.getChildCount());
	}
	
	@Test
	void testGroupContent_tenChildren() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new ParallelGroupAgent());
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
		SequentialGroup result = agent.groupContent(creatorAndAdder);
		assertEquals(10, result.getChildCount());
	}
}

// GroupCreatorAndElementAdder.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.*;

/**
 * �����, �������������� ���������������� ������.
 */
public class GroupCreatorAndElementAdder {

    public SequentialGroup createSequentialGroup() {
        return new SequentialGroup();
    }

    public ParallelGroup createParallelGroup() {
        return new ParallelGroup();
    }

    public void addComponentToGroup(ComponentAgent componentAgent, ParallelGroup group) {
        group.addComponent(componentAgent.getComponent());
    }

    public void addGroupToGroup(GroupAgent groupAgent, SequentialGroup group) {
        group.addGroup(groupAgent.groupContent(this));
    }
}

// GroupCreatorAndElementAdderTest.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.
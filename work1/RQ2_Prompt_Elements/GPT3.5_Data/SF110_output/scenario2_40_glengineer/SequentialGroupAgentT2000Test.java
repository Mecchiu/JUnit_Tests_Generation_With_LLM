// Source code for SequentialGroupAgentTest class

package glengineer.agents;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.SequentialGroup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import glengineer.agents.setters.GroupCreatorAndElementAdder;

class SequentialGroupAgentTest {

    private SequentialGroupAgent agent;
    private GroupCreatorAndElementAdder creatorAndAdder;

    @BeforeEach
    void setUp() {
        agent = new SequentialGroupAgent();
        creatorAndAdder = mock(GroupCreatorAndElementAdder.class);
    }

    @Test
    void testGroupContentWithNoChildren() {
        SequentialGroup group = agent.groupContent(creatorAndAdder);
        verify(creatorAndAdder).createSequentialGroup();
        assertEquals(group, creatorAndAdder.createSequentialGroup());
    }

    @Test
    void testGroupContentWithOneChild() {
        Agent child = mock(Agent.class);
        agent.addChild(child);
        SequentialGroup group = agent.groupContent(creatorAndAdder);
        verify(child).addContentToGroup(group, creatorAndAdder);
    }

    @Test
    void testGroupContentWithMultipleChildren() {
        Agent child1 = mock(Agent.class);
        Agent child2 = mock(Agent.class);
        agent.addChild(child1);
        agent.addChild(child2);
        SequentialGroup group = agent.groupContent(creatorAndAdder);
        verify(child1).addContentToGroup(group, creatorAndAdder);
        verify(child2).addContentToGroup(group, creatorAndAdder);
    }
}
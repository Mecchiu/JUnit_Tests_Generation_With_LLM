// Source code for SequentialGroupAgentTest class

package glengineer.agents;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import glengineer.agents.setters.ComponentAdder;
import glengineer.agents.setters.GroupCreatorAndElementAdder;

/**
 * Test class of {@link SequentialGroupAgent}.
 * It contains ten unit test cases for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
 */
class SequentialGroupAgentTest {

    private SequentialGroupAgent sequentialGroupAgent;

    @BeforeEach
    void setUp() {
        sequentialGroupAgent = new SequentialGroupAgent();
    }

    @Test
    void testGroupContentWithNullCreatorAndAdder() {
        assertThrows(NullPointerException.class, () -> sequentialGroupAgent.groupContent(null));
    }

    @Test
    void testGroupContentWithEmptyList() {
        List<Component> components = new ArrayList<>();
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertNotNull(sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithOneComponent() {
        List<Component> components = new ArrayList<>();
        components.add(new JLabel("Label"));
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertNotNull(sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithTwoComponents() {
        List<Component> components = new ArrayList<>();
        components.add(new JLabel("Label"));
        components.add(new JTextField("Text Field"));
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertNotNull(sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithThreeComponents() {
        List<Component> components = new ArrayList<>();
        components.add(new JLabel("Label"));
        components.add(new JTextField("Text Field"));
        components.add(new JButton("Button"));
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertNotNull(sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithNullComponent() {
        List<Component> components = new ArrayList<>();
        components.add(null);
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertThrows(NullPointerException.class, () -> sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithNullComponentList() {
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(null);
        assertThrows(NullPointerException.class, () -> sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithJPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Label"));
        panel.add(new JTextField("Text Field"));
        panel.add(new JButton("Button"));
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(panel.getComponents());
        assertNotNull(sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithJPanelAndExtraComponents() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Label"));
        panel.add(new JTextField("Text Field"));
        panel.add(new JButton("Button"));
        List<Component> components = new ArrayList<>(panel.getComponents());
        components.add(new JLabel("Extra Label"));
        components.add(new JTextField("Extra Text Field"));
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertNotNull(sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithJPanelAndNullComponent() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Label"));
        panel.add(new JTextField("Text Field"));
        panel.add(new JButton("Button"));
        List<Component> components = new ArrayList<>(panel.getComponents());
        components.add(null);
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(components);
        assertThrows(NullPointerException.class, () -> sequentialGroupAgent.groupContent(creatorAndAdder));
    }

    @Test
    void testGroupContentWithJPanelAndNullComponentList() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Label"));
        panel.add(new JTextField("Text Field"));
        panel.add(new JButton("Button"));
        GroupCreatorAndElementAdder creatorAndAdder = new ComponentAdder(null);
        assertThrows(NullPointerException.class, () -> sequentialGroupAgent.groupContent(creatorAndAdder));
    }
}
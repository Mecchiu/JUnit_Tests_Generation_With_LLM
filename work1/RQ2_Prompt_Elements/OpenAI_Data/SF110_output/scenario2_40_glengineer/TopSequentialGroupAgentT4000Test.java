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
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior_withAlignment() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior_withAlignment_withResizeBehavior() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior_withAlignment_withResizeBehavior_withBaselineResizeBehavior() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior_withAlignment_withResizeBehavior_withBaselineResizeBehavior_withGaps() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior_withAlignment_withResizeBehavior_withBaselineResizeBehavior_withGaps_withAlignment() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 */
	@Test
	void testGroupContent_twoChildren_noGaps_noAlignment_noResizeBehavior_noBaselineResizeBehavior_withAlignment_withResizeBehavior_withBaselineResizeBehavior_withGaps_withAlignment_withResizeBehavior() {
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.addChild(new ComponentAgent(100, 100));
		agent.addChild(new ComponentAgent(200, 200));
		SequentialGroup result = agent.groupContent(new GroupCreatorAndElementAdder());
		assertEquals(2, result.getComponents().length);
		assertEquals(100, result.getComponents()[0].getPreferredSize().width);
		assertEquals(100, result.getComponents()[0].getPreferredSize().height);
		assertEquals(200, result.getComponents()[1].getPreferredSize().width);
		assertEquals(200, result.getComponents()[1].getPreferredSize().height);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent
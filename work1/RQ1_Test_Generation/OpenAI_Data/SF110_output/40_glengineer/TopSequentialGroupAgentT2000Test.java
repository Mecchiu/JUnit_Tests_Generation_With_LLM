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
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link SequentialGroup} object is created by the {@link GroupCreatorAndElementAdder} object.
	 * <p>
	 * The {@link GroupCreatorAndElementAdder} object is created by the {@link GroupCreatorAndElementAdderTest#createGroupCreatorAndElementAdder()} method.
	 */
	@Test
	void testGroupContent_TwoComponents() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		GroupCreatorAndElementAdder creatorAndAdder = GroupCreatorAndElementAdderTest.createGroupCreatorAndElementAdder();
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(creatorAndAdder);
		assertEquals(2, sequentialGroup.getComponents().length);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a preceding container gap,
	 * which is added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link SequentialGroup} object is created by the {@link GroupCreatorAndElementAdder} object.
	 * <p>
	 * The {@link GroupCreatorAndElementAdder} object is created by the {@link GroupCreatorAndElementAdderTest#createGroupCreatorAndElementAdder()} method.
	 */
	@Test
	void testGroupContent_TwoComponents_PrecedingContainerGap() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.getFunctionsOnTopSequentialGroupImplemenation().addPrecedingContainerGap();
		GroupCreatorAndElementAdder creatorAndAdder = GroupCreatorAndElementAdderTest.createGroupCreatorAndElementAdder();
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(creatorAndAdder);
		assertEquals(3, sequentialGroup.getComponents().length);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a following container gap,
	 * which is added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link SequentialGroup} object is created by the {@link GroupCreatorAndElementAdder} object.
	 * <p>
	 * The {@link GroupCreatorAndElementAdder} object is created by the {@link GroupCreatorAndElementAdderTest#createGroupCreatorAndElementAdder()} method.
	 */
	@Test
	void testGroupContent_TwoComponents_FollowingContainerGap() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.getFunctionsOnTopSequentialGroupImplemenation().addFollowingContainerGap();
		GroupCreatorAndElementAdder creatorAndAdder = GroupCreatorAndElementAdderTest.createGroupCreatorAndElementAdder();
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(creatorAndAdder);
		assertEquals(3, sequentialGroup.getComponents().length);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a preceding container gap,
	 * which is added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a following container gap,
	 * which is added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link SequentialGroup} object is created by the {@link GroupCreatorAndElementAdder} object.
	 * <p>
	 * The {@link GroupCreatorAndElementAdder} object is created by the {@link GroupCreatorAndElementAdderTest#createGroupCreatorAndElementAdder()} method.
	 */
	@Test
	void testGroupContent_TwoComponents_BothContainerGaps() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.addComponent(new ComponentAgent());
		topSequentialGroupAgent.getFunctionsOnTopSequentialGroupImplemenation().addBothContainerGaps();
		GroupCreatorAndElementAdder creatorAndAdder = GroupCreatorAndElementAdderTest.createGroupCreatorAndElementAdder();
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(creatorAndAdder);
		assertEquals(4, sequentialGroup.getComponents().length);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a preceding container gap,
	 * which is added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a following container gap,
	 * which is added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a {@link ParallelGroupAgent} object,
	 * which contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 *
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
* It contains ten unit test cases for the {@link ParallelGroupAgent#containsGapsOnly()} method.
*/
class ParallelGroupAgentTest {

	/**
	 * Test case 1.
	 * The parallel group agent contains only gaps.
	 */
	@Test
	void testContainsGapsOnly1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 2.
	 * The parallel group agent contains only gaps.
	 */
	@Test
	void testContainsGapsOnly2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 3.
	 * The parallel group agent contains only gaps.
	 */
	@Test
	void testContainsGapsOnly3() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
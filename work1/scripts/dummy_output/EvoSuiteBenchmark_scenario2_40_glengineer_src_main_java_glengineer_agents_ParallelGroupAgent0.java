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
	 * Verifies that the method returns true if the parallel group agent contains gaps only.
	 */
	@Test
	void testContainsGapsOnly_1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 2.
	 * Verifies that the method returns false if the parallel group agent contains gaps and components.
	 */
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 3.
	 * Verifies that the method returns false if the parallel group agent contains gaps and sequential groups.
	 */
	@Test
	void testContainsGapsOnly_3() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new SequentialGroupAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 4.
	 * Verifies that the method returns false if the parallel group agent contains gaps and parallel groups.
	 */
	@Test
	void testContainsGapsOnly_4() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ParallelGroupAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 5.
	 * Verifies that the method returns false if the parallel group agent contains gaps and components in sequential groups.
	 */
	@Test
	void testContainsGapsOnly_5() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		SequentialGroupAgent sequentialGroupAgent = new SequentialGroupAgent();
		sequentialGroupAgent.addChild(new ComponentAgent());
		agent.addChild(sequentialGroupAgent);
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 6.
	 * Verifies that the method returns false if the parallel group agent contains gaps and components in parallel groups.
	 */
	@Test
	void testContainsGapsOnly_6() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addChild(new ComponentAgent());
		agent.addChild(parallelGroupAgent);
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 7.
	 * Verifies that the method returns false if the parallel group agent contains gaps and sequential groups in sequential groups.
	 */
	@Test
	void testContainsGapsOnly_7() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		SequentialGroupAgent sequentialGroupAgent = new SequentialGroupAgent();
		sequentialGroupAgent.addChild(new SequentialGroupAgent());
		agent.addChild(sequentialGroupAgent);
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 8.
	 * Verifies that the method returns false if the parallel group agent contains gaps and sequential groups in parallel groups.
	 */
	@Test
	void testContainsGapsOnly_8() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addChild(new SequentialGroupAgent());
		agent.addChild(parallelGroupAgent);
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 9.
	 * Verifies that the method returns false if the parallel group agent contains gaps and parallel groups in sequential groups.
	 */
	@Test
	void testContainsGapsOnly_9() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		SequentialGroupAgent sequentialGroupAgent = new SequentialGroupAgent();
		sequentialGroupAgent.addChild(new ParallelGroupAgent());
		agent.addChild(sequentialGroupAgent);
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 10.
	 * Verifies that the method returns false if the parallel group agent contains gaps and parallel groups in parallel groups.
	 */
	@Test
	void testContainsGapsOnly_10() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addChild(new ParallelGroupAgent());
		agent.addChild(parallelGroupAgent);
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
}
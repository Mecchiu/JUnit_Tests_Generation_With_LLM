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
	 * The parallel group agent contains gaps only.
	 */
	@Test
	void testContainsGapsOnly1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		assertTrue(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 2.
	 * The parallel group agent contains gaps and elements.
	 */
	@Test
	void testContainsGapsOnly2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addElement(new ElementAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 3.
	 * The parallel group agent contains gaps and parallel groups.
	 */
	@Test
	void testContainsGapsOnly3() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addParallelGroup(new ParallelGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 4.
	 * The parallel group agent contains gaps and sequential groups.
	 */
	@Test
	void testContainsGapsOnly4() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addSequentialGroup(new SequentialGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 5.
	 * The parallel group agent contains gaps and elements and parallel groups.
	 */
	@Test
	void testContainsGapsOnly5() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addElement(new ElementAgent());
		agent.addParallelGroup(new ParallelGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 6.
	 * The parallel group agent contains gaps and elements and sequential groups.
	 */
	@Test
	void testContainsGapsOnly6() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addElement(new ElementAgent());
		agent.addSequentialGroup(new SequentialGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 7.
	 * The parallel group agent contains gaps and parallel groups and sequential groups.
	 */
	@Test
	void testContainsGapsOnly7() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addParallelGroup(new ParallelGroupAgent());
		agent.addSequentialGroup(new SequentialGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 8.
	 * The parallel group agent contains gaps and elements and parallel groups and sequential groups.
	 */
	@Test
	void testContainsGapsOnly8() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addGap(10);
		agent.addGap(20);
		agent.addGap(30);
		agent.addElement(new ElementAgent());
		agent.addParallelGroup(new ParallelGroupAgent());
		agent.addSequentialGroup(new SequentialGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 9.
	 * The parallel group agent contains elements only.
	 */
	@Test
	void testContainsGapsOnly9() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addElement(new ElementAgent());
		agent.addElement(new ElementAgent());
		agent.addElement(new ElementAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	/**
	 * Test case 10.
	 * The parallel group agent contains parallel groups only.
	 */
	@Test
	void testContainsGapsOnly10() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addParallelGroup(new ParallelGroupAgent());
		agent.addParallelGroup(new ParallelGroupAgent());
		agent.addParallelGroup(new ParallelGroupAgent());
		assertFalse(agent.containsGapsOnly());
	}
}
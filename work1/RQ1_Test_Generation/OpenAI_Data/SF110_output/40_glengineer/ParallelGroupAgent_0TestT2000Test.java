// ParallelGroupAgent_0Test.java
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
class ParallelGroupAgent_0Test {

	/**
	 * Test case #1.
	 * <p>
	 * The parallel group contains gaps only.
	 * <p>
	 * Expected result: {@code true}.
	 */
	@Test
	void testContainsGapsOnly_1() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertTrue(parallelGroupAgent.containsGapsOnly());
	}
	
	/**
	 * Test case #2.
	 * <p>
	 * The parallel group contains gaps only.
	 * <p>
	 * Expected result: {@code true}.
	 */
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertTrue(parallelGroupAgent.containsGapsOnly());
	}
	
	/**
	 * Test case #3.
	 * <p>
	 * The parallel group contains gaps only.
	 * <p>
	 * Expected result: {@code true}.
	 */
	@Test
	void testContainsGapsOnly_3() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertTrue(parallelGroupAgent.containsGapsOnly());
	}
	
	/**
	 * Test case #4.
	 * <p>
	 * The parallel group contains gaps only.
	 * <p>
	 * Expected result: {@code true}.
	 */
	@Test
	void testContainsGapsOnly_4() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addG
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
	 * The parallel group contains gaps and components.
	 */
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #3.
	 * <p>
	 * The parallel group contains gaps and groups.
	 */
	@Test
	void testContainsGapsOnly_3() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #4.
	 * <p>
	 * The parallel group contains gaps, components and groups.
	 */
	@Test
	void testContainsGapsOnly_4() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #5.
	 * <p>
	 * The parallel group contains gaps and components.
	 * The gaps possess different types.
	 */
	@Test
	void testContainsGapsOnly_5() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #6.
	 * <p>
	 * The parallel group contains gaps and groups.
	 * The gaps possess different types.
	 */
	@Test
	void testContainsGapsOnly_6() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #7.
	 * <p>
	 * The parallel group contains gaps, components and groups.
	 * The gaps possess different types.
	 */
	@Test
	void testContainsGapsOnly_7() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #8.
	 * <p>
	 * The parallel group contains gaps and components.
	 * The gaps possess the same type.
	 */
	@Test
	void testContainsGapsOnly_8() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #9.
	 * <p>
	 * The parallel group contains gaps and groups.
	 * The gaps possess the same type.
	 */
	@Test
	void testContainsGapsOnly_9() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}

	/**
	 * Test case #10.
	 * <p>
	 * The parallel group contains gaps, components and groups.
	 * The gaps possess the same type.
	 */
	@Test
	void testContainsGapsOnly_10() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertFalse(parallelGroupAgent.containsGapsOnly());
	}
}

// ParallelGroupAgent_1Test.java
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
* It contains ten unit test cases for the {@link ParallelGroupAgent#getGapsType()} method.
*/
class ParallelGroupAgent_1Test {
		
	/**
	 * Test case #1.
	 * <p>
	 * The parallel group contains gaps only.
	 * The gaps possess the same type.
	 */
	@Test
	void testGetGapsType_1() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertEquals(parallelGroupAgent.getGapsType(), parallelGroupAgent.getGapsType());
	}

	/**
	 * Test case #2.
	 * <p>
	 * The parallel group contains gaps and components.
	 * The gaps possess the same type.
	 */
	@Test
	void testGetGapsType_2() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertEquals(parallelGroupAgent.getGapsType(), parallelGroupAgent.getGapsType());
	}

	/**
	 * Test case #3.
	 * <p>
	 * The parallel group contains gaps and groups.
	 * The gaps possess the same type.
	 */
	@Test
	void testGetGapsType_3() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertEquals(parallelGroupAgent.getGapsType(), parallelGroupAgent.getGapsType());
	}

	/**
	 * Test case #4.
	 * <p>
	 * The parallel group contains gaps, components and groups.
	 * The gaps possess the same type.
	 */
	@Test
	void testGetGapsType_4() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertEquals(parallelGroupAgent.getGapsType(), parallelGroupAgent.getGapsType());
	}

	/**
	 * Test case #5.
	 * <p>
	 * The parallel group contains gaps only.
	 * The gaps possess different types.
	 */
	@Test
	void testGetGapsType_5() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertThrows(RuntimeException.class, () -> {
			parallelGroupAgent.getGapsType();
		});
	}

	/**
	 * Test case #6.
	 * <p>
	 * The parallel group contains gaps and components.
	 * The gaps possess different types.
	 */
	@Test
	void testGetGapsType_6() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertThrows(RuntimeException.class, () -> {
			parallelGroupAgent.getGapsType();
		});
	}

	/**
	 * Test case #7.
	 * <p>
	 * The parallel group contains gaps and groups.
	 * The gaps possess different types.
	 */
	@Test
	void testGetGapsType_7() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertThrows(RuntimeException.class, () -> {
			parallelGroupAgent.getGapsType();
		});
	}

	/**
	 * Test case #8.
	 * <p>
	 * The parallel group contains gaps, components and groups.
	 * The gaps possess different types.
	 */
	@Test
	void testGetGapsType_8() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertThrows(RuntimeException.class, () -> {
			parallelGroupAgent.getGapsType();
		});
	}

	/**
	 * Test case #9.
	 * <p>
	 * The parallel group contains gaps and components.
	 * The gaps possess the same type.
	 */
	@Test
	void testGetGapsType_9() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addComponent(new ComponentAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertEquals(parallelGroupAgent.getGapsType(), parallelGroupAgent.getGapsType());
	}

	/**
	 * Test case #10.
	 * <p>
	 * The parallel group contains gaps and groups.
	 * The gaps possess the same type.
	 */
	@Test
	void testGetGapsType_10() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGroup(new GroupAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		parallelGroupAgent.addGap(new GapAgent());
		assertEquals(parallelGroupAgent.getGapsType(), parallelGroupAgent.getGapsType());
	}
}

// ParallelGroupAgent_2Test.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.Fun
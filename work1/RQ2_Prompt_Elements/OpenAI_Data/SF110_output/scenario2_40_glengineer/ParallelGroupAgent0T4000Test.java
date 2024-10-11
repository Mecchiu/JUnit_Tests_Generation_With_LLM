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

// ParallelGroupSettings.java
package glengineer.agents.settings;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;

/**
 * �����, �������������� ������������ ������.
 */
public class ParallelGroupSettings {

    /**
     * The alignment of the parallel group.
     */
    private Alignment alignment;

    /**
     * The resizable property of the parallel group.
     */
    private boolean resizable;

    /**
     * The preferred size of the parallel group.
     */
    private int preferredSize;

    /**
     * The maximum size of the parallel group.
     */
    private int maximumSize;

    /**
     * The minimum size of the parallel group.
     */
    private int minimumSize;

    /**
     * Creates a new instance of {@link ParallelGroupSettings}.
     */
    public ParallelGroupSettings() {
        this.alignment = Alignment.LEADING;
        this.resizable = true;
        this.preferredSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.maximumSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.minimumSize = GroupLayoutSettings.DEFAULT_SIZE;
    }

    /**
     * Creates a new instance of {@link ParallelGroupSettings} with the specified alignment.
     *
     * @param alignment the alignment of the parallel group
     */
    public ParallelGroupSettings(Alignment alignment) {
        this.alignment = alignment;
        this.resizable = true;
        this.preferredSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.maximumSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.minimumSize = GroupLayoutSettings.DEFAULT_SIZE;
    }

    /**
     * Creates a new instance of {@link ParallelGroupSettings} with the specified alignment and resizable property.
     *
     * @param alignment the alignment of the parallel group
     * @param resizable the resizable property of the parallel group
     */
    public ParallelGroupSettings(Alignment alignment, boolean resizable) {
        this.alignment = alignment;
        this.resizable = resizable;
        this.preferredSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.maximumSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.minimumSize = GroupLayoutSettings.DEFAULT_SIZE;
    }

    /**
     * Creates a new instance of {@link ParallelGroupSettings} with the specified alignment, resizable property, and preferred size.
     *
     * @param alignment the alignment of the parallel group
     * @param resizable the resizable property of the parallel group
     * @param preferredSize the preferred size of the parallel group
     */
    public ParallelGroupSettings(Alignment alignment, boolean resizable, int preferredSize) {
        this.alignment = alignment;
        this.resizable = resizable;
        this.preferredSize = preferredSize;
        this.maximumSize = GroupLayoutSettings.DEFAULT_SIZE;
        this.minimumSize = GroupLayoutSettings.DEFAULT_SIZE;
    }

    /**
     * Creates a new instance of {@link ParallelGroupSettings} with the specified alignment, resizable property, preferred size, and maximum size.
     *
     * @param alignment the alignment of the parallel group
     * @param resizable the resizable property of the parallel group
     * @param preferredSize the preferred size of the parallel group
     * @param maximumSize the maximum size of the parallel group
     */
    public ParallelGroupSettings(Alignment alignment, boolean resizable, int preferredSize, int maximumSize) {
        this.alignment = alignment;
        this.resizable = resizable;
        this.preferredSize = preferredSize;
        this.maximumSize = maximumSize;
        this.minimumSize = GroupLayoutSettings.DEFAULT_SIZE;
    }

    /**
     * Creates a new instance of {@link ParallelGroupSettings} with the specified alignment, resizable property, preferred size, maximum size, and minimum size.
     *
     * @param alignment the alignment of the parallel group
     * @param resizable the resizable property of the parallel group
     * @param preferredSize the preferred size of the parallel group
     * @param maximumSize the maximum size of the parallel group
     * @param minimumSize the minimum size of the parallel group
     */
    public ParallelGroupSettings(Alignment alignment, boolean resizable, int preferredSize, int maximumSize, int minimumSize) {
        this.alignment = alignment;
        this.resizable = resizable;
        this.preferredSize = preferredSize;
        this.maximumSize = maximumSize;
        this.minimumSize = minimumSize;
    }

    /**
     * Returns the alignment of the parallel group.
     *
     * @return the alignment of the parallel group
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Sets the alignment of the parallel group.
     *
     * @param alignment the alignment of the parallel group
     */
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * Returns the resizable property of the parallel group.
     *
     * @return the resizable property of the parallel group
     */
    public boolean isResizable() {
        return resizable;
    }

    /**
     * Sets the resizable property of the parallel group.
     *
     * @param resizable the resizable property of the parallel group
     */
    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }

    /**
     * Returns the preferred size of the parallel group.
     *
     * @return the preferred size of the parallel group
     */
    public int getPreferredSize() {
        return preferredSize;
    }

    /**
     * Sets the preferred size of the parallel group.
     *
     * @param preferredSize the preferred size of the parallel group
     */
    public void setPreferredSize(int preferredSize) {
        this.preferredSize = preferredSize;
    }

    /**
     * Returns the maximum size of the parallel group.
     *
     * @return the maximum size of the parallel group
     */
    public int getMaximumSize() {
        return maximumSize;
    }

    /**
     * Sets the maximum size of the parallel group.
     *
     * @param maximumSize the maximum size of the parallel group
     */
    public void setMaximumSize(int maximumSize) {
        this.maximumSize = maximumSize;
    }

    /**
     * Returns the minimum size of the parallel group.
     *
     * @return the minimum size of the parallel group
     */
    public int getMinimumSize() {
        return minimumSize;
    }

    /**
     * Sets the minimum size of the parallel group.
     *
     * @param minimumSize the minimum size of the parallel group
     */
    public void setMinimumSize(int minimumSize) {
        this.minimumSize = minimumSize;
    }

    /**
     * Applies the settings to the specified parallel group.
     *
     * @param parallelGroup the parallel group to which the settings are applied
     */
    public void applyTo(ParallelGroup parallelGroup) {
        FunctionsOnParallelGroup.setAlignment(parallelGroup, alignment);
        FunctionsOnParallelGroup.setResizable(parallelGroup, resizable);
        FunctionsOnParallelGroup.setPreferredSize(parallelGroup, preferredSize);
        FunctionsOnParallelGroup.setMaximumSize(parallelGroup, maximumSize);
        FunctionsOnParallelGroup.setMinimumSize(parallelGroup, minimumSize);
    }

    /**
     * Applies the settings to the specified parallel group and element.
     *
     * @param parallelGroup the parallel group to which the settings are applied
     * @param element the element to which the settings are applied
     */
    public void applyTo(ParallelGroup parallelGroup, Object element) {
        FunctionsOnParallelGroupAndElement.setAlignment(parallelGroup, element, alignment);
        FunctionsOnParallelGroupAndElement.setResizable(parallelGroup, element, resizable);
        FunctionsOnParallelGroupAndElement.setPreferredSize(parallelGroup, element, preferredSize);
        FunctionsOnParallelGroupAndElement.setMaximumSize(parallelGroup, element, maximumSize);
        FunctionsOnParallelGroupAndElement.setMinimumSize(parallelGroup, element, minimumSize);
    }
}

// ParallelGroupSettingsTest.java
package glengineer.agents.settings;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParallelGroupSettings}.
* It contains ten unit test cases for the {@link ParallelGroupSettings#applyTo(ParallelGroup)} method.
*/
class ParallelGroupSettingsTest {
		
	/**
	 * Test case 1.
	 * Verifies that the method applies the settings to the parallel group.
	 */
	@Test
	void testApplyTo_1() {
		ParallelGroup parallelGroup = FunctionsOnGroup.createParallelGroup();
		ParallelGroupSettings settings = new ParallelGroupSettings(Alignment.TRAILING, false, 10, 20, 30);
		settings.applyTo(parallelGroup);
		assertEquals(Alignment.TRAILING, FunctionsOnParallelGroup.getAlignment(parallelGroup));
		assertFalse(FunctionsOnParallelGroup.isResizable(parallelGroup));
		assertEquals(10, FunctionsOnParallelGroup.getPreferredSize(parallelGroup));
		assertEquals(20, FunctionsOnParallelGroup.getMaximumSize(parallelGroup));
		assertEquals(30, FunctionsOnParallelGroup.getMinimumSize(parallelGroup));
	}
	
	/**
	 * Test case 2.
	 * Verifies that the method applies the settings to the parallel group and element.
	 */
	@Test
	void testApplyTo_2() {
		ParallelGroup parallelGroup = FunctionsOnGroup.createParallelGroup();
		Object element = new Object();
		ParallelGroupSettings settings = new ParallelGroupSettings(Alignment.TRAILING, false, 10, 20, 30);

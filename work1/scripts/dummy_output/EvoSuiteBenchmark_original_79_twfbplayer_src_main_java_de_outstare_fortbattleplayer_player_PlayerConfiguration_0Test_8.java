// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {
		/**
		 * {@value}
		 */
    private static final int MIN_VALUE = 0;
    /**
     * {@value}
     */
    private static final String MIN_VALUE_STRING = "0";
    /**
     * {@value}
     */
    private static final String TARGET_STRING = "Target";
    /**
     * {@value}
     */
    private static final String TARGET_VALUE = "Random Target";
    /**
     * {@value}
     */
    private static final Set<String> TARGETS = new HashSet<>();
    /**
     * {@value}
     */
    private static final Set<String> INITIAL_CONDITIONS = new HashSet<>();
    /**
     * {@value}
     */
    private static final Set<String> INITIAL_CONDITION_STRINGS = new HashSet<>();

    static {
        INITIAL_CONDITIONS.add("Random Condition");
        INITIAL_CONDITION_STRINGS.add("Random condition");
        INITIAL_CONDITION_STRINGS.add("Random Condition 1");
        INITIAL_CONDITION_STRINGS.add("Random Condition 1");
        INITIAL_CONDITION_STRINGS.add("Random Condition 1");
        INITIAL_CONDITIONS.add("Random Condition");
        INITIAL_CONDITION_STRINGS.add("Random Condition 1");
        INITIAL_CONDITION_STRINGS.add("Random Condition 2");
        INITIAL_CONDITION_STRINGS.add("Random Condition 3");
        INITIAL_CONDITION_STRINGS
           .add("Random Condition");
        INITIAL_CONDITION_STRINGS.add("Random Condition 1");
        INITIAL_CONDITION_STRINGS.add("Random Condition 2");
    }

    @Test
    public void testCopy() {
        assertEquals(INITIAL_CONDITIONS, Configuration.get().getInitialConditions());
        assertEquals(INITIAL_CONDITION_STRINGS, Configuration.get().getInitialConditionStrings());
        setParameters(TARGET, "123", "1000", TARGETS);
        PlayerConfiguration config = configuration(INITIAL_CONDITIONS.iterator(), TARGET_STRING, TARGET_VALUE);
        config.copy();
        assertEquals(INITIAL_CONDITIONS, config.getInitialConditions());
        assertEquals(INITIAL_CONDITION_STRINGS, config.getInitialConditionStrings());
    }

    private void setParameters(String value) {
        if(value.equals(MIN_VALUE_STRING))
            values.remove(MinValue.class.getCanonicalName());
        values.put(value);
    }


	@Test
	public void testConstructor() {
		setParameters("50");
		Set<String> actualValues = new HashSet<>();
		lock.lock();
		try {
			actualValues.addAll(values.values());
			assertEquals(values.size(), actualValues.size());
			for (String actualValue : actualValues) {
				String actualMinValue = actualValue.split("@")[0];
				String actualTarget = actualValue.split("@")[1];
				Set<String> actualTargets = new HashSet<>();
				lock.lock();
				try {
					actualTargets.addAll(TARGETS);
				} finally {
					lock.unlock();
				}
				assertEquals(TARGETS.size(), actualTargets.size());
			}

		} finally {
			lock.unlock();
		}
	}

	/**
	 * @return the values
	 */
	Set<String> getValues() {
		lock.lock();
		try{
			return values.keySet();
		}finally{
			lock.unlock();
		}
	}

	/**
	 * @param actualMinValue the actualMinValue to set
	 */
	void setInitialValues(String actualMinValue) {
		values.put(MIN_VALUE_STRING, actualMinValue.split("@")[0]);
	}

	/**
	 * @return the initialMinValue
	 */
	String getInitialMinValue() {
		return values.get(MIN_VALUE_STRING).split("@")[0];
	}

	/**
	 * @param actualTarget the actualTarget to set
	 */
	void setTarget(String actualTarget) {
		values.put(TARGET_STRING, actualMinValue.split("@")[1]);
		TARGETS.add(TARGET_STRING);
		TARGETS
			.add(values.get(TARGET_STRING).split("@")[1]);
		TARGETS
			.add(values.get(TARGET_STRING).split("@")[1]);
	}

	/**
	 * @return the initialTargets
	 */
	Set<String> getInitialTargets() {
		return TARGETS;
	}

	/**
	 * @param actualTarget the actualTarget to setTarget
	 */
	void setInitialTargets(String actualTarget) {
		setInitialTarget(actualTarget);
	}

	@Test
    public void testInitialValues() {
        lock.lock();
        assertNotNull(0, getInitialMinValue());
        assertNotNull(1, getInitialTargets());

        lock.lock();
        assertEquals(getInitialMinValue(), values.get(MIN_VALUE_STRING));
        assertEquals(getInitialTargets(), TARGETS);
        lock.unlock();
    }

	@Test
    public void testParameter() {
        lock.lock();
        assertEquals(TARGET_VALUE, values.get(TARGET_STRING));
        lock.unlock();
    }

	@Configuration(Configuration.class)
	static class SetTargets {
		/**
		 * Constructor
		 * @param setValueSet the set value set to setTarget
		 * @param setValueString set valuestring to setTarget
		 * @param setTargetToSetSet the setTarget to set
		 */
		SetTargets(Set<String> setValueSet, String setValueString, Set<String> setTargetToSetSet) {
			assertEquals(setTargetToSetSet.size(), setTargetToSetSet.size());
			setValueSet.addAll(TARGETS);
		}
	}

	/**
	 * Test to check if all conditions which are to be set in the initial values have been set.
	 */
	void testSetCondition() {
		new Assertor<>().assertTrue("Condition not set", values.get(TARGETS))
				.test();
	}

	/**
	 * Test to checks if all values have been set.
	 */
	@Test
    public void testValuesNotEquals() {
        lock.lock();
        assertEquals(INITIAL_CONDITIONS, configuration(INITIAL_CONDITIONS.iterator(), TARGETS.iterator().next()));
		lock.unlock();
    }

	/**
	 * Test if the condition can be reset with the initial values.
	 */
}
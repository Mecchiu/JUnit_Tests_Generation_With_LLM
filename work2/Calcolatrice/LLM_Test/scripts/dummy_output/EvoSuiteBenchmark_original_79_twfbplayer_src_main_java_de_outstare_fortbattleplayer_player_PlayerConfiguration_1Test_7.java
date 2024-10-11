// PlayerConfiguration_1Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {
		
	/**
	 * Set up test case.
	 * @throws NullPointerException is thrown if 'target' is <code>null</code>.
	 */
	@Test
	void testInitialization()
		throws NullPointerException {

		final Set<String> targets;
		final String initialTargets;
		
		// Create a new configuration with an empty set of targets.
		new PlayerConfiguration(new String[]{""});

		// Inject null values for any target names that are not found in the
		// configuration.
		for (final String target : Configuration.NO_TARGET_NAMES) {

			Configuration.addAllNames(new String[]{target}, getDefaultTargets());

			// Create a new configuration with the target (but do not include to
			// any targets in the configuration).
			new PlayerConfiguration(new String[]{target});

			// Ensure no other target was found.
			assertEquals(Configuration.NO_TARGET_NAMES.size() - 1, Configuration.size());
		}

		// Initialize new configuration with targets that are not
		// contained in the configuration.
		new PlayerConfiguration(new String[]{"Fritz"});

		// Inject more targets that are not in the configuration.
		for (final String target : Configuration.NO_TARGET_NAMES) {

			Configuration.addAllNames(new String[]{target}, getOtherTargets());

			// Create a new configuration with the target (but do not include to
			// any targets in the configuration).
			new PlayerConfiguration(new String[]{target});

			// Ensure no other target was found.
			assertEquals(Configuration.NO_TARGET_NAMES.size() - 1, Configuration.size());
		}


		// Set up targets the one that should have only its own value.
		initialTargets = "Fritz";
		targets = new HashSet<>();
		targets.add(initialTargets);
								
		// Ensure that a configuration with only an initial target is not
		// initialized.
		new PlayerConfiguration(new String[]{initialTargets});

		assertEquals(0, Configuration.size());

		// Test that all given values are added into the configuration.
		new PlayerConfiguration(new String[]{"A", "B"});
		
		final Set<String> expectedValues = new HashSet<>();	
		expectedValues.add("B");

		targets = new HashSet<>();
		targets.add("B");
		new PlayerConfiguration(new String[]{"C"});
			
		new PlayerConfiguration(new String[]{"C", initialTargets}, Config.addAll(expectedValues));

		targets = new HashSet<>();
		targets.add(initialTargets);
		new PlayerConfiguration(new String[]{"C"}, Config.addAll(expectedValues));

		
		// Ensure that all values in the set that should have only an initlal value
		// are added.
		
		expectedValues = new HashSet<>(); 
		expectedValues.add("B");
		new PlayerConfiguration(new String[]{"A"});
			
		new PlayerConfiguration(new String[]{"C"}, Config.addAll(expectedValues));

		expectedValues = new HashSet<>();
		expectedValues.add(initialTargets);

		new PlayerConfiguration(new String[]{"C"});
		
		new PlayerConfiguration(new String[]{"C", initialTargets}, Config.addAll(expectedValues));


		// Ensure that all values in the set that should have only an initlal value
		// don't affect the configuration.
		
		expectedValues = new HashSet<>();
		expectedValues.add(initialTargets);

		new PlayerConfiguration(new String[]{"A"});
	}
	
	/**
	 * Return default targets for all players as set.
	 * @return Sets of all targets.
	 */
	Set<String> getDefaultTargets() {
		Set<String> targets = new HashSet<>();
		for (final Player player : Configuration.getAllPlayers()) {
			targets.add(player.getDefaultTargets().iterator().next());
		}	
		return targets;
	}
	
	/**
	 * Return default targets for the given list of players as set.
	 * @return Sets of all targets from given list.
	 */
	Set<String> getDefaultTargets(final String... players) {
		Set<String> targets = new HashSet<>();
		for (final Player player : Configuration.getAllPlayers()) {
			targets.add(player.getDefaultTargets().iterator().next());
		}
		for (String player : players) {
			targets.add(player);
		}
		return targets;
	}
	
	/**
	 * Return sets of other targets for all players as set.
	 * @return Sets of all targets other players.
	 */
	Set<String> getOtherTargets() {
		Set<String> targets = new HashSet<>();
		for (final Player player : Configuration.getAllPlayers()) {
			targets.add(player.getOtherTargets().iterator().next());	
		}
		return targets;
	}
	
	/**
	 * Initialize new configuration with targets that are not in the configuration.
	 * @param targets Set of strings to inject.
	 */
	void initConfiguration(final Set<String> targets) {
		for (String target : targets) {
			Configuration.addAll(target, getOtherTargets());
		}
	}
	
	/**
	 * Test of {@link PlayerConfiguration#showMoveTargets()} for empty configuration.
	 */
	@Test
	void testInitWithNullConfiguration() {
	
		Configuration.addAll(null);
		assertEquals(Configuration.NO_TARGET_NAMES, getDefaultTargets());

		Configuration.addAll(new HashSet<>());
		assertFalse(getDefaultTargets().isEmpty());

	}

	/**
	 * Test of {@link PlayerConfiguration#showMoveTargets()} for initial configuration.
	 */
	@Test
	void testInitWithTargetConfiguration() throws Exception {
		
		// Update the set of targets to include a value from a configuration.
		new PlayerConfiguration(new String[]{"A", "B"}).initConfiguration(Config.addAll(getOtherTargets(), Configuration.getAllPlayers()));		
		assertEquals(new HashSet<>(Configuration.getAllPlayers(), Configuration.getAllPlayers()), new HashSet<>(getDefaultTargets()));
		
		new Configuration(getOtherTargets().iterator());
		assertEquals(new HashSet<>(Configuration.getAllPlayers(), Configuration.getAllPlayers()), new HashSet<>(getDefaultTargets()));
	}
	
	/**
	 * Test of {@link PlayerConfiguration#addAll(Set)}.
	 */
	@Test
	void testAddAllWithSet() {

//		new PlayerConfiguration(new String[]{"X"})
//			.addAll(getOtherTargets())
//			.initConfiguration(getOtherTargets());

		final Set<String> expected = new HashSet<>();
}
}
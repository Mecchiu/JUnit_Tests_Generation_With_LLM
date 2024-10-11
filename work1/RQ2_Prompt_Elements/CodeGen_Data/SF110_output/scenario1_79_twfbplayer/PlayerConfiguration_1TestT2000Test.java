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
		 * Test for {@link PlayerConfiguration#showMoveTargets()} method, i.e. whether it takes place.
		 */
		@Test
		void shouldShowMoveTargets() {
		// Given
		boolean SHOW_MOVETARGETS_1 = Configuration.getInstance().showMoveTargets();

				// When
				Configuration.setInstance(SET_SHOW_MOVETARGETS_1);

				// Then
				assertFalse(SHOW_MOVETARGETS_1);
		}
}

// PlayerConfiguration_2.java
package de.outstare.fortbattleplayer;

import java.util.Set;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * The class implements the test case for {@link PlayerConfiguration#showMoveTargets()}.
 * It adds a dummy test method to this test case.
 */
class PlayerConfiguration_2Test implements Cloneable {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        int TEST_COUNT = Integer.parseInt(Configuration.getInstance().getProperty("totTunableTargets.test.count"));
		Set<Set<TestTuple_1>> tempUnusedTargets = new HashSet<Set<TestTuple_1>>();
		for (int i = 0; i < TEST_COUNT;++i) {  // It only takes some memory of the current test implementation
			tempUnusedTargets.add(new HashSet<TestTuple_1>());
		}
		Set<Set<TestTuple_2>> allTargettedTargets1 = new HashSet<Set<TestTuple_2>>();
		Set<Set<TestTuple_2>> allTargettedTargets2 = new HashSet<Set<TestTuple_2>>();
		for (int i = 0; i < TEST_COUNT;++i) {    // Each of the tests can be used to test if
				// the tunable is selected for all possible selected targets
				allTargettedTargets1.add(new HashSet<TestTuple_2>());
				allTargettedTargets2.addAll(allTargettedTargets1);
		}
		Set<Set<TestTuple_1>> allTargettedTargets1_1 = new HashSet<Set<TestTuple_1>>();
		Set<Set<TestTuple_2>> allTargettedTargets1_2 = new HashSet<Set<TestTuple_2>>();
		for (int i = 0; i < TEST_COUNT;++i) {        // The other test case is used to test if the tunable
			// is selected for all possible tuned targets
				allTargettedTargets1.add(new TestTuple_1(allTargettedTargets1_1));
				allTargettedTargets1_2.addAll(allTargettedTargets1);
		}
		Set<Set<TestTuple_1>> allTargettedTargets2_1 = new HashSet<Set<TestTuple_1>>();
		Set<Set<TestTuple_2>> allTargettedTargets2_2 = new HashSet<Set<TestTuple_2>>();
		for (int i = 0; i < TEST_COUNT;++i) {        // The other test case is used to test if the tunable
			// is selected for all possible tuned targets
			allTargettedTargets2.add(new TestTuple_2(allTargettedTargets2_2));
			allTargettedTargets2_2.addAll(allTargettedTargets2);
		}

		// When
		Set<Set<TestTuple_1>> unusedTargets = new HashSet<Set<TestTuple_1>>();
		unusedTargets.addAll(allTargettedTargets1);
		unusedTargets.addAll(allTargettedTargets2);
		System.out.println(unusedTargets);

		// Then
		//System.out.println(tempUnusedTargets);
		assertEquals(tempUnusedTargets.size(),allTargettedTargets1.size()+allTargettedTargets2.size());
		for (Set<TestTuple_1> tuple : unusedTargets) {
			// Unused target in the target list
			assertTrue(tuple.size() >= 0);
			for (Set<TestTuple_2> target : tuple) {
					// The target is in the target list
					assertTrue(target.size() >= 0);
			}
		}
                
		// When
		allTargettedTargets1.clear();
		allTargettedTargets2.clear();
		Set<Set<TestTuple_1>> tempTargets1 = new HashSet<Set<TestTuple_1>>();
		Set<Set<TestTuple_2>> tempTargets2 = new HashSet<Set<TestTuple_2>>();
		tempTargets1.addAll(allTargettedTargets1);
		tempTargets2.addAll(allTargettedTargets2);

                // When
                allUsedTargets = new HashSet<Set<TestTuple_1>>();
                for (Set<TestTuple_1> oneTuple : tempTargets1) {
                        for (Set<TestTuple_2> twoTuple:tempTargets2) {
                        			// It should not find all unused targets in the other list
                            for (TestTuple_1 one:oneTuple) {
                                        for (TestTuple_2 two:twoTuple) {
                                            assertTrue(!one.equals(two));
                                        }
                            }
                        }
                }
                
                // Then
                assertEquals(allUsedTargets,allTargettedTargets1);
                assertEquals(allUsedTargets,allTargettedTargets2);

				//When
				//System.out.println(tempTargets2);
                	allTargettedTargets1_1.clear();
		        allTargettedTargets1_2.clear();
                	allTargettedTargets2_1.clear();
                	allTargettedTargets2_2.clear();
                	allTargettedTargets1.clear();
                	allTargettedTargets2.clear();
				for (Set<TestTuple_1> oneTuple:tempTargets2) {
				     for (Set<TestTuple_2> twoTuple:tempTargets1) {// It should not find all unused targets in the other list
				               for (TestTuple_1 fromOne:oneTuple) {
                                            for (TestTuple_2 two:twoTuple) {
                                                assertTrue(!oneTuple.contains(two));
                                            }
                                        }
				     }
                               }
		//When
                	        unusedTargets.add(1);
                    		unusedTargets.clear();
				// Then
				//System.out.println(unusedTargets);
				assertTrue(unusedTargets.size()==3);
                	  for (
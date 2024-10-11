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
		* Test of getCurrentState method, of class PlayerConfiguration.
		*/
        @Test
		public void testGetCurrentState() {
			System.out.println("getCurrentState");
			PlayerConfiguration me = new PlayerConfiguration(0);

			System.out.println("return: "+me.getCurrentState());
			try { me.getCurrentState(); }
			catch (UnsupportedOperationException e) { System.out.println("Caught: " + e); }
			catch (IllegalStateException e) { System.out.println("Caught: " + e); }
			try { me.getRanking();}
			catch (UnsupportedOperationException e) { System.out.println("Caught: " + e); }
			catch (IllegalStateException e1) { System.out.println("Caught: " + e1); }
		}

        @Test
		public void testGetRanking1() throws UnsupportedOperationException {
			System.out.println("getRanking");
			PlayerConfiguration me = new PlayerConfiguration();

			Set<Integer> ranks = new HashSet<>();
			ranks.add(1);
			me.getRanking(ranks);
			assertTrue(me.isPresent(ranks));
		}

		@Test
		public void testGetRanking2() throws UnsupportedOperationException {
			System.out.println("getRanking2");
			PlayerConfiguration mock = mock(PlayerConfiguration.class);
			int count = 1;
			// we need to fake the first element for test
			CountState ts1 = mock.new CountState(count++);
			ts1.save();

			PlayerConfiguration me = new PlayerConfiguration();
			Set<Integer> ranks = new HashSet<>();
			ranks.add(1);
			me.getRanking(ranks);
			assertTrue(me.isPresent(ranks));

			count = 0;
			// we need to fake the second element for test!
			CountState ts2 = mock.new CountState(count + 1);
			ts2.save();

			assertFalse(me.isPresent(ranks));

		}

		@Test
		public void testGetRanking3() throws UnsupportedOperationException {
			System.out.println("getRanking3");
			PlayerConfiguration me = mock(PlayerConfiguration.class);
			int count = 0;
			CountState ts = mock.new CountState(count++);
			ts.save();

			PlayerConfiguration mock = mock(PlayerConfiguration.class);
			me.getRanking(HashSet.class);
			assertTrue(me.isPresent(HashSet.class));

			count = 0;
			ts = mock.new CountState(count++);
			ts.save();

			assertFalse(me.isPresent(HashSet.class));

		}

        /**
         * Utility class
         */
        private static final class CountState {
                /**
                 * Creates an instance of {@link CountState}
                 */
                private CountState(Integer c) {
                        this.cur = c;
                }

                void save() {
                 curTick = System.nanoTime();
               }

                void increment() {
                  cur = (int) (cur + 1);
                }

                int get() { return cur; }

                int getTicked() { return curTick; }

                void restore() { cur = curTick = 0; }

                public boolean isPresent(Set<Integer> hashes) { return hashes.contains(cur); }

                public Set<Integer> get() {
                        Integer[] ts = new Integer[cur];
				if(isPresent(hashes))
					for(int i = 0; i < hashes.size(); i++)
						ts[i] = hashes.get(i);
				else
					ts = new Integer[cur];
                        return ts;
                }

                final Integer cur = 0;
                final Long curTick = 0L;
        }
}
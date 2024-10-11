// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains one unit test case for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		private final Battleplan battleplan;
		private static final Logger log = Logger.getLogger(BattleplanTest.class.getName());

		BattleplanTest() {
					battleplan = new Battleplan();
					battleplan.numberOfRounds();
				}

		/**
		* Test method for {@link Battleplan#Battleplan(Collection)}.
		*/
		@Test
		public void testConstructorCollection() {
				Collection<IBattlePlayer> players = new TreeMap<>();
				Battleresult result = new Battleresult();

				IBattlePlayer a = battleplan.battlePlayer(players);
				assertNotNull(a);
				assertEquals(players.size(), 0);
				assertNull(battleplan.battlePlayer());
				Battleplan newBattleplan = new Battleplan(players);
				assertNotNull(newBattleplan.battlePlayer());
				assertEquals(players.size(), 1);
				assertNotNull(newBattleplan.battlePlayer());
				assertNotNull(newBattleplan.battlePlayer()); // todo add test for correct ordering
				assertNotSame(-1, battleplan.battlePlayer().compareTo(newBattleplan.battlePlayer())); // Test both method
		}

		/**
		* Test method for {@link Battleplan#Battleplan(Collection)}.
		*/
		@Test
		public void testConstructorCollectionA() {
				Collection<String> players = new TreeSet<>();
				players.add("a");
				Battleresult result = new Battleresult();

				String player = "a";
				IBattlePlayer b = battleplan.battlePlayer(players);
				assertNotNull(b);
				assertEquals(players.size(), 0);
				assertNull(battleplan.battlePlayer());
				Battleplan newBattleplan = new Battleplan(players);
				assertNotNull(newBattleplan.battlePlayer());
				assertEquals(players.size(), 1);
				assertNotNull(newBattleplan.battlePlayer());
				assertNotSame(-1, battleplan.battlePlayer().compareTo(newBattleplan.battlePlayer())); // Test both method
		}

		/**
		* Test method for {@link Battleplan#Battleplan_withMap(SortedMap)}.
		*/
		@Test
		public void testConstructorSortedMap() {
				SortedMap<String, IBattlePlayer> map
                     = new TreeMap<>();
				map.put("a", battleplan.battlePlayer("a"));
				map.put("b", battleplan.battlePlayer("b"));
				map.put("c", battleplan.battlePlayer("c"));
				map.put("d", battleplan.battlePlayer("d"));
				map.put("e", battleplan.battlePlayer("e"));
				map.put("f", battleplan.battlePlayer("f"));
				map.put("g", battleplan.battlePlayer("g"));
				map.put("h", battleplan.battlePlayer("h"));
				SortedMap<String, IBattlePlayer> newMap
						= new TreeMap<>(map);
				assertEquals(newMap.size(), 3);
				assertTrue(newMap.containsKey("b"));
				assertEquals(battleplan.battlePlayer("b").compareTo(newMap.get("b")), 0);
				assertEquals(newMap.get("d").compareTo(battleplan.battlePlayer("d")), 0);
				assertTrue(newMap.containsKey("d"));
				assertTrue(battleplan.battlePlayer("d").compareTo(newMap.get("d")) <= 0);

				Battleplan result = new Battleplan_withMap(map);
				assertNotNull(newMap);
				assertEquals(newMap.size(), 3);
				assertTrue(newMap.containsKey("b"));
				assertEquals(battleplan.battlePlayer("b").compareTo(newMap.get("b")), 0);
				assertTrue(newMap.containsKey("d"));
				assertTrue(battleplan.battlePlayer("d").compareTo(newMap.get("d")) <= 0);
				assertTrue(newMap.containsKey("e"));
				assertTrue(battleplan.battlePlayer("e").compareTo(newMap.get("e"))!= -1);
				assertTrue(newMap.containsKey("f"));
				assertTrue(battleplan.battlePlayer("f").compareTo(newMap.get("f")) >= 0);
				assertTrue(newMap.containsKey("g"));
				assertTrue(battleplan.battlePlayer("g").compareTo(newMap.get("g")) == 0);
				assertTrue(newMap.containsKey("h"));
				assertTrue(battleplan.battlePlayer("h").compareTo(newMap.get("h")) > 0);
				assertEquals(newMap.get("h").compareTo(battleplan.battlePlayer("h")), 0);

				SortedMap<String, IBattlePlayer> newMap2 =
				// todo add test for map.contains() test, which would need to be tested also
				newSortedMap(newMap);
				// todo add test for map.contains() test, which would need to be tested also
				// 
				Logger.getLogger("battleplan").setLevel(Level.FINE);
			}

		/**
		* Test method for {@link Battleplan#toString()}.
		*/
		@Test
		public void testToString() {
				Battleplan battleplan = new Battleplan();
				Logger.getLogger("battleplan").setLevel(Level.FINE);
				Logger.getLogger("battleplan").setLevel(Level.FINER);
				Logger.getLogger("battleplan").setLevel(Level.FINEST);
				Logger.getLogger("battleplan").setLevel(Level.FINEST);
				Logger.getLogger("battleplan").setLevel(Level.FINE);
				assertNotNull(battleplan.toString());
			}
}
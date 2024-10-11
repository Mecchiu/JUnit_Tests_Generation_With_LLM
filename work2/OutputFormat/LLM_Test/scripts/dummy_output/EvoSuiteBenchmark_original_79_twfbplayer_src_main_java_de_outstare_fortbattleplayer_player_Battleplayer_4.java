// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains one unit test case for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {
		/**
		 * @return a string representation of this battleplayer
		 */
		@Test
        public void testConstruction() {
            assertSame(this,Battleplayer.class.newInstance());
        }

	/**
	 * @return a string corresponding to no enemy {@link Battleplayer} given a {@link List} with an empty
	 * enemy set
	 */
	@Test
		public void testEmptyEnemyList() {
			List<Combatant> enemies = new ArrayList<Combatant>();
			enemies.add(new Combatant("Einstein", null, Battleplayer.class, this.getClass()));
			Battleplayer battleplayer = new Battleplayer(Battleplayer.class.getCanonicalName(), EnumManager.BATTLE_START,
															EnumManager.EIGEN, EnumManager.WARMING, EnumManager.WING_TIE, EnumManager.NEGATIVE, enemies);
			assertNotNull(battleplayer);
			/*
			assertEquals("Einstein", battleplayer.getEnemy(), EnumManager.NO_ENEMY);
			assertEquals(1, battleplayer.numberOfRounds());
			*/
			battleplayer.startBattle();
			assertEquals(-1, battleplayer.getLastTurn());
			battleplayer.finishBattle();
			assertNull(battleplayer.getEnemy());
			enemies.add(new Battleplayer("Einstein").getEnemy());
			assertEquals(1, battleplayer.numberOfRounds());

			List<Combatant> enemies2 = new ArrayList<Combatant>();
			enemies2.add(new Combatant("Pauw", "Pauw", Battleplayer.class, this));
			enemies2.add(new Battleplayer("Pauw").getEnemy());
            assertEquals(2, battleplayer.numberOfRounds());
            assertTrue(battleplayer.isEnemyInHistory(new Battleplayer().getEnemy()));
			// if you don't remove the previous enemy, the last team won't be used, so assertTrue(battleplayer.isEnemyInHistory(new Combatant("Tou")));
			assertEquals(0, battleplayer.numberOfRounds());
        }



		/**
		 * @return a battleplayer based on a given {@link Set} of {@link Battleplayer}s
		 * @param en
		 * @param enemies
		 */
		@Test
	    @Parameters("{0} -> {1}")
			public void testEnemyListSet(Set<Combatant> en, List<Combatant> enemies) {
			List<Combatant> enemies2 = new ArrayList<Combatant>();
			List<String> enemyNamesFound = new ArrayList<String>();
			// create battleplayer
			Battleplayer battleplayer = new Battleplayer(BattlePlayer.class.getCanonicalName(), Battleplayer.class.getCanonicalName(), EnumManager.BATTLE_START, EnumManager.NO_BATTLE, Battleplayer.class.getCanonicalName(), EnumManager.EIGEN, EnumManager.WARMING, EnumManager.NEGATIVE, enemies);
			assertNotNull(battleplayer);
			// add enemy
			assertEquals("Tou", battleplayer.getEnemy().getName());
			enemies2.add(new Battleplayer("Pauw").getEnemy());
			for (Combatant enemy; enemy = en.iterator().next();) {
				enemyNamesFound.add(enemy.getName());
				battleplayer.step(new Battleplayer(), enemy);
			}
			// assert that, all enemies have been visited
    		assertEquals(enemyNamesFound.size(), enemies.size());
			// test that battleplayer knows there is no enemy when encountering a battleplayer already there
			assertFalse(battleplayer.isEnemyInHistory(new Battleplayer().getEnemy()));
			// test that battleplayer knows the last enemy
			assertEquals(new Battleplayer(Battleplayer.class.getCanonicalName()).getLastTurn(), battleplayer.getLastTurn());
			// remove all enemies
			for (Combatant enemy: enemies) {
				enemies2.add(new Battleplayer(enemy.getName()).getEnemy());
				battleplayer.removeEnemy(enemy);
			}
			assertEquals(1, battleplayer.numberOfRounds());
			for (Combatant enemy: en) {
				assertTrue(battleplayer.isEnemyInHistory(enemy));
				battleplayer.addEnemy(enemy);
			}
			assertEquals(1, battleplayer.numberOfRounds());
			assertTrue(battleplayer.isEnemyInHistory(new Battleplayer().getEnemy()));
			// test that battleplayer knows already visited enemy
			assertEquals(new Battleplayer(Battleplayer.class.getCanonicalName()).getLastTurn(), battleplayer.getLastTurn());
			// remove 1 enemy
			for (Combatant enemy: enries[0]) {
				enemies2.add(new Battleplayer(enemy.getName()).getEnemy());
				battleplayer.removeEnemy(enemy);
			}
			assertEquals(1, battleplayer.numberOfRounds());
			for (Combatant enemy: en) {
				assertTrue(battleplayer.isEnemyInHistory(enemy));
				battleplayer.addEnemy(enemy);
			}
			assertEquals(1, battleplayer.numberOfRounds());
			// test not the player yet won't have a winner
			assertFalse(battleplayer.allEnemyAvailableToWin());
		}
}
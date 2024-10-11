// PlayerConfiguration_2Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
		/**
		 * Test method for {@link PlayerConfiguration#showShootline()}.
		 * @throws Exception
		 */
		@org.junit.jupiter.api.RepeatedTest
		@Test
		void test() throws Exception {
            player.setShowShootline(true);
            assertTrue(player.showShootline());
            player.setShowShootline(false);
            assertFalse(player.showShootline());
        }
		/**
		 * Test method for {@link PlayerConfiguration#showShootline()}.
		 * @throws Exception
		 */
		@org.junit.jupiter.api.RepeatedTest
		@Test
		public void test_2() throws Exception {
                final Set<String> shoots = new HashSet<String>();
                final Set<String> unshrooked = new HashSet<String>();
                final PlayerConfiguration player2 = new PlayerConfiguration();
                final Lock lock2 = new ReentrantLock();
                lock2.lock();
                shoots.add(Configuration.SHOOTLINE_MODE_PLAYER + "");
                final Set<PlayerLine> lines = new HashSet<PlayerLine>();
                final Set<PlayerLine> unshrookedLines = new HashSet<PlayerLine>();
                final Set<PlayerLine> unshrookedLines2 = new HashSet<PlayerLine>();
                final Set<PlayerLine> lines2 = new HashSet<PlayerLine>();
                final Set<PlayerLine> unshrookedLines3 = new HashSet<PlayerLine>();
                final Set<PlayerLine> unshrookedLines4 = new HashSet<PlayerLine>();
                final Set<PlayerLine> unshrookedLines5 = new HashSet<PlayerLine>();
                final Set<PlayerLine> unshrookedLines6 = new HashSet<PlayerLine>();
	        player.setShoutlines(shoots);
	        assertEquals(player2.getShoutlines().size(), 1);
	        lines.addAll(player2.getShoutlines().keySet());
	        unshrookedLines.addAll(player2.getShoutlines().values());
	        unshrookedLines2.addAll(player2.getShoutlines().values());
                lines2.addAll(player.getShoutlines().keySet());
                unshrookedLines3.addAll(unshrookedLines.values());
                unshrookedLines4.addAll(unshrookedLines2.values());
                unshrookedLines5.addAll(unshrookedLines3.values());
                unshrookedLines6.addAll(unshrookedLines4.values());
                unshrookedLines.addAll(lines.keySet());
                unshrookedLines2.addAll(unshrookedLines6.values());
                unshrookedLines3.addAll(lines2.keySet());
                unshrookedLines4.addAll(unshrookedLines4.values());
                unshrookedLines5.addAll(unshrookedLines4.values());
                unshrookedLines6.addAll(unshrookedLines4.values());
                unshrookedLines3.addAll(lines2.keySet());
                lock2.unlock();
                if(Configuration.SHOOTLINE_MODE_PLAYER!= Configuration.SHOOTLINE_MODE_TEAMS) {
                    assertEquals(player2.getShoutlines().size(), 2);
                    List<String> list = new LinkedList<String>();
                    for(String playerLine: player2.getShoutlines().keySet()) {
                        list.add(playerLine);
                    }
                    assertEquals(list, Configuration.SHOOTLINE_MODE_PLAYER_TO_TEAM.keySet());
                    assertEquals(player.getShoutlines().size(), Configuration.SHOOTLINE_MODE_PLAYER_TO_TEAM.size());
                    List<String> list2 = new LinkedList<String>();
                    for(String playerLine: player.getShoutlines().keySet()) {
                        list2.add(playerLine);
                    }
                    assertEquals(list.size(), Configuration.SHOOTLINE_MODE_PLAYER_TO_TEAM.size());
                    Set<String> list3 = new HashSet<String>();
                    for(String playerLine: list.keySet()) {
                        list3.add(playerLine);
                    }
                    assertTrue(list3.size() > list2.size());
                    Set<String> lsts = new LinkedHashSet<String>();
                    lsts.addAll(list2);
                    lsts.addAll(list3);
                    assertEquals(lsts, Configuration.SHOOTLINE_MODE_PLAYER_TO_TEAM.keySet());
                    assertEquals(player.getShoutlines().size(), Configuration.SHOOTLINE_MODE_TEAM_TO_PLAYER_SHOOTLINE.size());
                }
                else {
                    assertEquals(player.getShoutlines().size(), 1);
                    Set<String> list3 = ConfigManager.instance().getConfiguration().getShoutlines().keySet();
                    assertEquals(list3.size(), 4);
                    List<String> list2 = new LinkedList<String>();
                    for(String playerLine: player.getShoutlines().keySet()) {
                        list2.add(playerLine);
                    }
                    assertEquals(list.size(), list2.size());
                    Set<String> list5 = new HashSet<String>();
                    for(String playerLine: player.getShoutlines().keySet()) {
                        list5.add(playerLine);
                    }
                    assertTrue(list5.size() > list2.size());
                    Set<String> lsts = new LinkedHashSet<String>();
                    lsts.addAll(list2);
                    lsts.addAll(list5);
                    assertEquals(lsts, Configuration.SHOOTLINE_MODE_TEAM_TO_PLAYER_SHOOTLINE.keySet());
                }
        }
	}
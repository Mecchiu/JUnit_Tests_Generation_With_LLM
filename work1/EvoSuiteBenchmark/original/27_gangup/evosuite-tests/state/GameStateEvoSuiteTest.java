/*
 * This file was automatically generated by EvoSuite
 */

package state;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import state.GameState;
import state.Party;
import state.Player;

@RunWith(EvoSuiteRunner.class)
public class GameStateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      int int0 = gameState0.getGameState();
      assertEquals(1, int0);
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(0, gameState0.getNumDead());
  }

  @Test
  public void test1()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      int int0 = gameState0.getNumDead();
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0, int0);
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(1, gameState0.getGameState());
      assertEquals(0, gameState0.getNumOfPlayers());
  }

  @Test
  public void test2()  throws Throwable  {
      GameState gameState0 = new GameState((-12L));
      assertNotNull(gameState0);
      
      int int0 = gameState0.getNumOfPlayers();
      assertEquals(0, int0);
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(1, gameState0.getGameState());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test3()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      gameState0.setGameState(5890);
      Player player0 = new Player(1, "glColorMaterial", 1);
      gameState0.removePlayer(player0);
      gameState0.setDead(player0, (long) 1);
      assertEquals(5890, gameState0.getGameState());
      assertEquals(1, gameState0.getNumDead());
  }

  @Test
  public void test4()  throws Throwable  {
      GameState gameState0 = new GameState((-1324L));
      assertNotNull(gameState0);
      
      Player player0 = new Player();
      gameState0.updateLastMove(player0);
      boolean boolean0 = gameState0.isMoveTimeOK(player0);
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(true, boolean0);
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getGameState());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test5()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      int int0 = gameState0.type();
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(4, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      GameState gameState0 = new GameState((-12L));
      assertNotNull(gameState0);
      
      long long0 = gameState0.getGamestart();
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getGameState());
      assertEquals(0L, long0);
      assertEquals("GameState[]", gameState0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      Player[] playerArray0 = gameState0.players();
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(0, gameState0.getNumDead());
      assertNotNull(playerArray0);
      assertEquals(1, gameState0.getGameState());
      assertEquals("GameState[]", gameState0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      GameState gameState0 = new GameState(6L);
      assertNotNull(gameState0);
      
      gameState0.reload();
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getGameState());
      assertEquals(false, gameState0.hasChanged());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals("GameState[]", gameState0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      gameState0.setMe((Player) null);
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals("GameState[]", gameState0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      GameState gameState0 = new GameState((-12L));
      assertNotNull(gameState0);
      
      gameState0.getMe();
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(0, gameState0.getNumDead());
  }

  @Test
  public void test11()  throws Throwable  {
      GameState gameState0 = new GameState((-12L));
      assertNotNull(gameState0);
      assertEquals(0L, gameState0.getGamestart());
      
      gameState0.setGamestart((long) 0);
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getGameState());
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getTotalRounds());
  }

  @Test
  public void test12()  throws Throwable  {
      GameState gameState0 = new GameState(1328L);
      assertEquals(1, gameState0.getCurrentRound());
      assertNotNull(gameState0);
      
      gameState0.setCurrentRound(0);
      assertEquals(0, gameState0.getCurrentRound());
  }

  @Test
  public void test13()  throws Throwable  {
      GameState gameState0 = new GameState(6L);
      assertNotNull(gameState0);
      
      int int0 = gameState0.getCurrentRound();
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(1, int0);
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getTotalRounds());
  }

  @Test
  public void test14()  throws Throwable  {
      GameState gameState0 = new GameState((-12L));
      assertNotNull(gameState0);
      
      gameState0.setDead((Player) null);
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getGameState());
  }

  @Test
  public void test15()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      gameState0.setTotalRounds(13);
      assertEquals(13, gameState0.getTotalRounds());
  }

  @Test
  public void test16()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      int int0 = gameState0.getTotalRounds();
      assertEquals(1, int0);
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getGameState());
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumDead());
  }

  @Test
  public void test17()  throws Throwable  {
      GameState gameState0 = new GameState((-6L));
      assertNotNull(gameState0);
      
      Player player0 = new Player(19, "", "", 19);
      gameState0.addPlayer(player0);
      gameState0.reset(true);
      assertEquals(1, gameState0.getNumOfPlayers());
  }

  @Test
  public void test18()  throws Throwable  {
      GameState gameState0 = new GameState(0L);
      assertNotNull(gameState0);
      
      Player player0 = new Player(1, "glReplacementCodeuiColor4fNormal3fVertex3fSUN", "glReplacementCodeuiColor4fNormal3fVertex3fSUN", 1);
      gameState0.addPlayer(player0);
      player0.setConnected(false);
      gameState0.reset(false);
      assertEquals("GameState[glReplacementCodeuiColor4fNormal3fVertex3fSUN]", gameState0.toString());
      assertEquals(1, gameState0.getNumDead());
  }

  @Test
  public void test19()  throws Throwable  {
      GameState gameState0 = new GameState(6L);
      Player player0 = new Player(1, "glWindowPos4dvMESA", "glWindowPos4dvMESA", 1);
      gameState0.addPlayer(player0);
      assertEquals("GameState[glWindowPos4dvMESA]", gameState0.toString());
      
      player0.setConnected(false);
      gameState0.reset(true);
      assertEquals(0, gameState0.getNumOfPlayers());
  }

  @Test
  public void test20()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      Player player0 = new Player((int) (byte) (-96));
      boolean boolean0 = gameState0.isMoveTimeOK(player0);
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(true, boolean0);
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getGameState());
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getTotalRounds());
  }

  @Test
  public void test21()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      Player player0 = new Player(1, "glColorMaterial", 1);
      gameState0.updateLastMove(player0);
      boolean boolean0 = gameState0.isMoveTimeOK(player0);
      assertEquals(false, boolean0);
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0, gameState0.getNumDead());
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test22()  throws Throwable  {
      GameState gameState0 = new GameState(1321L);
      assertNotNull(gameState0);
      
      Player player0 = new Player(127, "glWind2Pos4dvM\\ESA", "glWind2Pos4dvM\\ESA", 127);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      assertEquals("GameState[glWind2Pos4dvM\\ESA]", gameState0.toString());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test23()  throws Throwable  {
      GameState gameState0 = new GameState(1328L);
      assertNotNull(gameState0);
      
      Player player0 = new Player(0, "glTexCoord2fColor3fVertex3fvSUN(", "glTexCoord2fColor3fVertex3fvSUN(", 0);
      gameState0.addPlayer(player0);
      assertEquals(1, gameState0.getNumOfPlayers());
      
      gameState0.removePlayer(player0);
      assertEquals(0, gameState0.getNumOfPlayers());
  }

  @Test
  public void test24()  throws Throwable  {
      GameState gameState0 = new GameState(1328L);
      assertNotNull(gameState0);
      
      Player player0 = new Player(0, "glTexCoord2fColor3fVertex3fvSUN(", "glTexCoord2fColor3fVertex3fvSUN(", 0);
      gameState0.join((Party) player0, (Party) player0);
      gameState0.join((Party) player0, (Party) player0);
      gameState0.removePlayer(player0);
      assertEquals(-1, gameState0.getNumOfPlayers());
  }

  @Test
  public void test25()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      gameState0.player((-1295));
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0, gameState0.getNumOfPlayers());
  }

  @Test
  public void test26()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      gameState0.player(1578);
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test27()  throws Throwable  {
      GameState gameState0 = new GameState(1328L);
      assertNotNull(gameState0);
      
      gameState0.player(0);
      assertEquals(0L, gameState0.getGamestart());
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(1, gameState0.getGameState());
      assertEquals("GameState[]", gameState0.toString());
      assertEquals(1, gameState0.getTotalRounds());
  }

  @Test
  public void test28()  throws Throwable  {
      GameState gameState0 = new GameState(0L);
      Player player0 = new Player(1, "glReplacementCodeuiColor4fNormal3fVertex3fSUN", "glReplacementCodeuiColor4fNormal3fVertex3fSUN", 1);
      gameState0.addPlayer(player0);
      player0.setConnected(false);
      gameState0.pack();
      assertEquals(1, gameState0.getNumOfPlayers());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test29()  throws Throwable  {
      GameState gameState0 = new GameState();
      assertNotNull(gameState0);
      
      byte[] byteArray0 = new byte[4];
      gameState0.unpack(byteArray0);
      assertEquals(0, gameState0.getNumDead());
      assertEquals(1, gameState0.getGameState());
      assertEquals(1, gameState0.getTotalRounds());
      assertEquals(0, gameState0.getNumOfPlayers());
      assertEquals(1, gameState0.getCurrentRound());
      assertEquals(0L, gameState0.getGamestart());
  }

  @Test
  public void test30()  throws Throwable  {
      GameState gameState0 = new GameState();
      Player player0 = new Player(13, "glConvolutionFilter1D", 13);
      gameState0.addPlayer(player0);
      Player player1 = new Player(2305, "glConvolutionFilter1D", 2305);
      player0.boss = (state.Party) player1;
      byte[] byteArray0 = gameState0.pack();
      gameState0.unpack(byteArray0);
      assertEquals(2, gameState0.getNumOfPlayers());
      assertEquals("GameState[Player1 , glConvolutionFilter1D]", gameState0.toString());
  }

  @Test
  public void test31()  throws Throwable  {
      GameState gameState0 = new GameState(1328L);
      Player player0 = new Player(23, "glWindowPos4d@0vMSA", "glWindowPos4d@0vMSA", 23);
      gameState0.addPlayer(player0);
      Player player1 = (Player)player0.gangBoss();
      player1.id = 18;
      gameState0.addPlayer(player0);
      gameState0.toString();
      assertEquals(2, gameState0.getNumOfPlayers());
  }
}

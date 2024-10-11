// ClientPlayerTest.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPlayer}.
* It contains one unit test case for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {
		private Player playerOne;

		private ClientPlayer playerTwo;
		
		/**
		 * @see ClientPlayerTest#testCanBowlBombs()
		 */
		@Test
		public void testThatCanBowlBowsersTrue_1(){
			assertTrue("playerOne can never bowl bombs", clientPlayer.canBowlBombs());
		}
		
		@Test
		public void testThatOnly_canBowlBombsNotBePlanted_1(){
			playerOne = new Player(2, 5);
			playerOne.add("dummy");
			playerOne.remove("dummy");
			ClientPlayer test = new ClientPlayer(Point.ORIGIN, 1); 
			assertFalse("playerCanBowlBomsers is set to true for an actor!", test.canBowlBoms());

		}
		
		@Test
		public void testThatOnly_plantsOnBanks_1() {
			playerOne = new Player(2, 5);
			playerOne.add("dummy");
			playerOne.remove("dummy");
			playerOne.setBombDiameter(5);
			ClientPlayer test = null;
			boolean b1 = clientPlayer.plantedBombExploded();
			
			GameOver gameOver = new GameOver();
			gameOver.setGameOverStatus(true);
			gameOver.getGameOverPlayers().addAll(constants.SERVERS);
			GameState gameState = gameOver.getGameState();
			assertEquals("planted bomb explosion position", Point.ORIGIN, gameState.getPile().getPointX(1));
			gameState = gameState.getPile().getPile().get(2);
			assertEquals("bomb explode position", Point.ORIGIN, gameState.getPile().getPointX(0));

			playerTwo = new ClientPlayer(Point.ORIGIN, 2);
			playerTwo.add("dummy");
			playerTwo.remove("dummy");
			
		}
		
		@Test
		public void testThatOnly_canBowlBoots_1(){
			playerOne = new Player(2, 5);
			playerOne.add("dummy");
			playerOne.remove("dummy");
			playerOne.setBombDiameter(5);
			playerTwo = new ClientPlayer(Point.ORIGIN, 2);
			playerTwo.add("dummy");
			playerTwo.remove("dummy");
			playerTwo.setBombDiameter(5);
			
			ClientPlayer test = null;
			boolean b1 = clientPlayer.canBowlBows();
			
			GameOver gameOver = new GameOver();
			gameOver.setGameOverStatus(true);
			gameOver.getGameOverPlayers().addAll(constants.SERVERS);
			GameState gameState = gameOver.getGameState();
			assertEquals("bowl boot", b1, gameState.getPile().getPile().get(0).getState());
			
			b1 = false;
			playerTwo.setBombDiameter(5);
			b1 = true;
			
		}

		@Test
		public void testThatBowsers_return() throws InterruptedException {
			playerOne = new Player(2, 5);
			playerOne.add("b");
			playerOne.remove("b");
			
			ClientPlayer playerTwo = new ClientPlayer(Point.ORIGIN, 3);
			playerTwo.add("b");
			playerTwo.remove("b");
			
			Thread.sleep(1000);
			assertEquals("b, b2", playerTwo.plantedBombExploded());
			
		}
}
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
		private final static Logger LOGGER = Logger.getLogger(ClientPlayerTest.class);
	private final static ClientPlayer player = new ClientPlayer(new Point(10, 10),
			Constants.PLAYER);

	/**
	 * Checks if the player can bowl bombs - if it can. 
	 * @throws Exception if something goes wrong
	 */
	@Test
	public void canBowlBombsTest() throws Exception {
		assertTrue("Bowls cannot be planted by non-players", 
				player.canBowlBombs());
	}

	/**
	 * Checks if the player can bowl bombs - if it can.
	 * @throws Exception if something goes wrong
	 */
	@Test
	public void canPlantBombTest() throws Exception {
		assertTrue("Falling bombs cannot be planted by non-players", 
				player.canPlantBomb());
	}

	/**
	 * Checks if the player can bowl bombs of a known bomb type
	 * @throws Exception if something goes wrong
	 */
	@Test
	public void canPlantBombTestKnownBombs() throws Exception {
		BomBom bomb = new BomBom(new Point(10, 10), Bomber.Type.HORIZONTAL);
		Player player1bom = null;

		try {
			player1bom = new Player(bomb);
		} catch (Exception e) {
			LOGGER.error(e);
			fail("Error getting player with known bomber type.");
		}

		Player player2 = null;
		try {
			player2 = new Player(bomb);
		} catch (Exception e) {
			LOGGER.error(e);
			fail("Error getting player with known bomber type.");
		}

		assertTrue("No bomber player can set as own bomber manager.",  
				player1bom.canPlantBomb());

		assertTrue("Player can not set as own bomber manager.",
				player2.canDefuseBomb());

		player1bom.plantedBombExploded();

		assertFalse("Player can add owner bomber manager.", player1bom.isOwnerBomManager());

		BomBom bomb1 = player.addBomBom(bomb);
		bomb1.plantedBombExploded();
		assertTrue("It should take player to this bomber type.",  
				player1bom.isOwnerBomManager());

		player2.defuseBomb();
		assertTrue("It should try player to this bomber type.",  
				player1bom.isOwnerBomManager());

		assertTrue("Player cant set own bomber manager.",  
				player2.canDefuseBomb());

		assertTrue("Player should planted a bomb of bomb damage.", player2.plantedBombExploded());
		assertTrue("Player should remove owner bomber manager.",    
				player2.isOwnerBomManager());
		player2.dropBomb();
		assertFalse("Player should not planted a bomb of bomb damage.", player2.plantedBombExploded());
		assertTrue("Player should remove owner bomber manager.",    
				player1bom.isOwnerBomManager());
		player1bom.dropBomb();
		assertTrue("Player cant planted a bomb of bomb damage.", player1bom.plantedBombExploded());
	}

	/**
	 * Creates a bomber manager.
	 * @return the resulting bomber manager.
	 */
	private BoardManager createBoardManager() {
		return new BoardManager();
	}

	/**
	 * Sets the board manager as a new factory.
	 */
	private void setBoardManagerFactoryFactory() {
		BoardManagerFactory.setBoardManagerFactoryImpl(createBoardManager());
	}

	/**
	 * @return player.getBoardManagerFactory().factory.
	 */
	private BoardManagerFactory factory() {
		return player.getBoardManagerFactory().factory;
	}

	/**
	 * @return createBoardManager() return the board manager that will exist.
	 */
	private BoardManager createBoardManager() {
		BoardManagerImpl impl = new BoardManagerImpl(factory());

		player.dropAllPlayers();
		player.dropAllBoms();

		player.setupBoard();

		return impl;
	}
}